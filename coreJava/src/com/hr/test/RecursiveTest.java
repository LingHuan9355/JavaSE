package com.hr.test;

import org.junit.Test;

/**
 * 
 *
 *@Name : RecursiveTest
 *@Author : LH
 *@Date : 2018-12-11����05:42:12
 *@Version : V1.0
 *@Description:  �׳˵ݹ����
 *  �׳˽��ܣ�һ���������Ľ׳�������С�ڼ����ڸ������������Ļ���������0�Ľ׳�Ϊ1����Ȼ��n�Ľ׳�д��n!
   *   ���׳˺����ǵݹ麯������ʾ����
 *  �׳˵�ʵ�ַ�����һ�ֵݹ飬����ѭ��������������
 */
public class RecursiveTest {
	
		
		@Test
		public void forTest(){
			int num =0;
			//num = Recursive.factorial(6);
			//num = Recursive.fordigui(6);
		    num = Recursive.whileDiGui(6);
			// num = Recursive.factorial(6, 1);
			System.out.println("�ݹ飺"+num);
			
		}
}
