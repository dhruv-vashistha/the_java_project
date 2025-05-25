import java.util.Scanner;
public class dv_19_project3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        switch(age) {
            case 18:
                System.out.println("you're gonna be an adult.");
                break;

            case 25:
                System.out.println("you're an matured adult");
                break;

            case 50:
                System.out.println("you're an old man..");
                break;

            default:
                System.out.println("by byyyy...");
                break;
        }
        System.out.println("you have successfully break through the switch function...");
        //        we can also use the enhanced switch in place of it and it won't need the break the tree......
        //we also use switch with char, strings and literals as in this example....
    }
}
