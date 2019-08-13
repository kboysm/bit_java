package GJ;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BookApp {
	
	public static void main(String[] args) {
		new UI_5().createUI();
	}
}

class UI_5 extends JFrame implements ActionListener {
	JButton select, insert, delete,update,exit,clear;
	TextField msg0,msg1;
	TextArea output0;
	Panel p1, p2;
	BookMgr2 mgr;
	static int num=0;
	
	
	void createUI() {
		super.setTitle("~Book App~");
		p1 = new Panel();
		mgr = new BookMgr2();
		p1.add(select = new JButton("검색"));
		p1.add(insert = new JButton("등록"));
		p1.add(delete = new JButton("삭제"));
		p1.add(update = new JButton("목록 출력"));
		p1.add(exit = new JButton("종료"));
		p1.add(clear = new JButton("지우기"));
		add(p1, BorderLayout.SOUTH);

		p2 = new Panel();
		// p2.setLayout(new GridLayout(1, 2));
		p2.add(new JLabel("책 이름"));
		p2.add(msg0 = new TextField(10));
		add(p2, BorderLayout.NORTH);
		p2.add(new JLabel("가격"));
		p2.add(msg1 = new TextField(10));
		add(p2, BorderLayout.NORTH);
		

		add(output0 = new TextArea(15, 40));
		output0.setFont(new Font("Monospaced", 1, 15));
		
		setSize(600, 300);
		setVisible(true);

		select.addActionListener(this);
		delete.addActionListener(this);
		insert.addActionListener(this);
		update.addActionListener(this);
		exit.addActionListener(this);
		clear.addActionListener(this);

		// f1.addWindowListener(new WindowEventP());
//	   addWindowListener(new WindowAdapter() {
//		   public void windowClosing(WindowEvent e) {
//				setVisible(false);
//				dispose();
//				System.exit(0);
//			}
//	   });

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//		msg0.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				output0.append("책 이름/가격 : "+msg0.getText()+"\n");
//				msg0.setText("");
//
//			}
//		});
//		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
		case "검색":
			output0.append(mgr.searchTitleBook(msg0.getText()));
			msg0.setText("");
			break;
		case "등록":
			boolean ab=true; //가격에 숫자가 아닐경우를 대비해서 만듬
			char [] aa =msg1.getText().toCharArray();//가격에 문자가 들어갔는지 확인하기 위해
			for(int i=0;i<aa.length;i++) {//루프를 돌리면서 확인
				if(!(aa[i]>='0'&&aa[i]<='9')) {
					output0.setText("가격에는 숫자만 입력하세요.");
					ab=false;//숫자가 아닌 녀석이 있을 경우
					break;
				}
			}
			if(ab==false)//숫자가 아닌 녀석이 있다면 멈춰!
				break;
			if(msg0.getText().equals("")||msg1.getText().equals(""))//책이름 또는 가격 둘중 하나만 적었을때를 대비해서 
				{output0.setText("책 이름과 가격을 둘다 입력하세요");
			break;}
			mgr.addBook(new Book(num++,msg0.getText(),Integer.parseInt(msg1.getText())));
			msg0.setText("");
			msg1.setText("");
			break;
		case "삭제":
			mgr.deleteBook(msg0.getText());
			output0.setText("작업완료 \n");
			break;
		case "목록 출력":
			output0.setText("");
			output0.append(mgr.bookListPrint());
			break;
		case "종료":
			System.exit(0);
		case "지우기":
			output0.setText("");
		default:
			break;
		}
	}


}
