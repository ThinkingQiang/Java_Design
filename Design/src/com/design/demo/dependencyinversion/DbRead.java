package com.design.demo.dependencyinversion;


/**
 * 数据库读取类
 * @author Toni
 */
public class DbRead implements Reader {
	
	private   int num1=0;
	private   int num2=0;

	
	@Override
	public void getNum(Object o) {
		//数据库读取数据
	}


	public int getNum1() {
		return num1;
	}


	public void setNum1(int num1) {
		this.num1 = num1;
	}


	public int getNum2() {
		return num2;
	}


	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	
}
