package day12_abstract;

import java.math.*;

import javax.tools.JavaCompiler;

public class Circle extends Shape {
private double radius;

public Circle() {
	super();
}

public Circle(String name ,double radius) {
	super(name);
	this.radius = radius;
}

public double getRadius() {
	return radius;
}

public void setRadius(double radius) {
	this.radius = radius;
}

@Override
	public void calculationArea() {
		// TODO Auto-generated method stub
		//area = radius*radius*Math.PI;
	}
@Override
	public void print() {
		// TODO Auto-generated method stub
	System.out.println("원의 면적은 "+Math.PI*radius*radius);
	}

}
