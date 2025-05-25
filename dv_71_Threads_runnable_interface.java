package com.company;

class MyThreadRunnable implements Runnable{
    public void run(){
        for (int i = 0; i< 40; i++){
        System.out.println("I am a thread, not a threat!");
        }
    }
}
class MyThreadRunnable2 implements Runnable{
    public void run(){
        for (int i = 0; i< 40; i++){
        System.out.println("I am a thread, not a threat, but may be you're true!");
        }
    }
}
public class dv_71_Threads_runnable_interface {
    public static void main(String[] args) {
        //using multithreading via implementing the runnable interface
        MyThreadRunnable m1 = new MyThreadRunnable();
        Thread t1 = new Thread(m1);

        MyThreadRunnable2 m2 = new MyThreadRunnable2();
        Thread t2 = new Thread(m2);

        t1.start();
        t2.start();
    }
}
//concurrent processing using the multithreading...
