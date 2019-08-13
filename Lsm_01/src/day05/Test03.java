package day05;

import java.util.Arrays;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg = "hello java ~~~";
		String msg2 = " alksdjlaks";
		char[]c= new char[msg.length()];
		for(int i = 0;i < msg.length() ;i++) {
			c[i] = msg.charAt(i);
		}
		char[] cc=msg.toCharArray();
		cc[0]='Q';
		String ne = new String(cc);
		//String -> char의 배열 -> 문자 배열을 모아서 String 으로 만드는 과정을 보여줌.
		System.out.println(msg);
		System.out.println(Arrays.toString(c));
		System.out.println(Arrays.toString(cc));
		System.out.println(ne);
		//toCharArray는 위의 포문과정을 하지 않고 char배열에 스트링형 문자열을 넣어주는 명령어이다.
		
	}
//내 생각 -> 모를경우 포문으로 2~3줄가량을 적어야 하지만 명령을 알고 있고 쓸 줄 알고 있다면 반줄정도로 해결 가능
}
