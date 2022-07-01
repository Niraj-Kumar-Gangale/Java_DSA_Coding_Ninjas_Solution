package Assignment;

/**
 * Reverse Each Word
 * Send Feedback\
 *
 * Aadil has been provided with a sentence in the form of a string as a function parameter.
 * The task is to implement a function so as to print the sentence such that each word in the sentence
 * is reversed.
 *
 * Example:
 * Input Sentence: "Hello, I am Aadil!"
 * The expected output will print, ",olleH I ma !lidaA".
 *
 * Input Format:
 * The first and only line of input contains a string without any leading and trailing spaces. T
 * he input string represents the sentence given to Aadil.
 *
 * Output Format:
 * The only line of output prints the sentence(string) such that each word in the sentence is reversed.
 *
 * Constraints:
 * 0 <= N <= 10^6
 * Where N is the length of the input string.
 *
 *
 * Time Limit: 1 second
 *
 * Sample Input 1:
 * Welcome to Coding Ninjas
 * Sample Output 1:
 * emocleW ot gnidoC sajniN
 *
 * Sample Input 2:
 * Always indent your code
 * Sample Output 2:
 * syawlA tnedni ruoy edoc
 */

public class ReverseEachWords {
    public static void main(String[] args) {
        String str1 = "my name is Noble Niraj";
        System.out.println(reverseEachWord(str1));
    }

    public static String reverseEachWord(String str) {
        //Your code goes here
        String output = "";
        int currentWordIndex = 0 ;
        int i = 0 ;
        while(i<str.length()){
            if (str.charAt(i)==' '){
                // calculate reverse
                String ans = "";
                while(currentWordIndex<=i-1){
                    ans = str.charAt(currentWordIndex)+ans;
                    currentWordIndex++;
                }
                // add the reverse to the main out put
                output = output + ans +" ";
                currentWordIndex = i+1;
            }

            i++;
        }
        // after the loop finish
        // calculate the last reverse
        String ans = "";
        while(currentWordIndex<=i-1){
            ans = str.charAt(currentWordIndex)+ans;
            currentWordIndex++;
        }


        // add the reverse to the main output
        output+= ans;

        return output;
    }
}
