package assignment_recursion_1;

/**
 * Pair Star
 * Send Feedback
 * Given a string S, compute recursively a new string where identical chars that are adjacent in the original string are separated from each other by a "*".
 * Input format :
 * String S
 * Output format :
 * Modified string
 * Constraints :
 * 0 <= |S| <= 1000
 * where |S| represents length of string S.
 * Sample Input 1 :
 * hello
 * Sample Output 1:
 * hel*lo
 * Sample Input 2 :
 * aaaa
 * Sample Output 2 :
 * a*a*a*a
 */

public class PairStar {

    public static void main(String[] args) {
        System.out.println(addStars("aoaoaaa"));
        System.out.println(addStars2("aoaoaaa"));
    }

    //using the general method of approach m1 (123)
    public static String addStars(String input) {
        // Write your code here
        if (input.length()<=1){
            return input;
        }

        //small problem
        String smallAns = addStars(input.substring(1));


        // solving big using small
        if (input.charAt(0)==smallAns.charAt(0)){
            return input.charAt(0)+"*"+smallAns;
        }else{
            return input.charAt(0)+smallAns;
        }

    }

    // using  m2 (132) approach i.e. first check then calculate
    public static String addStars2(String input) {
        // Write your code here
        if (input.length()<=1){
            return input;
        }

        if (input.charAt(0)==input.charAt(1)){
            return input.charAt(0)+"*"+addStars2(input.substring(1));
        }else{
            return input.charAt(0)+addStars2(input.substring(1));
        }



    }

}
