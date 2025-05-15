package com.company;

interface SmartTvRemote{
    void switchOn();
}
interface TvRemote extends SmartTvRemote{
    void SwitchItOn();
}
class Tv implements TvRemote{
    public void switchOn(){
        System.out.println("switched on");
    }
    public void SwitchItOn(){
        System.out.println("switched on the tv remote");
    }
}
public class dv_60_project4 {
    public static void main(String[] args) {
        //question - create an interface tv remote and use it to inherit another interface SmartTvRemote...
        Tv i = new Tv();
        i.SwitchItOn();
        i.switchOn();
    }
}

