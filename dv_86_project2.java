package com.company;

public class dv_86_project2 {
    public static int method1(int a, int b){
        return a/b;
    }
    public static void method2(int a) throws Exception{
        if (a<0){
            throw new IllegalArgumentException();
        }
        System.out.println("your amount has been submitted");
    }
    public static void main(String[] args) {
        /*
    question 2 = write a java program that prints haha on during the arithmetic exception
    and hehe during the illegal argument exception
     */
        //making the arithmetic exception occur
        try {
            System.out.println(method1(4,0));
        }catch (ArithmeticException e){
            System.out.println("haha haha....");
        }

        //making the illegalArgumentException occur
        try {
            try {
                method2(-8);
            }catch (IllegalArgumentException e){
                System.out.println("hihi hihi....");
            }
        }catch (Exception e){
            System.out.println(e);
        }finally {
            System.out.println("this is the end of the problem");
        }

    }
}
