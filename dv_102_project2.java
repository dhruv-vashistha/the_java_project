package com.company;

import java.util.*;

public class dv_102_project2 {
    public static void main(String[] args) {
        /*
        question - create a set and try to store a duplicate element in hashset
        and varify that only one instance is stored.
         */
        HashSet<String> hs = new HashSet<>();
        hs.add("tom");
        hs.add("harry");
        System.out.println(hs);
        hs.add("tom");
        System.out.println(hs);
        //set - collection of unique elements and in defined manner
        //therefore we cannot addUp the same element twice in hashset
    }
}
