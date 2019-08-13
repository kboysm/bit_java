package day20;

import java.util.Iterator;
import java.util.Properties;
import java.util.stream.Stream;

public class Test02 {
	public static void main(String[] args) {
		Properties p = new Properties(); //맵 구조를 상속 받은 아이 
		//보통 이녀석은 스트링,스트링  타입 , 이녀석은 보통 환경설정 파일을 확인할 때 사용한다. 확장자가 .Properties인 녀석이 많다
		
	p.setProperty("java01", "1234");
	p.setProperty("java02", "1234");
	p.setProperty("java03", "1234");
	p.setProperty("java04", "1234");
	p.setProperty("java05", "1234");
	//제너릭 타입 등 언급을 하지 않았는데 이녀석은 기본으로 String , String 형으로 돼 있다.
	System.out.println(p.getProperty("java01"));
	
	Iterator it = p.keySet().iterator();
	while(it.hasNext()) {
		String key=(String)it.next();
		System.out.println(key + " : "+ p.getProperty(key));
	}
	
	
	}
}
