import java.util.Scanner;
public class dv_19_project2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age");
        byte a = sc.nextByte();
        if (a>56){
            System.out.println("you're an experienced person.");
        }
        else if(a>40){
            System.out.println("you are just experienced.");
        }
        else if(a>35){
            System.out.println("you're intermediate.");
        }
        else{
            System.out.println("you need to work");
        }
        if (a>2){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}