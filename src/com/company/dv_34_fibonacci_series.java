public class dv_34_fibonacci_series {
    static void fibonacci(int n){
        int a = 0;
        int b = 1;
        int c;
        for (int i = 0; i<=n; i++) {
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;
        }
    }
    public static void main(String[] args) {
        System.out.println("enter the limit till you wanna print the fibonacci numbers ");
        fibonacci(20);
    }
}
