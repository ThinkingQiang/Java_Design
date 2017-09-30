package com.design.demo.dmt;

/**
 * 测试类
 * @author Toni
 */
public class Test {

	public static void main(String[] args) {
		
		//普通组装电脑过程
		ComputerModule module1=new ComputerModule("i7-7700", "GTX-1080","inter", "simple");
		System.out.println("开始diy电脑1，过程如下：");
		DiyComputer diy1=new DiyComputer();
		diy1.setModule(module1);
		diy1.addCpu();
		diy1.addDisplayCard();
		diy1.addNetWorkCard();
		diy1.addProcessor();
		diy1.printComputerInfo();
		
		System.out.println("----------------------分割线-------------------");
		
		//遵循迪米特原则DIY电脑
		ComputerModule module2=new ComputerModule("i7-8000", "GTX-1080ti","inter", "super");
		System.out.println("开始diy电脑2，过程如下：");
		DiyComputer2 diy2=new DiyComputer2(module2);
		diy2.startDiy();
		
	}
}
