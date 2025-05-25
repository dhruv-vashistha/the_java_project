package com.company;
import com.company.newPackage.dv_66_againExamples;
import com.company.newPackage.dv_66_examples;

//all modifiers = public, protected, default and private modifiers
class c1{
    public int x = 3;
    protected int y = 44;
    private int z = 20;
    int k = 22;
    //so it says that I can use all the modifiers in same class
    public void meth1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(k);
    }
}
class c2 extends dv_66_examples {
    public void meth2(){
        //System.out.println(a);  --> as we can se we cannot access the default in subclass from diff pkg..
        System.out.println(b);
        //System.out.println(c);
        System.out.println(d);
        //as expected default and private are showing errors
    }
}
public class dv_66_access_modifiers {
    public static void main(String[] args) {
        System.out.println("this is about the access modifiers in java");
        c1 c = new c1();
        c.meth1();

        //demonstration of the access modifiers use in same package
        System.out.println(c.x);
        System.out.println(c.y);
        System.out.println(c.k);
        //System.out.println(c.z);
        /*
        as we know that z is a private access modifier
        so it won't work other than in his own class
        */

        //now the example of the subclass
        //also we have make a file named examples for this
        c2 k = new c2();
        k.meth2();

        //now the example of the "world" as againExamples...
        dv_66_againExamples a = new dv_66_againExamples();
        System.out.println(a.q);
        //System.out.println(a.w);
        //System.out.println(a.e);
        //System.out.println(a.r);
        /*
        only the public access modifier works here in the world in different packages as package age
        and package age.com are different packages with the perspective of java
         */

    }
}
