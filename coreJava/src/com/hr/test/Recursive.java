package com.hr.test;

/**
 * 
 *@Name : Recursive
 *@Author : LH
 *@Date : 2018-12-11����05:42:12
 *@Version : V1.0
 *@Description:  �׳˵ݹ����
 *  �׳˽��ܣ�һ���������Ľ׳�������С�ڼ����ڸ������������Ļ���������0�Ľ׳�Ϊ1����Ȼ��n�Ľ׳�д��n!
   *   ���׳˺����ǵݹ麯������ʾ����
 *  �׳˵�ʵ�ַ�����һ�ֵݹ飬����ѭ��������������
 */
public class Recursive {
	
	/**
	 * ����1���ݹ�
	 * @param num
	 * @return
	 */
	public static int factorial(int num){
		if(num <0){
			return -1;
		} else if(num ==0 || num ==1){
			return 1;
		} else {
			return (num* factorial(num - 1));
		}
		
	}
	
	/**
	 * ����2��forѭ��
	 * @param num
	 * @return
	 */
	public static int fordigui(int num){
		if(num < 0){
			return -1;
		} else if (num == 0 || num ==1){
			return 1;
		} else {
			for (int i = num -1 ; i >= 1; i--) {
				num *= i;
			}
		}
		return num;
	}
	
	/**
	 * ����3��whileѭ��
	 * @param num
	 * @return
	 */
	public static int whileDiGui(int num) { 
	    int result = num; 
	    if (num < 0) { 
	        return -1; 
	    } else if (num == 0 || num == 1) { 
	        return 1; 
	    } else { 
	        while (num > 1) { 
	            num--; 
	            result *= num; 
	        } 
	    } 
	    return result; 
	};

	/**
	 * ����4��β�ݹ�
	 * @param n
	 * @param total
	 * @return
	 */
	public static int factorial(int n,int total){
		if(n == 1) return total;
		return factorial(n-1, n*total);
	}

}
