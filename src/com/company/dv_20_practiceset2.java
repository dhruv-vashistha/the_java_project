//taking the url of website and determining it's type in result....
import java.util.Scanner;
public class dv_20_practiceset2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the url of the website");
        String url = sc.nextLine().toLowerCase();
        System.out.println(url);
        if (url.endsWith(".org")) {
            System.out.println("it's an organizational website");
        }
        else if (url.endsWith(".in")) {
            System.out.println("it's an indian website");
        }
        else if (url.endsWith(".com")){
            System.out.println("it's an commercial website");
        }
        else{
            System.out.println("it's an unknown website");
        }
    }
}