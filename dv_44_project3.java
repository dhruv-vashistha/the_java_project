package com.company;
class Rectangle{
    private int length;
    private int breadth;

    //this is the constructor overloading
    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public Rectangle(){
        length = 30;
        breadth = 20;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}
public class dv_44_project3 {
    public static void main(String[] args) {
        //question - write a constructor that overloads as custom and the normal constructor
        // with length and breadth
        Rectangle rt = new Rectangle(40,20);
        System.out.println("the length of rectangle is " + rt.getBreadth());
        System.out.println("the breadth of the rectangle is " + rt.getLength());

        //the custom constructor call
        Rectangle rn = new Rectangle();
        System.out.println("the length of the custom class rectangle " + rn.getLength());
        System.out.println("the breadth of the custom class rectangle " + rn.getBreadth());
    }
}
