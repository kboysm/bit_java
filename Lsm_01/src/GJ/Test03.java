package GJ;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class Test03 {
	public static void main(String[] args) {
		String filename="data.obj";
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		try {
			fos=new FileOutputStream(filename);
			oos=new ObjectOutputStream(fos);
			
			String name="임상민";
			Date d= new Date();
			oos.writeObject(name);
			oos.writeObject(d);
			oos.flush();
			System.out.println("파일 저장 완료");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
