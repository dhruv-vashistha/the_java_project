package com.company;

import java.util.Scanner;
import java.util.Random;
class Game{
    private int uIn;
    private int cIn;
    private int noOfGuesses = 0;
    boolean gameOver = false;

    //getting the computer input 0-100....via constructor
    public Game(){
        Random rdm = new Random();
        cIn = rdm.nextInt(101);
    }

    //setter for the computer input
    public void setComputerChoice(int computerChoice){
        cIn = computerChoice;
    }
    //getter for the computer input
    public int getComputerChoice(){
        return cIn;
    }
    //making a setter for the uIn
    public void setUserInput(int userGuess){
        uIn = userGuess;
        noOfGuesses++;
    }
    //making a getter for the user uIn
    public int getUserInput(){
        return uIn;
    }

    //the main game logic via method
    public String gameCheck(){
        if(uIn == cIn){
            gameOver = true;
            System.out.println("the no of guesses you take is " + noOfGuesses + " so is your score.");
            return "you win it congrats!";
        }
        else if (uIn>cIn) {
            return "your guess is too high! try a smaller one";
        }
        else{
            return "your guess is too low! try a bigger one";
        }
    }
}
public class dv_43_guess_the_number {
    public static void main(String[] args) {
        Game gm = new Game();
        Scanner sc = new Scanner(System.in);

        while(!gm.gameOver){
            //setter as constructor and getter here for the computer choice
            //System.out.println(gm.getComputerChoice());

            //setter as the user input via Scanner and getter also
            System.out.println("enter the number between 0 to 100");
            int k = sc.nextInt();
            gm.setUserInput(k);
            //System.out.println(gm.getUserInput());

            //calling the main game method
            System.out.println(gm.gameCheck());
        }
        sc.close();

    }
}