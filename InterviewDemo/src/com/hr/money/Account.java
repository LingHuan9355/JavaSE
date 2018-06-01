package com.hr.money;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import javax.security.auth.login.AccountLockedException;

/**
 * 
 *@Name : Acount
 *@Author : LH
 *@Date : 2018-3-22����11:51:06
 *@Version : V1.0
 * @Description: �����˻�
 */
public class Account {

	/**
	 * ������
	 * �����ƣ�Ϊÿ�������˻�����һ���������ڴ��������м����ͽ����Ĳ���
	 */
	//private Lock accountLock = new ReentrantLock();
	
	
	//�˻����
	private double balance;
	
	/**
	 * ���������������˻��Ĵ�deposit��������ͬ����synchronized���ؼ���
	 * 
	 */
	/**
	 * ���
	 * @param money ������
	 */
	public synchronized void deposit(double money){
		//accountLock.lock();
		
		//try{
			double newBalance = balance + money;
			try {
				//ģ���ҵ����Ҫһ�δ���ʱ��
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			balance = newBalance;
	//	}finally{
	//		accountLock.unlock();
		//}
	}

	/**
	 * 
	 * @return ����˻����
	 */
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	
}
