package com.company;
import java.util.Scanner;

class Rectangle2{
    public int len;
    public int bre;
    public Rectangle2(int len, int bre){
        if (len>0 && bre>0){
            this.len = len;
            this.bre = bre;
            getArea();
        }
        else{
            //I want to continue the work then I will use the try and catch block
            try {
                throw new ArithmeticException("this is an exception input variable not greater then 0");
            }catch (Exception e){
                System.out.println(e);
            }

        }
    }
    public void getArea(){
        System.out.println("the area is: " + this.len*this.bre);
    }
}

public class dv_83_project {
    public static void main(String[] args) {
        //making a custom exception
        Scanner sc = new Scanner(System.in);
        System.out.println("input the length and breadth of the rectangle you're finding the area of.");
        int len = sc.nextInt();
        int bre = sc.nextInt();
        Rectangle2 obj = new Rectangle2(len,bre);

    }
}
