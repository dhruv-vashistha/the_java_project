package com.company;
/**
 * this is the java docs comment which add up the description in the java documentation.
 * @author Dhruv
 * @version 0.1
 * @see <a href ="https://docs.oracle.com/en/java/javase/17/docs/api/index.html"Target=_Blank>Java Docs</a>
 * @since 2002
 */

public class dv_107_javaDocsMethods {
    /**
     *hi this is most used method in java
     * @param args these are the arguments provided by me to write this code
     */
    public static void main(String[] args) {
        System.out.println("i am the main method here");
    }

    /**
     * there is no mean of adding a method in main method however I'm doing this as an example
     * @param a this is the first number
     * @param b this is the second number
     * @return this returns the value that the particular method supplied as a result
     * @deprecated this method is deprecated please use the + method
     * @throws Exception if a or b is 0
     */
    public int add(int a, int b) throws Exception{
        if(a ==0 || b== 0){
            throw new Exception();
        }
        return a+b;
    }

}
