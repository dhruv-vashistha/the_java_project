package com.company;

import javax.imageio.plugins.tiff.TIFFField;
import java.sql.Time;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class dv_99_GregorianCalendar {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getTime());
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.MINUTE));
        System.out.println(c.get(Calendar.SECOND));
        //for the international 24 hours system output
        System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));

        GregorianCalendar cd = new GregorianCalendar();
        System.out.println(cd.isLeapYear(8920392));

        //time zones are different in different countries GMT(greenWhich mean time)
        //IST(indian standard time) is ahead of the UST(coordinated universal time)
        //which is IST = UST + 5:30;
        //or we can say
        //which is IST = GMT + 5:30;

        System.out.println("list of all the time zones available");

        System.out.println(Arrays.toString(TimeZone.getAvailableIDs()));
        System.out.println(TimeZone.getDefault());
        System.out.println(TimeZone.getTimeZone("Asia/Kolkata"));

    }
}
