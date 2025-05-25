import java.util.Scanner;
public class dv_19_project5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the yearly income of the person in Lakhs");
        float a = sc.nextFloat();
        if (a>10){
            float tax = (a-10)*0.3f + (a-5)*0.2f + (a-2.5f)/20;
            System.out.println("your taxation is " + tax);
        }
        else if (a>5){
            float tax = (a-5)*0.2f + (a-2.5f)/20;
            System.out.println("your taxation is " + tax);
        }
        else if (a>2.5){
            float tax = (a-2.5f)/20;
            System.out.println("your taxation is " + tax);
        }
        else{
            System.out.println("congratulations you're too poor, that you're under no obligation to pay the taxes.... ");
        }
    }
}