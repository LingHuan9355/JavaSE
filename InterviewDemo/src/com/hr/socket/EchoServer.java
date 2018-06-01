package com.hr.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ��������
 * 
 *@Name : EchoServer
 *@Author : LH
 *@Date : 2018-3-22����06:46:04
 *@Version : V1.0
 * @Description: 72��Java�׽��ֱ��ʵ��һ�����̵߳Ļ��ԣ�echo��������
 * 
 * 
 */

public class EchoServer {

	private static final int ECHO_SERVER_PORT = 6789;
	
	public static void main(String[] args) {
		
		try {
			ServerSocket server = new ServerSocket(ECHO_SERVER_PORT);
		    System.out.println("�������Ѿ�����...");	
			while(true){
				Socket client = server.accept();
				new Thread(new ClientHandler(client)).start();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	private static class ClientHandler implements Runnable{
        private Socket client;
		
		public ClientHandler(Socket client){
			this.client = client;
		}
		
		public void run() {
			try {
				BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
				PrintWriter pw = new PrintWriter(client.getOutputStream());
				
				String msg = br.readLine();
				System.out.println("�յ�" +client.getInetAddress() + "���͵ģ�" +msg);
				pw.println(msg);
				pw.flush();
				
			} catch (IOException e) {
				e.printStackTrace();
			}finally{
				try {
					client.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
	
}
