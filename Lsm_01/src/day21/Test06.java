package day21;
// pack();자동으로 GUI의 크기를 조절해서 보여줌
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.stream.Stream;
//람다에서 e ->System.exit(0)로 쓸 수 있다.
public class Test06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new DrawImg();
	}

}

class DrawImg extends Frame{
	Image im;
	
	
	DrawImg(){
		String[] fontlist=Toolkit.getDefaultToolkit().getFontList(); //디플리키드된 에이피아이 즉 옛날에는 썻는데 지금은 쓰지마~안좋아~
		Stream.of(fontlist).forEach(i->System.out.println(i));
		super.setTitle("hi");
		im=Toolkit.getDefaultToolkit().getImage("c://img/01.jpg");
		setSize(500,500);
		setVisible(true);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		repaint(); // 스스로 패인팅을 내부적으로 paint()매서드를 호출,awt스레드에의해 paint()가그려진다. paint()를직접하지않는다.
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				setVisible(false); 
				dispose(); 
				System.exit(0);
				
			}
		});
	}
	public void paint(Graphics g) {
		g.drawImage(im, 20, 20,120,120, this); // 20,20은 위치 120,120은 이미지 크기 
	}
}