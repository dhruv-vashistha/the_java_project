package com.company;

class EkClass{
    int a;
    //getter for a
    public int getA() {
        return a;
    }
    //constructor for setter
    public EkClass(int a){
        this.a = a;
    }
    //method for fun
    public int returnOne(){
        return 1;
    }
}
class DoClass extends EkClass{
    int c;
    public DoClass(){
        super(44);
        System.out.println("this is the another constructor from the Doclass");
    }

}
public class dv_47_this_super {
    public static void main(String[] args) {
        EkClass e = new EkClass(55);
        System.out.println(e.getA());
    }
}
