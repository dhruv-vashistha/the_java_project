package com.company;

import java.io.*;
import java.util.Scanner;

public class dv_112_practiceSet_p4 {
    public static void main(String[] args) {
        /*
        question 4 = write the multiplication table and write it to a file
         */

        //creating a solution to write down the multiplication table
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter the number of which the table you want to save the file off ");
        int a = Sc.nextInt();

        File mulFile = new File("dv_MultiplicationTable.txt");
        try {
            mulFile.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            FileWriter w = new FileWriter(mulFile);
            for (int i = 1; i<=10; i++) {
                //the code has typeCasted to String
                String line = a + " Times " + i + " = " + a * i + "\n";
                w.write(line);
            }
            w.close();
            System.out.println("your table has saved to the given file");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
