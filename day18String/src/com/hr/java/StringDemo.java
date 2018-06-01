package com.hr.java;

import org.junit.Test;

/**
 * 
 *
 *@Description:�ַ����ķ�ת
 *
 *@Name : StringDemo
 *@Author : LH
 *@Date : 2018-6-1����10:26:45
 *@Version : V1.0
 *
 */
public class StringDemo {

	@Test 
	public void testString(){
		String str = "ABCDEFG";
		String str2 = reverseString(str, 3, 5);
		System.out.println(str2);
		
		String str3 = reverse(str);
		System.out.println(str3);
		
		String str4 =reverse2(str);
		System.out.println(str4);
		
		String str5 = reverse3(str);
		System.out.println(str5);
	}
	//1.ʵ���ַ����ķ�ת
	public static String reverse(String str){
		char [] c = str.toCharArray();
		for(int i =0 , j =c.length-1 ; i < j ; i++ , j--){
			char temp = c[i];
			c[i] =c[j];
			c[j] = temp;
		}
		return new String(c);
	}
	
	//������
	public static String reverse2(String str){
		 StringBuffer sb = new StringBuffer(str);
		 return sb.reverse().toString();
	}
	//������
	public static String reverse3(String str){
		if(str == null || str.length() <= 1)
			return str;
		return reverse3(str.substring(1)) +str.charAt(0);
	}
	
	  /**
	   *  2.��һ���ַ������з�ת�����ַ�����ָ�����ֽ��з�ת�����罫��abcdefg����תΪ��abfedcg��
	   */
	public static String reverseString(String str, int start, int  end){
		   
		char [] c = str.toCharArray();
		return reverseArrays(c, start, end);
	}
	
	public static String reverseArrays(char [] c ,int start , int end ){
	        for (int i =start , j =end; i < j ; i++ , j --  ){
	        	char  temp = c[i];
	        	c[i] = c[j];
	        	c[j] = temp;
	        	
	        }
		return new String(c);
	}
}
