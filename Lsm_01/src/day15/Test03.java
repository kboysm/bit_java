package day15;

import day14.Point;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer.Inner i = new Outer().new Inner();
	}
}
class Outer{
	Point p= new Point(3,3);
	class Inner{
//	Outer o= new Outer(); 강력한 구조로 만들어버린것 안좋음
		
		void print() {
			System.out.println(p);
		}//이너 클래스로 안에 넣어버리면 간단하게 p를 호출할 수 있음
	}
}
