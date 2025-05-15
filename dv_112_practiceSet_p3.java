package com.company;

@FunctionalInterface
interface useInter{
    void meth(int a);
}
public class dv_112_practiceSet_p3 {
    public static void main(String[] args) {
        /*
        Question 3 - create an interface and generate an instance from this
         */
        // I just have to use it in the code
        //using the lambda expression in place of the anonymous class
        useInter u = (int a)->{
            System.out.println("this is the method 1 in useInter class which is a interface " + "\nby the way number is: " + a);
        };
        u.meth(88);


    }
}
