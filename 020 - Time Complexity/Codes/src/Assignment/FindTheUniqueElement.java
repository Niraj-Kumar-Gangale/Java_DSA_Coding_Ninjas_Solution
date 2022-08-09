package Assignment;

import java.util.Arrays;

/**
 * Find the Unique Element
 * Send Feedback
 * You have been given an integer array/list(ARR) of size N. Where N is equal to [2M + 1].
 * Now, in the given array/list, 'M' numbers are present twice and one number is present only once.
 * You need to find and return that number which is unique in the array/list.
 *  Note:
 * Unique element is always present in the array/list according to the given condition.
 * Input format :
 * The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
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
 * 0 <= N <= 10^6
 *
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

public class FindTheUniqueElement {


    public static void main(String[] args) {
        int arr[] = {2, 3, 6, 3, 6, 2, 1};
        // function to find the unique Element
        System.out.println(findUnique(arr));
        System.out.println(findUniqueNew(arr));


    }

    // time complexity for the algorithm below is O(n^2)
    // this algorithm causes TLE error
    public static int findUnique(int[] arr){
        int arrLength = arr.length;
        for (int i = 0 ; i < arrLength-1 ; ++i){
            int j = 0 ;
            boolean isPresent = false;
            for (; j < arrLength ; ++j){
                if (j!=i){
                    if (arr[j]==arr[i]){
                        isPresent = true;
                    }
                }
            }
            if (!isPresent){
                return arr[i];
            }
        }
        return arr[arrLength-1];
    }


    // another way to solve the question
    // this solution works
    // and time complexity for this one is O(nlog(n))
    public static int findUniqueNew(int[] arr){
        // copy the original array
        int[] arrCopy = arr.clone();
        // sort the copied array
        Arrays.sort(arrCopy);
        for (int i = 0 ; i < arrCopy.length ; ++i){
            System.out.println(arrCopy[i]);
        }
        int n = arrCopy.length; // n is the length of the copied array
        // for loop to check if the current index value is equal to next adjacent index value
        for (int j = 0 ; j < (n-1) ; ++j){
            if (arrCopy[j]==arrCopy[j+1]){
                j++;
            }
            else{
                return arrCopy[j];
            }
        }
        return arrCopy[n-1];

    }

    // another method to solve in less time complexity
    // adding all the element using the Xor operator will give us the result

    public static int findUnique3 (int[] arr){
        int ans = 0;
        for (int i = 0 ; i < arr.length ; ++i){
            ans^=arr[i];
        }
        return ans;
    }
}
