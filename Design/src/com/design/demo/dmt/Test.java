package com.design.demo.dmt;

/**
 * ������
 * @author Toni
 */
public class Test {

	public static void main(String[] args) {
		
		//��ͨ��װ���Թ���
		ComputerModule module1=new ComputerModule("i7-7700", "GTX-1080","inter", "simple");
		System.out.println("��ʼdiy����1���������£�");
		DiyComputer diy1=new DiyComputer();
		diy1.setModule(module1);
		diy1.addCpu();
		diy1.addDisplayCard();
		diy1.addNetWorkCard();
		diy1.addProcessor();
		diy1.printComputerInfo();
		
		System.out.println("----------------------�ָ���-------------------");
		
		//��ѭ������ԭ��DIY����
		ComputerModule module2=new ComputerModule("i7-8000", "GTX-1080ti","inter", "super");
		System.out.println("��ʼdiy����2���������£�");
		DiyComputer2 diy2=new DiyComputer2(module2);
		diy2.startDiy();
		
	}
}
