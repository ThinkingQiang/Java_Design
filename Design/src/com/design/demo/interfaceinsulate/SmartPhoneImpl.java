package com.design.demo.interfaceinsulate;

/**
 * �����ֻ��Ľӿ�ʵ��
 * @author Toni
 */
public class SmartPhoneImpl implements SmartPhone {

	@Override
	public void playGame() {
		System.out.println("�����ֻ�����Ϸ");
	}


	@Override
	public void sendInfo() {
		System.out.println("������Ϣ");
	}

	@Override
	public void call() {
		System.out.println("��绰");
	}

}
