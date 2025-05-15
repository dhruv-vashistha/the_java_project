package com.company;

class MyCircle{
    private int r;
    public void setRadii(int radii){
        r = radii;
    }
    public void setParameter(float x){
        float parameter =x;
    }
    public void setArea(float y){
        float Area = y;
    }
    public float getParameter(){
        return 3.14f*r*2;
    }
    public float getArea(){
        return 3.14f*r*r;
    }
}
public class dv_40_getter_setter2 {
    public static class CheckAnswer{
        MyCircle crl = new MyCircle();
    }
    public static void main(String[] args) {


    }
}
