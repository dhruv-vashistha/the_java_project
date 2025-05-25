/*
question - write program using the while loop to sum first n even numbers...
 */
public class dv_25_practiceset2 {
    public static void main(String[] args) {
        int sum = 0;
        int n = 0;
        int k = 4;
        while (n < k){
            int num = 2*n;
            n++;
            sum = sum + num;
        }
        System.out.println(sum);

    }
}