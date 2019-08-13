package Java_Essen_5;

public class Java_5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NCircle lsm  = new NCircle(5,"ww");
		lsm.show();
	}

}
class Circle{
	private int radius;
	public Circle(int radius) {
		this.radius = radius;
	}
	public int getRadius() {
		return radius;
	}
}
 class NCircle extends Circle{
	String name;

	public NCircle(int radius, String name) {
		super(radius);
		this.name = name;
	}
	public void show() {
		System.out.println(this.name + " 반지름 = " +getRadius());
	}
}
