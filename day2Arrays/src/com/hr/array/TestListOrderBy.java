package com.hr.array;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.hr.entity.Student;


public class TestListOrderBy {

	
	 /**
	  * (1)ʹ��ð�������㷨
	  * ������ĿҪ���ǰ���ѧ���ĳɼ�������ˣ��ڱ�������Ԫ��ʱҪ����������бȽϣ���������������ӦԪ�ص�ֵ��
	  * ʵ�ֵĴ���������ʾ��
	  */
	  @Test
	  public void testStudent(){
		  List<Student> list = new ArrayList<Student>();
		  list.add(new Student(1,"С��",20,98));
		  list.add(new Student(2,"С��",18,99));
		  list.add(new Student(3,"С��",19,96));
		  //ʹ��ð�������㷨
		  for(int i=0; i< list.size()-1;i++){
			  for(int j=0; j<list.size()-1-i;j++){
				  if(list.get(j).getScore()>list.get(j+1).getScore()){
					  Student student=list.get(j);
					  list.set(j, list.get(j+1));
					  list.set(j+1, student);
				  }
			  }
		  }
		  
		  for(Student stu:list){
		  System.out.println(stu);
		  }
	  }
	
}
