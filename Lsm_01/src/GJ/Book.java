package GJ;

//북 클래스는 이걸로 완성 
public class Book implements Comparable<Book> {
  private String title;
  private int price;
  private int isbn=0;
  
  public Book() {}
  
  public Book(int num,String title,int price) {
  	this.title = title;
  	this.price = price;
  	this.isbn=num;
 
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
	public void print() {
		System.out.printf("Book[ %-20s : %7d] %n",title,price);
	}

	public int getIsbn() {
		return isbn;
	}

	
	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + ", isbn=" + isbn + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + isbn;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (isbn != other.isbn)
			return false;
		return true;
	}
	
	@Override
	public int compareTo(Book o) {
		// TODO Auto-generated method stub
		return isbn-o.isbn;
		//title은 스트링형으로 -연산이 안되지만 내부적으로 compareTo가 정의 되어 있어 사용이 가능하다 즉
		//title.compareTo(o.title)이 가능하다
	}
	
	
}
