package com.company;

public class dv_80_Try_Catch {
    public static void main(String[] args) {
        int a = 4000;
        int b = 0;
        try {
            System.out.println("the result is: " + a/b);
        }catch (Exception e){
            System.out.println("we failed to divide and the reason was: ");
            System.out.println(e);
        }
        System.out.println("the end of the program");

    }
}
