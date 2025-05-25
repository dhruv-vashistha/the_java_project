public class dv_13_strings_methods {
    public static void main(String[] args) {
        String a = new String("Dhruv vashistha\n");
        String b = "low code no code";
        System.out.println(a+b);

        String name = "Dhruv Vashistha";
        int value = name.length();
        System.out.println(value);
        System.out.println(name.length());
        String s2 = name.toLowerCase();
        System.out.println(s2);
        String s3 = name.toUpperCase();
        System.out.println(s3);
        System.out.println(name.toUpperCase());
        String name2 ="    Dhruv    is good.   ";
        System.out.println(name2.trim());
        System.out.println(name2.substring(6));
        System.out.println(name.substring(0,2));             //range= 0,4  therefore, it returns values stored 0 and 1..
        // 2 is excluded here..........
        System.out.println(name.substring(0,15));
        String name3 = "Dhruv";
        System.out.println(name3.replace('r','l'));
        System.out.println(name3.replace("ruv","oom"));
        System.out.println(name3.startsWith("v"));                             //writes boolean in result.
        System.out.println(name3.endsWith("uv"));                              //also writes the boolean in result.....
        System.out.println(name3.charAt(0));                                   //character at index 0.....
        String village = "Garhkhera";
        System.out.println(village.indexOf("h"));                              //occured first time in the string......
        System.out.println(village.indexOf("abcd"));                           //here the result is -1 cuz match not found...
        System.out.println(village.indexOf("ar"));
        System.out.println(village.indexOf("r",6));               //find index of r from the index 6.....
        System.out.println(village.lastIndexOf("h"));                      //finds last time h occured ind its index......
        System.out.println(village.lastIndexOf("h",4));           //start fnding from k......
        System.out.println(village.equals("Garhkhera"));                       //if string values are equal or not.....
        System.out.println(village.equals("garhkhera"));                       //uppercase problem.....
        System.out.println(village.equalsIgnoreCase("gaRhkHera"));


    }
}
