package com.hr.test;

public class Test {

	public static void main(String[] args) {
		int i=12;
		System.out.println(i+=i-=i*=i);
		//i*=i 12*12 =144
		//i-=i 12-144 = -132
		//i+-i 12-132 = -120
		
		assert(i > 0);
		
		System.out.println(reverse("12345"));
	}

	public static String reverse(String str) {
	    if(str == null || str.length() <= 1)
	    	return str;
	    	
	    //����һ����ָ��λ�ÿ�ʼ��������ָ�����ȵ����ַ�����
	  /*������str.substr(start,length); //
	  ����start��ѡ����������ַ�������ʼλ�á��ַ����е�һ���ַ�������Ϊ 0��
	  ����length��ѡ����ص����ַ����а������ַ�����*/
	   /* charAt(int index)������һ���ܹ����������ض������µ��ַ���Stringʵ���ķ���.
	    charAt()��������ָ������λ�õ�charֵ��������ΧΪ0~length()-1.
	    ��: str.charAt(0)����str�еĵ�һ���ַ�,str.charAt(str.length()-1)�������һ���ַ�.*/
	    return reverse(str.substring(1)) + str.charAt(0);
	}
	
	
}
