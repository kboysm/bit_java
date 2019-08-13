package day12_abstract;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg1 ="hello";
		String msg2 ="hello";
		
		System.out.println(msg1);
		System.out.println(msg2);
		
		System.out.println(msg1.toString());
		System.out.println(msg1.equals(msg2));
		System.out.println(msg2);
		
		Book b1 = new Book("java",2000);
		Book b2 = new Book("java",2000);
		//System.out.println(b1);
		//System.out.println(b2);
		//Object의 함수들을 상속받았기 때문에 b1,b2가 toString으로 주소가 찍힌다.
		//b1,b2는 내부적으로 toString이 호출된다 . 즉 toString을 Book클래스에서 오버라이딩을 해주면 우리가 원하는 결과가 나온다.
		System.out.println(b1.toString());
		System.out.println(b1.equals(b2));
		System.out.println(b2);
		
//		b1=null;
//		b2=null;
//		
//		System.gc();
//		가베지를 강제로 호출하는 명령
//		System.out.println("=== main end ===");
	}

}
