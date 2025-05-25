import java.util.Scanner;
public class dv_7_project1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the marks in first exam");
        double a = sc.nextInt();
        System.out.println("enter the marks in the second exam");
        double b = sc.nextInt();
        double cgpa = (a + b)/20;
        System.out.println("your CGPA is "+ cgpa);
    }
}
