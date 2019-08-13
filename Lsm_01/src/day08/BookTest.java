package day08;

import java.util.Arrays;

public class BookTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		BookMgr lsm = new BookMgr();
//		Book lsm1 = new Book("Java Program",12000);
//		Book lsm2 = new Book("JSP",10000);
//		Book lsm3 = new Book("SQL Fundamentals",10000);
//		Book lsm4 = new Book("JDBC Program",10000);
//		Book lsm5 = new Book("EJB Program",90000);
//		lsm.addBook(lsm1);
//		lsm.addBook(lsm2);
//		lsm.addBook(lsm3);
//		lsm.addBook(lsm4);
//		lsm.addBook(lsm5);
//		
//		lsm.printBookList();
//		lsm.printTotalPrice();
		//위에까지는 내가한거
		
		BookMgr mgr = new BookMgr(5);
		
		Book lsm1 = new Book("Java Program",12000);
		Book lsm2 = new Book("JSP",10000);
		Book lsm3 = new Book("SQL Fundamentals",10000);
		Book lsm4 = new Book("JDBC Program",10000);
		Book lsm5 = new Book("EJB Program",90000);
		Book lsm6 = new Book("Program",50000);
		
		mgr.addBook(lsm5);
		mgr.addBook(lsm4);
		mgr.addBook(lsm3);
		mgr.addBook(lsm2);
		mgr.addBook(lsm1);
		mgr.addBook(lsm6);
		//System.out.println(Arrays.toString(mgr.getBookList()));
		mgr.bookListPrint();
		System.out.println("총합계 :" +mgr.bookTotalPrice());
	}

}

