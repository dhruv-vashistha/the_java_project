package com.company;

interface Bicycle{
    void applyBrakes(int decrement);
    void speedUp(int increment);
    void saySomething(String say);
}
class Avon implements Bicycle{
    int speed = 10;
    public void speedUp(int increment) {
        this.speed = this.speed + increment;
    }
    public void applyBrakes(int decrement){
        this.speed = this.speed - decrement;
    }
    void printSpeed(){
        System.out.println(this.speed);
    }
    public void saySomething(String say){
        System.out.println(say);
    }
}
public class dv_54_interfaces {
    public static void main(String[] args) {
        System.out.println("this is the interfaces tutorial video");
        //the abstract class may contain concrete method along with abstract class
        //the inference class must contain all the methods as abstract methods
        Avon a = new Avon();
        a.applyBrakes(3);
        a.speedUp(7);
        a.printSpeed();
        a.saySomething("Yo! avon is the best.");
    }
}
