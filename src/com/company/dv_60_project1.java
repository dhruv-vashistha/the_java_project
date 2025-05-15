package com.company;

import org.w3c.dom.ls.LSOutput;

abstract class Pen{
    public void information(){
        System.out.println("this is the default method from the abstract class...");
    }
    abstract void refill();
    abstract void write() ;
}
class fountainPen extends Pen{
    public void changeNib(){
        System.out.println("changing the nib....");
    }
    public void refill(){
        System.out.println("your pen is refilling");
    }
    public void write(){
        System.out.println("your pen is writing something");
    }
}
public class dv_60_project1 {
    public static void main(String[] args) {
        /*
        question = create a class pen as abstract class with refill and write as abstract methods
         */
        Pen i = new fountainPen();
        i.refill();
        i.write();
        i.information();
        fountainPen f = new fountainPen();
        f.changeNib();
    }
}