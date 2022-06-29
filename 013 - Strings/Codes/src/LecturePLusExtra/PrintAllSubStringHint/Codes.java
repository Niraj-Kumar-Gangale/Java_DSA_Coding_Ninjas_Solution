package LecturePLusExtra.PrintAllSubStringHint;

/**
 * All substrings
 * Send Feedback
 * For a given input string(str), write a function to print all the possible substrings.
 * Substring
 * A substring is a contiguous sequence of characters within a string.
 * Example: "cod" is a substring of "coding". Whereas, "cdng" is not as the characters taken are not contiguous
 * Input Format:
 * The first and only line of input contains a string without any leading and trailing spaces.
 * All the characters in the string would be in lower case.
 * Output Format:
 * Print the total number of substrings possible,
 * where every substring is printed on a single line and hence
 * the total number of output lines will be equal to the total number of substrings.
 * Note:
 * The order in which the substrings are printed, does not matter.
 * Constraints:
 * 0 <= N <= 10^6
 * Where N is the length of the input string.
 *
 * Time Limit: 1 second
 * Sample Input 1:
 * abc
 * Sample Output 1:
 * a
 * ab
 * abc
 * b
 * bc
 * c
 *  Sample Input 2:
 * co
 * Sample Output 2:
 * c
 * co
 * o
 */
public class Codes {
    public static void main (String[] args) {
        // print all subString using 2nd vision
        String str = "pqrs";
        printSubstrings(str);
        // print all substring using 1st vision
        String str1 = "abcd";
        printSubstrings1(str1);

    }



    private static void printSubstrings1(String str1) {
        int n = str1.length();
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n - i; ++j) {
                for (int k = j; k <= j + i; ++k) {
                    System.out.print(str1.charAt(k));
                }
                System.out.println();
            }
        }
    }

    public static void printSubstrings (String str){
            //Your code goes here
            for (int i = 0; i < str.length(); i++) {

                for (int j = i; j < str.length(); j++) {

                    System.out.println(str.substring(i, j + 1));
                }
            }

        /*
        method without substring function
              int n = str.length();
              for (int i = 0; i < n; ++i) {
                  for (int j = i; j < n; ++j) {
                     for (int k = i; k <= j; ++k) {
                         System.out.print(str.charAt(k));
                }
                System.out.println();
               }
        }
         */
    }



}
