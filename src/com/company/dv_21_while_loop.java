import java.util.Scanner;
public class dv_21_while_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 0;
        while (i<5){
            System.out.println(i);
            i++;
        }
        System.out.println("you have exit the while loop!");
        System.out.println("enter the starting number");
        int a = sc.nextInt();
        System.out.println("enter the limiting value");
        int b = sc.nextInt();
        while (a<=b){
            System.out.println(a);
            a++;
        }
    }
}
