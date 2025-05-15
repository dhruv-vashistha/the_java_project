package com.company;

class Animals{
    public String printFeatures(){
        return "most of the animals are naive";
    }
}
class Dogs extends Animals{
    public String printFeature2(){
        return "dogs are naive too!";
    }
}
public class dv_45_inheritance2 {
    public static void main(String[] args) {
        //question - make a superclass animal and a subclass dog.
        Dogs d = new Dogs();
        System.out.println(d.printFeatures());
        System.out.println(d.printFeatures());
    }
}