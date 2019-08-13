package day11;

import day10.Animal;
import day10.Dog;

public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal d = new Dog("똥개","쪽파");
		if(d instanceof Dog)((Dog)d).dogPrint();
		d.breath();
		Animal f = new Fish("피라냐","물개");
		if(f instanceof Fish)((Fish)f).fishprint();//다운 캐스팅할때는 반드시 instance of를 쓴다 이건 룰이다 !!
		//다운캐스팅을 안전하게 하기 위해서 인스티드오브를 하는것이다!
		//인스티드오브 f가 Fish타입이 될 수 있을때만 캐스팅해!! 라는 의미
		f.breath();//물고기는 폐로 숨을 안쉰다. 부모로부터 물려받은 기능이 물고기 클래스에서는 쓸모없다.
		//이럴경우 반드시 메소드오버라이딩 ->부모에게 물려받은 메소드를 나의 상황에 알맞게 재정의
		((Fish)f).breath();
		//오늘 배운 오버라이딩을 잘 이해를 해야 한다. 오늘 이후로 배우는건 다 이걸 응용하는 부분이라고 했다~
		
		//fish가 엄청 중요하다고 강조 엄청 함
		//breath라는 메소드를 아가미로 오버라이딩 재정의했음.
		//오버라이딩이 된 메서드는 오버라이딩이 된 자식의 메서드를 가져옴
		// 부모클래스 tt = new 부모클래스 ; 로 정의해도 자식클래스에서 메소드 오버라이딩이 일어나면 tt의 범위에 포함되지 않더라도 오버라이딩된 자식
		//메서드를 가져온다. 
		//부모타입의 강점 : 타입은 하나인데 가질 수 있는 타입은 많다.
		//부모타입의 단점 : 자식의 자원을 건들 수 없다.
		//부모타입의 단점 보완 : 메서드 오버라이딩 (자식의 메서드를 가져온다)
		//오버라이딩 된 부모클래스의 메서드는 super로 접근한다. -> 자식 클래스의 메서드에서 super를 써야함
		
	}

}
