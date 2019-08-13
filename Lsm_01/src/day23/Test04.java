package day23;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Date;
//data.obj에서 읽어오는 예제 ,읽고 쓰는 순서와 데이터의 형을 잘 맞춰주라고 2~3번 말함 
public class Test04 {
	public static void main(String[] args) {
		String filename ="data.obj";
		FileInputStream fis =null;
		ObjectInputStream ois=null;
	
	try {
		fis = new FileInputStream(filename);//()에 안에서 저장하겠다. 경로를 설정하지 않아 이클립스의 경우 프로젝트위치 ,cmd는 빈폴더
		ois = new ObjectInputStream(fis);
		
		System.out.println(" data object read");
		String name =(String)ois.readObject();
		Date date =(Date)ois.readObject();
		System.out.println("Read : "+name);		
		System.out.println("Read : "+date);
		
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
