package com.company;

import java.util.Scanner;

public class dv_82_Quiz {
    public static void main(String[] args) {
        //write a java program that allows the user to enter the array indices until he enters the write index;
        int[] num = {4, 3, 66, 2, 9, 2, 5};
        System.out.println("the length of this array is: " + num.length);
        Scanner sc = new Scanner(System.in);

        boolean isTrueIndices = false;
        while (!isTrueIndices) {
            System.out.println("enter the indices");
            int a = sc.nextInt();
            try {
                int k = num[a-1];
                System.out.println("yes you've successfully entered the right index and the value of it is: " + k);
                isTrueIndices = true;
            }catch (ArrayIndexOutOfBoundsException m){
                System.out.println(m);
            }

        }

    }
}
