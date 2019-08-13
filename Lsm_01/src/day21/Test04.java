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

public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new UI_4();
	}

}

class UI_4 extends Frame implements ActionListener { //이녀석은 미리다 메서드를 오버라이딩해놓은것 ,다 빈 메서드로

	Button red, blue, exit; 
	Panel p1;
	
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		// TODO Auto-generated method stub
//	System.out.println("ActionEvent 발생");
//	System.out.println(e.getActionCommand()); //red ,exit ,blue중 뭐가 눌렸는지를 알 수 있다.
//	
//	}//이 메서드 하나로 생성된 여러가지 버튼을 전부 수행할 수 있다.
	
	@Override
	public void actionPerformed(ActionEvent e) {//메서드 한방에 버튼의
		// TODO Auto-generated method stub
		switch (e.getActionCommand()) {
		case "RED":
			p1.setBackground(Color.red);
			break;
		case "BLUE":
			p1.setBackground(Color.red);
			break;
		case "EXIT":
			p1.setBackground(Color.red);
			break;

		default:
			break;
		}
	}
	UI_4() {
		super("awt UI Test ~~"); //Frame을 상속받은 녀석이므로 프레임이 만들어 질때 위의 내용을 전달하여 생성 
		p1 = new Panel();
		p1.add(red = new Button("RED"));
		p1.add(blue = new Button("BLUE"));
		p1.add(exit = new Button("EXIT"));
		add(p1, BorderLayout.SOUTH); 

		setSize(300, 300);
		setVisible(true);

		red.addActionListener(this);
		exit.addActionListener(this);
		blue.addActionListener(this);
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

