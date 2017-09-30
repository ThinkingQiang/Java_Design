package com.design.demo.dmt;

/**
 * DIY ���Ի�������
 * @author Toni
 */
public class DiyComputer {

	private ComputerModule module;
	
	public DiyComputer(){
		
	}
	
	public void  addNetWorkCard()
	{
		System.out.println("���"+module.getNetworkCard()+"�ͺ� �Կ�");
	}
	
	public  void addCpu()
	{
		System.out.println("���"+module.getCpu()+"�ͺ� CPU");
	}
	
	public void addDisplayCard()
	{
		System.out.println("���"+module.getDisplayCard()+"�ͺ� �Կ�");
	}
	
	public void addProcessor()
	{
		System.out.println("���"+module.getProcessor()+"�ͺ� ������");
	}
	
	public void printComputerInfo(){
		System.out.println("�õ��Ե�������Ϣ���£�");
		System.out.println("CPU��"+module.getCpu());
		System.out.println("DisplayCard��"+module.getDisplayCard());
		System.out.println("Processor��"+module.getProcessor());
		System.out.println("NetWorkCard��"+module.getNetworkCard());
	}
	

	public ComputerModule getModule() {
		return module;
	}
	public void setModule(ComputerModule module) {
		this.module = module;
	}
	
}
