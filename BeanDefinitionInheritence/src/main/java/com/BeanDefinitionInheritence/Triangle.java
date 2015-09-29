package com.BeanDefinitionInheritence;

import java.util.List;

public class Triangle {


	private List<Point> points;

	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}
	
	public void print(){
		System.out.println("the first coordinates");
		System.out.println(getPoints().get(0).getX()+","+getPoints().get(0).getY());
		System.out.println("the second coordinates");
		System.out.println(getPoints().get(1).getX()+","+getPoints().get(1).getY());
		System.out.println("the third coordinates");
		System.out.println(getPoints().get(2).getX()+","+getPoints().get(2).getY());
	}
}
