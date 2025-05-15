package com.company;

public class dv_39_project2 {
    public static void main(String[] args) {
        /*
        question - write a class cellphone that prints the ringing, vibrating and silent etc
         */
        CellPhone cp = new CellPhone();
        cp.phoneStateRinging();
        cp.phoneStateVibrating();
        cp.phoneStateSilent();
    }
}
class CellPhone{
    public static void phoneStateRinging(){
        System.out.println("The phone is ringing...");
    }
    public static void phoneStateVibrating(){
        System.out.println("The phone is vibrating...");
    }
    public static void phoneStateSilent(){
        System.out.println("The phone is silent...");
    }
}