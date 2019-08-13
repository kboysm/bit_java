package day20;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;

public class Test04 {
	public static void main(String[] args) {
		new UI();
	}
}

class UI{
	Frame f;
	Button ok,exit;
	
	UI(){
	f=new Frame();
	ok=new Button("ok");
	exit=new Button("Exit");
	Panel p1 = new Panel();
	p1.add(ok);
	p1.add(exit);
	f.add(p1);
	f.setSize(500, 500);
	f.setVisible(true);
	}
}
//DAO -> 데이터베이스와 연동만 하는 클래스 
//VO -> 그냥 데이타
// 스프링 프레임 웍은 분산환경 지원하지 않고 가벼운 프로그램 , Ejb에 비해 쉽다 
//---------------------------------------------------------------------------------------------------//

//AWT는 무겁고 os에 어느정도 의존적 -> 스윙 등장! 스윙은 명령어 앞에 J가 붙는다 