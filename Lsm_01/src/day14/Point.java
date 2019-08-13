package day14;

public class Point implements Cloneable { // 자바에서 제공하는 인터페이스!!!!!!!!!!!!
	private int x,y;

	
	
	public Point() {
		this(0,0);
	}
	
	public Point(int x) {
		this(x,0);
	}
	
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	
	@Override //아래 throw부터는 복제기능을 수행하다 문제가 발생할 수 있음을 알려주는것
	//클론이라는 기능은 throw 이후 부터의말은 문제가 발생할 수 있어~라는 말 즉 클론이 지원안되면 예외발생 지원은 implements cloneable을 해줘야함
	public Point clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (Point)super.clone();
	}
}
