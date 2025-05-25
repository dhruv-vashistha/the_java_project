package com.company;
import java.util.Scanner;

//making a custom exception here
class MaximumReachException extends Exception{
    public String toString(){
        return "this is the maximum limit of your tries";
    }
}
public class dv_86_project3 {
    public static void main(String[] args) {
        /*
        question 3 = write a program that allows you to keep accessing an array until you give it the right index
        if maximum tries exceeds 5 then give it an error.
         */
        int[] arr = {3, 5, 6, 3, 6, 2, 7, 2, 3};
        System.out.println(arr.length);
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i<5;){
            try {
                System.out.println("enter the index of the array");
                int a = sc.nextInt();
                System.out.println("the number that you put at the index of the array is " + arr[a]);
                break;
            }catch (Exception e){
                System.out.println("we cannot print the number and the reason is: " + e);
                i++;
            }finally {
                if (i == 5){
                    System.out.println("error");
                    try {
                        throw new MaximumReachException();
                    }catch (Exception e){
                        System.out.println(e);
                    }
                }
            }
        }


    }
}
