package com.design.demo.interfaceinsulate;

/**
 * ��ͨ�ֻ��Ľӿ�ʵ��
 * @author Toni
 */
public class SimpleNessPhoneImpl implements SimplenessPhone{

	
	@Override
	public void snakeGame() {
		System.out.println("��ͨ�ֻ���̰������Ϸ");
		
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
