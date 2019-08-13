package day11;

public class Test04 {
public static void main(String []args) {
	String msg1 = "hello";
	String msg2 = "hello";
	System.out.println(msg1.toString());
	System.out.println(msg2.toString());
	Book b1 = new Book("Java", 700);
	Book b2 = new Book("Java", 700);
	System.out.println(b1);
	System.out.println(b2);
}

}

class Book extends Object{
	String title;
	int price;
	
	
	public Book() {
	}
	
	public Book(String title, int price) {
		this.title = title;
		this.price = price;
	}
	@Override
	public String toString() {
		//return에 스트링 빌더로 써 보내기
		StringBuilder lsm = new StringBuilder();
		lsm.append(title);
		lsm.append("/");
		lsm.append(price);
		String aa =new String(lsm);
		return aa;
	}
}