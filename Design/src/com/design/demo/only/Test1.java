package com.design.demo.only;

public class Test1 {

	/**
	 * 测试结果
	 */
	public static void main(String[] args) {
		String filePath="e:\\num.txt"; //文件路径根据实际情况定，文件内容为num1和num2的值
		
		Calculate c=new Calculate();
		
		double result=c.count(filePath);
		System.out.println("result："+result);
		
		
	}
}
