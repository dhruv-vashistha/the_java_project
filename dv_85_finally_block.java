package com.company;

public class dv_85_finally_block {
    //this is the method for the main class
    public static void greet(){
        try {
            int a = 10;
            int b = 0;
            System.out.println(a/b);
        }catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("this is the end of method");
        }
    }
    public static void main(String[] args) {
        greet();
    }
}
