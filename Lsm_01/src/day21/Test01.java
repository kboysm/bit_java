package day21;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new UI_1();
	}

}

class UI_1 { // extends Frame{// 이건 클래스 자체가 프레임이라는 것 .
	Frame f1; // has a 관계 , 윈도우 이벤트 ->마찬가지로 감시자 필요 WindowListener();
	Button red, blue, exit; // 액션이벤트 , 버튼이 눌려지는걸 감지해야 함 ->감시자를 붙임(Listener : 액션이벤트가 감지하는지를 감시)
	Panel p1;

	UI_1() {
		f1 = new Frame("awt UI Test ~~");
		p1 = new Panel();
		p1.add(red = new Button("RED")); // new 버튼안에 있는 글은 버튼의 제목으로 들어간다
		p1.add(blue = new Button("BLUE"));
		p1.add(exit = new Button("EXIT"));
		f1.add(p1, BorderLayout.SOUTH); // add(p1)할수도 있고 (p1,레이아웃.방향)으로 조절할 수 도 있다.

		f1.setSize(300, 300);
		f1.setVisible(true);

		red.addActionListener(
			//액션리스너는 추상메서드가 하나만 존재해서 액션어댑터는 존재이유가 없다 . 
			(e)-> p1.setBackground(Color.red));
		exit.addActionListener(new ActionListener() {
			//액션리스너는 추상메서드가 하나만 존재해서 액션어댑터는 존재이유가 없다 . 
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				f1.setVisible(false);
				f1.dispose();
				System.exit(0);
			}
		});
		blue.addActionListener(new ActionListener() {
			//액션리스너는 추상메서드가 하나만 존재해서 액션어댑터는 존재이유가 없다 . 
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				p1.setBackground(Color.blue);
			}
		});
		f1.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				f1.setVisible(false); //빨리 우리눈에서 사라지게 하기 위해 안보이게 함
				f1.dispose();// UI를 다 파괴시키는 작업 
				System.exit(0);

			}
		});//만약 이벤트가 발생하면 해야할 일은 ()에 있어 ~라는 의미
	
	}
}
//	class windowEventP extends WindowAdapter {// implements WindowListener의 오버라이딩을 이미 해놓은 녀석이 윈도우어댑터
//		// 다른 오버라이딩 녀석들을 오버라이딩 하지 않아도 내가 필요한 녀석만 해서 사용가능 윈도우어댑터!
//		//이녀석을 내부클래스화 시켜서 f1에 접근할 수 있게 함 
//		@Override
//		public void windowClosing(WindowEvent e) {
//			// TODO Auto-generated method stub
//			f1.setVisible(false); //빨리 우리눈에서 사라지게 하기 위해 안보이게 함
//			f1.dispose();// UI를 다 파괴시키는 작업 
//			System.exit(0);
//
//		}
//	} 밖에 클래스가 있는 재활용이 되는 녀석을 위에 어노미너스 클래스로 재활용이 안되는 녀석으로 내가 필요한 메서드만 오버라이딩해서 구현했음
//내부클래스로도 밖에 따로 둘수도 어너미너스 클래스로 활용하고 버릴 수도 있다 즉 3가지 방법을 배웠다.

//이벤트의 종류 알기
/*
 * 버튼을 클릭하거나 리스트아이템을 더블클릭하거나 텍스트필드에서 엔터키를 누를때 (나 이거 다했어 처리해줘 ~ 하는게 액션이벤트)
 * ex)아이디를 입력 후 엔터누르면 반응x 패스워드는 반응o 버튼이나 텍스트필드 리스트상자에서 항목을 더블클릭 했을때
 * 
 * 윈도우 이벤트 : 윈도우에서 발생할 수 있는 이벤트
 */
