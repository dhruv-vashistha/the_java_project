package com.company;

//making a thread class.
class thisThread extends Thread{
    //making a constructor here
    public thisThread(String name){
        super(name);
    }
    public void run(){
        int i = 0;
        while(i<3){
            System.out.println("this the run method in the thread class");
            i++;
        }
    }
}
public class dv_73_ThreadConstructor {
    public static void main(String[] args) {
        //life cycle of a tread --> 1.new  2.runnable  3.non-runnable  4.terminated
        thisThread t = new thisThread("tom");
        t.start();
        System.out.println("the id of this thread is: " + t.threadId());
        System.out.println("the name of this thread is: " + t.getName());
        thisThread tt = new thisThread("jerry");
        tt.start();
        System.out.println("the name of this thread is: " + tt.getName());
        System.out.println("the id of this thread is: " + tt.threadId());
    }
}
