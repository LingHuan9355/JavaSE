package com.imooc.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


/**
 * 
 *@Name : ListTest
 *@Author : LH
 *@Date : 2018-6-1����05:42:00
 *@Version : V1.0
 * 
 *@Description: ��ѡ�γ���
 */
public class ListTest {

	/**
	 * ���ڴ�ű�ѡ�γ̵�List
	 */
	@SuppressWarnings("unchecked")
	public List coursesToSelect;
	
	@SuppressWarnings("unchecked")
	public ListTest(){
		this.coursesToSelect = new ArrayList();
	}
	
	/**
	 * ������coursesToSelect����ӱ�ѡ�γ�
	 */
	@SuppressWarnings("unchecked")
	public void testAdd(){
		//����һ���γ̶��󣬲�ͨ������add��������ӵ���ѡ�γ�List��
		Course cr1 = new  Course("1", "���ݽṹ");
		coursesToSelect.add(cr1);
		Course temp = (Course) coursesToSelect.get(0);
		System.out.println("����˿γ̣�"+ temp.id + ":" + temp.name);
		
		Course cr2 = new Course("2", "C����");
		coursesToSelect.add(0,cr2);
		Course temp2 = (Course) coursesToSelect.get(0);
		System.out.println("����˿γ̣�" + temp2.id + ":" + temp2.name);
		
		//���·������׳������±�Խ���쳣
		/*Course cr3 = new Course("3", "test");
		coursesToSelect.add(4,cr3);*/
		
		coursesToSelect.add(cr1);
		Course temp0 = (Course) coursesToSelect.get(2);
		System.out.println("����˿γ̣�"+ temp0.id + ":" + temp0.name);
		
		Course [] courses = { new Course("3", "��ɢ��ѧ"), new Course("4","�������")};
		coursesToSelect.addAll(Arrays.asList(courses));
		Course temp3 = (Course) coursesToSelect.get(3);
		Course temp4 = (Course) coursesToSelect.get(4);
		
		System.out.println("��������ſγ̣�" + temp3.id  + ":" + temp3.name + 
				                     ";" + temp4.id + ":" + temp4.name);
		
		Course [] course2 ={ new Course("5", "�ߵ���ѧ"), new Course("6", "��ѧӢ��")};
		//addAll(index,?) ָ��λ�ò���Ԫ�ص���
		coursesToSelect.addAll(2, Arrays.asList(course2));
		Course temp5 = (Course) coursesToSelect.get(2);
		Course temp6 = (Course) coursesToSelect.get(3);

		System.out.println("��������ſγ̣�" + temp5.id  + ":" + temp5.name + 
				                     ";" + temp6.id + ":" + temp6.name);
		
	}
	
	/**
	 * ȡ��List�е�Ԫ�صķ���
	 * @param args
	 */
	public void testGet(){
		int size = coursesToSelect.size();
		System.out.println("�����µĿγ̴�ѡ��");
		for (int i = 0; i < size; i++) {
		Course cr= 	(Course) coursesToSelect.get(i);
		System.out.println("�γ̣�" + cr.id + ":" +cr.name);
			
		}
	}
	
	/**
	 * ͨ��������������List
	 * @param args
	 */
	@SuppressWarnings("unchecked")
	public void testIterator(){
		//ͨ�����ϵ�iterator����,ȡ�õ�������ʵ��
		  Iterator it =  coursesToSelect.iterator();
		  System.out.println("�����¿γ̴�ѡ��ͨ�����������ʣ�");
		  while (it.hasNext()) {
	               Course cr = (Course) it.next();
	               System.out.println("�γ̣� " + cr.id + ":" +cr.name);
	    	}
	}
	
	/**
	 * ͨ��for each �������ʼ���Ԫ��
	 * @param args
	 */
	public void testForEach(){
		  System.out.println("�����¿γ̴�ѡ��ͨ��for each���ʣ�");
          for (Object obj : coursesToSelect) {
			Course cr = (Course) obj;
			System.out.println("�γ̣�" + cr.id + ":" + cr.name);
		}
	}
	
	/**
	 * �޸�List��Ԫ��
	 * @param args
	 */
	@SuppressWarnings("unchecked")
	public void testModify(){
		//4λ���ϵ����ݽṹ��Ϊë��  �γ̣�1:���ݽṹ
		coursesToSelect.set(4, new Course("7", "ë��"));
		testForEach();
	}
	
	/**
	 * ɾ��List�е�Ԫ��
	 * @param args
	 */
	@SuppressWarnings("unchecked")
	public void testRemove(){
		Course cr=(Course) coursesToSelect.get(4);
		Course cr2=(Course) coursesToSelect.get(5);
		System.out.println("����ɾ��4λ�ú�5λ���ϵĿγ�");
		System.out.println(cr.id+"="+cr.name +";"+cr2.id+"="+cr2.name);
		Course [] courses = {(Course) coursesToSelect.get(4),(Course) coursesToSelect.get(5)};
		coursesToSelect.removeAll(Arrays.asList(courses));
		coursesToSelect.remove(4);
		System.out.println("�ɹ�ɾ���γ̣�");
		testForEach();
	}
	
	/**
	 * ��List�����һЩ��ֵĶ���
	 * @param args
	 */
	@SuppressWarnings("unchecked")
	public void testType(){
		System.out.println("�ܷ���List�������һЩ��ֵĶ����أ���");
		coursesToSelect.add("�Ҳ��ǿγ̣���ֻ��һ���޹����ַ�������");
		testForEach();
	}
	
	public static void main(String[] args) {
		ListTest lt = new ListTest();
		lt.testAdd();
		lt.testGet();
		lt.testIterator();
		lt.testForEach();
		
		lt.testModify();
		
		lt.testRemove();
		
		//lt.testType();
		
	}
	
	
	
}
