package com.company;

class MyEmployee{
    private int id;
    private String name;
    public void setId(int a){
        id = a;
    }
    public int getId(){
        return id;
    }
    public void setName(String k){
        name = k;
    }
    public String getName(){
        return name;
    }
}
public class dv_40_access_modifiers {
    public static void main(String[] args) {
        System.out.println("this is the new starting...");
        MyEmployee goku = new MyEmployee();
        goku.setName("kakarot");
        System.out.println(goku.getName());
        goku.setId(55);
        System.out.println(goku.getId());
    }
}
/*
use of getter and setter in private access modifier
 */