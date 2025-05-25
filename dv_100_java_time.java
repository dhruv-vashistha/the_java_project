package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class dv_100_java_time {
    public static void main(String[] args) {
        //searching the java time API
        LocalDate d = LocalDate.now();
        System.out.println(d);

        LocalTime t = LocalTime.now();
        System.out.println(t);

        LocalDateTime n = LocalDateTime.now();
        System.out.println(n);

        //there is date time formatter also which you can see the reference from the java docs or the ChatGPT or the geek for geeks
        //it can change the format of the date and time
    }
}