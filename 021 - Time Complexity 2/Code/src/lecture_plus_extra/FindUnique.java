package lecture_plus_extra;

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

import java.util.Arrays;

public class FindUnique {
    public static void main(String[] args) {

        int[] arr = {1,2,8,6,2,6,1,7,8};
        System.out.println(findUnique1(arr));
        System.out.println(findUnique2(arr));
        System.out.println(findUnique3(arr));
    }

    // Method 1 [ using the brute force method ]
    public static int findUnique1 (int[] arr) {

        // FOR LOOP TO Select the individual index element
        for (int i = 0 ; i < arr.length ;++i){
            boolean isPresent =  false;
            // to check if the value similar to arr[i] present in the loop
            for (int j = 0 ; j < arr.length ;  ++j){
                if (i!=j){
                    if (arr[i]==arr[j])
                        isPresent =  true;
                }
            }
            if (!isPresent){
                return arr[i];
            }
        }
        return -1 ;
    }

    // Method 2 [ sorting and comparing the adjacent index for same values ]
    public static int findUnique2 (int[] arr){
        // sort the array
        Arrays.sort(arr);
        // compare the adjacent index for similar value
        for (int i = 0 ; i< arr.length ; i++){
            if (arr[i]==arr[i+1]){
                i++;
            }else{
                return arr[i];
            }
        }
        return arr[arr.length-1] ;
    }


    // Method 3 [ using the Xor Method ]
    public static int findUnique3 (int[] arr){
        int ans = 0;
        for (int j : arr) {
            ans ^= j;
        }
        return ans;
    }
}
