package com.company;

//this is the example of multithreading via extending the thread class
//next via runnable interfaces (achieved multithreading);
class MyThread1 extends Thread{
    @Override
    public void run() {
        int i = 0;
        while (i < 50) {
            System.out.println("this is the thread1");
            System.out.println("it's good");
            i++;
        }
    }
}

class MyThread2 extends Thread{
    @Override
    public void run() {
        int i = 0;
        while (i < 50) {
            System.out.println("this is the thread2");
            System.out.println("looks decent");
            i++;
        }
    }
}
public class dv_70_Multithreading {
    public static void main(String[] args) {
        System.out.println("finally we're here on the multithreading in the java");
        //multithreading achieves the concurrency not the parallelism
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
    }
}
