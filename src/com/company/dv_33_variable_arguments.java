public class dv_33_variable_arguments {
    static int sum(int x , int y) {
        return x+y;
    }
    static int sum(int x , int y, int z) {
        return x+y;
    }
    static int sum(int x , int y, int z, int k) {
        return x + y;
    }
    static int NinjaTechnique(int x, int y , int ...arr){
        int sum = 0;
        for (int elements: arr){
            sum += elements;
        }
        sum = sum + x + y;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(4,7));
        System.out.println(sum(6,8,2));
        System.out.println(sum(5,7,2,6));
        //so in place of making so many methods we can try the ninja technique
        System.out.println(NinjaTechnique(5,5,5,5,5,5,5,5,5,5));
        //System.out.println(NinjaTechnique(9));   //sum is 9...
        //System.out.println(NinjaTechnique());         //sum is 0...the problem can be solved by adding an
                                                      //compulsary argument...as sum(int x, int ...arr)..
        System.out.println(NinjaTechnique(5,7));

    }
}
