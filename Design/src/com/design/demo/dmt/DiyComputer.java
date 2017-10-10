package com.design.demo.dmt;

/**
 * DIY 电脑机器配置
 * @author Toni
 */
public class DiyComputer {

	private ComputerModule module;
	
	public DiyComputer(){
		
	}
	
	public void  addNetWorkCard()
	{
		System.out.println("添加"+module.getNetworkCard()+"型号 显卡");
	}
	
	public  void addCpu()
	{
		System.out.println("添加"+module.getCpu()+"型号 CPU");
	}
	
	public void addDisplayCard()
	{
		System.out.println("添加"+module.getDisplayCard()+"型号 显卡");
	}
	
	public void addProcessor()
	{
		System.out.println("添加"+module.getProcessor()+"型号 处理器");
	}
	
	public void printComputerInfo(){
		System.out.println("该电脑的配置信息如下：");
		System.out.println("CPU："+module.getCpu());
		System.out.println("DisplayCard："+module.getDisplayCard());
		System.out.println("Processor："+module.getProcessor());
		System.out.println("NetWorkCard："+module.getNetworkCard());
	}
	

	public ComputerModule getModule() {
		return module;
	}
	public void setModule(ComputerModule module) {
		this.module = module;
	}
	
}
