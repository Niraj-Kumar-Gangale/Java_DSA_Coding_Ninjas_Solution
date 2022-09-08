package assignment;

/**
 * Rotate array
 * Send Feedback
 * You have been given a random integer array/list(ARR) of size N. Write a function that rotates the given array/list by D elements(towards the left).
 *  Note:
 * Change in the input array/list itself. You don't need to return or print the elements.
 * Input format :
 * The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
 *
 * First line of each test case or query contains an integer 'N' representing the size of the array/list.
 *
 * Second line contains 'N' single space separated integers representing the elements in the array/list.
 *
 * Third line contains the value of 'D' by which the array/list needs to be rotated.
 * Output Format :
 * For each test case, print the rotated array/list in a row separated by a single space.
 *
 * Output for every test case will be printed in a separate line.
 * Constraints :
 * 1 <= t <= 10^4
 * 0 <= N <= 10^6
 * 0 <= D <= N
 * Time Limit: 1 sec
 * Sample Input 1:
 * 1
 * 7
 * 1 2 3 4 5 6 7
 * 2
 * Sample Output 1:
 * 3 4 5 6 7 1 2
 * Sample Input 2:
 * 2
 * 7
 * 1 2 3 4 5 6 7
 * 0
 * 4
 * 1 2 3 4
 * 2
 * Sample Output 2:
 * 1 2 3 4 5 6 7
 * 3 4 1 2
 */

public class RotateArray {

    public static void main(String[] args) {

        int[] arr = {1, 3, 6, 11, 12, 17};
        rotate(arr, 4);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // --------- Method 1 ------------
    // rotate once at a time
    public static void rotate(int[] arr, int d) {
        //Your code goes here
        if (arr.length == 0) {
            return;
        }
        d = d % arr.length;
        System.out.println(d);
        for (int i = 0; i < d; i++) {
            int firstNum = arr[0];
            for (int k = 0; k < arr.length - 1; k++) {
                arr[i] = arr[i + 1];
            }
            arr[arr.length - 1] = firstNum;
        }
    }

    // ------------Method 2 ------------------------
    //  making new array
    public static void rotate2(int[] arr, int d) {
        //Your code goes here
        if (arr.length == 0) {
            return;
        }
        d = d % arr.length;
        int[] tempArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (i + d < arr.length) {
                tempArr[i] = arr[i + d];
            } else {
                tempArr[i] = arr[i + d - arr.length];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = tempArr[i];
        }
    }

    // ----------  Method 3 ----------
    // new array based on the size of d
    public static void rotate3(int[] arr, int d) {
        //Your code goes here
        if (arr.length == 0) {
            return;
        }
        d = d % arr.length;
        int[] tempArr = new int[d];
        for (int i = 0; i < d; i++) {
            tempArr[i] = arr[i];
        }
        int i = 0;
        for (; i < arr.length - d; i++) {
            arr[i] = arr[i + d];
        }
        int k = 0;
        for (; i < arr.length; i++) {
            arr[i] = tempArr[k];
            k++;
        }

    }

    // --------- Method 4 -------------
    // coding ninja method
    public static void swap (int[] arr, int indexOne, int indexTwo){
        int temp = arr[indexOne];
        arr[indexOne] = arr[indexTwo];
        arr[indexTwo] = temp;
    }

    public static void rotate4(int[] arr, int d) {
        //Your code goes here
        if (arr.length == 0){
            return;
        }
        d = d%arr.length;

        // reverse the array
        for (int i = 0 ; i < arr.length/2 ; i++){
            swap (arr, i,arr.length - 1 - i);
        }
        // reverse the n-d part from starting
        for (int i = 0 ;  i < (arr.length - d)/2  ; i++){
            swap (arr , i , arr.length - d - 1 - i);
        }
        // reverse the d part from the last
        for ( int i = 0;  i <  d/2  ; i++){
            swap ( arr, arr.length - d - i , arr.length - 1 - i );
        }


    }

    // --------- method 4 optimized version by coding ninja ---------
    private static void swapElements(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
    private static void reverse(int[] arr, int start, int end){
        while(start < end) {
            swapElements(arr, start, end);
            start += 1;
            end -= 1;
        }
    }
    public static void rotateOptimized4(int[] arr, int d) {
        if (arr.length == 0) {
            return;
        }

        if (d >= arr.length) {
            d %= arr.length;
        }
        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, arr.length - d - 1);
        reverse(arr, arr.length - d, arr.length - 1);
    }



}



