package GJ;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Set;

public class Test06 {
	public static void main(String[] args) {
		String filename="account.obj";
		FileInputStream fis=null;
		ObjectInputStream ois=null;
		
		try {
			fis= new FileInputStream(filename);
			ois = new ObjectInputStream(fis);
			
			System.out.println("data Object read");
			
			Set<Account> name =(Set<Account>)ois.readObject();
			name.forEach(i->System.out.println(i));
			System.out.println("Read : "+name);
			System.out.println(ois.readObject());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
