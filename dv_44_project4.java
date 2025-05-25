package com.company;

class Sphere{
    private int radii;
    //making a constructor for setting the radii;

    public Sphere(int radii) {
        this.radii = radii;
    }

    public int getRadii() {
        return radii;
    }
    //making a method to find the surface area of the sphere
    public double Area(){
        return 4*Math.PI*radii*radii;
    }
    public double Volume(){
        return 4/3d*Math.PI*radii*radii*radii;
    }
}
public class dv_44_project4 {
    public static void main(String[] args) {
        //question - write the program to print the area and volume of the sphere
        Sphere sp = new Sphere(5);
        System.out.println("the area of the sphere is " + sp.Area());
        System.out.println("the volume of the sphere is " + sp.Volume());
    }
}
