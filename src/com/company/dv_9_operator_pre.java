//precedence and associativity in java.
 public class dv_9_operator_pre {
    public static void main(String[] args) {
        System.out.println("Precedence and associativity of the operators......");
        /*
        precedence order --------(* = / > + = -)---------
        associativity order for * and / it is left to right therefore, the left most will be evaluated first.
         */
        double l = (4/2-3+4*5);
        System.out.println(l);

        int x = 2;                 //defining the variables......
        int y = 1;
        int a = x + 1;
        int b = a + 1;
        int c = b + 1;
        int d = c + 1;

        int k = (x + y)/2;
        int j = (b^2 - 4*a*c)/2*a;   //highest precedence is for  the parenthesis.
        System.out.println(j);
    }
 }
