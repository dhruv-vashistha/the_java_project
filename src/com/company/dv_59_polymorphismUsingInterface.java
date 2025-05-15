package com.company;

class cycle{
    public void getMoving(){
        System.out.println("moving the cycle");
    }
    void stop(){
        System.out.println("stopping the cycle");
    }
}
interface car{
    default void moreTalk(){
        System.out.println("come and buy it!");
    }
    default void letsTalk(){
        moreTalk();
        System.out.println("this the ultimate car.");
    }
    void getSeatBelt();
    void getEngineOn();
}
interface tampo{
    void loadOrders();
    void packUp();
}
class BigTruck extends cycle implements car, tampo{
    public void getSeatBelt(){
        System.out.println("checking the seatBelt");
    }
    public void getEngineOn(){
        System.out.println("starting the engine");
    }
    public void loadOrders(){
        System.out.println("load the items for shipping");
    }
    public void packUp(){
        System.out.println("pack up the things for delivery");
    }
}
public class dv_59_polymorphismUsingInterface {
    public static void main(String[] args) {
        //this is for the interface better understanding
        BigTruck t = new BigTruck();
        car c = new BigTruck();
        c.getSeatBelt();
        c.letsTalk();
    }
}
