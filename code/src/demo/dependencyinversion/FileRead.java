package demo.dependencyinversion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;


/**
 * 文件读取类
 * @author sourlemon
 */
public class FileRead implements Reader{

	private   int num1=0;
	private   int num2=0;

	@Override
	public void getNum(Object o) {
		try {
			File file=new File((String)o);
			BufferedReader reader=new BufferedReader(new FileReader(file));
			num1=Integer.parseInt(reader.readLine());
			num2=Integer.parseInt(reader.readLine());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	
}
