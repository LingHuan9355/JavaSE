package com.hr.filecopy;

import java.io.IOException;

import org.junit.Test;



/**
 * 
 *@Name : Test
 *@Author : LH
 *@Date : 2018-3-22����05:35:10
 *@Version : V1.0
 * @Description:  ����copy�ļ�
 */
public class MyTest {

	@Test
	public void testMain() throws IOException{
		
		String source = "F:\\dir\\ABC.txt";
		String target = "F:\\dir\\dir2\\abc.txt";
		
		MyUtil.fileCopy(source, target);
	}
	
}
