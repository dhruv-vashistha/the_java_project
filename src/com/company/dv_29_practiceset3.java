public class dv_29_practiceset3 {
    public static void main(String[] args) {
        /*
        question - write the average marks of physics exam of an class from an array....
         */
        float[] phy = {77.5f, 44f, 89.5f, 60f, 90f, 33f, 69f, 40f, 70f, 60f};
        float sum = 0;
        for (float elements: phy){
            sum = sum + elements;
        }
        float average = sum/phy.length;
        System.out.println("the average marks obtained by the class is: " + average);
    }
}
