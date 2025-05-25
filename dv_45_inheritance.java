package com.company;

class Base{
    int x;
    public int getX() {
        return x;
    }
    public void setX(int x) {
        System.out.println("we're setting the x now from the Base class");
        this.x = x;
    }
    public void printMe(){
        System.out.println("I am an Constructor");
    }
}

class Derived extends Base{
    //Instead of copying pasting the code from above class I can inherit it in this class
    int y;
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    //the above code is available here also the getter and setter of y;
}
public class dv_45_inheritance {
    public static void main(String[] args) {
        Base b = new Base();
        b.setX(3344);
        System.out.println(b.getX());
        Derived dv = new Derived();
        dv.setX(55);
        System.out.println(dv.getX());
    }
}
