package com.DependencyInjection;

public class Circle implements Shape{

	private Point center;
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Drawing a circle");
		System.out.println(" the center coordinates is :"+getCenter().getX()+","+getCenter().getY());
		
	}
	public Point getCenter() {
		return center;
	}
	public void setCenter(Point center) {
		this.center = center;
	}

}
