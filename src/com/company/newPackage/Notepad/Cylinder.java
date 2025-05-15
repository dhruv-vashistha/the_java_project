package com.company.newPackage.Notepad;
import com.company.newPackage.Notepad.Circle;

class MyCylinder extends MyCircle{
	public int height;
	public void setHeig(int y){
		this.height = y;
	}
	public int getHei(){
	 	return this.height;
	}
	public void setRadii(int x){
		this.Radii = x;
	}
	public double getArea(){
		return 2*Math.PI*Radii*Radii + 2*Math.PI*Radii*height;
	}
	public double getVol(){
		return Math.PI*Radii*Radii*height;
	}
}
public class Cylinder{
	public static void main(String[] args){
	System.out.println("this is the Cylinder class that's gonna be in a new package named notepad..");
	//setting the Radii
	MyCylinder k = new MyCylinder();
	k.getHei();
	k.setRadii(4);
	k.setHeig(6);
	System.out.println(k.getArea());
	System.out.println(k.getVol());

	}
}
