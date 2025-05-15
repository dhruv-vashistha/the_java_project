package com.company;

class ThreadRunnable1 implements Runnable{
    private String name;
    //making up a constructor here to set the name
    public ThreadRunnable1(String name){
        this.name = name;
    }
    public void run(){
        System.out.println("this is the run method that invokes on its owns");
    }
}
public class dv_73_threadConstructorRunnable {
    public static void main(String[] args) {
        //so this to name the thread and provide the id to it using the runnable
        ThreadRunnable1 k = new ThreadRunnable1("tom");
        Thread t = new Thread(k,"tom");
        t.start();

        ThreadRunnable1 m = new ThreadRunnable1("jerry");
        Thread tt = new Thread(m,"jerry");
        tt.start();

        System.out.println("the id is: " + t.threadId() + " and the name is: " + t.getName());
        System.out.println("the id is: " + tt.threadId() + " and the name is: " + tt.getName());
    }
}
