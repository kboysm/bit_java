package day16;

import java.io.IOException;

public class Test03 {
	public static void main(String[] args) {
		int jumsu = 90;
		System.out.println("main start");
		try {
			if (!(jumsu >= 0 && jumsu <= 100))
				throw new IOException("점수가 유효하지 않습니다.");
//		throw new RuntimeException("~~~문제 발생~~~");}
		} catch (IOException e) {
			System.out.println("고의로 문제발생");
//RuntimeException 이녀석은 언체크드라서 실행해야 오류가 난다.
			// throw new IOException 이녀석은 체크드 익셉션이라서 트라이캐치를 꼭 해야 컴파일을 통과한다. 런타임익셉션이 아니다.
		} finally {
			System.out.println("hi");
		}
		System.out.println("main end");
	}
}
//오류에 대한 적절한 메세지를 뿌려주는 행동 = 예외 핸들링
//에러 메세지는 유저의 화면에 찍혀야함.