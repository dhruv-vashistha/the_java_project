package com.company;

class Circle{
    int r;
    public float getParameter(){
        return 2*3.14f*r;
    }
    public float getArea(){
        return 3.14f*r*r;
    }
}
public class dv_39_project4 {
    public static void main(String[] args) {
        /*
        question - give the parameter of the circle and the area also with the class and methods
         */
        Circle crc = new Circle();
        crc.r = 5;
        System.out.println("the parameter of the circle is: " + crc.getParameter());
        System.out.println("the area of the circle is: " + crc.getArea());
    }
}
