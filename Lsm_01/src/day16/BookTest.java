package day16;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Book book = new Book("",90000);
			System.out.println(book);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		System.out.println("end");
	}


}
