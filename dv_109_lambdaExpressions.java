package com.company;

@FunctionalInterface
interface myInt{
    void meth1(int a);
}

//via traditional way we can make implement the class

//class thisInt implements myInt{
//    @Override
//    public void meth1() {
//        System.out.println("this is the method 1 calling from implemented class");
//    }
//}
public class dv_109_lambdaExpressions {
    public static void main(String[] args) {
        //using the lambda expressions for the first time
        myInt obj = (a) ->{
            System.out.println("this is me implementing the interface using the lambda expressions " + a);

        };
        obj.meth1(22);

    }
}
