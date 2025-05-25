import java.util.Scanner;
public class dv_4_taking_input {

     public static void main(String[] args) {
         System.out.println("taking input from the user....");
         Scanner sc = new Scanner(System.in);
         System.out.println("the first number is: ");
         int a = sc.nextInt();
         System.out.println("the second number is: ");
         int b = sc.nextInt();
         int sum = a + b;
         System.out.println("the sum of the given numbers is: ");
         System.out.println(sum);
         System.out.println("GOOD JOB!");
     }
 }
