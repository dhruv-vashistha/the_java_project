package com.company;

class customException extends Exception{
    public String toString(){
        return "this number i don't like";
    }
    public String getMessage(){
        return "please get rid of this number";
    }
}
public class dv_86_project1 {
    //method for the runtimeError
    public static void division(int a, int b) throws Exception{
        if(b<0) {
            throw new customException();
        }
        System.out.println(a/b);
    }


    public static void main(String[] args) {
        /*
        question 1 = write a java program to demonstrate the syntax, logical and runtime errors
          */
        //for the syntax error
        int a = 88;
        //System.out.println(a)

        //for the logical error - print the numbers from 5 to 10
//        for(int i = 5; i<10; i++){
//            System.out.println(i)
//        }

        //for the runtime error- or the exceptions
        //making a method for this
        int b = -7;
        try {
            division(4,-4);
        }catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("this is the end of the programme");
        }

    }
}
