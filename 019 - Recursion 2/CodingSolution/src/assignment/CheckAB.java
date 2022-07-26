package assignment;

/**
 * Check AB
 * Send Feedback
 * Suppose you have a string, S, made up of only 'a's and 'b's.
 * Write a recursive function that checks if the string was generated using the following rules:
 * a. The string begins with an 'a'
 * b. Each 'a' is followed by nothing or an 'a' or "bb"
 * c. Each "bb" is followed by nothing or an 'a'
 * If all the rules are followed by the given string, return true otherwise return false.
 * Input format :
 * String S
 * Output format :
 * 'true' or 'false'
 * Constraints :
 * 1 <= |S| <= 1000
 * where |S| represents length of string S.
 * Sample Input 1 :
 * abb
 * Sample Output 1 :
 * true
 * Sample Input 2 :
 * abababa
 * Sample Output 2 :
 * false
 * Explanation for Sample Input 2
 * In the above example, a is not followed by either "a" or "bb",
 * instead it's followed by "b" which results in false to be returned.
 */
public class CheckAB {
    // my solution works for the "abbbb" input and return true which is wrong
    // my solution work for
    // a----->a
    // a----->bb
    // and
    // bb---->a
    // bb---->bb
    public static boolean checkAB(String input, int startIndex) {

        // base case
        if (startIndex==input.length()){
            return true;
        }

        if (startIndex==0&&input.charAt(startIndex)!='a'){
            return false;
        }
        System.out.println(startIndex);


        if (input.charAt(startIndex)=='a'){
            return checkAB(input,startIndex+1);
        }else if ((input.length()-startIndex)>1&&input.substring(startIndex, startIndex + 2).equals("bb")){
            return checkAB(input,startIndex+2);
        }else{
            return false;
        }


    }

    public static boolean checkAB(String input) {
        // Write your code here
        return checkAB(input,0);

    }

    // this is the correct solution
    // this solution work for
    // a----->a
    // a----->bb
    // and
    // bb---->a

    public static boolean checkABCorrect(String str) {
            if(str.length() == 0){
                return true;
            }

            if(str.charAt(0) == 'a') {
                if(str.substring(1).length() > 1 && str.substring(1, 3).equals("bb")) {
                    return checkABCorrect(str.substring(3));
                } else {
                    return checkABCorrect(str.substring(1));
                }
            }

            return false;
    }


    public static void main(String[] args) {
        String str = "abbb";
        System.out.println(checkAB(str));


    }
}
