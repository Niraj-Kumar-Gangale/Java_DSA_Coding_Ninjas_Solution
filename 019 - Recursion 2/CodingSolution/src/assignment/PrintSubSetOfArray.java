package assignment;

/**
 * Print Subsets of Array
 * Send Feedback
 * Given an integer array (of length n), find and print all the subsets of input array.
 * Subsets are of length varying from 0 to n, that contain elements of the array. But the order of elements should remain same as in the input array.
 * Note : The order of subsets are not important. Just print the subsets in different lines.
 * Input format :
 * Line 1 : Integer n, Size of array
 * Line 2 : Array elements (separated by space)
 * Constraints :
 * 1 <= n <= 15
 * Sample Input:
 * 3
 * 15 20 12
 * Sample Output:
 * [] (this just represents an empty array, don't worry about the square brackets)
 * 12
 * 20
 * 20 12
 * 15
 * 15 12
 * 15 20
 * 15 20 12
 */


public class PrintSubSetOfArray {
    public static void main(String[] args) {
        printSubsets(new int[]{15, 20, 12});

    }
    public static void printSubsets(int[] input){
        printSubsets(input, 0, new int[0]);
    }

    // helper function for subsets
    public static void printSubsets(int input[], int si , int[] outputArray) {
        // Write your code here
        // base case
        if(si==input.length){
            for (int i = 0 ; i < outputArray.length ; ++i){
                System.out.print(outputArray[i]+" ");
            }
            System.out.println();
            return;
        }

        // with and without the input[si]
        // without
        printSubsets(input , si+1 , outputArray);

        // with
        int[] temp = new int[outputArray.length+1];
        for (int i = 0 ; i < temp.length ; ++i){
            if (i< outputArray.length){
                temp[i]= outputArray[i];
            } else{
                temp[i]=input[si];
            }
        }
        outputArray = temp;
        printSubsets(input, si+1, outputArray);
    }
}
