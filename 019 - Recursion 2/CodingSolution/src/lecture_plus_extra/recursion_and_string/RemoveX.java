package lecture_plus_extra.recursion_and_string;

import javax.swing.*;

/**
 * Remove X
 * Send Feedback
 * Given a string, compute recursively a new string where all 'x' chars have been removed.
 * Input format :
 * String S
 * Output format :
 * Modified String
 * Constraints :
 * 1 <= |S| <= 10^3
 * where |S| represents the length of string S.
 * Sample Input 1 :
 * xaxb
 * Sample Output 1:
 * ab
 * Sample Input 2 :
 * abc
 * Sample Output 2:
 * abc
 * Sample Input 3 :
 * xx
 * Sample Output 3:
 */

public class RemoveX {

    public static void main(String[] args) {
        System.out.println("Already solved a similar problem before");
        System.out.println(removeX("axgjxgdjx"));
        System.out.println(removeX2("axgjxgdjx"));
    }



    // method 1    (123)
    public static String removeX(String input){
        // Write your code here

        if (input.length()==0) {
            return "";
        }
        String small = removeX(input.substring(1));
        if (input.charAt(0)=='x'){
            return small;
        }else{
            return input.charAt(0)+small;
        }
    }

    // method 2 (132)
    public static String removeX2(String input){
        if(input.length() == 0){
            return "";
        }
        if(input.charAt(0) == 'x'){
            return removeX2(input.substring(1));
        }
        return input.charAt(0) + removeX2(input.substring(1));
    }


}
