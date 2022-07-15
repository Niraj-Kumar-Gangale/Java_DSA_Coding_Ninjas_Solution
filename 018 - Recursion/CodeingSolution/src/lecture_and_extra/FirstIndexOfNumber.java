package lecture_and_extra;

/**
 * First Index of Number
 * Send Feedback
 * Given an array of length N and an integer x, you need to find and return the first index of integer x present in the array. Return -1 if it is not present in the array.
 * First index means, the index of first occurrence of x in the input array.
 * Do this recursively. Indexing in the array starts from 0.
 * Input Format :
 * Line 1 : An Integer N i.e. size of array
 * Line 2 : N integers which are elements of the array, separated by spaces
 * Line 3 : Integer x
 * Output Format :
 * first index or -1
 * Constraints :
 * 1 <= N <= 10^3
 * Sample Input :
 * 4
 * 9 8 10 8
 * 8
 * Sample Output :
 * 1
 */

public class FirstIndexOfNumber {

    // it is similar to the check the number in the array
    // in that question we were checking if the integer x is present or not
    // here we have to return the first occurrence of the number.

    // using the better + method 2 (132)
    public static int firstIndex (int[] input ,int x, int startIndex){
        // base case
        if (startIndex ==input.length-1){
            if (x == input[startIndex]){
                return startIndex;
            } else {
                return -1;
            }
        }

        // processing and update
        if (input[startIndex]==x){
            return startIndex;
        }

        // small case and its use
        return firstIndex(input,x,startIndex+1);
    }

    // SOLVING THE ABOVE USING THE = BETTER + METHOD (123)
    // some test case not cleared because
    // method 123 check from last to first and we wamt first to last therefore
    // method 1 (123) will work
    public static int firstIndex_2 (int[] input ,int x, int startIndex){
        // base case
        if (startIndex ==input.length-1){
            if (x == input[startIndex]){
                return startIndex;
            } else {
                return -1;
            }
        }
        // small problem
        int smallAns = firstIndex_2(input,x,startIndex+1);

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

    // solving with the help of METHOD 2 only of making smaller array

    public static int firstIndexM2 (int[] input , int x){

        // base case
        if (input.length == 0){
            return -1;
        }

        if (input[0]== x){
            return 0;
        }

        // make smaller problems
        int[] smallInput = new int[input.length-1];
        for (int i = 1; i < input.length ; i++){
            smallInput[i-1]=input[i];
        }

        // now we use the small to solve the big
        int smallAns = firstIndexM2(smallInput,x);

        if (smallAns==-1){
            return -1;
        }else{
            return smallAns+1;
        }

    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,45,9};
        System.out.println(firstIndex(arr,4,0));
        System.out.println(firstIndexM2(arr,4));
    }






}
