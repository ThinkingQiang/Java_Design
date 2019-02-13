package demo.interfaceinsulate;

/**
 * 测试类
 * @author sourlemon
 */
public class Test {
	public static void main(String[] args) {
		
		SimplenessPhone phone1=new SimpleNessPhoneImpl();
		phone1.snakeGame();
		
		SmartPhone phone2=new SmartPhoneImpl();
		
		phone2.playGame();
		
	}
}
