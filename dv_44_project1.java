package com.company;

import java.util.concurrent.Callable;

class Cylinder{
    private int radii;
    private int height;
    //make getter and setter as code<generator<getter and setter;

    public int getRadii() {
        return radii;
    }

    public void setRadii(int radii) {
        this.radii = radii;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public double getArea(){
        return Math.PI*radii*radii*height + 2*Math.PI*radii*radii;
    }
    public double getVolume(){
        return 2*Math.PI*radii*height;
    }
}
public class dv_44_project1 {
    public static void main(String[] args) {
        //Question - for cylinder make class and write the getters and setters for its radius and height
        Cylinder cd = new Cylinder();
        cd.setHeight(44);
        cd.setRadii(12);
        System.out.println("area is " + cd.getArea() + " metre square");
        System.out.println("volume is " + cd.getVolume() + " metre cube");

    }
}