package com.ConstructorInjection;

public class Triangle {

	private String type;
	private Integer height;
    public Triangle(String type){
    	this.type=type;
    }
    
    public Triangle(String type,Integer height){
    	this.type=type;
    	this.height=height;
    }
    
    public Integer getHeight(){
    	return height;
    }
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	public void printType(){
		System.out.println(this.type+" triangle with a height of  "+getHeight());
	}
}

