//question = write a java program that detects the double and triple spaces
//           in the string in result true or false.....
public class dv_14_project4 {
    public static void main(String[] args) {
        String str = "hi, what should we  do to reduce  the global warming.....";
        System.out.println(str.indexOf("  "));
        System.out.println(str.indexOf("   "));
        //if any of these value is -1 then there is double or triple spaces present....
    }
}
