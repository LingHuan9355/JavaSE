package com.hr.thread;

import java.util.concurrent.Callable;

/**
 * 
 *@Name : MyTask
 *@Author : LH
 *@Date : 2018-3-22����12:32:54
 *@Version : V1.0
 * @Description:java1.5�󴴽��̵߳����ַ�ʽ��ʵ��Callable�ӿڣ��ýӿ��е�call��������
 * ���߳�ִ�н���ʱ����һ������ֵ��
 */
public class MyTask implements Callable<Integer> {

	private int upperBounds;
	
	
	public MyTask(int upperBounds) {
		this.upperBounds = upperBounds;
	}


    public Integer call() throws Exception {
		int sum = 0;
		for (int i = 1; i <= upperBounds; i++) {
			sum += i;
		}
		
		return sum;
	}

}
