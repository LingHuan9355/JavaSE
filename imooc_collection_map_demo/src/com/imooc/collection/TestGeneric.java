package com.imooc.collection;

import java.util.ArrayList;
import java.util.List;
/**
 * 
 *@Name : TestGeneric
 *@Author : LH
 *@Date : 2018-6-1����06:41:52
 *@Version : V1.0
 * 
 *@Description: Ӧ�÷��͹���
 */
public class TestGeneric {

	/**
	 * ���з��͡���Course����List��������
	 */
	public List<Course> courses;
	
	public TestGeneric(){
		this.courses = new ArrayList<Course>();
	}
	
	/**
	 * ���Ӳ���
	 */
   public void testAdd(){
	   Course cr1 = new Course("1", "��ѧ����");
	   courses.add(cr1);
	   //���ͼ����У��������ӷ��͹涨�����ͼ�������������Ķ��󣬷���ᱨ����
	  // courses.add("�ܷ�����һЩ��ֵĶ����أ���");
	   Course cr2 = new Course("2","Java����");
	   courses.add(cr2);
   }	
   
   /**
    * ����ѭ������
    */
   public void testForEach(){
	    for (Course cr : courses) {
	    	System.out.println(cr.id + ":" +cr.name);
    	}
   }
   
   /**
    * ���ͼ��Ͽ������ӷ��͵������͵Ķ���ʵ��
    * @param args
    */
   public void testChild(){
	   ChildCourse ccr = new ChildCourse();
	   ccr.id = "3";
	   ccr.name = "���������͵Ŀγ̶���ʵ��~~";
	   courses.add(ccr);
	   testForEach();
   }
   
   /**
    * ���Ͳ���ʹ�û�������
    * @param args
    */
    public void testBaiscType(){
    	List<Integer> list= new ArrayList<Integer>();
    	list.add(1);
    	System.out.println("�������ͱ���ʹ�ð�װ����Ϊ���ͣ�" + list.get(0));
    }
   
	public static void main(String[] args) {
                 TestGeneric tg = new TestGeneric();
                 tg.testAdd();
                 tg.testForEach();
                 tg.testChild();
                 
                 tg.testBaiscType();
	}

}