package day09;
import java.util.Date;
public class Test03_StringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg = "";
		msg = msg +"hello"+new java.util.Date()+"java"+" test";
		//불변의 객체를 내부적으로 계속 생성해서 더하는 식이라 성능에 매우 좋지 않다.
		System.out.println(msg);
		
//		String msg2 ="";
//		StringBuffer sb = new StringBuffer();
//		sb.append("hello ");
//		sb.append(new Date());
//		sb.append(" java");
//		sb.append(" test");
//		sb.append('A');
//		sb.append(89);
		//스트링버퍼에 담는 과정.. sb는 스트링이 아니다 성능에는 엄청난 차이가 있어서 스트링 버퍼를 써야한다.
		
//		msg2 = sb.toString();// 스트링버퍼를 스트링으로 만들어서 집어 넣는다.
//		msg2 = new String(sb); // 이거 또한 버퍼를 스트링형 변수에 담을 수 있다. 위의 방법과 동일
//		System.out.println(msg2);
		String msg2 ="";
		StringBuilder sb = new StringBuilder(); //스트링 빌더가 더 최신에 나옴 버퍼보다 버퍼보다 더 좋다고 함 이유는 잘 모르겠음.싱크로나이즈 때문
		sb.append("hello ");
		sb.append(new Date());
		sb.append(" java");
		sb.append(" test");
		sb.append('A');
		sb.append(89);
		
	}

}
