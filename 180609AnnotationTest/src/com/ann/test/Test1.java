package com.ann.test;

import com.ann.bean.Child;
import com.ann.bean.Person;

/**
 * 
 * @Name  : Test1
 * @Author : LH
 * @Date : 2018��6��9�� ����10:54:30
 * @Version : V1.0
 * 
 * @Description : Java �г���ע��
 *     JDK�Դ�ע�⣺
 *          @Override  ����д�����ǣ������еķ���
 *          @Deprecated  �����÷�����ʱ
 *          @SuppressWarnings("deprecation" ) ������deprecation�������
 *     ������ע�⣺
 *         Spring ��
 *            		@Controller,@Autowird,@Service,@Repository,   
 *          Mybatis:
 *                  @InsertProvider,UpdateProvider,@Options
 *          
 */
public class Test1 {
      
	  //����deprecation�����������ʱ���ľ���
	  @SuppressWarnings("deprecation" )
	   public void sing() {
		   Person person = new Child();
		   person.sing();
	   }
}
