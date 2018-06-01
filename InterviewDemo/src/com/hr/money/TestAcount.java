package com.hr.money;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 
 *@Name : TestAcount
 *@Author : LH
 *@Date : 2018-3-22����11:59:27
 *@Version : V1.0
 * @Description:  ����100���˻�ͬʱ��һ�������˻�����1ԪǮ����û��ʹ��ͬ�����ƺ�ʹ��ͬ�����Ƶ�����µ�ִ�����
 */
public class TestAcount {

	
	public static void main(String[] args) {
		
		Account account = new Account();
	    /**
	     * ����һ���̳߳أ����̳߳�����ʹ�ù����޽�������еĹ̶��������̡߳� 
	     * ���κ�ʱ�����nThreads�̶߳��������������
	     * ����������̴߳��ڻ״̬ʱ�ύ�������������ǽ��ڶ����еȴ���ֱ���߳̿��á�
	     * ����κ��߳��ڹر�֮ǰ��ִ���ڼ�����ʧ�ܶ���ֹ��������Ҫִ�к�������ʱ��ȡ������
	     * ���е��߳̽�һֱ���ڣ�ֱ��������ȷ�رա�
	     */
		ExecutorService service =Executors.newFixedThreadPool(100);
		
		for (int i = 1; i <= 100; i++) {
			service.execute(new AddMoneyThread(account, 1));
		}
	    
		service.shutdown();
		
		while(!service.isTerminated()){
			
		}
		
		System.out.println("�˻���" + account.getBalance());
	
	}
}
