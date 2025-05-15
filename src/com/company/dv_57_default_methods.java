package com.company;

interface Camera{
    void takeSnap();
    void recordVideo();
    //so using the default method in the interface i can use it as usual class method that is inherited by another class
    default void shutDown(){
        System.out.println("your camera battery is low so it shutting down");
    }
}
interface wifi{
    //using the private method in the interface
    private void forMiniLogic(){
        System.out.println("//logic");
    }
    //so I can use the private method to use it as the mini logic in case of bigger code
    default void fullLogic(){
        forMiniLogic();
        System.out.println("//the total code");
    }
    String[] getNetworks();
    void connectToNetwork(String networkName);
}
class cellPhone{
    void callNumber(long Number){
        System.out.println("calling " + Number);
    }
    void pickCall(){
        System.out.println("connecting....");
    }
}
class Phones extends cellPhone implements Camera, wifi{
    //but we can override the default method even if it is from the interface class
//    @Override
//     public void shutDown(){
//        System.out.println("shut it down");
//    }
    public void takeSnap(){
        System.out.println("your photo-shop has done!\ngood bye...");
    }
    public void recordVideo(){
        System.out.println("your video is being recorded by the cameraman prashant...");
    }
    public String[] getNetworks(){
        System.out.println("getting the list of the networks");
        String[] Networks = {"prashantnet", "bsnl", "airtel"};
        return Networks;
    }
    public void connectToNetwork(String networkName){
        System.out.println("connecting to the network named " + networkName);
    }
}
public class dv_57_default_methods {
    public static void main(String[] args) {
        Phones p = new Phones();
        p.takeSnap();
        p.recordVideo();
        String[] arr = p.getNetworks();
        for (String elements: arr){
            System.out.println(elements);
        }
        p.connectToNetwork("Airtel5g");
        p.pickCall();
        p.callNumber(8893933);
        p.shutDown();
        p.fullLogic();
    }
}
