package com.company;

class DepAno{
    @Deprecated
    public void meth1(){
        System.out.println("this is the method 1 with deprecated annotation");
    }
}
public class dv_112_practiceSet_p2 {
    @SuppressWarnings("deprication")
    public static void main(String[] args) {
        //question 2 - create a class with a method of deprecated annotation
        DepAno dep = new DepAno();
        dep.meth1();

    }
}
