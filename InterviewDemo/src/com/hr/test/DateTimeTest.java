package com.hr.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

/**
 * 
 *@Name : DateTimeTest
 *@Author : LH
 *@Date : 2018-3-15����03:29:51
 *@Version : V1.0
 * @Description:
 * 1��jdk1.7��ȡ�����ա�Сʱ������
 * 2��1.7��ȡ1970��1��1��0ʱ0��0�뵽���ڵĺ�����
 * 3����ȡĳ�µ����һ��
 * 4����ʽ������
 * 5������ĵ�ǰʱ��
 */
public class DateTimeTest {

	
	@Test
	public void myTest(){
		//1\jdk1.7��ȡ�����ա�Сʱ������
		Calendar cal =Calendar.getInstance();
		System.out.println(cal.get(Calendar.YEAR)+"\t");//��
		System.out.print(cal.get(Calendar.MONTH)+1+"\t");//��
		System.out.print(cal.get(Calendar.DATE)+"\t");//��
		System.out.print(cal.get(Calendar.HOUR_OF_DAY)+"\t");//ʱ
		System.out.print(cal.get(Calendar.MINUTE)+"\t");//��
		System.out.println(cal.get(Calendar.SECOND)+"\t");//��

		//2��1.7��ȡ1970��1��1��0ʱ0��0�뵽���ڵĺ�����
		System.out.println(Calendar.getInstance().getTimeInMillis());
		System.out.println(System.currentTimeMillis());
		
		//3����ȡĳ�µ����һ��
		Calendar time = Calendar.getInstance();
		int day = time.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(day);
		
		//4����ʽ������
        SimpleDateFormat oldFormatter = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
	    System.out.println(oldFormatter.format(date));
	    
	    //5������ĵ�ǰʱ��
	    Calendar cal2 = Calendar.getInstance();
	    cal2.add(Calendar.DATE, -1);
	    System.out.println(cal2.getTime());
	    System.out.println(oldFormatter.format(cal2.getTime()));
	}
}
