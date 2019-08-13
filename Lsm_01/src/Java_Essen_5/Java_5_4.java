package Java_Essen_5;

public class Java_5_4 {
	public static void main(String[] args) {
		CPoint lsm = new CPoint(5, 5, "Ye");
		lsm.setPoint(10, 20);
		lsm.setColor("GREEN");
		lsm.show();
	}
}
class Point {
	private int x,y;
	public Point(int x , int y) {
		this.x=x;
		this.y=y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	protected void move(int x,int y) {
		this.x=x;
		this.y=y;
	}
}
class CPoint extends Point {
	private String CC;
	public CPoint(int x , int y , String cc) {
		// TODO Auto-generated constructor stub
		super(x,y);
		this.CC=cc;
	}
	public void setPoint(int x ,int y) {
		move(x,y);
	}
	public void setColor(String aa) {
		this.CC=aa;
	}
	public void show() {
		System.out.println(this.CC + "색으로 ("+getX()+","+getY()+")");
	}
	
}
