package day11;

import day10.Dog;
import day10.Animal;

public class AnimalTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal[] animals=	{
				new Dog("진돗개","몽둥이"),
				new Fish("구피"),
				new Dog("똥개","회초리")
				};
		
		for(Animal data : animals) {
			//data.breath();
//			data.print();
		}
		Dog a1 = new Dog("똥개","쪽파");
		Fish f1 = new Fish("붕어");
		callD(a1);
		callD(f1);
		callD(animals[0]);
		
	}
	//그렇다면 dog와 fish에 상속은 받았지만 메소드 오버라이딩을 하지 않았다면 에러가 나는가?
	public static void callD(Animal d) {
		d.breath();
	}
	//애니멀타입이 부모타입이라 애니멀로 인자를 받는다고 한다면 dog와 fish 자식 변수도 받을 수 있다.오버라이딩이 됐기 때문에
	//매서드는 하나인데 들어오는 데이터에따라 완전히 다른 동작을 하는것 - > 자바 폴리모피즘(다형성)(오버라이딩을 접목)20~24라인이 그 설명 폐와 아가미 차이
	//
}
