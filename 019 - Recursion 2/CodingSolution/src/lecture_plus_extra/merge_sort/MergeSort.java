package lecture_plus_extra.merge_sort;

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

    // <<<<<<<<<< there is another method to do it iteratively without recursion >>>>>>>>>>>

    // Using the better method i.e. creating window of operation.
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
    public static void mergeSort(int[] input){
        // let's call the helper function
        mergeSort(input, 0, input.length-1);
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


    public static void main(String[] args) {
        int[] arr = {2,1,3,5,4,8,9};
//        mergeSort(arr);
//        printArray(arr);
//        System.out.println("----------------------------");
//        int[] arr2 = { 4,6,3,8,2,6,7};
        printArray(arr);
        mergeSortDirect(arr);
        printArray(arr);
    }

    public static void printArray(int[] array){
        for (int j : array) {
            System.out.print(j+" ");
        }
    }


}
