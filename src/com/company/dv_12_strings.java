//strings are class as the scanner but can be used as datatypes as int............
//strings are immutable also.....
import java.util.Scanner;
public class dv_12_strings {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            String s = new String("dhruv");
            System.out.println(s);
            String k = "Dhruv Vashistha";
            System.out.println(k);
            int a = 34;
            float b = 8.43334f;
            System.out.printf("the value of a is %d and the value of the b is %f",a,b);
            System.out.format("the value of a is %d and the value of the b is %f",a,b);
            String c = sc.next();
            System.out.println(c);
            String d = sc.nextLine();
            System.out.println(d);
            System.out.format("the value of a is %d and the value of the b is %7f",a,b);  //total digits taken 7;
            System.out.println();
            System.out.format("the value of a is %d and the value of the b is %7.4f",a,b); //total digits 7 and digits taken after the point 4;

        }
}

