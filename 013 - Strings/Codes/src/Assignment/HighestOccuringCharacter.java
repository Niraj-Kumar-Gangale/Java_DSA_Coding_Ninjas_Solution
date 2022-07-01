package Assignment;


import jdk.swing.interop.SwingInterOpUtils;

import java.util.Locale;

/**
 * Highest Occuring Character
 * Send Feedback
 * For a given a string(str), find and return the highest occurring character.
 *
 * Example:
 * Input String: "abcdeapapqarr"
 * Expected Output: 'a'
 * Since 'a' has appeared four times in the string which happens to be the highest frequency character,
 * the answer would be 'a'.
 * If there are two characters in the input string with the same frequency, return the character
 * which comes first.
 *
 * Consider:
 * Assume all the characters in the given string to be in lowercase always.
 *
 * Input Format:
 * The first and only line of input contains a string without any leading and trailing spaces.
 *
 * Output Format:
 * The only line of output prints the updated string.
 *
 * Note:
 * You are not required to print anything explicitly. It has already been taken care of.
 *
 * Constraints:
 * 0 <= N <= 10^6
 * Where N is the length of the input string.
 *
 * Time Limit: 1 second
 *
 * Sample Input 1:
 * abdefgbabfba
 * Sample Output 1:
 * b
 *
 * Sample Input 2:
 * xy
 * Sample Output 2:
 * x
 */


public class HighestOccuringCharacter {

    public static void main(String[] args) {
        String str = "xxyyyxx";
        System.out.println(highestOccuringChar(str));
    }


    public static char highestOccuringChar(String str) {
        //Your code goes here

        /*
        //brute force method
        // we don't care about TLE
        char ans = '0';
        int count1 = 0 ;
        int count2 = 0 ;

        for (int i = 0 ; i < str.length() ; ++i){

            for (int j = i ; j < str.length() ; ++j){
                if (str.charAt(i)==str.charAt(j)){
                    count2++;
                }
            }
            System.out.println(count2);
            if (count2>count1){
                ans = str.charAt(i);
                count1 = count2;

            }

            count2 = 0;
        }
        return ans;
         */

        // Using frequency method
        int[] arr = new int[256];
        for (int i = 0 ; i < str.length() ; ++i){
            ++arr[str.charAt(i)];
        }
        int count1 =0,count2=0;
        char ans = '0';
        for (int i = 0 ; i < str.length() ; ++i){
            count2 = arr[str.charAt(i)];
            if (count2>count1){
                ans = str.charAt(i);
                count1 = count2;

            }
        }
        return ans;
        /*
        // -----------------------Coding Ninja Solution---------------------------

        int n = str.length();
        int frequency[] = new int[256];
        int maxFrequency = 0;
        for (int i = 0; i < n; i++) {
            frequency[str.charAt(i)]++;
            maxFrequency = Math.max(maxFrequency, frequency[str.charAt(i)]);
            char answer = '\0';
            for (int i = 0; i < n; i++) {
                if (frequency[str.charAt(i)] == maxFrequency) {
                    answer = str.charAt(i);
                    break;
                }
                return answer;
            }
        }

         */





    }




}
