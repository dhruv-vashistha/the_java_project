public class dv_10_datatype_increment_decrement {
    public static void main(String[] args) {
        System.out.println("this for the datatype expression and increment and decrement");
        float a = 1.56f + 44;
        double b = 1.44 + 7;
        System.out.println(b);
        System.out.println(a);
        /*   so this is all about the algebra of data
        now, the increment and the decrements  */
        int i = 77;                     //this is incrementing the literals.
        int c = i++;             //first c is assigned as i then, it is incremented.
        int d = i;
        int e = ++i;
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);   //now the value of i is 79...
        int f = i--;
        int g = --i;             //some examples of the decrements........
        int h = ++i;
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        int j = 60;;
        System.out.println(++j * 2);
        char k = 'l';                       //character incremented.........
        System.out.println(++k);
    }
}
