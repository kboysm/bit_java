package GJ;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;

public class BookMgr2 {
//    private Book[] bookList; 북리스트를 어레이리스트로 생성하여 북의 배열은 필요가 없다
    
    Map<Integer,Book> map = null;
    
    public BookMgr2() {
    	//bookList = new Book[10];
    	map = new HashMap<Integer, Book>();
//    	list = new LinkedList<Book>();
//    	list = new VectorList<Book>();
    }
//	public Book[] getBookList() {
//		return bookList;
//	}
    
    public void addBook(Book book) {
    	map.put(book.getIsbn(),book);
    }
    
    public String deleteBook(String title) { 
    	Iterator<Integer> it=map.keySet().iterator();
    	while(it.hasNext()) {
    		Integer isbn=it.next();
    		Book data =map.get(isbn);
    		if(data.getTitle().equals(title)) {
 
//    			map.remove(isbn);
    			it.remove();
    		}
    	}
    		return "작업완료";
//    	if(lsm.length())
    }
    public String searchTitleBook(String title) {
    	StringBuilder lsm = new StringBuilder();
    	lsm.append(title+"검색 결과 \n");
    	Iterator<Integer> it=map.keySet().iterator();
    	while(it.hasNext()) {
    		Integer isbn=it.next();
    		Book data =map.get(isbn);
    		if(data.getTitle().toUpperCase().contains(title.toUpperCase())) {
    			lsm.append(data);
    		}else
    			lsm.append("");
    	}
    	return lsm.toString();
    }
    //아래 리스트 프린트 메서드는 포이치 기반으로 설계
	public String bookListPrint() { //포 이치는 람다를 무조건 쓰는게 좋다 안그러면 읽기가 너무 어렵다 
		StringBuilder lsm = new StringBuilder();
		lsm.append("book list \n");
		Iterator<Integer> it=map.keySet().iterator();
		while(it.hasNext()) {
    		Integer isbn=it.next();
    		Book data =map.get(isbn);
    		lsm.append(data+"\n");
    		}
    	
		return lsm.toString();
	}
	
     
}




