package day06;

//P127페이지 참조
public class Test02 {

	public static void main(String[] args) {
//		int num;
//		String name;
		Employee emp1 = new Employee(); //emp1은 오브잭트로 주소가 들어있을것이다. 오브젝트(메모리에 띄워진 상태)==인스턴스 같은말이다.
		//System.out.println(emp1.age+ ":"+emp1.name+":"+emp1.dept);// 0 : null : null
		Employee emp2 = new Employee();
//		emp2.age=201901;
//		emp2.name="홍길동";
//		emp2.dept="인사부";
		//System.out.println(emp2.age+ ":"+emp2.name+":"+emp2.dept);
		Employee emp3 = new Employee();
//		emp3.age =201907;
//		emp3.name="임상민";
//		emp3.dept="비트캠프";
		//System.out.println(emp3.age+ ":"+emp3.name+":"+emp3.dept);
		// Employee라는 클래스가 없어서 에러 -> 같은 패키지안에Employee라는 클래스를 만들어주면 새로운 데이터타입이 만들어져
		//에러가 사라진다. ->모든 소스는 src에있다. - >bin폴더에는 class파일이 있다.
		//java -d ../bin _____ 로 클래스를 만듬.
		//하드디스크에 있는 자료를 메모리로 끌어올리는(new) 작업을 객체(인스턴스) 생성이라고 한다.
		//new Employee()도 가능함 메모리에 잠깐 띄우고 버릴객체(템플로이 객체)
		//Employee().~~~을 쓸수 있다.
		//다른 객체의 인스턴스변수가 다른 객체의 인스턴스 변수를 주소만 알고 있다면 접근이 가능하다.
		//객체 내의 this사용시 객체내의 인스턴스변수를 말한다.
		
	}

}
