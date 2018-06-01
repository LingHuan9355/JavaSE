package com.hr.filecopy;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 
 *@Name : MyUtil2
 *@Author : LH
 *@Date : 2018-3-22����06:02:27
 *@Version : V1.0
 * @Description: 71��дһ������������һ���ļ�����һ���ַ�����ͳ������ַ����ڴ��ļ��г��ֵĴ�����
 */
public class MyUtil2 {

	/**
	 * �������еķ������Ǿ�̬��ʽ���ʵ���˽�������˽�в�����������
	 */
	private MyUtil2(){
		throw new AssertionError();
	}
	
	/**
	 * ͳ�Ƹ������ļ��и����ַ������ֵĴ���
	 *  
	 * @param filename
	 * @param word
	 * @return �ַ������ļ��г��ֵĴ���
	 */
	public static int countWordInFile(String filename,String word){
		int counter = 0;
		try {
			FileReader fr = new FileReader(filename);
			BufferedReader br = new BufferedReader(fr);
			String line = null;
			while((line = br.readLine()) != null){
				int index =-1;
				while(line.length() >= word.length() && (index = line.indexOf(word)) >= 0){
					counter ++;
					line = line.substring(index + word.length());
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return counter;
	}
}
