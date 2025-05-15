package com.company;
import java.util.Scanner;

public class dv_81_Exception_Handling {
    public static void main(String[] args) {
        //we have made an array so we're finding a number that we will divide from it and use the exception handling in process
        int[] marks = new int[5];
        marks[0] = 11;
        marks[1] = 33;
        marks[2] = 44;
        marks[3] = 22;
        marks[4] = 99;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the index of the marks");
        int k = sc.nextInt();
        System.out.println("enter the no you want to divide the marks you've chosen");
        int l = sc.nextInt();
        try {
            System.out.println(marks[k]/l);
        }catch (ArrayIndexOutOfBoundsException i){
            System.out.print("the exception is: ");
            System.out.println(i);
        }catch (ArithmeticException a){
            System.out.print("the exception is: ");
            System.out.println(a);
        }catch (Exception e){
            System.out.print("the exception is: ");
            System.out.println(e);
        }

    }
}
