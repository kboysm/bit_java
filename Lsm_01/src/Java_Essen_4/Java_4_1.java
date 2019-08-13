package Java_Essen_4;

public class Java_4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Song mysong = new Song("Let it go");
		Song yoursong = new Song("강남스타일");
		
		System.out.println("내 노래는 "+mysong.getTitle());
		System.out.println("니 노래는 "+yoursong.getTitle());
	}

}

class Song{
	String title;
	
	Song(){
		this("제목");
	}
	Song(String title){
		this.title=title;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
}