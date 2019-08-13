package Java_Essen_4;

public class Java_4_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle pizza = new Circle(5);
		Circle waffle = new Circle(1);
		
		boolean res = CircleMg.equals(pizza, waffle);
		
		if(res==true)
			System.out.println(" 같은 크기");
		else
			System.out.println(" 다른 크기");
		
		CircleMg.copy(pizza, waffle);
		res=CircleMg.equals(pizza, waffle);
		
		if(res==true)
			System.out.println("pizza와 waffle 크기 같음");
		else
			System.out.println("pizza와 waffle 크기 다름");
	}

}
class Circle{
	private int radius;
	public Circle(int radius) {
		this.radius=radius;
	}
	public int getRadius() {
		return this.radius;
	}
	public void setRadius(int radius) {
		this.radius=radius;
	}
}
class CircleMg{
	static void copy(Circle src, Circle dest) {
		dest.setRadius(src.getRadius());
	}
	static boolean equals(Circle a , Circle b) {
		if(a.getRadius()==b.getRadius()) {
			return true;
		}
		else
			return false;
	}
}