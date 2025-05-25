package com.company;

class TommyStatus{
    public String getHitting(){
        return "hitting...";
    }
    public String getRunning(){
        return "running...";
    }
    public String getFiring(){
        return "firing...";
    }
    public String getMovingRight(){
        return "advancing right...";
    }
    public void getMovingLeft(){
        System.out.println("advancing left....");
    }
    public void sprinting(){
        System.out.println("sprinting...");
    }
}
public class dv_39_project5 {
    public static void main(String[] args) {
        /*
        question - create a class of Tommy for rockstar games capable of
        hitting the print as hitting, firing, running etc
         */
        TommyStatus ts = new TommyStatus();
        System.out.println(ts.getHitting());
        System.out.println(ts.getMovingRight());
        ts.sprinting();
    }
}
