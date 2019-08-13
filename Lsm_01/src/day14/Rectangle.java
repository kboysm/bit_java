package day14;


interface DrawAndMoveAble extends Drawbale,Moveable{}//인터페이스의 다중상속
public class Rectangle extends Shape {
	
	Point p;
	int w;
	int h;
	
	
	
	public Point getP() {
		return p;
	}
	public void setP(Point p) {
		this.p = p;
	}
	public int getW() {
		return w;
	}
	public void setW(int w) {
		this.w = w;
	}
	public int getH() {
		return h;
	}
	public void setH(int h) {
		this.h = h;
	}
	public Rectangle() {
		super();
	}
	public Rectangle(Point p, int w, int h) {
		super();
		this.p = p;
		this.w = w;
		this.h = h;
	}
	@Override
	public void move(int m) {
		// TODO Auto-generated method stub
		p.setX(p.getX()+m);
		p.setY(p.getY()+m);
	}
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("그리어 그려");
	}
	@Override
	public String toString() {
		return "Rectangle [p=" + p + ", w=" + w + ", h=" + h + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + h;
		result = prime * result + ((p == null) ? 0 : p.hashCode());
		result = prime * result + w;
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
		Rectangle other = (Rectangle) obj;
		if (h != other.h)
			return false;
		if (p == null) {
			if (other.p != null)
				return false;
		} else if (!p.equals(other.p))
			return false;
		if (w != other.w)
			return false;
		return true;
	}
	@Override
	double area() {
		// TODO Auto-generated method stub
		return w*h;
	}

	
	
	
	
	
	
	
	
}
