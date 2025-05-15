package com.company;

class Phone{
    public void on(){
        System.out.println("turning on the phone.....");
    }
    public void greetings(){
        System.out.println("you are most welcome");
    }
}

class smartPhone extends Phone{
    public void on(){
        System.out.println("turning on the smartPhone....");
    }
    public void greet(){
        System.out.println("you're welcome");
    }
}
public class dv_49_dynamic_method_dispatch {
    public static void main(String[] args) {
        Phone o = new Phone();
        smartPhone t = new smartPhone();
        //we can also use the object as
        Phone obj = new smartPhone();  //here the refence is Phone(superclass) and the object is smartPhone(subclass)
        //the vice-versa is invalid
        obj.on();
        obj.greetings();
    }
}
