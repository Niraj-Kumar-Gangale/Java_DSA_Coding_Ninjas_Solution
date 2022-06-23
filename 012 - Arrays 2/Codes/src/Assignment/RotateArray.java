package Assignment;

/**
 * Rotate array
 * Send Feedback
 * -----------------
 * You have been given a random integer array/list(ARR) of size N.
 * Write a function that rotates the given array/list by D elements(towards the left).
 *  Note:
 * Change in the input array/list itself. You don't need to return or print the elements.
 * ------------------
 * Input format :
 * The first line contains an Integer 't' which denotes the number of test cases or queries to be run.
 * Then the test cases follow.
 *
 * First line of each test case or query contains an integer 'N' representing the size of the array/list.
 *
 * Second line contains 'N' single space separated integers representing the elements in the array/list.
 *
 * Third line contains the value of 'D' by which the array/list needs to be rotated.
 * ------------------
 * Output Format :
 * For each test case, print the rotated array/list in a row separated by a single space.
 *
 * Output for every test case will be printed in a separate line.
 * -----------------
 * Constraints :
 * 1 <= t <= 10^4
 * 0 <= N <= 10^6
 * 0 <= D <= N
 * Time Limit: 1 sec
 * ------------------
 * Sample Input 1:
 * 1
 * 7
 * 1 2 3 4 5 6 7
 * 2
 * Sample Output 1:
 * 3 4 5 6 7 1 2
 * -------------------
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
        int[]  arr = {1 ,3 ,6 ,11 ,12 ,17};
        rotate(arr,4);
    }

    public static void rotate(int[] arr, int d) {
        //Your code goes here
        if(arr.length==0){
            return;
        }
        // we have to tune the d also because of its range [0 <= D <= N]
        if (d>arr.length){
            int multipleOf7 = d / arr.length;
            d = d - multipleOf7*7;
        }
        /* ----------- METHOD 1 ---------------------

        // >>> my solution

        int[] temp = new int [arr.length];

        // Now we will insert the  rotated element from  main array to temp

        int i = d;
        int k = 0;
        while (i< arr.length){
             temp[k] = arr[i];
            System.out.println(temp[k]);
             i++;
             k++;
        }
        i = 0;
        while (k < temp.length ){
            temp[k]= arr[i];
            System.out.println(temp[k]);
            k++;
            i++;
        }
        arr = temp;

         */

        for (int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();

        // --------------------- METHOD OF Coding Ninja ---------------------------

        // >>>>>> Doing one rotation at a time

        while (d>0){
            // depending upon number of [ d ] you literally rotate the array that many times
            // BY Swapping : when you swap the whole array one time final resulted array
            // is rotated array with rotation of One Unit.
            for (int i = 0 ; i < arr.length-1; i++){
               // swap
                int temp  = arr[i];
                arr[i] = arr[i+1];
                arr[i+1]  = temp;
            }
            d--;
        }

        for (int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
        }


        // >>>>>> store the element upto d in temporary ARRAY and
        // then shift the array and copy back the remaining element from the temp array
        // Based upon my method


        // >>>>>> reverse the whole array then
        // reverse the n-d portion from the starting of the array
        // reverse the d portion from the last of the array

        /*


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
        public static void rotate(int[] arr, int d) {
        if (arr.length == 0) {
            return;
        }

        if (d >= arr.length && arr.length != 0) {
            d %= arr.length;
        }
        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, arr.length - d - 1);
        reverse(arr, arr.length - d, arr.length - 1);
    }
         */



    }
}
