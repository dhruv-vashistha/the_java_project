public class dv_32_methodoverloading2 {
    static void greet() {
        System.out.println("good morning bro!");
    }
        static void greet(int x){
        System.out.println("good morning " + x + " times bro!");
    }
    static void greet(int x, int y){
        System.out.println("good morning " + x + " times bro!");         //here the int x and int y are
        System.out.println("good morning " + y + " times bro!");         // the parameters.
    }
    public static void main(String[] args) {
        greet();
        greet(5000);
        greet(3000,5000);            // the value assigned to them is argument(arguments are actual.)
    }
    //method oveloading cannot be done by changing the return type in methods...
    //so parameters can be changed with same name are said to be method overloading...
}
