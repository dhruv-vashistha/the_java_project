package com.company;
class A{
    int a;
    //method 1
    public int green(){
        return 12;
    }
    public void Method2(){
        System.out.println("I am the method2 of the class A");
    }
}
class B extends A{
    //override annotation
    @Override
    public void Method2(){
        System.out.println("I am the method2 of the class B");
    }
    public void Method3(){
        System.out.println("I am the method3 of the class B");
    }
}
public class dv_48_Method_Overriding {
    public static void main(String[] args) {
        A a = new A();
        a.Method2();
        //here the method called from superclass is working as the method of the superclass
        //in order to override it we can just make another method in the extended class of same name and parameters but different output
        B b = new B();
        b.Method2();
    }
}
