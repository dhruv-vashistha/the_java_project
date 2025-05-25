//the if else statement.....
 import java.util.Scanner;
 public class dv_15_if_else_statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();                //or i can write boolean age = sc.nextboolen();
        if (age>=18){                          //as if contain boolean type literal...
            System.out.println("yes, boy you can drive...");
        }
        else{
            System.out.println("no, you're too young to drive yet!");
        }
    }
 }
