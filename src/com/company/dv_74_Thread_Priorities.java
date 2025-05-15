package com.company;

class MyThreads extends Thread{
    //making a constructor
    public MyThreads(String name){
        super(name);
    }
    public void run(){
        System.out.println("this is the run method from the MyThreads class" + "\n the name is " + getName());
    }
}
public class dv_74_Thread_Priorities {
    public static void main(String[] args) {
        //Ready Queue: T1 T2 T3 T4
        //Thread scheduler help the thread to schedule their working and where
        MyThreads t1 = new MyThreads("peter");
        MyThreads t2 = new MyThreads("stark");
        MyThreads t3 = new MyThreads("shanks");
        MyThreads t4 = new MyThreads("groot");
        MyThreads t5 = new MyThreads("jarvis");
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t5.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
