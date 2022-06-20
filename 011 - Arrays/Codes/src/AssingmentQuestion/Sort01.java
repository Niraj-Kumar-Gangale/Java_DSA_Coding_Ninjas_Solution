package AssingmentQuestion;

/**
 * Sort 0 1
 * Send Feedback
 * You have been given an integer array/list(ARR) of size N that contains only integers, 0 and 1. Write a function to sort this array/list. Think of a solution which scans the array/list only once and don't require use of an extra array/list.
 * Note:
 * You need to change in the given array/list itself. Hence, no need to return or print anything.
 * Input format :
 * The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
 *
 * First line of each test case or query contains an integer 'N' representing the size of the array/list.
 *
 * Second line contains 'N' single space separated integers(all 0s and 1s) representing the elements in the array/list.
 * Output format :
 * For each test case, print the sorted array/list elements in a row separated by a single space.
 *
 * Output for every test case will be printed in a separate line.
 * Constraints :
 * 1 <= t <= 10^2
 * 0 <= N <= 10^5
 * Time Limit: 1 sec
 * Sample Input 1:
 * 1
 * 7
 * 0 1 1 0 1 0 1
 * Sample Output 1:
 * 0 0 0 1 1 1 1
 * Sample Input 2:
 * 2
 * 8
 * 1 0 1 1 0 1 0 1
 * 5
 * 0 1 0 1 0
 * Sample Output 2:
 * 0 0 0 1 1 1 1 1
 * 0 0 0 1 1
 */
public class Sort01 {
    public static void main(String[] args) {
        // main function
        int[] arr = {0,1,1,0,1,0};
        sortZeroesAndOne(arr);

        for (int i = 0;  i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }

    public static void sortZeroesAndOne(int[] arr) {
        //Your code goes here
        // we need to finish the array in one cycle only so we have to check the
        // starting and the ending element simultaneously
        int start = 0;
        int end = arr.length-1;
        while (start < end ){
            // when starting element is 1 and ending is 0.
            if (arr[start] == 1 && arr[end] == 0){
                arr[start]= 0;
                arr[end] = 1;
                start++;
                end--;
            }// arr[start]==1 && arr[end] =1
            else if (arr[start]==1 && arr[end] ==1){
                end--;
            }else if (arr[start]==0 && arr[end] ==0){
                start++;
            }else{
                start++;
                end--;
            }
        }
    }
}
