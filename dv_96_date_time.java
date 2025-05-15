package com.company;

public class dv_96_date_time {
    public static void main(String[] args) {
        //milliSeconds passed since 1 jan 1970
        //java assumes the base date as the 1900 for the years calculation
        System.out.println(System.currentTimeMillis()/1000/3600/24/365);
        //result --> 55
        //and 2025 - 55 = 1970
        System.out.println(System.currentTimeMillis());
        //as long literal can store up to 10^20 millis therefore it sum up to 3 billion years
    }
}
