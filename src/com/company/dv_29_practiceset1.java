public class dv_29_practiceset1 {
    public static void main(String[] args) {
        /*
        question - calculate the sum of the array of 5 floats.......
         */
        float[] flt = {1.3f, 2.4f, 3.5f, 4.3f, 5.4f};
        float sum = 0;
        //method 1-
        for (int i = 0; i<5; i++){
            sum = sum + flt[i];
        }
        System.out.println("the sum of all the value is: " + sum);
        //method 2-
//        for (float elements: flt){
//            sum = sum + elements;
//        }
//        System.out.println(sum);
    }
}