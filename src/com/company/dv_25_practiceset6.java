public class dv_25_practiceset6 {
    public static void main(String[] args) {
//        //repeat the num 5 using for loop and 1 using while loop........
//        for (int i = 4; i<10 ; i--){
//            System.out.println(5);
//        }
//        //now while loop.......
//        int k = 5;
//        while (k<10){
//            System.out.println(1);
//        }

        //now sum of the multiplication table of 8......
        int sum = 0;
        for (int i = 1; i<= 10;i++){
            int mul = i * 8;
            sum = sum + mul;
        }
        System.out.println("the sum of the multiplication of the table of 8 is: " + sum);

    }
}