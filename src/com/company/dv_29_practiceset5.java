public class dv_29_practiceset5 {
    public static void main(String[] args) {
        /*
        question - reversing an array....
         */
        int[] arr = {1,2,3,4,5,6,7};
        int l = arr.length;          //the Math.floorDiv helps to provide the services
        int a = Math.floorDiv(l,2);   //as the greatest integer function.....
        int temp;

        for (int i = 0; i<a; i++) {
            //swap the i with (l-1-k)
            //swapping logic--{ |3| |4| | |---| | |4| |3|---|4| |3| | | }
            temp = arr[i];
            arr[i] = arr[l-1-i];
            arr[l-i-1] = temp;
        }
        //displaying the array....
        for (int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

    }
}