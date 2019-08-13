package GJ;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookMgr {
//    private Book[] bookList; 북리스트를 어레이리스트로 생성하여 북의 배열은 필요가 없다
    int count = 0;
    
    List<Book> list = null;
    
    public BookMgr() {
    	//bookList = new Book[10];
    	list = new ArrayList<Book>();
//    	list = new LinkedList<Book>();
//    	list = new VectorList<Book>();
    }
    public BookMgr(List<Book> list) {
    	//bookList = new Book[10];
    	this.list=list;
    }
//	public Book[] getBookList() {
//		return bookList;
//	}
    public void addBook(Book book) {
    	list.add(book);
    }
    
    public void deleteBook(int isbn) { 
    	Iterator<Book> it = list.iterator();
    	while(it.hasNext()) {
    		Book data = it.next();
    		if(data.getIsbn()==isbn)
    			System.out.println(data+"->삭제됩니다.");
    	}
    }
    public void searchTitleBook(String title) {
    	System.out.println(title+"검색");
    	Iterator<Book> it = list.iterator();
    	while(it.hasNext()) {
    		Book data =it.next();
    		if(data.getTitle().toUpperCase().contains(title.toUpperCase())) {
    			System.out.println(data);
    		}
    	}
    }
	public void bookListPrint() {
		System.out.println("Book List");
		list.forEach(i-> System.out.println(i)
		//list.forEach( System.out::println); 도 가능할듯
				);
	}
	
     
}




