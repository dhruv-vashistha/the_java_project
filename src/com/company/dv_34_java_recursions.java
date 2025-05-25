public class dv_34_java_recursions {
    //method 1 iterative approach
    static int factorial(int k) {
        int mul = 1;
        if (k == 0){
            return 0;
        }
        else {
            for (int i = k; i > 0; i--) {
                mul = mul * i;
            }
            return mul;
        }
    }
    //method 2 recursive approach
    /*recursions is programming concept where the function call itself to solve the smaller part of the problem
    of a larger problem...*/
    static int ftrl(int a){
        if(a==0 || a==1){      //base case....
            return 1;
        }
        else{                  //recursive case....
            return a*ftrl(a-1);
        }

    }
    public static void main(String[] args) {
        System.out.println(ftrl(8));
        System.out.println(factorial(8));
    }
}
