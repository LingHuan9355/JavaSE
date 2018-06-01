package com.imooc.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * 1.ͨ��Conllections.sort()��������Integer���͵�List��������
 * 2.��String���͵�List��������
 * 3.���������ͷ��͵�list����������StudentΪ��
 * @author LH
 *
 */
public class ConllectionsTest {

	   /**
	    * 1.ͨ��Conllections.sort()��������Integer���͵�List��������
	    * ����һ��Integer���͵�List������ʮ��100���ڵĲ��ظ����������
	    * ����Collections.Sort()���������������
	    */
	public void testSort1(){
		List<Integer> integerList = new ArrayList<Integer>();
		//����ʮ��100���ڵĲ��ظ����������
		Random random = new Random();
		Integer k;
		for (int i = 0; i < 10; i++) {
			do{
				k = random.nextInt(100);
			}while(integerList.contains(k));
			integerList.add(k);
			System.out.println("�ɹ����������" + k);
		}
		System.out.println("-------------����ǰ--------------------");
	    for (Integer integer : integerList) {
			System.out.println("Ԫ�أ�" + integer);
		}
	    Collections.sort(integerList);
        System.out.println("==========�����=========");
        for (Integer integer : integerList) {
		    System.out.println("Ԫ�أ� " +integer);
	    }
	}
	
	/**
	 * 2.��String���͵�List��������
     *����String���͵�List��������������StringԪ��
     *����sort�������ٴ����������˳��
	 */
   public void testSort2(){
	   List<String> stringList = new ArrayList<String>();
	   stringList.add("microsoft");
	   stringList.add("google");
	   stringList.add("lenovo");
	   System.out.println("-------------����ǰ--------------------");
       for (String string : stringList) {
		System.out.println("Ԫ�أ�" + string);
	  }
       Collections.sort(stringList);
	   System.out.println("-------------�����--------------------");
	   for (String string : stringList) {
		   System.out.println("Ԫ�أ�" + string);
	   }
	   
   }
   
   /**
    * 3.���������ͷ��͵�list����������StudentΪ��
    */
   public void testSort3(){
	   List<Student> list = new ArrayList<Student>();
	   Random ran = new Random();
	   list.add(new Student(ran.nextInt(1000)+"","Make"));
	   list.add(new Student(ran.nextInt(1000)+"","Jack"));
	   list.add(new Student(ran.nextInt(1000)+"","Carl"));
	   list.add(new Student(10000 +"","Beyaon"));
	   System.out.println("-------------����ǰ--------------------");
	   for (Student student : list) {
		System.out.println("ѧ����"+student.id+"::" +student.name);
	   }
	   Collections.sort(list);
	   System.out.println("-------------�����--------------------");
	   for (Student student : list) {
			System.out.println("ѧ����"+student.id+"::" +student.name);
	   }
	   
	   Collections.sort(list,new StudentComparator());
	   System.out.println("-------------�������������-----------");
	   for (Student student : list) {
		   System.out.println("ѧ����"+student.id+"::" +student.name);
	   }
	   
   }
	
	
	public static void main(String[] args) {
               ConllectionsTest ct= new ConllectionsTest();
                ct.testSort1();
                ct.testSort2();
                ct.testSort3();
	}

}
