package com.ann.test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.ann.bean.Filter;
import com.ann.bean.Filter2;
import com.ann.util.Column;
import com.ann.util.Table;

/**
 *   ע����Ŀʵս
 * @Name  : Test
 * @Author : LH
 * @Date : 2018��6��9�� ����12:43:25
 * @Version : V1.0
 * 
 * @Description : 
 *        ��Ŀ˵���� ��Ŀȡ��һ����˾�ĳ־ò�ܹ�����������hibernate�Ľ�����������Ĵ���ͨ��ע����ʵ�֡�
 *        ����1����һ���û����ֶΰ����û�id���û������ǳƣ����䣬�Ա����ڳ��У����䣬�ֻ��š�
 *                 2������Ķ�ÿ���ֶλ��ֶε�����������м���������ӡSQL��
 *                 3.ʹ�÷�ʽҪ�㹻�򵥣�����ʾ�����¡�
 *              
 */
public class Test {
	
	 			public static void main(String[] args) {
					Filter f1 = new Filter();
					f1.setId(10);//��ѯidΪ10 ���û�
					
					Filter f2 = new Filter();
					f2.setUserName("luck");//��ѯ�û���Ϊ��luck�����û�
					f2.setAge(18);
					
					Filter f3 = new Filter();
					//f3.setEmail("carl@sina.com,ksana@sina.com,zh@163.com");//��ѯ����Ϊ��������һ����
					f3.setEmail("carl@sina.com");//��ѯ����Ϊ��������һ����
				
	 			   String sql1 = query(f1);
	 			   String sql2 = query(f2);
	 			   String sql3 = query(f3);
	 			   
	 			   System.out.println(sql1);
	 			   System.out.println(sql2);
	 			   System.out.println(sql3);
	 			   
	 			   Filter2 filter2 = new Filter2();
	 			   filter2.setAmount(10);
	 			   filter2.setName("������");
	 			   System.out.println(query(filter2));
	 			}
	 			
	 			private static String query(Object filter) {
	 				StringBuilder sb = new StringBuilder();
	 				//1.��ȡclass
	 				Class c = filter.getClass();
	 				//2.��ȡtable������
	 				boolean exists = c.isAnnotationPresent(Table.class);
	 				if(!exists) {
	 					return null;
	 				}
	 				
	 				Table table =   (Table) c.getAnnotation(Table.class);
	 				String tableName = table.value();
	 				//System.out.println(tableName);
	 				sb.append("select * from ").append(tableName).append(" where 1=1 ");
	 				//3.���������ֶ�
	 				Field [] fs = c.getDeclaredFields();
	 				 //4.����ÿ���ֶζ�Ӧ��sql
	 				for (Field field : fs) {
	 					 //4.1���õ��ֶ���
	 					boolean fExists =  field.isAnnotationPresent(Column.class);
	 					if(!fExists) {
	 						continue;
	 					}
						Column column = field.getAnnotation(Column.class);
						String columnName = column.value();
						//System.out.println(columnName);
	 					//4.2�õ��ֶ�ֵ
						String fieldName = field.getName();
						String getMethodName = "get"+fieldName.substring(0, 1).toUpperCase()+fieldName.substring(1);
	 					
						Object fieldValue = null;
						try {
							Method getMethod = c.getMethod(getMethodName);
							fieldValue = getMethod.invoke(filter);
						} catch (Exception e) {
							e.printStackTrace();
						}
						//4.3ƴװsql
						if(fieldValue == null || (fieldValue instanceof Integer && (Integer)fieldValue ==0 )) {
							continue;
						}
						sb.append(" and ").append(fieldName);
						if(fieldValue instanceof String ) {
							if(((String) fieldValue).contains(",")) {
								String [] values = ((String) fieldValue).split(",");
							    sb.append(" in (");
							    for (String v : values) {
									sb.append("'").append(v).append("'").append(",");
								}
							    sb.deleteCharAt(sb.length()-1);
							    sb.append(")");
							}else {
								sb.append(" = ").append("'").append(fieldValue).append("'");
							}
						}else if(fieldValue instanceof Integer) {
							sb.append(" = ").append(fieldValue);
							
						}
	 				}
	 				
	 				return sb.toString();
	 			}
}
