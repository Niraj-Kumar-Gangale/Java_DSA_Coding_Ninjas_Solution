package lecture_and_extra;

/**
 * Last Index of Number
 * Send Feedback
 * Given an array of length N and an integer x, you need to find and return the last index of integer x present in the array. Return -1 if it is not present in the array.
 * Last index means - if x is present multiple times in the array, return the index at which x comes last in the array.
 * You should start traversing your array from 0, not from (N - 1).
 * Do this recursively. Indexing in the array starts from 0.
 * Input Format :
 * Line 1 : An Integer N i.e. size of array
 * Line 2 : N integers which are elements of the array, separated by spaces
 * Line 3 : Integer x
 * Output Format :
 * last index or -1
 * Constraints :
 * 1 <= N <= 10^3
 * Sample Input :
 * 4
 * 9 8 10 8
 * 8
 * Sample Output :
 * 3
 */

public class LastIndexOfNumber {


    // it is similar to the check the number in the array
    // in that question we were checking if the integer x is present or not
    // here we have to return the last occurrence of the number.


    // SOLVING THE ABOVE USING THE = BETTER + METHOD  1 (123)
    // Method 2 won't work because method 2 checks from left to right, and we want right to left check.
    public static int lastIndex (int[] input ,int x, int startIndex){
        // base case
        if (startIndex ==input.length-1){
            if (x == input[startIndex]){
                return startIndex;
            } else {
                return -1;
            }
        }
        // small problem
        int smallAns = lastIndex(input,x,startIndex+1);

        if (smallAns!=-1){
            return smallAns;
        }

        // solving the big using the small
        if (input[startIndex]==x){
            return startIndex;
        }else{
            return -1;
        }
    }

    // using the method 1 only without Better
    public static int lastIndexM1 (int[] input , int x){

        // base case
        if (input.length == 0){
            return -1;
        }

        // make smaller problems
        int[] smallInput = new int[input.length-1];
        for (int i = 1; i < input.length ; i++){
            smallInput[i-1]=input[i];
        }

        // now we use the small to solve the big
        int smallAns = lastIndexM1(smallInput,x);

        if (smallAns!=-1){
            // we need to check
            return smallAns+1;
        }
        if (input[0]==x){
            return 0;
        }else{
            return -1;
        }

    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,45,9};
        System.out.println(lastIndex(arr,45,0));
        System.out.println(lastIndexM1(arr,45));
    }


}

