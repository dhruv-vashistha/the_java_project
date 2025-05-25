//break use in loops......
public class dv_24_break_continue {
    public static void main(String[] args) {
        //break and continue in loops..
        for (int i = 0; i<5; i++){
            System.out.println(i);
            System.out.println("java is great!");
            if (i==3){
                System.out.println("breaking the loop...");
                break;
            }
        }
        System.out.println("loop ends here.");
        //the break statement use in do while loop.......
        int a = 0;
        do {
            System.out.println(a);
            a++;
            if (a>3){
                System.out.println("breaking the loop");
                break;
            }
        }while(a < 7);
    }
}