package day13;

public class SingletonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton s=Singleton.getInstance();
		Singleton s1=Singleton.getInstance();
		Singleton s2=Singleton.getInstance();
		
	}

}

class Singleton {
	private static Singleton s = new Singleton();
	private Singleton() {
		System.out.println("Singleton 객체 생성");
	}
	
	public static Singleton getInstance() {
		if(s==null)
			s= new Singleton();
	return s;	
	}
}
