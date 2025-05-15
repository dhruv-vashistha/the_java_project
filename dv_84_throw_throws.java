package com.company;
import java.util.Scanner;

public class dv_84_throw_throws {
    //making a method
    public static int divide(int a, int b){
        if(b<=0){
            try {
                System.out.println(a/b);
                return -1;
            }catch (ArithmeticException e){
                System.out.print(e);
                return -1;
            }

        }else {
            return a/b;
        }

    }
    public static void main(String[] args) {
        System.out.println("enter the numbers");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(divide(a,b));

    }
}
