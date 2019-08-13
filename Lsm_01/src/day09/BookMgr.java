package day09;


public class BookMgr {
//책을 몇개 가지고 있나 라는 변수 count를 만든다.
	/*Book[] booklist= new Book[5];

	public BookMgr() {
		// 자동초기화
		
	}

	public void addBook(Book book) {
		for (int i = 0; i < booklist.length; i++) {
			if (booklist[i] == null) {
				booklist[i] = book;
				break;
				
			}
		}
	}
	public static void copy(Book[] a) {
				
	}
	public void printBookList() {
		System.out.println("===책 목록===");
		for (Book a : booklist) {
			System.out.println(a.getTitle());
		}
	}

	public void printTotalPrice() {
		int sum = 0;
		for (Book a : booklist) {
			sum += a.getPrice();
		}
		System.out.println("===책 가격의 총합===");
		System.out.printf("전체 책 가격의 합 : %d", sum);
	} 여기까지 내가 한 거*/
	
	//아래부터 교수님 풀이
	
	private Book[] bookList;
	int count=0;// 갖고 있는 Book의 수를 의미하는 변수 
	
//	public Book[] getBookList() {
//		return bookList;
//	}
	public void setBookList(Book[] booklist) {
		this.bookList = booklist;
	}
	public BookMgr() {
		this(10);
	}
	public BookMgr(int size) {
		bookList = new Book[size];
	}
	public void addBook(Book book) {
		if(count == bookList.length) {
			Book[] copy =new Book[bookList.length*2];
			System.arraycopy(bookList, 0, copy, 0, bookList.length);
			bookList=copy;
		}
		bookList[count]=book;
		count++;
	}
	public void delBook(int a) {
		int b=a-1;
		if(count==1) {
			bookList[count-1]=null;
		}
		if(count>=2) {
		bookList[b]=bookList[count-1];
		bookList[count-1]=null;
		count--;
		}
	}//count==10일 조건을 넣을 필요가 없다 10일때 배옆이 자동으로 커지기 때문이다.
	
	public void searchTitleBook(String title) {
		System.out.println(title+" 검색");
		for(Book data : bookList) {
			if(data==null)return;
				
			if(data.getTitle().toUpperCase().contains(title.toUpperCase())) {
				data.print();
			}
		}
		System.out.println("--------------------------------");
	}
	
	public void bookListPrint() {
		System.out.println("====Book List======");
		for(int i=0;i<count;i++) {
			bookList[i].print();
		}
		System.out.println("총"+count+"권");
		System.out.println("====================");
	}
//	public int bookTotalPrice() {
//		int sum=0;
//		for(int i=0;i<count;i++) {
//			sum+=bookList[i].getPrice();
//		}
//		return sum;
//	}
}


/*교수님이 만드신 delBook
 * public void delBook(String title){
 * for(int i=0 ; i<count;i++){
 * 	if(bookList[i].getTitle().equals(title){
 * 	System.arraycopy(bookList,i+1,bookList,i,count-i-1);
 * count--;
 * system.out.println(title+" 삭제 완료 ");
 * return;
 * }}
 * system.out.println("입력하신 도서는 등록되있는 도서가 아니므로 삭제가 불가합니다.");
 * }*/
