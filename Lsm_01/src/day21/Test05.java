package day21;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JLabel;

public class Test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new UI_5().createUI();
	}

}

class UI_5 extends Frame implements ActionListener { 

	JButton red, blue, exit; 
	TextField msg;
	TextArea output;
	Panel p1,p2;
	
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
			p1.setBackground(Color.BLUE);
			break;
		case "EXIT":
			System.exit(0);
			break;

		default:
			break;
		}
	}
	void createUI() {
		super.setTitle("awt UI Test ~~"); //Frame을 상속받은 녀석이므로 프레임이 만들어 질때 위의 내용을 전달하여 생성 
		p1 = new Panel();
		p1.add(red = new JButton("RED"));
		p1.add(blue = new JButton("BLUE"));
		p1.add(exit = new JButton("EXIT"));
		add(p1, BorderLayout.SOUTH); 

		p2=new Panel();
//		p2.setLayout(new GridLayout(1,2));
		p2.add(new JLabel("메세지 창"));
		p2.add(msg = new TextField(20));
		add(p2,BorderLayout.NORTH);
		
		add(output = new TextArea(15,40));
		output.setFont(new Font(null,0 , 20)); //글자크기만 조절
		setSize(300, 300);
		setVisible(true);

		red.addActionListener(this);
		exit.addActionListener(this);
		blue.addActionListener(this);
		
		msg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				output.append(msg.getText()+"\n"); //메시지창에있는텍스트를 읽어와서 아웃풋창에 추가하라
				msg.setText("");
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

