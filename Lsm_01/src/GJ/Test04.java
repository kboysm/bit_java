package GJ;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Date;

public class Test04 {
	public static void main(String[] args) {
		String filename = "data.obj";
		FileInputStream fis =null;
		ObjectInputStream ois =null;
		try {
			fis = new FileInputStream(filename);
			ois =new ObjectInputStream(fis);
			
			System.out.println("data object read");
			String name=(String)ois.readObject();
			Date date =(Date)ois.readObject();
			
			System.out.println("Read : "+name);
			System.out.println("Read : "+date);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
