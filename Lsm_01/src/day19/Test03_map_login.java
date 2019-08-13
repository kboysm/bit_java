package day19;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
//login시스템에 예를 들어 설명합. (키값을 찾는 속도가 엄청나게 빠른 구조이다. ->> 해쉬맵) , key값은 중복불허 즉 기본키
public class Test03_map_login {
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
		
		Scanner lsm = new Scanner(System.in);
		while(true) {
			System.out.println(" 로그인 처리");
			System.out.println("id/password 형식으로 입력하시오");
			String data = lsm.nextLine();
			String aa[] = data.split("/");
			if(map.containsKey(aa[0])) {
				if(map.get(aa[0]).equals(aa[1])) {
					System.out.println("로그인 성공");
					break;
				}else {
					System.out.println("pw가 불일치");
					System.out.println("다시 로긴 하시오");
				}
			}else {
				System.out.println("id가 존재하지 않습니다.");
				System.out.println("회원가입 후 이용하세요");
			}
//			map.put(aa[0], aa[1]);
		}
		
	}
}
