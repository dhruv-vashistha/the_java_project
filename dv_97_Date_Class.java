package com.company;

import java.util.Date;

public class dv_97_Date_Class {
    public static void main(String[] args) {
        System.out.println(Long.MAX_VALUE);
        //9223372036854775807
        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getTime());
        System.out.println(d.getDate());
        System.out.println(d.getYear());
        //takes the 1900 as the reference of the time

    }
}
