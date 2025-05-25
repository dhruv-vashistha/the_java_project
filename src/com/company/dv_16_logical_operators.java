public class dv_16_logical_operators {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = true;
        boolean c = true;
        //for the logical AND.....
        if (a && b && c){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
        //for the logical OR......
        if (a || b || c){
            System.out.println("yes atleast one is true.");
        }
        else{
            System.out.println("no one of'em is true.");
        }
        //not a !a is used as inverter as it inverts the output.....

        //for NOT logical operator...
        System.out.println("the not a is " + !a);
        System.out.println("the a is " + a);
        System.out.println("the not b is " + !b);
        System.out.println("the b is " + b);
    }
}
