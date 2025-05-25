package com.company;
import java.util.Scanner;

class illegalOperationInput extends Exception{
    public String toString(){
        return "you cannot perform the wrong operation";
    }
}
class divByZero extends Exception{
    public String toString(){
        return "you cannot divide the integer with 0";
    }
}
class maxInputMul extends Exception{
    public String toString(){
        return "you cannot provide that big input into the program especially in multiplication";
    }
}
class maxInput extends Exception{
    public String toString(){
        return "that much big number is not allowed";
    }
}

class methods{
    //for the addition
    public int addUp(int a, int b){
        return a+b;
    }
    //for the subtraction
    public int subtract(int a, int b){
        return a-b;
    }
    //for the division
    public int div(int a, int b) throws Exception{
        if(b == 0){
            throw new divByZero();
        }
        return a/b;
    }
    //for the multiplication
    public int mul(int a, int b){
        return a*b;
    }
}
public class dv_87_custom_calculator {
    public static void main(String[] args) throws Exception{
        try{
            Scanner sc = new Scanner(System.in);

            System.out.println("enter the first number");
            int f = sc.nextInt();
            System.out.println("enter the second number");
            int s = sc.nextInt();
            System.out.println("enter the operation that you wanna perform in the custom calculator");
            char opt = sc.next().charAt(0);

            if (opt != '+' && opt != '-' && opt != '*' && opt != '/') {
                try {
                    throw new illegalOperationInput();
                }catch (illegalOperationInput i){
                System.out.println(i);
                }
            }

            methods m = new methods();
            //invalid input exception
            if (f > 100000 || s > 100000){
                try {
                    throw new maxInput();
                }catch (maxInput k){
                    System.out.println(k);
                }
            }

            //making a switch case for the arithmetic operation
            switch (opt){
                case('+'): {
                    System.out.println(m.addUp(f, s));
                    break;
                }
                case('-'):{
                    System.out.println(m.subtract(f,s));
                    break;

                }
                case('*'):{
                    if (f > 10000 || s > 10000){
                        try {
                            throw new maxInputMul();
                        }catch (maxInputMul j){
                            System.out.println(j);
                        }

                    }
                    System.out.println(m.mul(f,s));
                    break;
                }
                case('/'):{
                    if (f > 10000 || s > 10000){
                        try {
                            throw new maxInputMul();
                        }catch (maxInputMul n){
                            System.out.println(n);
                        }
                    }
                    System.out.println(m.div(f,s));
                    break;
                }
            }
            sc.close();
        }catch (Exception e){
            System.out.println(e);
        }

    }


}
 