package lecture_plus_extra.recursion_and_string;

/**
 * Remove Duplicates Recursively
 * Send Feedback
 * Given a string S, remove consecutive duplicates from it recursively.
 * Input Format :
 * String S
 * Output Format :
 * Output string
 * Constraints :
 * 1 <= |S| <= 10^3
 * where |S| represents the length of string
 * Sample Input 1 :
 * aabccba
 * Sample Output 1 :
 * abcba
 * Sample Input 2 :
 * xxxyyyzwwzzz
 * Sample Output 2 :
 * xyzwz
 */

public class ReplaceDuplicateRecursively {


    // method 1
    public static String removeConsecutiveDuplicates(String s) {
        // Write your code here

        //base case
        if (s.length() == 1){
            return s;
        }

        //  condition check
        String ans = "";
        if(s.charAt(0)!=s.charAt(1)){
            ans = ans + s.charAt(0);
        }

        String small = removeConsecutiveDuplicates(s.substring(1));

        return ans + small;

    }


    // method 2
    public static String removeConsecutiveDuplicates1(String s) {
        // Write your code here

        //base case
        if (s.length() == 1){
            return s;
        }

        if(s.charAt(0)!=s.charAt(1)){
            return  s.charAt(0) + removeConsecutiveDuplicates1(s.substring(1));
        }

        return removeConsecutiveDuplicates(s.substring(1));

    }



    // there  are 3 more ways to solve this question
    // * better + m1
    // * better + m2
    // * passing the ans in the recursion in forward direction

    public static void main(String[] args) {
        System.out.println(removeConsecutiveDuplicates("xxxvvvssfff"));
        System.out.println(removeConsecutiveDuplicates1("xxxvvvssfff"));
    }
}
