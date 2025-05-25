public class dv_34_java_recursions2 {
     static long fibo(long r){
         if(r == 0){
             return 0;
         }
         if(r == 1){
             return 1;
         }
         else{
             return fibo(r - 1) + fibo(r - 2);
         }
    }
    public static void main(String[] args) {
        //question make the fibonacci series using the programming and recursions
        //it looks like this - 0,1,1,2,3,5,8,13,21,........
        System.out.println("the ebonacci series upto 10 values");
        for (long i = 0; i<10; i++){
            System.out.print(fibo(i) + ",");
        }
        System.out.println("\n");
        System.out.println(fibo(50));
    }
}

