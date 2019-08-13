package day19;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
//login시스템에 예를 들어 설명합. (키값을 찾는 속도가 엄청나게 빠른 구조이다. ->> 해쉬맵) , key값은 중복불허 즉 기본키
public class Test02 {
	public static void main(String[] args) {
		Map<String , String> map = new HashMap<String, String>();
		//데이터를 넣는 메소드 put
		map.put("java01", "1234");
		map.put("java02", "1234");
		map.put("admin", "admin");
		map.put("test01", "test");
		
		for(int i=0 ;i<30 ; i++) {
			map.put("ttest"+i, (int)(Math.random()*3)+"00");
		}
		
		System.out.println(map); //순서와 관계없이 출력됨 ,키값으로 구분되어 나옴
		
		//특정 아이디에 해당하는 비밀번호가 궁금하다!
		
		System.out.println(map.get("admin")); //get메소드안에 키값을 넣어서 벨류값을 리턴받을 수 있다.
		System.out.println(map.get("java01")); // 위와 같음
		System.out.println(map.get("java09")); // 없는 데이터를 집어넣어 봤다 null이 나옴->이유 : 키가존재하지 않아서 

		System.out.println(map.get("ttest1")); // 없는 데이터를 집어넣어 봤다 null이 나옴->이유 : 키가존재하지 않아서 
		System.out.println("-------------------------------------------------------------");
		
		Set<String> Keynames =map.keySet(); //키 이름만 전부 뽑아주는 메서드
		Iterator<String> it = Keynames.iterator();
		while(it.hasNext()) {
			String key =it.next();
			System.out.println(map.get(key));
		}
	}
}
