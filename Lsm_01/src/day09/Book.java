package day09;
//이녀석은 데이터에 초점을 맞춘 클래스
public class Book {
private String title;
private int price;

public Book() {
	this("책 제목",0);
}
public Book(String a,int b) {
	
	setTitle(a);
	setPrice(b);
	
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
//아래부터는 교수님이 하신것을 추가한것 내가 한 것에서 이것만 추가하심
public void print() {
	System.out.printf("Book[%s : %7d] %n",title,price);
}
}
