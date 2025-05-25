public class dv_28_multidimensional_arrays {
    public static void main(String[] args) {
        int[]num ;    //declaration of 1D array......
        int[][]num2;  //declaration of 2D array.......
        num = new int[2];      //space allocation......
        num2 = new int[1][2];  //space allocation.......
        num[0] = 2;
        num[1] = 3;
        num2[0][0] = 7;
        num2[0][1] = 9;
        for (int elements:num){
            System.out.println(elements);
        }
        //
        for (int elements:num2[0]){
            System.out.println(elements);
        }
        //displaying the 2D array..........
        System.out.println("displaying the array");
        int[][] num3 ;   //2D array....
        num3 = new int[3][3];
        num3[0][0] = 1;
        num3[0][1] = 2;
        num3[0][2] = 3;
        num3[1][0] = 4;
        num3[1][1] = 5;
        num3[1][2] = 6;
        num3[2][0] = 7;
        num3[2][1] = 8;
        num3[2][2] = 9;
        //method 1--using the for each loop...
//        for (int i = 0; i<3; i++) {
//            for (int elements : num3[i]) {         //for each loop...
//                System.out.println(elements);
//            }
//        }
        //method 2--using the nested loop....
        for (int i = 0; i<3; i++){
            for (int k = 0; k<3; k++){
                System.out.println(num3[i][k]);
            }
            System.out.println(" ");
        }
        //4-D array...
        int [][][] space = new int[2][3][4];
        //initialization....
        space[0][0][0] = 1;
        space[0][0][1] = 2;
        space[0][0][2] = 3;
        space[0][0][3] = 4;
        space[0][1][0] = 5;
        space[0][1][1] = 6;
        space[0][1][2] = 7;
        space[0][1][3] = 8;
        space[0][2][0] = 9;
        space[0][2][1] = 10;
        space[0][2][2] = 11;
        space[0][2][3] = 12;
        space[1][0][0] = 13;
        space[1][0][1] = 14;
        space[1][0][2] = 15;
        space[1][0][3] = 16;
        space[1][1][0] = 17;
        space[1][1][1] = 18;
        space[1][1][2] = 19;
        space[1][1][3] = 20;
        space[1][2][0] = 21;
        space[1][2][1] = 22;
        space[1][2][2] = 23;
        space[1][2][3] = 24;

        //the nested for loop to display the 3D array.........
        System.out.println("displaying the 3D array");
        for (int i = 0; i<2; i++){
            for (int j = 0; j<3; j++){
                for (int k = 0; k<4; k++){
                    System.out.println(space[i][j][k]);
                }
                System.out.println(" ");
            }
            System.out.println(" ");
        }



    }
}