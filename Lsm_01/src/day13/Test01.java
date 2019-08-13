package day13;

import java.util.Calendar;
import java.util.Formatter;

public class Test01 {

	public static void main(String[] args) throws Exception{//th~exception 예외를 jvm이 처리할거야! 라는 의미
		// TODO Auto-generated method stub
		Calendar c = Calendar.getInstance(); //캘린더의 객체생성방법
		
		System.out.println(c);
		String data=String.format("현재시간은 %tk시 : %tM 분 : %tS 초 %n", c,c,c);
		System.out.println(data);
		
		//calendar.하면 상수화된 올 대문자로 이루어진 아이들이 많이 있다.
		
		String f=String.format("%f", Math.PI);
		
		StringBuffer sb =new StringBuffer();
//		Formatter fm = new Formatter(sb);
		Formatter fm = new Formatter("sss.txt");
		//내가 원하는 메세지를 파일에 차곡차곡 기록할때 포멧터 클래스를 많이 사용한다
		//파일io작업을 할때는 버퍼공간에 데이터를 모아서 데이터공간이 다 차면 밀어내는 식으로 한꺼번에 모아서 하드에 저장하는 방식
		fm.format("현재시간은 %tk시 : %tM 분 : %tS 초 %n", c,c,c);
		fm.format("%f %n", Math.PI);
		System.out.println(sb);
		fm.flush();
		//보통 로그파일을 만드는데 포메터를 사용한다.
		System.out.println("main end");
	}

}
