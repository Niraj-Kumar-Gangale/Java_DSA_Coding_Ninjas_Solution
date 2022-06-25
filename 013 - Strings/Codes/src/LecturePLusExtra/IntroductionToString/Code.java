package LecturePLusExtra.IntroductionToString;

public class Code {

    public static void main(String[] args) {
        // let's talk about the string
        // it's a non primitive datatype

        // how to declare the string
        String firstString = "Hello brother";

        // how to check the length of the string
        System.out.println(firstString.length());

        // IN string the data is stored in the form of the array
        // So if you want to check the character at certain position in string
        // don't use
        // firstString[6] >>>>>>>>>>>>>>> THIS IS WRONG IN JAVA
        // instead use
        // firstString.charAt(6) >>>>>>>>>> THIS IS CORRECT
        System.out.println(firstString.charAt(6));

        //NOTE ------------------
        // similar to ArrayIndexOutBound we have StringIndexOutOFBound
    }
}
