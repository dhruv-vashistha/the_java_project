import java.util.Scanner;
public class dv_19_project1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //question 1 = write a java program to tell pass or fail if it needs 40% overall and 33% in each subject to pass
        //             also there are 3 subjects.
        System.out.println("enter marks in maths ");
        int maths = sc.nextInt();
        System.out.println("enter the marks in science");
        int science = sc.nextInt();
        System.out.println("enter the marks in english");
        int english = sc.nextInt();
        boolean a = maths>33;
        boolean b = science>33;
        boolean c = english>33;
        if (a && b && c){
            int k = (maths + science + english)/3;
            if (k>40){
                System.out.println("you're pass in your exams!");
                System.out.println("your percentage is: " + k);
            }
            else{
                System.out.println("you're fail!");
            }

        }
        else{
            System.out.println("you're fail!");
        }
    }
}