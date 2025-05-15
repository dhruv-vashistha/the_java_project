package com.company;

import java.util.ArrayDeque;

public class dv_93_ArrayDeque {
    public static void main(String[] args) {
        //the array dequeue
        ArrayDeque<Integer> d = new ArrayDeque<>();
        d.add(8);
        d.addLast(9);
        d.addFirst(7);
        d.addLast(3);
        d.addFirst(33);
        d.addFirst(44);
        d.removeFirst();
        d.remove();
        System.out.println(d);
        //for getting an element we can use - peek or get
        //for saving an element we can use - add or offer
        //for taking an element we can use - poll or remove
        //first for no error and second may give an error in case

        System.out.println(d.peekFirst());
        //etc, etc


    }
}
