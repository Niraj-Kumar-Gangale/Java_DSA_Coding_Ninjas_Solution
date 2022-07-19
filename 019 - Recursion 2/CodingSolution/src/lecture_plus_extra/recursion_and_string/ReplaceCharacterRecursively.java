package lecture_plus_extra.recursion_and_string;

/**
 * Replace Character Recursively
 * Send Feedback
 * Given an input string S and two characters c1 and c2, you need to replace every occurrence of character c1 with character c2 in the given string.
 * Do this recursively.
 * Input Format :
 * Line 1 : Input String S
 * Line 2 : Character c1 and c2 (separated by space)
 * Output Format :
 * Updated string
 * Constraints :
 * 1 <= Length of String S <= 10^6
 * Sample Input :
 * abacd
 * a x
 * Sample Output :
 * xbxcd
 */

public class ReplaceCharacterRecursively {


    // Method 1 (132)
    public static String replaceCharacter(String input, char c1, char c2) {


        // base case
        if (input.length()==0){
            return input;
        }

        // small problem
        String smallAns = replaceCharacter(input.substring(1),c1,c2);

        // solve big using the small
        if (input.charAt(0)==c1){
            return c2+smallAns;
        }else{
            return input.charAt(0)+smallAns;
        }


    }


    // Method 2 (123)
    public static String replaceCharacter1(String input, char c1, char c2) {


        // base case
        if (input.length()==0){
            return input;
        }

        // solve big using the small
        if (input.charAt(0)==c1){
            return c2+replaceCharacter1(input.substring(1),c1,c2);
        }else{
            return input.charAt(0)+replaceCharacter1(input.substring(1),c1,c2);
        }


    }

    // there  are 3 more ways to solve this question
    // * better + m1
    // * better + m2
    // * passing the ans in the recursion in forward direction

    public static void main(String[] args) {
        System.out.println(replaceCharacter("abxa",'a','c'));
        System.out.println(replaceCharacter1("abxa",'a','c'));
    }



}
