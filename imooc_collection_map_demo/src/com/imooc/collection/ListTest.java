package com.imooc.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


/**
 * 
 *@Name : ListTest
 *@Author : LH
 *@Date : 2018-6-1下午05:42:00
 *@Version : V1.0
 * 
 *@Description: 备选课程类
 */
public class ListTest {

	/**
	 * 用于存放备选课程的List
	 */
	@SuppressWarnings("unchecked")
	public List coursesToSelect;
	
	@SuppressWarnings("unchecked")
	public ListTest(){
		this.coursesToSelect = new ArrayList();
	}
	
	/**
	 * 用于往coursesToSelect中添加备选课程
	 */
	@SuppressWarnings("unchecked")
	public void testAdd(){
		//创建一个课程对象，并通过调用add方法，添加到备选课程List中
		Course cr1 = new  Course("1", "数据结构");
		coursesToSelect.add(cr1);
		Course temp = (Course) coursesToSelect.get(0);
		System.out.println("添加了课程："+ temp.id + ":" + temp.name);
		
		Course cr2 = new Course("2", "C语言");
		coursesToSelect.add(0,cr2);
		Course temp2 = (Course) coursesToSelect.get(0);
		System.out.println("添加了课程：" + temp2.id + ":" + temp2.name);
		
		//以下方法会抛出数组下标越界异常
		/*Course cr3 = new Course("3", "test");
		coursesToSelect.add(4,cr3);*/
		
		coursesToSelect.add(cr1);
		Course temp0 = (Course) coursesToSelect.get(2);
		System.out.println("添加了课程："+ temp0.id + ":" + temp0.name);
		
		Course [] courses = { new Course("3", "离散数学"), new Course("4","汇编语言")};
		coursesToSelect.addAll(Arrays.asList(courses));
		Course temp3 = (Course) coursesToSelect.get(3);
		Course temp4 = (Course) coursesToSelect.get(4);
		
		System.out.println("添加了两门课程：" + temp3.id  + ":" + temp3.name + 
				                     ";" + temp4.id + ":" + temp4.name);
		
		Course [] course2 ={ new Course("5", "高等数学"), new Course("6", "大学英语")};
		//addAll(index,?) 指定位置插入元素递增
		coursesToSelect.addAll(2, Arrays.asList(course2));
		Course temp5 = (Course) coursesToSelect.get(2);
		Course temp6 = (Course) coursesToSelect.get(3);

		System.out.println("添加了两门课程：" + temp5.id  + ":" + temp5.name + 
				                     ";" + temp6.id + ":" + temp6.name);
		
	}
	
	/**
	 * 取得List中的元素的方法
	 * @param args
	 */
	public void testGet(){
		int size = coursesToSelect.size();
		System.out.println("有如下的课程待选：");
		for (int i = 0; i < size; i++) {
		Course cr= 	(Course) coursesToSelect.get(i);
		System.out.println("课程：" + cr.id + ":" +cr.name);
			
		}
	}
	
	/**
	 * 通过迭代器来遍历List
	 * @param args
	 */
	@SuppressWarnings("unchecked")
	public void testIterator(){
		//通过集合的iterator方法,取得迭代器的实例
		  Iterator it =  coursesToSelect.iterator();
		  System.out.println("有如下课程待选（通过迭代器访问）");
		  while (it.hasNext()) {
	               Course cr = (Course) it.next();
	               System.out.println("课程： " + cr.id + ":" +cr.name);
	    	}
	}
	
	/**
	 * 通过for each 方法访问集合元素
	 * @param args
	 */
	public void testForEach(){
		  System.out.println("有如下课程待选（通过for each访问）");
          for (Object obj : coursesToSelect) {
			Course cr = (Course) obj;
			System.out.println("课程：" + cr.id + ":" + cr.name);
		}
	}
	
	/**
	 * 修改List的元素
	 * @param args
	 */
	@SuppressWarnings("unchecked")
	public void testModify(){
		//4位置上的数据结构改为毛概  课程：1:数据结构
		coursesToSelect.set(4, new Course("7", "毛概"));
		testForEach();
	}
	
	/**
	 * 删除List中的元素
	 * @param args
	 */
	@SuppressWarnings("unchecked")
	public void testRemove(){
		Course cr=(Course) coursesToSelect.get(4);
		Course cr2=(Course) coursesToSelect.get(5);
		System.out.println("即将删除4位置和5位置上的课程");
		System.out.println(cr.id+"="+cr.name +";"+cr2.id+"="+cr2.name);
		Course [] courses = {(Course) coursesToSelect.get(4),(Course) coursesToSelect.get(5)};
		coursesToSelect.removeAll(Arrays.asList(courses));
		coursesToSelect.remove(4);
		System.out.println("成功删除课程！");
		testForEach();
	}
	
	/**
	 * 往List中添加一些奇怪的东西
	 * @param args
	 */
	@SuppressWarnings("unchecked")
	public void testType(){
		System.out.println("能否往List的中添加一些奇怪的东西呢！？");
		coursesToSelect.add("我不是课程，我只是一个无辜的字符串！！");
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
