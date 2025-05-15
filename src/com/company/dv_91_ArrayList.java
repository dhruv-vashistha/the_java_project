package com.company;
import java.util.*;

public class dv_91_ArrayList {
    public static void main(String[] args) {
        //Arraylist
        ArrayList<Integer> k = new ArrayList<>();
        ArrayList<Integer> m = new ArrayList<>();
        m.add(111);
        m.add(383);
        m.add(290);
        m.add(482);
        k.add(33);
        k.add(3);
        k.add(3);
        k.add(3);
        k.add(5);
        k.add(1);
        k.add(99);
        k.add(1,55);
        k.add(1,44);
        k.addAll(0,m);
        //k.clear();
        k.remove(1);
        k.set(0,2999);

        //displaying the arraylist
        for (int i = 0; i<k.size(); i++){
            System.out.println(k.get(i));
        }

        System.out.println(k.contains(111));
        System.out.println(k.indexOf(3));
        System.out.println(k.lastIndexOf(3));


        m.trimToSize();
        for (Integer integer : m) {
            System.out.println(integer);
        }
        boolean a = true;
        m.removeIf(num -> num % 2 == 0);
        System.out.println(m);

    }
}