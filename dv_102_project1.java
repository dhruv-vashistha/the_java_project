package com.company;

import java.util.ArrayList;
import java.util.Objects;

public class dv_102_project1 {
    public static void main(String[] args) {
        //Advanced java practiceSet
        ArrayList<String> arr = new ArrayList<>(10);
        arr.add("Thor");
        arr.add("Tom");
        arr.add("Jerry");
        arr.add("mec");
        arr.add("IronMan");
        arr.add("Stark");
        arr.add("HawkEye");
        arr.add("BlackWidow");
        arr.add("Jarvis");
        arr.add("Thanos");
        System.out.println(arr);
        for (Object elements: arr){
            System.out.print(elements + ", ");

        }

    }
}
