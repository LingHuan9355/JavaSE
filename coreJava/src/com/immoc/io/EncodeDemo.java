package com.immoc.io;

/**
 * 
 *
 *@Description: �ֽڱ��� code
 *
 *@Name : EncodeDemo
 *@Author : LH
 *@Date : 2018-6-1����10:36:11
 *@Version : V1.0
 *
 */
public class EncodeDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String s = "Ľ��ABC";
		byte [] bytes1 = s.getBytes();//ת�����ֽ������õ�����ĿĬ�ϵı���gbk
		for (byte b : bytes1) {
			//���ֽڣ�ת����int����16���Ƶķ�ʽ��ʾ
			   System.out.print(Integer.toHexString(b & 0xff) + " ");
		}
		System.out.println();
		byte [] byte2 = s.getBytes("gbk");
		//gbk ��������ռ�������ֽڣ�Ӣ��ռ��1���ֽ�
		for (byte b : byte2) {
			System.out.print(Integer.toHexString(b & 0xff)+ " ");
		}
		System.out.println();
		byte [] byte3 = s.getBytes("utf-8");
		//utf-8 ��������ռ�������ֽڣ�Ӣ��ռ��1���ֽ�
		for (byte b : byte3) {
			System.out.print(Integer.toHexString(b & 0xff)+ " ");
		}
		
		//java��˫�ֽڱ��� utf-16be
		byte [] byte4 = s.getBytes("utf-16be");
		//utf-16be ����ռ��2���ֽ� Ӣ��ռ��2���ֽ�
		for (byte b : byte4) {
			System.out.print(Integer.toHexString(b & 0xff)+ " ");
		}
		System.out.println();
		/*
		 * ������ֽ�����ʽĳ�ֱ���ʱ�����ʱ������ֽ����б��
		 * �ַ�����Ҳ��Ҫ���ֱ��뷽ʽ��������������
		 * 		 
		 * */
       String str1 =new String(byte4);//��ĿĬ�ϵı���
       System.out.println(str1);
       String str2 = new String(byte4,"utf-16be");
       System.out.println(str2);
       String str3 = new String(byte3,"utf-8");
       System.out.println(str3);
       /*
        * �ı��ļ� �����ֽ�����
        * ��������������ֽ�����
        * ������������Ļ�����ֱ�Ӵ����ı��ļ������ı��ļ�ֻ��ʶansi����
        * ��ͨ��������һ���ɺϣ��������÷���utf-8����Ĺ���
        */
	}

}
