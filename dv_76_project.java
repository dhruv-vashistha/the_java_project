package com.company;

class practiceSet1 extends Thread{
    public void run(){
        while(true){
            System.out.println("good morning");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class practiceSet2 extends Thread{
    public void run(){

        while(true){
            System.out.println("welcome");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class dv_76_project {
    public static void main(String[] args) {
        practiceSet1 p = new practiceSet1();
        practiceSet2 k = new practiceSet2();
        System.out.println(k.getState());
        p.start();
        k.start();
        p.setPriority(9);
        k.setPriority(1);
        System.out.println(k.getPriority());
        System.out.println(p.getPriority());
        System.out.println(k.getState());
        System.out.println(p.getState());
        //last question is: how to get the reference to the current thread and apply the commands
        System.out.println(Thread.currentThread().getState());

    }
}
