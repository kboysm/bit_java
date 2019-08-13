package day17;

import day16.Book;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1 = new Book();
		b1.setTitle("길용성");
		try {
			b1.setPrice(1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());//err 은 에러메세지를 이걸로 빨간색으로 강조효과있음
		}
		
		System.out.println(b1);
		System.out.println("---------------------------------------------");
		Book b2=null;
		try {
		b2 = new Book("길용성2",1);
		} catch (PriceException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}
		
		
	}

}
