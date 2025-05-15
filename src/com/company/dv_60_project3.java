package com.company;

abstract class telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
class SmartPhone extends telephone{
    public void smartPhone(){
        System.out.println("this is the smart phone");
    }
    public void ring(){
        System.out.println("ringing");
    }
    public void lift(){
        System.out.println("on call");
    }
    public void disconnect(){
        System.out.println("disconnected");
    }
}
public class dv_60_project3 {
    public static void main(String[] args) {
        System.out.println("this is the polymorphism via abstract methods and class");
        telephone t = new SmartPhone();
        //t.smartPhone();  -->not allowed as only the  common thing can be allowed for inherited methods
        t.disconnect();
    }
}
