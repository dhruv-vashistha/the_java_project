public class dv_27_for_each_loop {
    public static void main(String[] args) {
        int[] marks = {22, 33, 44};
        float[] flt = {2.2f, 4.44f, 6.6f, 3.99f};
        //declaration, memory allocation, initialization....
        String[] names = {"rohan", "raj", "vikram", "ajay"};
        System.out.println(names[2]);
        System.out.println(names.length);
        //displaying an array.....
        //method 1-
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
        //method 2-
        for (int i = 0; i<names.length; i++){
            System.out.println(names[i]);
        }

//        //question 2 = display the array in reverse order ....
//        System.out.println("printing in reverse order");
//        for (int k = names.length -1; k>-1; k--){
//            System.out.println(names[k]);
//        }

        //for each loop in array display...
        System.out.println("the work of for each loop");
        for (String elements :names){
            System.out.println(elements);
        }


    }
}