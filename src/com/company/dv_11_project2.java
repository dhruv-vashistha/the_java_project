/*
encrypting and decrypting the grades of the student...........
 */
public class dv_11_project2 {
    public static void main(String[] args) {
        char grade = 'b';
        grade = (char) (grade + 8);
        System.out.println(grade);  //here the grade has been encrypted.........

        //    so if we decrypt this grade to it's original form.............
        grade = (char)(grade - 8 );
        System.out.println(grade);

        //this is the work of the typecasting which allows the datatype to work as another datatype.....
    }
}
