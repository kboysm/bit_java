package day08;

public class Card {
	String kind="다이아";
	int number;
	final static int WIDTH=100; //수정불가능 상수화처리 ->final ,보통 변수이름을 전부 대문자로 설정함
	final static int HEIGHT=250;
	public static void main (String [] args) {
		//Card.width=10; ->final처리때문에 오류발생함
		System.out.println(WIDTH+"*"+HEIGHT);
		System.out.println(new Card().kind);
	}
}
