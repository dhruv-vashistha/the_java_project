package com.company;

class Monkey{
    public void jump(){
        System.out.println("jump");
    }
    public void bite(){
        System.out.println("bite");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal{
    @Override
    public void eat(){
        System.out.println("Eating");
    }
    @Override
    public void sleep(){
        System.out.println("sleeping");
    }
}
public class dv_60_project2 {
    public static void main(String[] args) {
        Human h = new Human();
        h.eat();
        h.jump();
    }
}
