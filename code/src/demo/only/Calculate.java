package demo.only;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * 计算类
 * @author sourlemon
 */
public class Calculate {
	
	public double  count(String filePath){
		int num1=0;
		int num2=0;
		try {
			File file=new File(filePath);
			BufferedReader reader=new BufferedReader(new FileReader(file));
			num1=Integer.parseInt(reader.readLine());
			num2=Integer.parseInt(reader.readLine());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return num1+num2;	
	}
	
}
