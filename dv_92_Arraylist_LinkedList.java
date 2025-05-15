package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class dv_92_Arraylist_LinkedList {
    public static void main(String[] args) {
        //this is the video that will differentiate bw the linked list and the array list
        //making the array list
        //use the array list when you need to save computation and faster access
        ArrayList<Integer> arrList= new ArrayList<>();
        arrList.add(1);
        arrList.add(3);
        arrList.add(4);
        arrList.add(5);
        arrList.add(1,2);

        System.out.println(arrList);

        //making the linked list
        //use the linkedList when you have to add up and remove the elements in the linked list
        LinkedList<Integer> linkList = new LinkedList<>();
        linkList.add(9482);
        linkList.add(833);
        linkList.addAll(0,arrList);
        linkList.reversed();

        System.out.println(linkList);


    }
}
