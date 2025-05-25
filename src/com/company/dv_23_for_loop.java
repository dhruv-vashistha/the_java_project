import java.util.Scanner;
public class dv_23_for_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i<=5; i++) {
            System.out.println(i);
        }
        System.out.println("questions in for loop");
        //question - write a program using for loop to print the first 5 odd numbers......
        for (int a = 0; a<=5; a++){
            int n = 2*a + 1;
            System.out.println(n);
        }
        System.out.println("question 2");
        //question2 - dectrementing for loop.......
        for (int b = 10; b != 0; b--){
            System.out.println(b);
        }
        //question3 - write the natural no. in reverse order...........
        System.out.println("question3\nenter the number for the reverse order natural number print");
        int n = sc.nextInt();
        for (int c = n; c>0 ; c--){
            System.out.println(c);
        }

    }
}
