package com.design.demo.openandclose;

public class Test {

	
	public static void main(String[] args) {
		WorkDay workDay1=new MondayWork();
		WorkDay workDay2=new TuesdayWork();
		WorkDay workDay3=new WednesdayWork();
		WorkDay workDay4=new ThursdayWork();
		WorkDay workDay5=new MondayWork();
		
		workDay1.doWork();
		workDay2.doWork();
		workDay3.doWork();
		workDay4.doWork();
		workDay5.doWork();
	}

}
