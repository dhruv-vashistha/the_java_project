public class dv_26_arrays {

    public static void main(String[] args) {
        //declaration and memory allocation.
        int[] marks = new int[5];

        //initialization.
        marks [1] = 84;
        marks [0] = 88;
        marks [2] = 90;
        marks [3] = 77;
        marks [4] = 55;      //overwriting the array.....
        marks [4] = 99;

        System.out.println("here is the marks of our 4th student " + marks [4]);

        //declaration.
        int [] salary;       //making a new array......

        //memory allocation.
        salary = new int[2];

        //initialization.
        salary[1] = 200;
        salary[0] = 388;
        System.out.println(salary[1]);

        //all in one go(declaration + memory allocation + initialization....)
        int [] cost = {400, 500};
        System.out.println(cost[0]);

    }
}