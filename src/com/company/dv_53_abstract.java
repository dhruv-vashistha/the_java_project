package com.company;

//either we can implement the class from abstract class or we can make new abstract class
//so the abstract class may contain concrete methods however it must contain one abstract method
abstract class Base2{
    void bb(){
        System.out.println("this is concrete method from the abstract class Base2");
    }
    Base2(){
        System.out.println("I am the constructor of the base2");
    }
    abstract public void sayHello();
}
class Derived2 extends Base2{
    @Override
    public void sayHello(){
        System.out.println("hello!");
    }
}
abstract class DerivedAgain extends Base2{
    public void th(){
        System.out.println("goodbye!");
    }

}
public class dv_53_abstract {
    public static void main(String[] args) {
        //Base2 b = new Base2(); we cannot make object of the abstract class
        //however we can do like
        Base2 b = new Derived2();
        //reference is base2 and object is for Derived2 we can implement only abstract methods
        Derived2 d = new Derived2();
        d.sayHello();
        d.bb();

    }
}