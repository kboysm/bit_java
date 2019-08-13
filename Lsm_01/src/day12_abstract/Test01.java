package day12_abstract;

public class Test01 {
public static void main(String []args) {
	 Animal[] a={new Dog("똥개","쪽파"),
			 	new Fish("어류","청상아리","백상아리"),
			 	new Fish("붕어","빵")
	};
	 for(Animal data:a) {
		 System.out.println(data);//내부적으로 toString이 호출된다.각 객체들 마다 toString을 오버라이딩 햇기 때문에 아래와
		 //같은 결과가 나온다. data가 가능한 이유가 자동으로 toString()메소드를 호출하기 때문에 우리가 메서드 오버라이딩을 해놓은 것이 호출된다.
		 System.out.println(data.toString());
		 data.breath();
	 }//위에 포문은 
}
}
