package com.company;

class Employee{
    int id;
    String name;
    public void printDetails(){
        System.out.println("the id of person is " + id);
        System.out.println("the name of that person is " + name);
    }
}
public class dv_38_custom_class {
    public static void main(String[] args) {
        System.out.println("this is our custom class");
        //instantiating a new employee object
        com.company.Employee bob = new com.company.Employee();
        //setting the attributes to bob
        bob.id = 33;
        bob.name = "bob";

        /*
        we can say---
         System.out.println("the id of bob is " + bob.id);
         System.out.println("the name of the person is " + bob.name);
        */
        bob.printDetails();
        //initiating the new obj
        com.company.Employee kris = new com.company.Employee();
        //setting the attributes to kris
        kris.id = 55;
        kris.name = "kris hammer";
        kris.printDetails();



    }
}

