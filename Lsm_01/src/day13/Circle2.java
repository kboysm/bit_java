package day13;
//여기부터 has a관계 시작 , 서클2는 점이다 or 서클2는 점을 가지고 있다 의 차이 이 클래스에서는 has a가 적합
public class Circle2 extends Shape implements Drawbale{
	Point p; //has a관계
	int r;
	
	
	public Circle2() {
		p = new Point(0,0);
	}

	public Circle2(Point p , int r) {
		super();
		this.p = p;
		this.r = r;
	}

	public Point getP() {
		return p;
	}

	public void setP(Point p) {
		this.p = p;
	}

	@Override
	public String toString() {
		return "Circle2 [p=" + p + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((p == null) ? 0 : p.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circle2 other = (Circle2) obj;
		if (p == null) {
			if (other.p != null)
				return false;
		} else if (!p.equals(other.p))
			return false;
		return true;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println(getClass().getName()+"그려 그리어~");
	}

	@Override
	double area() {
		// TODO Auto-generated method stub
		return r*r*Math.PI;
	}

	
}
