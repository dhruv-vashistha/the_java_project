package com.company;

public class dv_85_finally_uses {
    public static void main(String[] args) {
        for (int i = 0; i<10; i++){
            try {
                if (i==5){
                    break;
                }
            }
            finally{
                System.out.println("this is finally statement use " + i + " times");
            }
            System.out.println("loop is going on " + i + " times");
        }
    }
}
//we only use finally with try catch block or with Try
