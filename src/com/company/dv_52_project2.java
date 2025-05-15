package com.company;

class Rectangle1{
    private int L;
    private int B;
    public Rectangle1(int L, int B){
        this.L = L;
        this.B = B;
        System.out.println("hey! this is the constructor 1");
    }
    //the method for the area
    public int AreaOfRectangle(){
        return L*B;
    }
    //getter and setter for the length and the breadth

    public int getL() {
        return L;
    }

    public void setL(int l) {
        L = l;
    }

    public int getB() {
        return B;
    }

    public void setB(int b) {
        B = b;
    }
}
class Cuboid extends Rectangle1{
    private int H;
    Cuboid(int L, int B, int H){
        super(L,B);
        System.out.println("and this is the constructor 2");
        this.H = H;
    }
    //making a method for the area of cuboid
    public int AreaOfCuboid(){
        int L = getL();
        int B = getB();
        return L*B + B*H + L*H;
    }

    //getter and setter for the height
    public int getH() {
        return H;
    }

    public void setH(int h) {
        H = h;
    }
}
public class dv_52_project2 {
    public static void main(String[] args) {
        //question - use inheritance and create the classes rectangle and the cuboid
        Cuboid c = new Cuboid(2,4,6);
        c.setL(2);
        c.setB(4);
        System.out.println(c.AreaOfCuboid());
        System.out.println(c.AreaOfRectangle());
    }
}
