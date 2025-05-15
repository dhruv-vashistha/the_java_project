package com.company;

import java.util.Scanner;
public class dv_39_project3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Square sqr = new Square();
        sqr.side = sc.nextInt();
        System.out.println("the parameter of the square is: " + sqr.getParameter());
        System.out.println("the area of the square is: " + sqr.getArea());
    }
}
class Square{
    int side;
    public int getParameter(){
        return 4*side;
    }
    public int getArea(){
        return side*side;
    }
}
