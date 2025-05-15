package com.company;
import java.util.Scanner;

class MaxTryException extends Exception{
    @Override
    public String toString(){
        return "you cannot try anymore, ending the programme";
    }
}

public class dv_86_project4{
    static boolean victory = false;
    static int[] arr = {3, 5, 2, 5, 2, 6, 3};
    public static void mekeCall(int index){
        try {
            System.out.println("the number at your index in the array is: " + arr[index]);
            victory = true;
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i<5; i++){
            System.out.println("enter the index of the array");
            mekeCall(sc.nextInt());
            try {
                if (victory){
                    break;
                }
            }
            finally {

                if (i == 4) {
                    try {
                        throw new MaxTryException();
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }
            }
        }


    }
}
