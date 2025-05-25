import java.util.Scanner;
public class dv_5_input_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("give the first number");
        int a = sc.nextInt();
        System.out.println("give the second number");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("the addition of the numbers is " + sum);
        int sub = a - b;
        System.out.println("the subtraction of the numbers is " + sub);
        int mul = a*b;
        System.out.println("the multiplication of the numbers is " + mul);
        int div = a/b;
        System.out.println("the division of the numbers is " + div);

    }
}
