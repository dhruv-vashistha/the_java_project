package com.company;

class mainThread extends Thread{
    public void run(){
        int i = 0;
        while(i<10) {
            System.out.println("1");
            i++;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class mainThread2 extends Thread {
    public void run() {
        int i = 0;
        while(i<10) {
            System.out.println("2");
            i++;
        }
    }
}
public class dv_75_ThreadMethods {
    public static void main(String[] args) {
        //this is about the methods in thread class
        mainThread m1 = new mainThread();
        mainThread2 m2 = new mainThread2();
        //if i wanna first run the first thread then the second then I will do the try and catch
        m1.start();
        m2.start();
        //now we're using the exception for the sleep command for the threads.
//        //this is the try and catch exception using the join thread command.
//        try{
//            m1.join();
//        }catch (Exception e){
//            System.out.println(e);
//        }
    }
}
