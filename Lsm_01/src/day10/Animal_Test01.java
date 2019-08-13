package day10;

public class Animal_Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal a1 = new Animal();
		a1.breath();
		
		Animal a2 = new Animal("Dog");
		a2.breath();

		Dog d1 = new Dog("시베리안허스키   ","케리");
		d1.breath();
		d1.dogPrint(); 
		
		
		Dog d2 = new Dog("Dog ","똥개   ","쪽파");
		d2.dogPrint();
		
		String animalkind =d2.getSuperKind();
		System.out.println(animalkind);
	}
	//자식클래스는 부모클래스에게 상속을 받는 경우 부모클래스의 멤버변수를 사용할 수 있는 것뿐 자식클래스에 똑같은 녀석이 생기는 것이 아니다.

}
