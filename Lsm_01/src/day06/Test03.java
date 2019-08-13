package day06;

//P127페이지 참조
public class Test03 {

	public static void main(String[] args) {
//		int num;
//		String name;
		Employee emp1 = new Employee(); //emp1은 오브잭트로 주소가 들어있을것이다. 오브젝트(메모리에 띄워진 상태)==인스턴스 같은말이다.
		emp1.display();
		Employee emp2 = new Employee();
		emp2.setAge(27);
		//emp2.age=201907;
		emp2.setName("홍길동");
		emp2.setDept("인사부");
		emp2.setSingle(true);
		emp2.display();
		Employee emp3 = new Employee();
		//emp3.age=201908;
		emp3.setAge(31);
		emp3.setName("임상민");
		emp3.setDept("비트캠프");
		emp3.display();
		//Employee클래스의 데이터를 private설정하면 퍼블릭인 메서드를 제외하곤 그 클래스 말곤 접근할 수 없다. // 캡슐화가 이것이다.
		//public ->import만하면 쓸수있다. 접근 지정자를 안써주면 같은패키지까지 접근가능. private는 같은 클래스만 접근가능
		//일일이 호출하는것이 아니라 메서드로 설정해서 메서드를 호출하면 한번에 호출이 가능하다.
		//boolean만 set과 is 나머지는 전부 set,get
	}

}
