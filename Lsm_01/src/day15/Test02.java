package day15;

import day15.A.C;

public class Test02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	A a =new A();
//	a.print();
		A.B b =new A().new B(); // b는 이터클래스 b의 주소를 담는 그릇으로 만들때는 꼭 A타입의 주소.비타입으로 
		b.print();
//		A.B c =a.new B(); //이미 생성된 A타입의 객체 a에 B인 이너클래스를 만들어준것
//		c.print();
//		A.C c = new A().new C();
//		c.print();
		C.print(); //이건 안돼야 정상인데 내 생각에는 import가 걸려서 되는것 같다 원래는 A.C.print();해줘야 한다.
	}

}

 class A {//일반적으로는 스태틱을 클래스앞에 붙이지 않는다. 그러나 이너클래스는 붙인다
	String name = "A";

	
	void print() {
		System.out.println("A");
		new B().print();
	}
	class B {
		String name = "B";
		void print() {
			System.out.println("B " + this.name);
			System.out.println("B " + A.this.name); //A의 name을 호출
		}
	}
	static class C{ //스태틱 맴버를 가지고 있는 이너클래스는 스태틱을 붙여주어야 한다.
		//	주의할 점은 스태틱이기 때문에 인스턴스 자원을 쓸 수 없어 this키워드 사용불가 
	static void print() {	
		System.out.println("~~~~");
	}
	}
	class D{
		void p() {
			class E{//이 녀석은 p라는 메소드안에서 잠깐 생성해서 쓰고 버릴 녀석 .class파일에서 보통 이런녀석 이름 앞에는 숫자가 붙는다.
				
			}
		}
	}
}