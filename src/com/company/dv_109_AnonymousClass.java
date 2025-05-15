package com.company;

//Lambda expressions for the functional interfaces and the anonymous class is for the multiple methods in the interface

interface gadgets{
    public void makeSound();
    public void shutDown();
}
public class dv_109_AnonymousClass {
    public static void main(String[] args) {
        //anonymous class : it helps to concise the code and make the logic more direct
        /*
        as it declares the instance and also initiates at the same time typically used to implement the interface
         */
        //if you have noticed here there is no name for the class, it's an object named washingMachine
        gadgets washingMachine = new gadgets() {
            @Override
            public void makeSound() {
                System.out.println("burr burr....");
            }

            @Override
            public void shutDown() {
                System.out.println("shutting down please turn the switch off");
            }
        };
        gadgets inverter = new gadgets() {
            @Override
            public void makeSound() {
                System.out.println("Beep Beep");
            }

            @Override
            public void shutDown() {
                System.out.println("battery is not charged anyway so shutting down is the only option now");
            }
        };
        washingMachine.makeSound();
        washingMachine.shutDown();
        inverter.makeSound();
        inverter.shutDown();

    }
}
