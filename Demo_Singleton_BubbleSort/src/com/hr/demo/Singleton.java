package com.hr.demo;

/**
 * ����ģʽ��
 * @author LH
 *
 */
public class Singleton {

	/**
	 * ����ʽ
	 */
	/* 
	   private static Singleton instance = new Singleton();
	   private Singleton(){}
	   public static Singleton getInstance(){
		   return instance;
	   }*/
	
	/**
	 * ����ʽ
	 */
		
	   private static Singleton instance= null;
	   private Singleton(){}
	   public static synchronized Singleton getInstance(){
		   if (instance == null){
			   instance = new Singleton();
		   }
		   return instance;
	   }
	   
	
}
