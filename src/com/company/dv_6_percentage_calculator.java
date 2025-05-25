import javax.lang.model.util.SimpleElementVisitor6;
import java.util.Scanner;
public class dv_6_percentage_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the marks in Maths");
        float m = sc.nextInt();
        System.out.println("enter the marks in english");
        float e = sc.nextInt();
        System.out.println("enter the marks in hindi");
        float h = sc.nextInt();
        System.out.println("enter the marks in science");
        float s = sc.nextInt();
        System.out.println("enter the marks in s.s.t");
        float ss = sc.nextInt();
        float percentage = (m + e + h + s + ss)/5;
        System.out.println("you percentage is " + percentage);

    }
}

