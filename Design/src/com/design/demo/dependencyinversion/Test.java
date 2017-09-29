package com.design.demo.dependencyinversion;

public class Test {

	public static void main(String[] args) {
		
		FileRead reader=new FileRead();
		
		reader.getNum("e:\\num.txt");
		
		Calculate c=new Calculate();
		
		double result=c.count(reader.getNum1(), reader.getNum2());
		
		System.out.println("result:"+result);
		
		//同样可以使用其他的实现类，比如使用DbRead类，具体getNum()方法没有实现
		DbRead dbRead=new DbRead();
		
		dbRead.getNum(null);
		
		double result2=c.count(dbRead.getNum1(), dbRead.getNum2());
		
		System.out.println("result2:"+result2);
		
		//..............
		
	}
}
