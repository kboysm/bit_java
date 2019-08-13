package day23;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Set;
//data.obj에서 읽어오는 예제 ,읽고 쓰는 순서와 데이터의 형을 잘 맞춰주라고 2~3번 말함 
public class Test06 {
	public static void main(String[] args) {
		String filename ="account.obj";
		FileInputStream fis =null;
		ObjectInputStream ois=null;
	
	try {
		fis = new FileInputStream(filename);//()에 안에서 저장하겠다. 경로를 설정하지 않아 이클립스의 경우 프로젝트위치 ,cmd는 빈폴더
		ois = new ObjectInputStream(fis);
		
		System.out.println(" data object read");

		Set<Account> name =(Set<Account>)ois.readObject();

		name.forEach(i->System.out.println(i));
		//		System.out.println("Read : "+name);		
//		System.out.println(ois.readObject());
//		System.out.println(ois.readObject()); //데이터를 다써버리면 null이 들어온다.
		//즉 while 조건문에 ois.readObject가null이 아니라면을 넣음
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}finally {
		try {
			if(ois != null) ois.close();
			if(fis != null) fis.close();
		} catch (Exception e2) {
			e2.getMessage();
		}
	}
		
	}
}
