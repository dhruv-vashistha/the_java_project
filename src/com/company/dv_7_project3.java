import java.util.Scanner;
public class dv_7_project3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("this is the miles to kilometers convertor");
        System.out.println("enter the number of miles");
        double miles = sc.nextInt();
        double kilometers = miles/1.6;
        System.out.println("it is about " + kilometers + " kilometers");

    }
}
