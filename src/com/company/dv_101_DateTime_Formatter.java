package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class dv_101_DateTime_Formatter {
    public static void main(String[] args) {
        LocalDateTime t = LocalDateTime.now();  //date object
        System.out.println(t);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");  //format for the date
        DateTimeFormatter dtf2 = DateTimeFormatter.ISO_LOCAL_DATE;          //preDefined format for the date class

        String MyDate = t.format(dtf);   //taking the date (t) in the format of (dtf) --> to make a string out of it
        System.out.println(MyDate);      //printing the formatted date String

        String MyDate2 = t.format(dtf2);
        System.out.println(MyDate2);

        //pattern for formatting and parsing
        //E is for day of the week
        //a for AM and PM
        //H for hours and m for minutes
        DateTimeFormatter a = DateTimeFormatter.ofPattern("dd-MM-yyyy E H:m a");
        String aa = t.format(a);
        System.out.println(aa);
    }
}
