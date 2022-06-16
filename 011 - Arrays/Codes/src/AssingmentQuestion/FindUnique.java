package AssingmentQuestion;

/**
 * Find Unique
 * Send Feedback
 *
 * You have been given an integer array/list(ARR) of size N. Where N is equal to [2M + 1].
 * Now, in the given array/list, 'M' numbers are present twice and one number is present only once.
 * You need to find and return that number which is unique in the array/list.
 *  Note:
 * Unique element is always present in the array/list according to the given condition.
 * Input format :
 * The first line contains an Integer 't' which denotes the number of test cases or queries to be run.
 * Then the test cases follow.
 *
 * First line of each test case or query contains an integer 'N' representing the size of the array/list.
 *
 * Second line contains 'N' single space separated integers representing the elements in the array/list.
 * Output Format :
 * For each test case, print the unique element present in the array.
 *
 * Output for every test case will be printed in a separate line.
 * Constraints :
 * 1 <= t <= 10^2
 * 0 <= N <= 10^3
 * Time Limit: 1 sec
 * Sample Input 1:
 * 1
 * 7
 * 2 3 1 6 3 6 2
 * Sample Output 1:
 * 1
 * Sample Input 2:
 * 2
 * 5
 * 2 4 7 2 7
 * 9
 * 1 3 1 3 6 6 7 10 7
 * Sample Output 2:
 * 4
 * 10
 */

public class FindUnique {
    public static void main(String[] args) {


    }


    public static int findUnique(int[] arr){
        //Your code goes here
        // lets the array be {1,2,3,5,5,2,3]

        // we will pick one index and search inside the array for index having same element


        // METHOD 1
        //  pick the one index
        /*
        for (int i = 0 ; i < arr.length-1 ; i++){
            if (arr[i]==-1){
                break;
            }
            // search the array having similar number
            for (int j = i+1 ; j< arr.length ; j++){
                // If you found same number
                if (arr[i]==arr[j]){
                    arr[i] = -1;
                    arr[j] = -1;
                    break;
                }
                if (j== arr.length-1){
                    return arr[i];
                }
            }
        }

        */

        // METHOD 2


        for(int i = 0; i < arr.length; i++) {
            int j;
            for(j = 0; j < arr.length; j++) {
                if (i==j){
                    continue;
                }
                if(arr[i] == arr[j]) {
                        break;
                }

            }
            if(j == arr.length) {
                return arr[i];
            }
        }

        return arr[arr.length-1];

    }
}
