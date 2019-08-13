package day09;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Test01_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String msg1="hello";
//		String msg2=new String(new char[] {'a','b'});
	String msg1=JOptionPane.showInputDialog("book정보를 입력하세요 ex(title/price)");
		//배열은 항상 유효한 인덱스를 꼭 파악하고 거기서 놀아야 한다.
//		System.out.println(msg1);
//		System.out.println(msg1.toUpperCase());
//		System.out.println(msg1);
		//스트링은 절대 변하지 않는다.
		//재 어사인? 을 해야 스트링은 변한다 ex msg1= mag1.toUpperCase();
	//	String msg1 =" ui /23000";
		String []data = msg1.split("/");//슬러시를 기준으로 쪼개라는 명령
		System.out.println(Arrays.toString(data));
		
		if(msg1.indexOf("/")==-1) {
			System.out.println("다시 입력 /시가 필요");
			return;
		}
		Book b1 =new Book(data[0].trim(),Integer.parseInt(data[1].trim()));
		//.trim()을 안해주면 공백때문에 오류가 날 수있다 ->인트형이 변형 불가할 수 있다
		b1.print();
	}

}
