package Assignment;

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

        int[] arr = {1,2,3,4,5,6};
        rotateArray4(arr,3);
        for (int i = 0 ; i < arr.length ;++i){
            System.out.println(arr[i]);
        }
    }

    // Method 1  ( making new array )
    public static void rotateArray(int[] arr, int d){
        int[] newArr = new int[arr.length];

        for (int i = 0 ; i < arr.length ; ++i){
            if ((d+i)>arr.length-1){
                newArr[i] = arr[d+i-arr.length];
            }else{
                newArr[i] = arr[d+i];
            }
        }
        for (int i = 0 ; i < arr.length ;++i){
            arr[i]=newArr[i];
        }

    }

    // Method 2 ( explicitly rotating the array based on the value of d )
    public static void rotate2 (int[] arr , int d){
        // write the code
        if (d==arr.length){
             return;
        }
         while (d>0){
             int temp = arr[0];
             for (int i = 0; i < arr.length-1 ;++i){
                 arr[i] = arr[i+1];
             }
             arr[arr.length-1]=temp;
             d--;
         }
    }

    // Method 3 ( saving a part of array )
    public static void rotate3 (int [] arr , int d){

         int temp[] = new int[d];
         for(int i = 0; i < d;i++){
             temp[i] = arr[i];
         }
         int i = 0 ;
         for (; i < arr.length - d; ++i){
             arr[i]=arr[i+d];
         }
         int k = 0 ;
         while(k<d){
             arr[i++]= temp[k++];
         }
    }

    // Method 4 ( coding ninja method )
    public static void rotateArray4 (int[] arr, int d){

        for (int i = 0 ; i < arr.length ;i++ ){
            int temp =  arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        // reverse the n-d part of the array
        for (int i = 0 ; i < arr.length-d ; ++i){
            int temp =  arr[i];
            arr[i] = arr[arr.length - d - 1 - i];
            arr[arr.length - d - 1 - i] = temp;
        }

        // reverse the d part of the array
        for (int i = 0 ; i < d/2 ; ++i ){
            int temp =  arr[(arr.length-d) + i];
            arr[(arr.length-d) + i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    // method 4 ( optimized version ) by coding ninja
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
