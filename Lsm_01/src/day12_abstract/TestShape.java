package day12_abstract;

public class TestShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Shape[] shape = new Shape[2];
	
	shape[0]=new Circle("원",10);
	shape[1]=new Rectangle("직사각형",10,20);
	
	for(int i=0;i<shape.length;i++) {
		shape[i].calculationArea();
		shape[i].print();
	}
	}

}
//calculationArea로 부모 클래스의 area에 값을 넣고 print를 한다.
//나는 다 오버라이딩 햇지만 교수님은 이런식으로 햇다
//이 문제의 의도는 추상메소드로 등록되어 있는 추상메소드를 고민해 보라는 문제
//자식쪽에서 그쪽의 기능을 수행하고 부모쪽을 셋팅하고 실행하는 문제

//객체 생성에는 반드시 ()가 와야한다 new aa[]는 객체생성이 아니다