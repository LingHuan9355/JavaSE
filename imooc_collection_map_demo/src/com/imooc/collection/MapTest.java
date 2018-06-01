package com.imooc.collection;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/**
 * Map & HashMap����
 *@Name : MapTest
 *@Author : LH
 *@Date : 2018-6-1����08:38:11
 *@Version : V1.0
 * 
 *@Description:��ֵ�ԣ�key-value������ʽ�洢
 */
public class MapTest {

	/**
	 * ������װѧ�����Ͷ���
	 * @param args
	 */
	public Map<String,Student> students;
	
	/**
	 * �ڹ������г�ʼ��student����
	 * @param args
	 */
	public MapTest(){
		this.students =new HashMap<String, Student>();
	}
	
	/**
	 * ������ӣ�����ѧ��ID,�ж��Ƿ�ռ��
	 * ��δ��ռ�ã�������������������ѧ�����󣬲�����ӵ�students��
	 * @param args
	 */
	public void testPut(){
		//����һ��Scanner����������ȡ�����ѧ��ID������
		Scanner console = new Scanner(System.in);
		int i = 0;
		while(i < 3){
				System.out.println("������ѧ��ID��");
				String ID =console.next();
				//�жϸ�ID�Ƿ�ռ��
				Student st = students.get(ID);
				if(st == null){
						//��ʾ����ѧ������
						System.out.println("������ѧ��������");
						String name = console.next();
						//�����µ�ѧ������
						Student newStudent = new Student(ID, name);
						//ͨ������students��put���������ID-ѧ��ӳ��
						students.put(ID, newStudent);
						System.out.println("�ɹ����ѧ����" + students.get(ID).name);
						i++;
				}else {
						System.out.println("��ѧ��ID�ѱ�ռ�ã�");
					    continue;
				}
		}
	}
	
	/**
	 * ����Map��keySet����
	 */
    public void testKeySet(){
    	//ͨ��keySet����������Map�е����С�������Set����
    	Set<String> keySet = students.keySet();
    	//ȡ��students������
    	System.out.println("�ܹ��У�" + students.size() + "��ѧ��!");
       //����keySet��ȡ��ÿһ�������ٵ���get����ȡ��ÿ������Ӧ��value
    	for (String stuId : keySet) {
			 Student st = students.get(stuId);
			 if(st !=null){
				 System.out.println("ѧ����" + st.name);
			 }
		}
    }
    
    /**
     * ����ɾ��Map�е�ӳ��
     */
    public void testRemove(){
    	//��ʾ�����ѧ����ID
    	System.out.println("������Ҫɾ����ѧ����ID��");
    	Scanner console = new Scanner(System.in);
    	while(true){
		    	String ID = console.next();
		    	//�жϸ�ID�Ƿ��ж�Ӧ��ѧ������
		    	Student st =students.get(ID);
		    	if( st == null){
		    		//��ʾ�����ID������
		    		System.out.println("��ID�����ڣ����������룡");
		    		continue;
		    	}
		    	students.remove(ID);
		    	System.out.println("�ɹ�ɾ��ѧ����" + st.name);
		    	break;
    	}
    } 
    /**
     * ͨ��entrySet����������Map
     */
    public void testEntrySet(){
    	//ͨ��entrySet����������Map�е����м�ֵ��
    	Set<Entry<String, Student>> entrySet = students.entrySet();
    	for (Entry<String, Student> entry : entrySet) {
			System.out.println("ȡ�ü��� " + entry.getKey());
			System.out.println("��Ӧ��ֵΪ��" + entry.getValue().name);
		}
    }    
    
    /**
     * ����put�����޸�Map�е�����ӳ��
     */
    public void testModify(){
    	//��ʾ����Ҫ�޸ĵ�ѧ��id
    	System.out.println("������Ҫ�޸ĵ�ѧ����ID��");
    	//����һ��Scanner����ȥ��ȡ�Ӽ����������ѧ��ID�ַ���
    	Scanner console = new Scanner(System.in);
    	while(true) {
    		//ȡ�ôӼ��������ѧ��ID
    		String stuID = console.next();
    		//��studnets �в��Ҹ�ѧ��ID��Ӧ��ѧ������
    	    Student student = students.get(stuID);
    	    if(student == null){
    	    	System.out.println("��ID�����ڣ����������룡");
    	    	continue;
    	    }
    	    //��ʾ��ǰ��Ӧ��ѧ�����������
    	    System.out.println("��ǰ��ѧ��ID������Ӧ��ѧ��Ϊ��" + student.name);
    	    //��ʾ�����µ�ѧ�����������޸����е�����
    	    System.out.println("�������µ�ѧ��������");
    	    String name =console.next();
    	    Student newStudent = new Student(stuID, name);
    	    students.put(stuID, newStudent);
    	    System.out.println("�޸ĳɹ���");
    	    break;
    	}
    }
    
    /**
     * ����map�У��Ƿ����ĳ��keyֵ����ĳ��Valueֵ
     */
    public  void testContainsKeyOrValue(){
    	//��ʾ����ѧ��id
    	System.out.println("������Ҫ��ѯ��ѧ��ID: ");
    	Scanner  console = new Scanner(System.in);
    	String id = console.next();
    	//��map�У���containsKey()���������ж��Ƿ����ĳ��keyֵ
       System.out.println("�������ѧ��IDΪ��" + id + "����ѧ��ӳ������Ƿ���ڣ� " +students.containsKey(id));
       if(students.containsKey(id)){
    	   System.out.println("��Ӧ��ѧ��Ϊ�� " + students.get(id).name);
       }
       //��ʾ����ѧ��������ѯ
       System.out.println("������Ҫ��ѯ��ѧ��������");
       String name = console.next();
    	//��containsVlaue()���������ж��Ƿ����ĳ��valueֵ
       if(students.containsValue(new Student(null, name))){
    	   System.out.println("��ѧ��ӳ����У�ȷʵ����ѧ����" + name);
       }else {
    	   System.out.println("��ѧ��ӳ����в����ڸ�ѧ��");   
       }
    }
    
    
	public static void main(String[] args) {
                 MapTest mt = new MapTest();
                 mt.testPut();
                 mt.testKeySet();
                 mt.testRemove();
                 mt.testEntrySet();
               //  mt.testModify();
               //  mt.testEntrySet();
	       mt.testContainsKeyOrValue();
	}

}
