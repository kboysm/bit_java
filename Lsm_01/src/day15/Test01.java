package day15;

import day14.Circle;
import day14.Point;

public class Test01 {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
	Point p1 = new Point(5,5);
	Point p2= p1.clone();//메인쪽에 throw문장과 point클래스에 clone을 임플리멘트 하고 clone메서드를 퍼블릭으로 바꿔줘야 함
	
	System.out.println("--------------------");
	Circle c1 =new Circle(new Point(7,7),2);
	Circle c2 = c1.clone();
	c2.setP(c1.getP().clone());
	c2.setRa(0);
	c2.getP().setX(0);
	
	System.out.println(c1);
	System.out.println(c2);
	}

}
