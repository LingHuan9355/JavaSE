package com.hr.filecopy;

import org.junit.Test;


public class MyTest2 {

	
	@Test
	public void testMain(){
	   
		String filename= "F:\\dir\\ABC.txt";
		String word ="a";
		int  count= MyUtil2.countWordInFile(filename, word);
	
		System.out.println("�ַ������ļ��г��ֵĴ���:"+count);
	}
}
