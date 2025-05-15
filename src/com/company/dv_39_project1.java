package com.company;
class Employees{
    String name;
    int sal;
    public int getSalary(){
        return sal;
    }
    public String getNames(){
        System.out.print("the salary in thousand dollars ");
        return name;
    }
//this    public static String setNames(){
//
//    }
}
public class dv_39_project1 {
    public static void main(String[] args) {
        /*
        question - create a class employee with (salary and names) attributes
                   and (getSalary,getNames,setNames) as the methods.
         */
        Employees luffy = new Employees();
        luffy.name = "monkey d.luffy";
        luffy.sal = 40;
        Employees zoro = new Employees();
        zoro.name = "zoro";
        zoro.sal = 30;
        System.out.println(luffy.getSalary());
        System.out.println(luffy.getNames());


    }
}
