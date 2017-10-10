package com.design.demo.interfaceinsulate;

/**
 * 智能手机的接口实现
 * @author Toni
 */
public class SmartPhoneImpl implements SmartPhone {

	@Override
	public void playGame() {
		System.out.println("智能手机玩游戏");
	}


	@Override
	public void sendInfo() {
		System.out.println("发送信息");
	}

	@Override
	public void call() {
		System.out.println("打电话");
	}

}
