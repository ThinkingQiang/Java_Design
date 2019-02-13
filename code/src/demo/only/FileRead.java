package demo.only;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FileRead {

	public  int num1=0;
	public  int num2=0;
	
	public void  getNumValue(String filePath){
		try {
			File file=new File(filePath);
			BufferedReader reader=new BufferedReader(new FileReader(file));
			num1=Integer.parseInt(reader.readLine());
			num2=Integer.parseInt(reader.readLine());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
