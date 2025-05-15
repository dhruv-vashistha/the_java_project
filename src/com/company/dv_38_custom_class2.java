package com.company;

class GetSalary{
    int sal;
    String name;
    public void printSalary(){
        System.out.println("the Employee name is " + name);
        System.out.println("the Employee salary is " + sal+ " thousands dollars ");
    }
    String address;
    public String GetAddress(){
        System.out.print("the address " + name + " is ");
        return address;
    }
}
public class dv_38_custom_class2 {
    public static void main(String[] args) {
        GetSalary bob = new GetSalary();
        bob.name = "bob curmets";
        bob.sal = 55;
        bob.printSalary();
        GetSalary cris = new GetSalary();
        cris.name = "cris bumstead";
        cris.sal = 99;
        cris.printSalary();
        bob.address = "oggy and the chockroches";
        System.out.println(bob.GetAddress());
        cris.address = "the gym";
        System.out.println(cris.GetAddress());
    }
}
