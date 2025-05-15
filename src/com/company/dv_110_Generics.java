package com.company;
import java.util.ArrayList;
import java.util.Scanner;

/*
why use the generics: it helps easy multiple value access at the same time as String, integer, etc.
so we may use the generics in place of the classes and the methods we make to stabilize the code.
 */
class thisGenerics<val, str, str2>{
    private int val;
    private String str;
    private String str2;

    //making the getter and setter for the str2
    public String getStr2() {
        return str2;
    }

    public void setStr2(String str2) {
        this.str2 = str2;
    }

    //Constructor for setting the values
    public thisGenerics(int val,String str,String str2){
        this.val = val;
        this.str = str;
        this.str2 = str2;
    }

    //And making the getter and setter for both variables
    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }
}
public class dv_110_Generics {
    public static void main(String[] args) {
        //using the generics here
        ArrayList<String> arL= new ArrayList<>();
        arL.add("String1");
        arL.add("String2");
        System.out.println(arL);

        //without the generics
        ArrayList arL2 = new ArrayList();
        arL2.add("tom");
        arL2.add("jerry");
        arL2.add(88);
        arL2.add(new Scanner(System.in));

        int l2 = (Integer) arL2.get(2);
        String l0 = (String) arL2.get(0);
        String l1 = (String) arL2.get(1);
        Scanner l3 = (Scanner) arL2.get(3);

        int a = l3.nextInt();

        System.out.println(l0);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(a);

        //now using the generics class in the main method
        thisGenerics<Integer, String, String> g = new thisGenerics<>(88,"YUJI", "LENZ");
        System.out.println(g.getVal());
        System.out.println(g.getStr());
        System.out.println(g.getStr() + " " + g.getStr2());

    }
}
