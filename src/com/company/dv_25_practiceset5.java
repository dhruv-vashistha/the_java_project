/*
question - write a program to give the factorial value of given num....
 */
public class dv_25_practiceset5 {
    public static void main(String[] args) {
        int fac = 1;
        int num = 3;
        for (int i = 1; i<=num; i++){
            fac = fac*i;
        }
        System.out.println("the factorial of " + num + " is: " + fac);
    }
}