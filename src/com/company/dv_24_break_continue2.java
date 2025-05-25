//continue use in loops.....
public class dv_24_break_continue2 {
    public static void main(String[] args) {
        //break and continue in loops..
        for (int i = 0; i<5; i++){
            if (i==3){
                System.out.println("breaking the loop...");
                continue;
            }
            System.out.println(i);
            System.out.println("java is great!");
        }
        System.out.println("loop ends here.");
        //the break statement use in do while loop.......
        int a = 0;
        do {
            a++;
            if (a>3){
                System.out.println("breaking the loop");
                continue;
            }
            System.out.println(a);
        }while(a < 7);
    }
}