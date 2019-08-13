package day23;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class Test03 {
	public static void main(String[] args) {
		String filename ="data.obj";
		FileOutputStream fos =null;
		ObjectOutputStream oos=null;
	
	try {
		fos = new FileOutputStream(filename);//()에 안에 있는 녀석에 저장하겠다. 경로를 설정하지 않아 이클립스의 경우 프로젝트위치 ,cmd는 빈폴더
		oos = new ObjectOutputStream(fos);
		
		String name = "홍길동";
		Date d = new Date();
		oos.writeObject(name);
		oos.flush(); //여기서 버퍼링 작업이 있다는걸 눈치채야함
		oos.writeObject(d);
		oos.flush(); //여기서 버퍼링 작업이 있다는걸 눈치채야함
		System.out.println("파일에 저장 완료");		
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}finally {
		try {
			if(oos != null) oos.close();
			if(fos != null) fos.close();
		} catch (Exception e2) {
			e2.getMessage();
		}
	}
		
	}
}
