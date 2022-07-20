package lecture_plus_extra.merge_sort;

import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Merge Sort Code
 * Send Feedback
 * Sort an array A using Merge Sort.
 * Change in the input array itself. So no need to return or print anything.
 * Input format :
 * Line 1 : Integer n i.e. Array size
 * Line 2 : Array elements (separated by space)
 * Output format :
 * Array elements in increasing order (separated by space)
 * Constraints :
 * 1 <= n <= 10^3
 * Sample Input 1 :
 * 6
 * 2 6 8 5 4 3
 * Sample Output 1 :
 * 2 3 4 5 6 8
 * Sample Input 2 :
 * 5
 * 2 1 5 2 3
 * Sample Output 2 :
 * 1 2 2 3 5
 */

public class MergeSort {

    // two method to do merge sort by recursion
    // 1] direct method in which you manually break the array into two for mergeSort operation
    // 2] better method in which you create window of operation by passing start and end indexes.
    // 3] using the iterative method some people call it ,Bottom up approach , two-way merge sort,
    // iterative merge sort.



    // Using the better method i.e. creating window of operation.
    public static void mergeSort(int[] input){
        // let's call the helper function
        mergeSort(input, 0, input.length-1);
    }
    public static void  mergeSort(int[] arr,int si , int ei){

        // base function
        // condition will be based on the constraint
        // the minimum length of array in input will be at least one [ 1 <= n <= 10^3 ]
        // so si==ei this should be the condition for base
        // IF YOU WANT TO MAKE IT WORK FOR EMPTY ARRAY ALSO IT'S SIMPLE
        // make the condition si>ei

        if (si==ei){
            return;
        }

        // calculate mid INdex mi
        int mi = (si+ei)/2;

        // divide the array into two parts
        mergeSort(arr,si,mi);
        mergeSort(arr,mi+1,ei);

        // merge  the divide part
        merge(arr,si,ei);


    }


    public static void merge(int[] arr, int si , int ei) {
        // mid
        int mi = (si+ei)/2;
        int i = si;
        int j = mi+1;
        int k = 0;
        int [] temp = new int[ei-si+1];

//        System.out.println(si-ei+1);
        while (i<=mi && j<=ei){
            if (arr[i]<arr[j]){
                temp[k]=arr[i];
                k++;
                i++;
            }else{
                temp[k]=arr[j];
                j++;
                k++;
            }
        }

        while (i<=mi){
            temp[k]=arr[i];
            k++;
            i++;
        }

        while (j<=ei){
            temp[k]=arr[j];
            k++;
            j++;
        }
        int l =0 ;
        while(si<=ei){
            arr[si]=temp[l];
            si++;
            l++;
        }
    }



    // using the direct method i.e. without any helper function.
    public static void mergeSortDirect (int[] array){

        // base case considering the zero length input
        if (array.length <=1){
            return;
        }

        int midIndex = (array.length-1)/2;

        // make array1
        int[] array1 = new int[midIndex+1];
        for (int i = 0 ; i < midIndex+1  ; ++i){
            array1[i] = array[i];
        }

        // make array2
        int[] array2 = new int[array.length-1-midIndex];
        for (int i = 0 ; i < array.length-1-midIndex ;++i ){
            array2[i]=array[midIndex+1+i];
        }


        mergeSortDirect(array1);
        mergeSortDirect(array2);

        mergeDirect(array1, array2, array);

    }
    public static void mergeDirect (int[] array1, int[] array2 , int[] array) {

        int[] temp = new int[array.length];
        int i = 0, j = 0, k = 0;
        int array1Length = array1.length;
        int array2Length = array2.length;

        while (i < array1Length || j < array2Length) {
            if (i < array1Length && j < array2Length) {
                if (array1[i] < array2[j]) {
                    temp[k] = array1[i];
                    k++;
                    i++;
                } else {
                    temp[k] = array2[j];
                    k++;
                    j++;
                }
            } else if (i < array1Length) {
                temp[k] = array1[i];
                k++;
                i++;
            } else {
                temp[k] = array2[j];
                k++;
                j++;
            }

        }

        // copy from the temp to te original array

        System.arraycopy(temp, 0, array, 0, array.length);
    }


    // 3] using the iterative merge sort

    // Merge two sorted subarrays `A[from…mid]` and `A[mid+1…to]`
    public static void merge(int[] A, int[] temp, int from, int mid, int to)
    {
        int k = from, i = from, j = mid + 1;
        System.out.println("from "+ from + " mid "+ mid + " to "+ to);

        // loop till no elements are left in the left and right runs
        while (i <= mid && j <= to)
        {
            if (A[i] < A[j]) {
                temp[k++] = A[i++];
            }
            else {
                temp[k++] = A[j++];
            }
        }

        //
        // copy remaining elements
        // while (i <= mid) this will produce error for large number of inputs
        // it fails test cases for large values in coding ninja
        // so use this while (i <= mid
        // && i <A.length )
        while (i <= mid && i <A.length) {
            temp[k++] = A[i++];
        }

        /* no need to copy the second half (since the remaining items
           are already in their correct position in the temporary array) */

        // copy back to the original array to reflect sorted order
        for (i = from; i <= to; i++) {
            A[i] = temp[i];
        }
    }

    // Iteratively sort subarray `A[low…high]` using a temporary array
    public static void mergeSortIterative(int[] A)
    {
        int low = 0;
        int high = A.length - 1;

        // sort array `A[]` using a temporary array `temp`
        int[] temp = Arrays.copyOf(A, A.length);

        // divide the array into blocks of size `m`
        // m = [1, 2, 4, 8, 16…]
        for (int m = 1; m <= high - low; m = 2*m)
        {
            System.out.println("m "+ m);
            // for m = 1, i = 0, 2, 4, 6, 8 …
            // for m = 2, i = 0, 4, 8, 12 …
            // for m = 4, i = 0, 8, 16 …
            // …
            for (int i = low; i < high; i += 2*m)
            {
                int from = i;
                int mid = i + m - 1;
                int to = Integer.min(i + 2*m - 1, high);

                merge(A, temp, from, mid, to);
            }
        }
    }




    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr3 = new int[403];


         for (int i = 0 ; i < 403 ; i++ ){
             arr3[i] = sc.nextInt();
         }
         sc.close();
        int[] arr = {2,1,3,5,4,8,9};
        mergeSort(arr);
        printArray(arr);
        System.out.println();
        int[] arr2 = { 4,6,3,8,2,6,7};
        mergeSortDirect(arr2);
        printArray(arr2);
        System.out.println();
//        int[] arr3 = { 1,3,4,5,2};
        mergeSortIterative( arr3);
        printArray(arr3);
    }

    /*
     * There is an error in the code it will give an Exception to ArrayIndexOutOfBoundException
     * for large value of the input.
     *
     * let me explain it,
     *
     * if we give it 403 element
     *
     * and when m has a value of 4 (i.e. m=4)
     * it will divide the array into 4 and 4 block
     * and merge those 4 and 4 blocks to generate a sorted array of lengths 8
     *
     * now when it was dividing the array let's say
     *
     * i = 0;
     * from = 0
     * mid = 0 + 4 -1 = 3
     * to = minimum( 0 + 2*8 -1 = 7, 403)
     *
     *
     * i = 8
     * from = 8
     * mid = 8 + 4-1 = 11
     * to = minimum ( 8 + 2*4 -1 = 15, 403)

     * ........ keep on going..............
     *
     * (here it will generate an error )
     * i = 400
     * from = 400
     * mid = 400 + 4 - 1 = 403
     * to = minimum(400 + 2*4 -1= 407 , 403)
     *
     * mid value = 403 will generate error
     * to remove this error just add a condition inside while loop in line 22 of the code
     *         while (i <= mid && i< A.length)
     * */

    public static void printArray(int[] array){
        for (int j : array) {
            System.out.print(j+" ");
        }
    }



}
