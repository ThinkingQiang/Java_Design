package com.design.demo.interfaceinsulate;

/**
 * 普通手机的接口实现
 * @author Toni
 */
public class SimpleNessPhoneImpl implements SimplenessPhone{

	
	@Override
	public void snakeGame() {
		System.out.println("普通手机玩贪吃蛇游戏");
		
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
