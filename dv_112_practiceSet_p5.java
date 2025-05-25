package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class dv_112_practiceSet_p5 {
    public static void main(String[] args) {
        //question - write table from 2 to 9 and save them to file

        File mulFile = new File("dv_MultiplicationTable2.txt");
        try {
            mulFile.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            FileWriter w = new FileWriter(mulFile);
            for (int j = 2; j<10; j++){
                w.write("\nthe table of " + j + "\n");
                for (int i = 1; i<=10; i++) {
                    //the code has typeCasted to String
                    String line = j + " Times " + i + " = " + j * i + "\n";
                    w.write(line);
                }
            }
            w.close();
            System.out.println("your table has saved to the given file");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
