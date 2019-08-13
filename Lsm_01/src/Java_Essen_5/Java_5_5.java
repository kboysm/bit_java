package Java_Essen_5;

import java.util.Scanner;

public class Java_5_5 {
	public static void main(String[] args) {
		System.out.println(">");
		SS lsm = new SS();
	}
}
interface SI{
	int length(); //스택에 들어 있는 문자열 개수 리턴
	String pop(); // 스택의 톱에 있는 문자열 팝
	boolean push(String ob); // 스택의 톱에 문자열 ob 푸시 삽입
}
class SS implements SI{
	@Override
	public int length() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public String pop() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean push(String ob) {
		// TODO Auto-generated method stub
		return false;
	}
}