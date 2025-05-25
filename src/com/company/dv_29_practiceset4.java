/*
in order to become the leap year that year should be multiple of 4 and 100 if it is of 400.......
or if it only multiple of 4 then it's okay
however, if it's multiple of 100 then it must be the multiple of 400 to become the leap year.........
 */
import java.util.Scanner;
public class dv_29_practiceset4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year%4 == 0 && year %100 !=0 || year %400 == 0){
            System.out.println("yes, its a leap year");
        }
        else{
            System.out.println("its not an leap year");
        }
    }

}