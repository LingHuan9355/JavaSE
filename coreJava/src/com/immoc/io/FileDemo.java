package com.immoc.io;

import java.io.File;
import java.io.IOException;

/**
 *  File �ļ�Ŀ¼���봴������
 *@Description:
 *@Name : FileDemo
 *@Author : LH
 *@Date : 2018-6-1����10:39:01
 *@Version : V1.0
 *
 */
public class FileDemo {

     public static void main(String[] args) {
		File file = new File("F:\\imooc");
		//System.out.println(file.exists());
		if(!file.exists()){
			file.mkdir();
		}else{
			file.delete();
		}
		//�Ƿ���һ��Ŀ¼�������Ŀ¼����true���������Ŀ¼��Ŀ¼�����ڷ���false
		System.out.println(file.isDirectory());
		//�Ƿ���һ���ļ�
		System.out.println(file.isFile());
		
		//File file2 =new File("f:\\imooc\\�ռ�1.txt");
		File file2 = new File("f:\\imooc\\","�ռ�1.txt");
		if(!file2.exists()){
			try {
				file2.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}else{
			file2.delete();
		}
		System.out.println(file);
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getName());
		System.out.println(file2.getName());
	}
}
