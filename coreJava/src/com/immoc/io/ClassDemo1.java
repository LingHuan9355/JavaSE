package com.immoc.io;

/**
 * ����
 *@Description:
 *@Name : ClassDemo1
 *@Author : LH
 *@Date : 2018-6-1����10:41:27
 *@Version : V1.0
 *
 */
public class ClassDemo1 {

	public static void main(String[] args) {
          
		Foo  foo1 = new Foo();
		//Ȼ��һ���඼��Class��ʵ������
		
		//�κ�һ���඼��һ�������ľ�̬��Ա
		Class c1  = Foo.class;
		
		//����Ķ���ͨ��getClass����
		Class c2 =foo1.getClass();
		
		System.out.println(c1 == c2);
		
		Class c3 = null;
		try {
			c3 = Class.forName("com.immoc.io.Foo");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println(c2 == c3);
	}

}

class Foo{}