package com.company;
class Base1{
    //constructor for base1
    public Base1(){
        System.out.println("I am the constructor from base1");
    }
    //overloading the constructors
    public Base1 (int x){
        System.out.println("this is the overloaded constructor and by the way the value is " + x);
    }
}
class Derived1 extends Base1{
    public Derived1(){
        System.out.println("This is me from the derived1 class");
    }
    public Derived1(int x, int y){
        super(x);
        System.out.println("this is me from the derived class with values " + x + " and " + y);
    }
}
class ChildDerived extends Derived1{
    public ChildDerived() {
        System.out.println("this is the constructor from the childDerived");
    }
    public ChildDerived(int x, int y, int z){
        super(x,y);
        System.out.println("this is the overloaded constructor with a value " + x + " and " + y + " and " + z);
    }
}
public class dv_46_constructors_in_inheritance {
    public static void main(String[] args) {
        /*
        making objects for classes
        Base1 b1 = new Base1();
        Derived1 d1 = new Derived1();
        Base1 b2 = new Base1(55);
        Derived1 d2 = new Derived1(44,66);
*/
        //Derived1 d2 = new Derived1(44,88);
        //ChildDerived cd = new ChildDerived();
        ChildDerived cd1 = new ChildDerived(4,6,7);
    }
}
