package com.ann.bean;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 
 * @Name  : Description
 * @Author : LH
 * @Date : 2018��6��9�� ����12:04:50
 * @Version : V1.0
 * 
 * @Description : �Զ���ע��Ķ���
 */
@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface Description {

	     String value();
		//String desc();
		
		//String author();
		
		//int age() default 18;
}
