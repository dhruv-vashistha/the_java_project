package com.company;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class dv_102_project3 {
    public static void main(String[] args) {

        Date d = new Date();
        System.out.println(d.getHours() + ":" + d.getMinutes() + ":" + d.getSeconds());    //methods are deprecated now

        //now doing it with the calendar class

        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));

        //now doing it with the help of the time API
        LocalDateTime t = LocalDateTime.now();
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd MM yyyy");
        String myDate = t.format(f);
        System.out.println(myDate);

    }
}
