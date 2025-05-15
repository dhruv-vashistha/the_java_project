package com.company;
//making the subclass out of the inheritance

/**
 * functionalInterface annotation help to only add 1 abstract method to the interface
 */
@FunctionalInterface
interface thatPhone{
    void qualityPhone();
}
class thisPhone{
    public void phone(){
        System.out.println("this is 7pm");

    }
}
/**
 * this is the class which is extending the thisPhone class and using @Override annotation via inheritance in same package
 */
class superPhone extends thisPhone{
    @Override
    public void phone() {
        System.out.println("hello");
    }
    @Deprecated
    public int sum(int a, int b){
        return a+b;
    }

}
/**
 * this is the class for the java annotations
 */
public class dv_108_javaAnnotations {
    /**
     * this is the main method
     * @param args no use
     */
    @SuppressWarnings("deprication")
    public static void main(String[] args) {
        System.out.println("the java provide annotations for the extra information about the programme\nalso provide to the class or methods");
        System.out.println("metadata: information about some information");

        superPhone s = new superPhone();
        s.phone();

        System.out.println(s.sum(8,7));

    }
}
