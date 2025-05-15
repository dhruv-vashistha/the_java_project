package com.company;

import java.util.Calendar;
import java.util.TimeZone;

public class dv_98_Calendar_class {
    public static void main(String[] args) {
        //calendar class is an abstract class
        Calendar c = Calendar.getInstance();
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone());

        Calendar cc = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
        System.out.println(cc.getTimeZone());
        System.out.println("this is the new time zone set manually");

    }
}
