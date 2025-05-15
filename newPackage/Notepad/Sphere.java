package com.company.newPackage.Notepad;
import com.company.newPackage.Notepad.Circle;

class MySphere extends MyCircle{

	public void setRadii(int x){
		this.Radii = x;
	}
	public double getArea(){
		return 4*Math.PI*Radii*Radii;
	}
	public double getVol(){
		return (4.0/3)*Math.PI*Radii*Radii*Radii;
	}
}
public class Sphere{
	public static void main(String[] args){
	System.out.println("this is the Sphere class that's gonna be in a new package named notepad..");
	//setting the Radii
	MySphere R = new MySphere();
	R.setRadii(8);
	System.out.println(R.getArea());
	System.out.println(R.getVol());

	}
}
