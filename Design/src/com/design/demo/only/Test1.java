package com.design.demo.only;

public class Test1 {

	/**
	 * ���Խ��
	 */
	public static void main(String[] args) {
		String filePath="e:\\num.txt"; //�ļ�·������ʵ����������ļ�����Ϊnum1��num2��ֵ
		
		Calculate c=new Calculate();
		
		double result=c.count(filePath);
		System.out.println("result��"+result);
		
		
	}
}
