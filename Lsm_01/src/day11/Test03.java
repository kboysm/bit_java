package day11;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p=new Person("고길동",26); //다운캐스팅 불가 펄슨 아래 아무것도 없음(메모리 내에)
		Person s=new Student("홍길동",20,2019001);//스튜던트 클래스로 다운캐스팅이가능 스튜던트로 선언해서 
		Employee e = new Employee("유관순",40,"교무과");
		Object o = new Teacher("이순신",30,"JAVA");
		Object msg = new String("hi java");
		
		
		
		//최상위 부모 = 최하위 자식으로 선언시 모든 객체를 접근 가능 하고 자신의 필요에 의해 자른다.
		//다운캐스팅 한번으로 다운캐스팅한 클래스부터 위에 조상클래스까지 모든 데이터를 접근할 수 있다.
	}

}
