package com.hr.test;

import java.util.Arrays;
import java.util.Scanner;

import org.junit.Test;

public class MaoPaoArrayTest {

	  
		/**
		 * ð��������������С�Ĳ�		
		 */
	   @Test
	   public void testArray1(){
		     Scanner input = new Scanner(System.in);
			  int [] arry = new int [5];
			  for (int i = 0; i < arry.length ; i++) {
				  arry[i] = input.nextInt();
			  }
		  // int [] arry = {2,5,1,9,6,4};
		   int max;
		   for (int i = 0; i < arry.length; i++) {
			    for (int j = 0; j < arry.length-1; j++) {
					if(arry[j] < arry[j+1]){
						max =arry[j+1];
						arry[j+1] = arry[j];
						arry[j]=max;
					}
				}
		   }
		  /* for (int i = 0; i < arry.length; i++) {
			    System.out.println(arry[i]);
		   }*/
		   int cha = arry[0] - arry[arry.length-1];
		   System.out.println("���ֵ����Сֵ�Ĳ" + cha);
		   
	   }
	   /**
	    * ��������
	    * Java.util.Arrays��� sort() �����ṩ������Ԫ��������
	    */
	   @Test
	   public void testArray2(){
		   Scanner input = new Scanner(System.in);
		   int [] arry = new int [5];
		   for (int i = 0; i < arry.length ; i++) {
			  arry[i] = input.nextInt();
		  }
		   
		//   int [] arry = {2,5,1,9,6,4};
		   Arrays.sort(arry);
		   for (int i = 0; i < arry.length; i++) {
			   	System.out.println(arry[i]);
		   }
		   
		   int cha = arry[arry.length-1] - arry[0];
		   System.out.println("���ֵ����Сֵ�Ĳ" + cha);
		   
	   }
	   
	   
	   /**
	    * java��ά��������㷨
		*����һ��int[] [] rr=new int[][3] ����һ��3�еĶ�ά��������㷨��Ҫ���һ�в���� �ڶ���������ӣ�
		*�����и��ڶ���һ������һ���൱һ��ʾ����Map�����Keyһ��
		*
		*n*n��ά�������
	    */
	   @Test
	   public void testArray3(){
		   int [][]a = {{1,2,4,5},{6,7,8,9},{10,11,12,13},{14,15,16,17}};
		   int sum  =0; //����sumΪ0���������
		    //˫��ѭ�������ά����
		   for(int i = 0; i < a.length; i++) { 
			   for(int j = 0; j < a[i].length ;j++){
				   // ��ά�������ȥ�����ж�
				   //if(i >= 2){
				   	sum = sum+ a[i][j];
				   //}
			   }
		   }
		   		//������
		     System.out.println(sum); 
	}
	   /**
	    * java��ά�����㷨
	    *���ά�������ֵ���ڵ��к��С�
	    */
	   @Test
	   public void testArray4(){
		   int [][]a = {{1,2,4,5},{6,7,8,9},{10,11,12,13},{14,15,16,17}};
		   int row = 0 ,colum = 0; 
		   int max =a[0][0];
		   //˫��ѭ�������ά����
		   for(int i = 0; i < a.length; i++) { 
			   for(int j = 0; j < a[i].length ;j++){
				   // ��ά�������ȥ�����ж�
				   if(a[i][j] > max){
					   max = a[i][j];
					   row = i+1;
					   colum =j+1 ;
				   }
				   
			   }
		   }
		   //������
		   System.out.println("max=" +max +",row=" +row +",colum="+colum);
		   /*���н�����£� 
		   ---------------------------------------------------------- 
		   max=10, 
		   row = 2,3 
		   colum = 1 ,2
		   ---------------------------------------------------------- 
		   */   
	   }
		
	   
	   
	 
	   
	   
}
