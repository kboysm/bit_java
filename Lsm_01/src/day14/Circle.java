package day14;


interface Moveable{ //able가 붙으면 거진 인터페이스
	void move(int m);
}
abstract class Shape implements DrawAndMoveAble{ //이녀석이 중요함.이거하나로 기존의 오류나는것들이 동작함
	abstract double area();//기반틀을 제공해서 편하다,도형의 면적을 구하는 메소드는 이거야 라는 약속을 정한것
	//이녀석을 상속받는 녀석들은 다 오버라이딩 하기 때문에 알아보기 편하다
}

interface Drawbale{
	void draw(); //public abstract가 생략되어 있다. 인터페이스안에는 그 두개만 쓸 수 있기 때문에 생략이 가능하다
	
}

public class Circle extends Shape implements Cloneable {
	Point p;//has a 관계
	private double r;
	int ra;



public Circle() {
	super();
}

public Circle(Point p,int ra) {
	super();
	this.p = p;
	this.ra =ra;
}



public Point getP() {
	return p;
}

public void setP(Point p) {
	this.p = p;
}

public double getR() {
	return r;
}

public void setR(double r) {
	this.r = r;
}

public int getRa() {
	return ra;
}

public void setRa(int ra) {
	this.ra = ra;
}

@Override
	double area() {
		// TODO Auto-generated method stub
		return ra*ra*Math.PI;
	}

@Override
public void draw() {
	// TODO Auto-generated method stub
	System.out.println("그려 그리어~"+getClass().getName());
}

@Override
public String toString() {
	return "Circle [p=" + p + ", r=" + ra + "]";
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((p == null) ? 0 : p.hashCode());
	long temp;
	temp = Double.doubleToLongBits(r);
	result = prime * result + (int) (temp ^ (temp >>> 32));
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
	Circle other = (Circle) obj;
	if (p == null) {
		if (other.p != null)
			return false;
	} else if (!p.equals(other.p))
		return false;
	if (Double.doubleToLongBits(r) != Double.doubleToLongBits(other.r))
		return false;
	return true;
}
@Override
public void move(int m) {
	// TODO Auto-generated method stub
	p.setX(p.getX()+m);
	p.setY(p.getY()+m);
}
@Override
public Circle clone() throws CloneNotSupportedException {
	// TODO Auto-generated method stub
	return (Circle)super.clone();
}
//public Circle clone() throws CloneNotSupportedException {
//	// TODO Auto-generated method stub
// Circle c =(Circle)super.clone();
// Point p = c.p.clone();
// c.p=p;
//	return c;
//} 이건 선생님이 작성한 코드로 깊은 clone()을 가능하게 한다.
}
