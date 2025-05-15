package com.company;

import java.util.Scanner;

public class dv_82_nested_try_catch {
    public static void main(String[] args) {
        int[] marks = new int[4];
        marks[0] = 2;
        marks[1] = 5;
        marks[2] = 1;
        marks[3] = 9;
        System.out.println("we're making here a nested try and catch");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the index of the marks:");
        int k =  sc.nextInt();
        System.out.println("enter the number you want to divide it with");
        int j =  sc.nextInt();
        int value = 1;
        try{
            try {
                value = marks[k];
            }catch (ArrayIndexOutOfBoundsException a){
                System.out.println(a);
            }

            try {
                System.out.println(value/j);
            }catch (ArithmeticException o){
                System.out.println(o);
            }

        }catch (ArithmeticException e){
            System.out.println(e);
        }
        sc.close();


    }
}
