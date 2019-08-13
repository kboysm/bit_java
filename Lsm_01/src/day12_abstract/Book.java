package day12_abstract;

public class Book {
	private String title;
	private int price;
	
	
	
	public Book() {
	}
	public Book(String title, int price) {
		super();
		this.title = title;
		this.price = price;
	}
	public Book(int price ,String title) {
		super();
		this.title = title;
		this.price = price;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
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
		// return lsm.toString();
	}
	//*******이퀄즈 메소드를 오버라이딩 혼자 한다면 여태까지 잘 따라온거**************************
	@Override
	public boolean equals(Object obj) {
		boolean flag=false;
		// TODO Auto-generated method stub
		if(!(obj instanceof Book)||obj==null)
			return false;
		// 내가한거 : return ((Book)obj).title==this.title&&((Book)obj).price==this.price;
//		교수님 코드
		 Book data =(Book)obj;
		if(price == data.price && title.equals(data.title)){ return true;}
		return flag;
	}
//	@Override
//	protected void finalize() throws Throwable {
//		//객체가 소멸되기 직전에 호출되는 메소드이지만 자바에서는 사용하지 않고 별도의 자원반납 메소드를 만들어 그것을 사용한다. ex) .close()
//		System.out.println("자원 반납 코드~~");
//		super.finalize();
//	} 이녀석은 가베지가 언제 활동하는지 모르므로 우리는 이런녀석이 있다 정도만 알고있고 자원반납을 하는 메소드를 따로 만든다.
	
	public void close() {
		System.out.println("자원반납");
}
}
