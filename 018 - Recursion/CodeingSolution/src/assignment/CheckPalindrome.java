package assignment;

/***
 * Check Palindrome (recursive)
 * Send Feedback
 * Check whether a given String S is a palindrome using recursion. Return true or false.
 * Input Format :
 * String S
 * Output Format :
 * 'true' or 'false'
 * Constraints :
 * 0 <= |S| <= 1000
 * where |S| represents length of string S.
 * Sample Input 1 :
 * racecar
 * Sample Output 1:
 * true
 * Sample Input 2 :
 * ninja
 * Sample Output 2:
 * false
 */


public class CheckPalindrome {

    // I used the original method without recursion to create a recursive function
    // of my own and with helper function my answer comes out to be correct


    // method 1 + better
    public static boolean isStringPalindrome(String input, int startIndex, int endIndex) {
        //base case
        if (startIndex>endIndex){
            return true;
        }
        // small problem

        boolean smallAns = isStringPalindrome(input,startIndex+1,endIndex-1);

        // solving big using small
        if (!smallAns){
            return false;
        }

        return input.charAt(startIndex) == input.charAt(endIndex);

    }

    // method 2 + better
    public static boolean isStringPalindrome2(String input, int startIndex, int endIndex) {
        //base case
        if (startIndex>endIndex){
            return true;
        }

        // processing
        if(input.charAt(startIndex)!=input.charAt(endIndex)){
            return false;
        }

        return isStringPalindrome2(input,startIndex+1,endIndex-1);

    }

    // method 1 directly using substring
    public static boolean isStringPalindrome(String input) {

        if (input.length()==1 || input.length()==0){
            return true;
        }

        // Use substring instead of the for loop
        String smallInput = input.substring(1,input.length()-1);

        boolean smallAns = isStringPalindrome(smallInput);

        if (!smallAns){
            return false;
        }

        return input.charAt(0) == input.charAt(input.length()-1);

    }

    // method 2 directly using substring
    public static boolean isStringPalindrome2(String input) {
        if (input.length()==1 || input.length()==0){
            return true;
        }

        if (input.charAt(0) != input.charAt(input.length()-1)){
            return false;
        }

        String smallInput = input.substring(1,input.length()-1);

        return  isStringPalindrome(smallInput);

        // solving big using small


    }





    public static void main(String[] args) {
        String str = "carttrac";
        System.out.println(isStringPalindrome2(str,0,7));
        System.out.println(isStringPalindrome(str,0,7));
        System.out.println(isStringPalindrome(str));
        System.out.println(isStringPalindrome2(str));





    }

}
