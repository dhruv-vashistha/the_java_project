package com.company;

interface Bicycle1{
    //the properties of the interfaces are final
    int a = 77;
    void applyBrakes(int decrement);
    void speedUp(int increment);
}
interface truck{
    void blowHorn(String hornTune);
    void warning();
}
//you can implement two or more classes in same class but, you cannot extend two classes in same class
class hero implements Bicycle1, truck{
    //we can override the variable/fields of the interfaces
    public int a = 44;
    int speed = 15;
    public void applyBrakes(int decrement){
        speed = speed - decrement;
    }
    public void speedUp(int increment){
        speed = speed + increment;
    }
    public int getSpeed() {
        return speed;
    }
    public void blowHorn(String hornTune){
        System.out.println(hornTune);
    }
    public void warning(){
        System.out.println("crush'em all!");
    }
}
public class dv_55_interfacesAndAbstraction {
    public static void main(String[] args) {
        hero h = new hero();
        h.speedUp(50);
        h.applyBrakes(20);
        System.out.println(h.getSpeed());
        //so you can create the properties in interfaces
        //however you cannot modify them in implemented classes as they are final
        System.out.println(h.a);
        //h.a = 33; this is the example of final variable
        h.blowHorn("dhoom machale dhoom machale");
        h.warning();
    }
}