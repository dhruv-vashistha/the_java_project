package com.company;

interface sampleInterface{
    void meth1();
    void meth2();
}
interface childSampleInterface extends sampleInterface{
    void meth3();
    void meth4();
}
class SampleClass implements childSampleInterface{
    public void meth1(){
        System.out.println("meth1");
    }public void meth2(){
        System.out.println("meth2");
    }public void meth3(){
        System.out.println("meth3");
    }public void meth4(){
        System.out.println("math4");
    }
}
public class dv_58_InheritanceInInterfaces {
    public static void main(String[] args) {
        //this is about the interfaces properties
        SampleClass s = new SampleClass();
        s.meth1();
    }
}
