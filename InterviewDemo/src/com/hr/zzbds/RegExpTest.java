package com.hr.zzbds;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

/**
 * 
 *@Name : RegExpTest
 *@Author : LH
 *@Date : 2018-3-23����04:34:17
 *@Version : V1.0
 * @Description: ��δ��ַ����н�ȡ��һ��Ӣ��������֮ǰ���ַ��������磺  ������(������)(������)(������)��
 * ��ȡ���Ϊ�����У�������ʽ��ôд��
 *
 */
public class RegExpTest {

	@Test
	public void regTest(){
	    /* String str ="������(������)(������)(������)";
	     Pattern p = Pattern.compile(".*?(?=\\()");*/
	     String str ="������(������)[������)(������)";
	     Pattern p = Pattern.compile(".*?(?=\\[)");
	     Matcher m = p.matcher(str);
	     if(m.find()){
	    	 System.out.println(m.group());
	     }
	}
}
