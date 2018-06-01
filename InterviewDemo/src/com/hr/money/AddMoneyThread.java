package com.hr.money;

/**
 * 
 *@Name : AddMoneyThread
 *@Author : LH
 *@Date : 2018-3-22����11:56:13
 *@Version : V1.0
 * @Description: ��Ǯ�߳�
 */
public class AddMoneyThread implements Runnable {

	//�����˻�
	private Account account;
	//������
	private double money;
	
	
	public AddMoneyThread(Account account, double money) {
		this.account = account;
		this.money = money;
	}

    /**
     * ������:���̵߳��ô���ʱ�������˻�����ͬ��
     */
	public void run() {
		synchronized(account){
          account.deposit(money);
		}
	}

}
