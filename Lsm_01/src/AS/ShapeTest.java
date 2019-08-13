package AS;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle lsm = new Rectangle(5,6);
		RectTriangle lsm1 = new RectTriangle(6,2);
		Shape[] aa = {lsm,lsm1};
		
		for(Shape data:aa) {
			System.out.println(data.getArea());
			if(data instanceof Resizable) {
				((Resizable) data).resize(0.5);
			}
		}
	}

}

interface Resizable{
	void resize(double s);
}

abstract class Shape{
	int numSides;
	
	public int Shape(int numSides) {
		return 0;
	}
	public void getNumSides() {};
	abstract double getArea();
}

class Rectangle extends Shape implements Resizable{
	private double h;
	private double w;
	
	public Rectangle() {
		super();
	}

	public Rectangle(double h, double w) {
		super();
		this.h = h;
		this.w = w;
	}

	

	public double getH() {
		return h;
	}

	public void setH(double h) {
		this.h = h;
	}

	public double getW() {
		return w;
	}

	public void setW(double w) {
		this.w = w;
	}
@Override
double getArea() {
	// TODO Auto-generated method stub
	return w*h;
}
	@Override
	public void resize(double s) {
		// TODO Auto-generated method stub
		this.setH(this.getH()*s);
		this.setW(this.getW()*s);
		System.out.println("new area: "+h*w);
	}
}
class RectTriangle extends Shape{
	private double w;
	private double h;
	
	
	
	public RectTriangle() {
		super();
	}
	public RectTriangle(double w, double h) {
		super();
		this.w = w;
		this.h = h;
	}
	public double getW() {
		return w;
	}
	public void setW(double w) {
		this.w = w;
	}
	public double getH() {
		return h;
	}
	public void setH(double h) {
		this.h = h;
	}
	@Override
	double getArea() {
		// TODO Auto-generated method stub
		return w*h/2;
	}
	
}