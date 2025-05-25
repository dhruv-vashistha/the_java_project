package com.company;

//making a custom exception class for the method 2
class NegativeRadiusException extends Exception{
    public String toString(){
        return "radius can't be negative";
    }

    public String getMessage(){
        return "radius cannot be negative";
    }
}
public class dv_84_java_throws_and_throw {
    //method no1
    public static int divide(int a, int b) throws ArithmeticException{
        return a/b;
    }

    //method no2
    public static double Area(int r) throws Exception{
        if (r<0){
            throw new NegativeRadiusException();
        }
        return Math.PI*r*r;
    }
    public static void main(String[] args) {
        System.out.println("this is the throw and throws class");
        try {
            System.out.println(divide(9,2));
        }catch (Exception e){
            System.out.println(e);
        }

        try{
            System.out.println(Area(-8));
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
