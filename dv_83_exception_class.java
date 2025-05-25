package com.company;

import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString(){
        return super.toString() + "this is my toString()";
    }

    @Override
    public String getMessage(){
        return super.getMessage() + "this is my getMessage()";
    }

}
public class dv_83_exception_class {
    public static void main(String[] args) {
        //this is the exception class
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a");
        int a = sc.nextInt();
        if (a<100){
            try {
                throw new MyException();
            }catch(Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);
                e.printStackTrace();
            }
        }

    }
}
