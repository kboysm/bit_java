package day11;

public class Test02 {
	public static void main(String[] args) {
		Person[]  p = {   new Student("홍길동", 20, 2012001),
		                  new Teacher("이순신", 30, "JAVA"),
		                  new Employee("유관순", 40, "교무과")
		};
		//만약 스튜덴트 클래스의 자식클래스로 a1이라는 클래스가 있다면 배열 p에 new a1을 생성하면 a1클래스로 다운캐스팅 1번으로 접근이 가능하다.
		
		for(Person data :p) {
			data.printA();  //부모Person() 영역의 자원을 접근할때는 바로 접금 가능
			System.out.println();
		}
		System.out.println("====================");
		
		for(Person data :p) {
			//자식 영역의 자원을 접근할때는  다운 캐스팅 필요
			//반드시 하단부에 어떤 객체가 바인딩 되어 있는지 타입 체크 필요 
			
			if(data instanceof Student) ((Student)data).print();
			if(data instanceof Teacher) ((Teacher)data).print();
			if(data instanceof Employee) ((Employee)data).print();
			
			//히테로지니어스 : 상속을 잘 부여하면 배열에 다양한 객체를 넣을 수 있다.
			//부모타입으로 선언하면 다운캐스팅을 해줘야 하고 에러발생을 알려주지 않기 때문에 주의가 필요하다.
			//다운캐스팅을 잘못하면 app가 죽을 수 있다
		}
	}
}
