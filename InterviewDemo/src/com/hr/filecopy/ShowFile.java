package com.hr.filecopy;

import java.io.File;

import org.junit.Test;

/**
 * 
 *@Name : ShowFile
 *@Author : LH
 *@Date : 2018-3-22����06:27:47
 *@Version : V1.0
 * @Description: 71��java�����г�һ��Ŀ¼�����е��ļ�
 */
public class ShowFile {

		/**
		 * ���ֻҪ���г���ǰ�ļ����µ��ļ�
		 */
	   @Test
	   public void test1(){
		   File f = new File("F:\\IT_Data");
		   for(File temp : f.listFiles()){
			   if(temp.isFile()){
				   System.out.println(temp.getName());
			   }
		   }
	   }
	   
	   /**
	    * �����Ҫ���ļ��м���չ��
	    */
	   @Test
	   public void test2(){
		   showDirectory(new File("F:\\IT_Data\\JavaScript"));
	   }
	   public static void showDirectory(File f){
		   _walkDirectory(f,0);
	   }
	   
	   private static void _walkDirectory(File f,int level){
		   if(f.isDirectory()){
			   for(File temp:f.listFiles()){
				   _walkDirectory(temp, level+1);
			   }
		   }else{
			   for (int i = 0; i < level - 1; i++) {
				System.out.println("\t");
			   }
			   System.out.println(f.getName());
		   }
	   }
	   
}
