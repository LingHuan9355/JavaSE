package com.lh.variable;

import java.util.Date;

@SuppressWarnings("serial")
public class Test_className extends Date{

	public static void main(String[] args) {
             new Test_className().test();
	}
	
	public void test(){
		//���ط�����������
		System.out.println(super.getClass().getName());
		//���ر���ĸ���
		System.out.println(getClass().getSuperclass().getName());
	}

}
