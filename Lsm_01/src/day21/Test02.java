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

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new UI_2();
	}

}

class UI_2 extends Frame { 

	Button red, blue, exit; 
	Panel p1;

	UI_2() {
		super("awt UI Test ~~"); //Frame을 상속받은 녀석이므로 프레임이 만들어 질때 위의 내용을 전달하여 생성 
		p1 = new Panel();
		p1.add(red = new Button("RED"));
		p1.add(blue = new Button("BLUE"));
		p1.add(exit = new Button("EXIT"));
		add(p1, BorderLayout.SOUTH); 

		setSize(300, 300);
		setVisible(true);

		red.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				p1.setBackground(Color.red);
			}
		});
		exit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				dispose();
				System.exit(0);
			}
		});
		blue.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				p1.setBackground(Color.blue);
			}
		});
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				setVisible(false); 
				dispose(); 
				System.exit(0);

			}
		});
	
	}
}
//	class windowEventP_1 extends WindowAdapter {
//		@Override
//		public void windowClosing(WindowEvent e) {
//			f1.setVisible(false); //빨리 우리눈에서 사라지게 하기 위해 안보이게 함
//			f1.dispose();// UI를 다 파괴시키는 작업 
//			System.exit(0);
//
//		}
//	} 

