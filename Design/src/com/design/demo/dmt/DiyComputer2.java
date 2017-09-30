package com.design.demo.dmt;

/**
 * 遵循迪米特原则进行Diy电脑
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
		System.out.println("添加"+NetWorkCard+"型号 显卡");
	}
	
	private  void addCpu(String cpuInfo)
	{
		System.out.println("添加"+cpuInfo+"型号 CPU");
	}
	
	private void addDisplayCard(String DisplayCard)
	{
		System.out.println("添加"+DisplayCard+"型号 显卡");
	}
	
	private void addProcessor(String Processor)
	{
		System.out.println("添加"+Processor+"型号 处理器");
	}
	
	private void printComputerInfo(ComputerModule module){
		System.out.println("该电脑的配置信息如下：");
		System.out.println("CPU："+module.getCpu());
		System.out.println("DisplayCard："+module.getDisplayCard());
		System.out.println("Processor："+module.getProcessor());
		System.out.println("NetWorkCard："+module.getNetworkCard());
	}
	
}
