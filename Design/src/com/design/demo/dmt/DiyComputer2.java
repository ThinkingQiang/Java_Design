package com.design.demo.dmt;

/**
 * ��ѭ������ԭ�����Diy����
 * @author Toni
 */
public class DiyComputer2 {
	
	private ComputerModule module;
	
	public DiyComputer2(){
		
	}
	
	public DiyComputer2(ComputerModule module)
	{
		this.module=module;
	}
	
	public void startDiy()
	{
		this.addCpu(module.getCpu());
		this.addDisplayCard(module.getDisplayCard());
		this.addNetWorkCard(module.getNetworkCard());
		this.addProcessor(module.getProcessor());
		this.printComputerInfo(module);
	}
	
	private void  addNetWorkCard(String NetWorkCard)
	{
		System.out.println("���"+NetWorkCard+"�ͺ� �Կ�");
	}
	
	private  void addCpu(String cpuInfo)
	{
		System.out.println("���"+cpuInfo+"�ͺ� CPU");
	}
	
	private void addDisplayCard(String DisplayCard)
	{
		System.out.println("���"+DisplayCard+"�ͺ� �Կ�");
	}
	
	private void addProcessor(String Processor)
	{
		System.out.println("���"+Processor+"�ͺ� ������");
	}
	
	private void printComputerInfo(ComputerModule module){
		System.out.println("�õ��Ե�������Ϣ���£�");
		System.out.println("CPU��"+module.getCpu());
		System.out.println("DisplayCard��"+module.getDisplayCard());
		System.out.println("Processor��"+module.getProcessor());
		System.out.println("NetWorkCard��"+module.getNetworkCard());
	}
	
}
