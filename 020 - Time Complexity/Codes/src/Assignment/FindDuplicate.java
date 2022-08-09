package Assignment;

import java.util.Arrays;

/**
 * Duplicate in array
 * Send Feedback
 * You have been given an integer array/list(ARR) of size N which contains numbers from 0 to (N - 2). Each number is present at least once. That is, if N = 5, the array/list constitutes values ranging from 0 to 3, and among these, there is a single integer value that is present twice. You need to find and return that duplicate number present in the array.
 * Note :
 * Duplicate number is always present in the given array/list.
 * Input format :
 * The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
 *
 * First line of each test case or query contains an integer 'N' representing the size of the array/list.
 *
 * Second line contains 'N' single space separated integers representing the elements in the array/list.
 * Output Format :
 * For each test case, print the duplicate element in the array/list.
 *
 * Output for every test case will be printed in a separate line.
 * Constraints :
 * 1 <= t <= 10^2
 * 0 <= N <= 10^6
 *
 * Time Limit: 1 sec
 * Sample Input 1:
 * 1
 * 9
 * 0 7 2 5 4 7 1 3 6
 * Sample Output 1:
 * 7
 * Sample Input 2:
 * 2
 * 5
 * 0 2 1 3 1
 * 7
 * 0 3 1 5 4 3 2
 * Sample Output 2:
 * 1
 * 3
 */

public class FindDuplicate {



    public static void main(String[] args) {
        int arr[] = {0,1,3,2,3};
        // function to find the unique Element
        System.out.println(findDuplicate(arr));
        System.out.println(findDuplicateNew(arr));
        System.out.println(findDuplicate3(arr));
        int h = (int) Math.pow(10,12);
        System.out.println(h);


    }

    // time complexity for the algorithm below is O(n^2)
    // this algorithm causes TLE error
    // METHOD 1
    public static int findDuplicate(int[] arr){
        int arrLength = arr.length;
        for (int i = 0 ; i < arrLength-1 ; ++i){

            for (int j = 0; j < arrLength ; ++j){
                if (j!=i){
                    if (arr[j]==arr[i]){
                        return arr[j];
                    }
                }
            }

        }
        return -1;
    }

    // Improved Method 2
    public static int findDuplicateImp(int[] arr){
        int arrLength = arr.length;
        for (int i = 0 ; i < arrLength-1 ; ++i){

            for (int j = i+1; j < arrLength ; ++j){

                    if (arr[j]==arr[i]){
                        return arr[j];
                    }
            }

        }
        return -1;
    }


    // another way to solve the question
    // this solution works
    // and time complexity for this one is O(nlog(n))
    public static int findDuplicateNew(int[] arr){
        // copy the original array
        int[] arrCopy = arr.clone();
        // sort the copied array
        Arrays.sort(arrCopy);

        int n = arrCopy.length; // n is the length of the copied array
        // for loop to check if the current index value is equal to next adjacent index value
        for (int j = 0 ; j < (n-1) ; ++j){
            if (arrCopy[j]==arrCopy[j+1]){
                return arrCopy[j];
            }

        }
        return -1;

    }

    // METHOD USing the statement the number are from 0 to n-2
    // So, sum of
     public static int findDuplicate3(int[] arr){

            // array indices sum
            int arraysum = 0;
            for(int i = 0 ; i < arr.length ; ++i){
                arraysum += arr[i];
            }
            int sumUptoNMinusTwo = 0;
            for(int i = 0 ; i < arr.length-1 ; ++i){
                sumUptoNMinusTwo += i ;
            }

            return arraysum-sumUptoNMinusTwo;


     }

}
