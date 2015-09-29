package com.InjectObjects;

public class Triangle {

	Point pointA;
	Point pointB;
	Point pointC;
	public Point getPointA() {
		return pointA;
	}
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}
	public Point getPointB() {
		return pointB;
	}
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}
	public Point getPointC() {
		return pointC;
	}
	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}
	
	public void print(){
		System.out.println("the first coordinates");
		System.out.println(getPointA().getX()+","+getPointA().getY());
		System.out.println("the second coordinates");
		System.out.println(getPointB().getX()+","+getPointB().getY());
		System.out.println("the third coordinates");
		System.out.println(getPointC().getX()+","+getPointC().getY());
	}
}
