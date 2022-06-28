package LecturePLusExtra.StringImmutability;

import java.sql.SQLOutput;

public class Code {
    public static void main(String[] args) {
        // String is Non-Primitive and immutable in Java
        // So if you want to change a character at certain position in String then it is NOt possible
        // "abc" to "abd" NOT POSSIBLE
        String str = "Noble";
        //    str.setCharAt(2) = 'j'; NOt POSSIBLE

        // IF you add a character to String An ENTIRELY NEW STRING will be generated.
        // no change will take place inside the old one.
        String str2 = str + "less";

        System.out.println(str);
        System.out.println(str2);
    }

}
