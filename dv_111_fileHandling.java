package com.company;

import java.io.*;
import java.util.Scanner;

public class dv_111_fileHandling {
    public static void main(String[] args) {
        //code to create a new file
        File myFile = new File("dv_111_file.txt");

        try {
            myFile.createNewFile();
        }catch (IOException i){
            throw new IOError(i);
        }

        //writing in the same file
        try {
            FileWriter fileWriter = new FileWriter("dv_111_file.txt");
            fileWriter.write("this is our first file from this java course\nokay byy");
            fileWriter.close();

        }catch (IOException i){
            throw new IOError(i);
        }

        //reading the same file in the console
        try {
            Scanner sc = new Scanner(myFile);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

//        //reading the custom text file whose content has taken from the internet
//        File thiFile = new File("customFile.txt");
//        try {
//            Scanner s = new Scanner(thisFile);
//            while(s.hasNextLine()){
//                String line = s.nextLine();
//                System.out.println(line);
//            }
//
//
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }

        //deleting the file that we've made
        //so by the way if you run the code as it is it won't delete the file
        //but if you comment all this code except the myFile object it will delete the text file
        if (myFile.delete()){
            System.out.println("i have deleted the file named " + myFile.getName());
        }
        else {
            System.out.println("some problem occurred while deleting the file");
        }

    }
}
