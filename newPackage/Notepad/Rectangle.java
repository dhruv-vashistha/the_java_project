package com.company.newPackage.Notepad;

class Rectangle1{
	private int len;
	private int bdt;
	public void setlen(int x){
		this.len = x;
	}
	public void setBr(int y){
		this.bdt = y;
	}
	public int getArea(){
	 	return len*bdt;
	}
}
public class Rectangle{
	public static void main(String[] args){
	//this is the java file maing up the code with the help of the notepad and the powershell
	System.out.println("this is the rectangle individual class");
	Rectangle1 r = new Rectangle1();
	r.setlen(5);
	r.setBr(6);
	System.out.println(r.getArea());

	}
}
