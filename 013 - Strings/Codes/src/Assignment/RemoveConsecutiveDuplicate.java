package Assignment;

/**
 * Remove Consecutive Duplicates
 * Send Feedback
 * For a given string(str), remove all the consecutive duplicate characters.
 *
 * Example:
 * Input String: "aaaa"
 * Expected Output: "a"
 *
 * Input String: "aabbbcc"
 * Expected Output: "abc"
 *
 *  Input Format:
 * The first and only line of input contains a string without any leading and trailing spaces.
 * All the characters in the string would be in lower case.
 *
 * Output Format:
 * The only line of output prints the updated string.
 *
 * Note:
 * You are not required to print anything. It has already been taken care of.
 *
 * Constraints:
 * 0 <= N <= 10^6
 * Where N is the length of the input string.
 *
 * Time Limit: 1 second
 *
 * Sample Input 1:
 * aabccbaa
 *
 * Sample Output 1:
 * abcba
 *
 * Sample Input 2:
 * xxyyzxx
 *
 * Sample Output 2:
 * xyzx
 */

public class RemoveConsecutiveDuplicate {

    public static void main(String[] args) {
        String str1 = "aabbbccddffg";
        System.out.println(removeConsecutiveDuplicates(str1));
    }

    public static String removeConsecutiveDuplicates(String str) {
        //Your code goes here
        // simple solution

        String temp = ""+ str.charAt(0);
        for (int i = 0 ; i < str.length()-1 ; ++i){
            if (str.charAt(i)!=str.charAt(i+1)){
                temp+=str.charAt(i+1);
            }
        }

        return temp;

        /*
        method from coding ninja


        String answer = "";
        int startIndex = 0;
        while(startIndex < n) {
            char uniqueChar = str.charAt(startIndex);
            int nextUniqueCharIndex = startIndex + 1;
            while (nextUniqueCharIndex < n && str.charAt(nextUniqueCharIndex) == uniqueChar) {

            answer += uniqueChar;
            startIndex = nextUniqueCharIndex;
        return answer;

         */
    }

}
