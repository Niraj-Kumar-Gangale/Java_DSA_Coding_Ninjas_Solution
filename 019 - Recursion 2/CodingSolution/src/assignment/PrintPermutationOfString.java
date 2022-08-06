package assignment;

public class PrintPermutationOfString {

/**
 * Print Permutations
 * Send Feedback
 * Given an input string (STR), print all possible permutations of the input string.
 * Note:
 * The input string may contain the same characters, so there will also be the same permutations.
 * The order of permutations doesn’t matter.
 * Input Format:
 * The only input line contains a string (STR) of alphabets in lower case
 * Output Format:
 * Print each permutation in a new line
 * Note:
 * You do not need to print anything, it has already been taken care of. Just implement the function.
 * Constraint:
 * 1<=length of STR<=8
 * Time Limit: 1sec
 * Sample Input 1:
 * cba
 * Sample Output 1:
 * abc
 * acb
 * bac
 * bca
 * cab
 * cba
*/

    public static void main(String[] args) {
        System.out.println("Hello world!");
        printPermutation("abc", "");
    }

    // Function to print the String permutations
    // using the Method 1
    public static void printPermutationOfString(String input, String outputSoFar){
        // base case
        if (input.length() == 0 ){
            System.out.println(outputSoFar);
            return;
        }

        // for loop
        for (int i = 0 ; i < input.length() ; i++){
            String smallInput = input.substring(0,i)+ input.substring(i+1);
            printPermutationOfString(smallInput, outputSoFar+input.charAt(i));
        }
    }

    // Solving using the Method 2
    public static void printPermutation(String input, String outputSoFar){
        // base case
        if (input.length() == 0 ){
            System.out.println(outputSoFar);
            return;
        }

        // for loop
        for (int i = 0 ; i < outputSoFar.length()+1 ;++i){
            String smallInput = input.substring(0, input.length()-1);
            String newOutputSoFar = outputSoFar.substring(0,i)+ input.charAt(input.length()-1)+
                    outputSoFar.substring(i);
            printPermutation(smallInput, newOutputSoFar);
        }
    }

    // Coding ninja solution based on method 1
    public static void FindPermutations(String str) {
        char[] arr = str.toCharArray();
        FindPermutationsHelper(arr, 0, arr.length - 1);
    }

    private static void FindPermutationsHelper(char[] a, int i, int j) {
        if (i >= j) {
            // print the new permutation
            String permutation = "";
            for (int k = 0; k < a.length; k++) {
                permutation += (a[k]);
            }
            // for printing in next line
            System.out.println(permutation);
            return;
        }
        for (int k = i; k <= j; k++) {
            swap(a, i, k);
            FindPermutationsHelper(a, i + 1, j);
            swap(a, i, k);
        }
    }
    private static void swap(char[] a, int i, int j) {
        char te = a[i];
        a[i] = a[j];
        a[j] = te;
    }
}
