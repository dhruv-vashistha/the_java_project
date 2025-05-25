package com.company;

import java.util.Scanner;

public class dv_78_errors {
    public static void main(String[] args) {
        //three types of errors: 1.syntax  2.logical(also called bug)  3.runtime(also called exceptions)

        //now let say about the logical errors or the bugs
        //write a program to print the prime no from 1 to 10
        for(int i = 1; i<10; i++){
            if(!(i%2 == 0) && !(i%9 ==0)){
                System.out.print(i + ", ");
            }
        }
        System.out.println("\n");

        //RUNTIME ERROR
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        //takes the integer part only even if it is floating type
        System.out.println("thousand divided by k is: " + 1000/k);

    }
}
