//question = replace the name in the letter and print it altogether....
public class dv_14_project3 {
    public static void main(String[] args) {
        String letter = "dear <|name|>, how are you i hope you're fine there........";
        letter = letter.replace("<|name|>","yash");
        System.out.println(letter);
    }
}
