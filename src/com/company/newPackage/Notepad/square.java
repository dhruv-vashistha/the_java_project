package com.company.newPackage.Notepad;

class Square0{
	public int side;
	public void setSide(int x){
	this.side = x;
	}
	public int getArea(){
	return side*side;
	}
}
public class square{
	public static void main(String[] args){
	System.out.println("this is the sqaure class that's gonna be in a new package named notepad..");
	//setting the side
	Square0 s = new Square0();
	s.setSide(4);
	System.out.println(s.getArea());

	}
}
