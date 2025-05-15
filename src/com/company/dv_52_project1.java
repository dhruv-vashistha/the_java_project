package com.company;

class Circle1{
    public int radii;
    Circle1(int r){
        radii = r;
    }
    public double getArea(){
        return Math.PI*this.radii*this.radii;
    }
}
class Cylinder1 extends Circle1{
    public int height;
    Cylinder1(int r, int h){
        super(r);
        this.height = h;
    }
    public double area(){
        return 2*Math.PI*this.radii*this.radii + 2*Math.PI*this.radii*this.height;
    }
    public double volume(){
        return Math.PI*this.radii*this.radii*height;
    }
}
public class dv_52_project1 {
    public static void main(String[] args) {
        //question - create the circle class and cylinder using the inheritance in it
        //the attributes has already set using the constructor
        Cylinder1 c = new Cylinder1(3,8);
        //now calling the method with the help of object
        System.out.println(c.getArea());
        System.out.println(c.area());
        System.out.println(c.volume());

    }
}
