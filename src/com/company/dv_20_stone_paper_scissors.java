import java.util.Random;
import java.util.Scanner;
public class dv_20_stone_paper_scissors {
    public static void main(String[] args){
        Random rdm = new Random();
        Scanner sc = new Scanner(System.in);
        int userScore = 0;
        int computerScore = 0;
        //round 1:
        System.out.println("round 1");
        int b = rdm.nextInt(3);
        System.out.println("enter the number as: 0 for scissors, 1 for stone and 2 for paper");
        int a = sc.nextInt();
        System.out.println("the random number is " + b);
        if(b == 0 && a == 1 || b == 1 && a == 2 || b == 2 && a == 0){
            System.out.println("you win");
            userScore++;
        }
        else if (a == b){
            System.out.println("it's a draw");
        }
        else {
            System.out.println("you loose");
            computerScore++;
        }
        //round 2:
        System.out.println("round 2");
        int b2 = rdm.nextInt(3);
        System.out.println("enter the number as: 0 for scissors, 1 for stone and 2 for paper");
        int a2 = sc.nextInt();
        System.out.println("the random number is " + b2);
        if(b2 == 0 && a2 == 1 || b2 == 1 && a2 == 2 || b2 == 2 && a2 == 0){
            System.out.println("you win");
            userScore++;
        }
        else if (a2 == b2){
            System.out.println("it's a draw");
        }
        else {
            System.out.println("you loose");
            computerScore++;
        }
        //round 3:
        System.out.println("round 3");
        int b3 = rdm.nextInt(3);
        System.out.println("enter the number as: 0 for scissors, 1 for stone and 2 for paper");
        int a3 = sc.nextInt();
        System.out.println("the random number is " + b3);
        if(b3 == 0 && a3 == 1 || b3 == 1 && a3 == 2 || b3 == 2 && a3 == 0){
            System.out.println("you win");
            userScore++;
        }
        else if (a3 == b3){
            System.out.println("it's a draw");
        }
        else {
            System.out.println("you loose");
            computerScore++;
        }
        //round 4:
        System.out.println("rond 4");
        int b4 = rdm.nextInt(3);
        System.out.println("enter the number as: 0 for scissors, 1 for stone and 2 for paper");
        int a4 = sc.nextInt();
        System.out.println("the random number is " + b4);
        if(b4 == 0 && a4 == 1 || b4 == 1 && a4 == 2 || b4 == 2 && a4 == 0){
            System.out.println("you win");
            userScore++;
        }
        else if (a4 == b4){
            System.out.println("it's a draw");
        }
        else {
            System.out.println("you loose");
            computerScore++;
        }
        //round 5:
        System.out.println("round 5");
        int b5 = rdm.nextInt(3);
        System.out.println("enter the number as: 0 for scissors, 1 for stone and 2 for paper");
        int a5 = sc.nextInt();
        System.out.println("the random number is " + b5);
        if(b5 == 0 && a5 == 1 || b5 == 1 && a5 == 2 || b5 == 2 && a5 == 0){
            System.out.println("you win");
            userScore++;
        }
        else if (a5 == b5){
            System.out.println("it's a draw");
        }
        else {
            System.out.println("you loose");
            computerScore++;
        }
        //final scores....
        System.out.println("the final scores:");
        if (userScore>computerScore){
            System.out.println("you are the winner!");
        }
        if (userScore<computerScore){
            System.out.println("you are the looser of this game!");
        }
        if (userScore==computerScore){
            System.out.println("it's a tie.");
        }

    }
}