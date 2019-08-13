package AS;
//말하고 싶은 것은 부모메소드를 호출하기 때문에 부모의 멤버변수를 리턴 받는 것인가??
class Parent1{
	int x=100;
	Parent1(){
		this(200);
	}
	Parent1(int x){
		this.x=x;
	}
	int getX() {
		return x;
	}
}

class Child1 extends Parent1{
	int x =3000;
	Child1(){
		this(1000);
	}
	Child1(int x){
		this.x=x;
	}
}

class Exercise7_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child1 c = new Child1();
		System.out.println("x="+c.getX());
	}

}