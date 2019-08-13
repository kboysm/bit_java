package day14;


public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle(new Point(4,4),3);
//		System.out.println(c1);
//		c1.move(1);
//		System.out.println(c1);
//		c1.draw();
		
		Rectangle  r1 = new Rectangle(new Point(3,3),5,7);
//		System.out.println(r1);
//		r1.move(3);
//		System.out.println(r1);
//		r1.draw();
		Shape[] shapes={c1,r1};
		for(Shape data : shapes) {
			System.out.println(data);
			System.out.println(data.area());
			data.move(1);
			data.draw();
			System.out.println(data);
		}
	
	}

}
