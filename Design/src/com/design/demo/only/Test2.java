package com.design.demo.only;

public class Test2 {

	
	public static void main(String[] args) {
		
		String filePath="e:\\num.txt"; //文件路径根据实际情况定，文件内容为num1和num2的值
		
		FileRead read=new FileRead();
		read.getNumValue(filePath);
		
		Calculate2 c=new Calculate2();
		double result=c.count(read.num1, read.num2);
		
		System.out.println("result:"+result);
		
	}
}
