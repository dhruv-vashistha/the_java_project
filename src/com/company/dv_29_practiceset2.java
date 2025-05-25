import java.util.Scanner;
public class dv_29_practiceset2 {
    public static void main(String[] args) {
        /*
        question = write a program to find out whether the number is present in an array...
         */
        Scanner sc = new Scanner(System.in);
        int[] example = {23, 888, 345, 444, 89, 39, 99};
        int num = sc.nextInt();
        boolean isInArray = false;
        for (int i = 0; i< example.length; i++){
            int a = example[i];
            if (num == a){
                isInArray = true;
                break;
            }
        }
        if (isInArray){
            System.out.println("we found the number although it was very hard but worthit!");
        }
        else {
            System.out.println("we didn't found what you ask for..by..by..");
        }

    }
}