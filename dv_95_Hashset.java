package com.company;
import java.util.HashSet;
//in hashing technique the search processing decreases also it makes the relation with the inserted value
// so that it can search quick and saves the processing

public class dv_95_Hashset {
    public static void main(String[] args) {
        /*
        1.Hashing technique --> for the fast access
        2.chaining --> for the hashing collisions to chain a linked list
        3.load factor make sure that after filling the hashtable partially as specified it increases the size on its own
         */
        //it uses the hashing technique also it acts like a set that's why it is called hashset.
        //set::collection of unique items(therefore no repetition allowed)

        HashSet<Integer> hs = new HashSet<>(6,0.5f);     // --> syntax of generics

        //the default load factor is 0.75 and capacity is 16
        hs.add(6666);
        hs.add(7777);
        hs.add(8888);
        hs.add(9999);
        //here, I have inserted 4 elements and the loadFactor is 0.5 so 0.5*6 = 3 , 4>3 hence the hashset has resized
        //now the capacity is 8 just enough not to trigger the resize point
        System.out.println(hs.size());
        hs.remove(888);
        System.out.println(hs.contains(8888));

        System.out.println(hs);

    }
}
