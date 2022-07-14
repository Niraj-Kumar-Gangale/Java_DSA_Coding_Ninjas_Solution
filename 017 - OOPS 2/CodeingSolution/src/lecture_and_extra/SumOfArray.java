package lecture_and_extra;


/***
 * Sum of Array
 * Send Feedback
 * Given an array of length N, you need to find and return the sum of all elements of the array.
 * Do this recursively.
 * Input Format :
 * Line 1 : An Integer N i.e. size of array
 * Line 2 : N integers which are elements of the array, separated by spaces
 * Output Format :
 * Sum
 * Constraints :
 * 1 <= N <= 10^3
 * Sample Input 1 :
 * 3
 * 9 8 9
 * Sample Output 1 :
 * 26
 * Sample Input 2 :
 * 3
 * 4 2 1
 * Sample Output 2 :
 * 7
 */
public class SumOfArray {

    // using the general approach of recursion

    // 1] smaller problem
    // let's say we have this array 1 2 5 6 4
    // if I have sum for the array 2 5 6 4
    // I can solve the bigger using the smaller
    // 2] solve big using the small
    /*
        sumTotal = input[0] + sum(smallerInput);
        return sumTotal;
     */
    // 3] base condition
    /*
        if(input.length == 1){
            RETURN input[0]
        }
    */

    // sum of the array function
    public static int sum(int[] input){

        // base
        if (input.length == 1){
            return input[0];
        }


        // making the smaller problem
        int[] smallerInput = new int[input.length-1];
        for (int i = 1 ; i < input.length ; ++i){
            smallerInput[i-1]= input[i];
        }
        // solving the big using the small
        return input[0] + sum(smallerInput);
    }

    public static void main(String[] args) {
        int[] arr = {1 , 2, 4,5,8,6,6};
        System.out.println(sum(arr));
    }


}
