package com.lh.variable;
/**
 * 
 *@Name : Test
 *@Author : LH
 *@Date : 2018-6-1����09:46:38
 *@Version : V1.0
 * 
 *@Description: ����try{}����һ��return��䣬�����finally�����᲻��ִ�У�ʲôʱ��ִ�У���returnǰ����֮��
 *���  "func1(),func2(),2"
 */
public class Test {

	public static void main(String[] args) {
            System.out.println(new Test().test());
	}

	int test(){
		try{
			return func1();
		}finally{
			return func2();
		}
	}



	private int func1() {
		System.out.println("func1");
		return 1;
	}
	
	private int func2() {
		System.out.println("func2");
		return 2;
	}
}
