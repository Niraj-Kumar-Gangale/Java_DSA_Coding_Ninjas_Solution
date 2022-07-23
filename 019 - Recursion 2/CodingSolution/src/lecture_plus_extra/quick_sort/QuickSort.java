package lecture_plus_extra.quick_sort;

import static lecture_plus_extra.merge_sort.MergeSort.printArray;

/**
 * Quick Sort Code
 * Send Feedback
 * Sort an array A using Quick Sort.
 * Change in the input array itself. So no need to return or print anything.
 *
 *
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
 * 1 5 2 7 3
 * Sample Output 2 :
 * 1 2 3 5 7
 */

public class QuickSort {

    // Just like in the merge sort we have around three ways to write the program for the Quick Sort
    // 1] using the window of operation method i.e. defining the range of operation using start and end index.
    // 2] Direct method in which we literally break the array int two part leaving behind the pivot element.
    // 3] using the iterative version of the Quick sort with stack we will learn stack and come back and solve it.

    // 1] using the window of operation method i.e. defining the range of operation using start and end index.

    public static void quickSort(int[] input , int si ,int ei){
        // base case
        if (si>=ei){
            return;
        }

        // partition

        int pivotPos = partition(input,si,ei);




        // call the quick sort on the two part excluding the pivot integer
        quickSort(input, si, pivotPos-1);
        quickSort(input, pivotPos+1,ei);

    }

    // Partition function
    // select the input[si] as pivot
    // set the pivot to it correct position
    // make sure the element to the left should be lesser than and equal to pivot value
    // and the integer on the right should be greater than pivot value
    // return the pivot position

    private static int partition(int[] input, int si, int ei) {
        // select the input[si] as the pivot element
        int pivotValue = input[si];
        // set the pivot to it correct position
        // we create a for loop to count the number of values which are less than and equal to pivotValue
        int count = 0;
        for (int i = si+1; i <= ei ; ++i){
            if (input[i]<=pivotValue){
                count++;
            }
        }
        // the value of pivot position
        int pivotPos = si+count;

        // shift the pivotValue to pivot position
        input[si] = input[pivotPos];
        input[pivotPos]=pivotValue;

        // make sure integer on left to lesser than equal to pivot Value nad on the right is greater than pivot value
        int i = si ;
        int j = ei ;
        while (i<pivotPos && j>pivotPos){
            if (input[i]<=pivotValue){
                i++;
            }
            if (input[j]>pivotValue){
                j--;
            }
            if (input[i]>pivotValue && input[j]<=pivotValue){
                // swap
                int temp = input[i];
                input[i]= input[j];
                input[j] = temp;
                i++;
                j--;
            }
        }
        return pivotPos;
    }

    public static void quickSort (int[] input){
        quickSort(input,0, input.length-1);
    }

    // 2] Direct method in which we literally break the array int two part leaving behind the pivot element.

    public static void quickSortDirect (int[] input){

        // base case
        if (input.length <=1){
            return;
        }

        // partition direct
        int pivotPos = partition(input);
        printArray(input);
        System.out.println();

        // create array
        // arr1
        int[] arr1 = new int[pivotPos];

        // arr2
        int[] arr2 = new int[input.length-1-pivotPos];

        // we have copy element form input to arr1 and arr2
        for (int i = 0 ;i<pivotPos ; ++i) {
            arr1[i]=input[i];
        }
        printArray(arr1);
        System.out.println();

        for (int i = pivotPos+1 ; i< input.length;++i){
            arr2[i-pivotPos-1]=input[i];
        }
        printArray(arr2);
        System.out.println();

        // call the quick sort recursion on individual array
        quickSortDirect(arr1);
        quickSortDirect(arr2);


        // we have to copy the arr1 and arr2 into the main input
        for (int i = 0 ; i < input.length ; ++i){
            if (i == pivotPos){
                continue;
            }
            if (i<pivotPos){
                input[i]= arr1[i];
            }
            if (i>pivotPos){
                input[i]= arr2[i-pivotPos-1];
            }
        }
    }

    private static int partition(int[] input) {
        // define the pivotValue
        int pivotVal = input[0];
        int count = 0;
        // now arrange it to it's correct place
        for(int i = 1 ; i < input.length ; ++i){
            if (input[i]<=pivotVal){
                count++;
            }
        }
        // swap
        input[0]=input[count];
        input[count]=pivotVal;

        // arrange value less than equal to pivotVal on the right and greater than pivotVal
        int i = 0 ;
        int j = input.length-1;

        while (i<count&&j>count){
            if (input[i]<=pivotVal) {
                i++;
            }else if (input[j]>pivotVal){
                j--;
            }else{
                // swap
                int temp = input[i];
                input[i]=input[j];
                input[j]= temp;
            }
        }
        return count;
    }


    // this program works but gives TLE
    public static void quickSortIterative (int[] input){

        for (int i = 0 ;i < input.length ;++i){

            // call the partition
            int pivotPos = partition(input,i, input.length-1);

            if (pivotPos!=i){
                i--;
            }
        }

    }


    public static void main(String[] args) {
        int[] arr = {1,5,8,9,4,3};
        printArray(arr);
        System.out.println();
        quickSort(arr);
        printArray(arr);
        System.out.println();
        int[] array = {5,8,9,3,7,4,6,1};
//        printArray(array);
//        System.out.println();
//        quickSortDirect(array);
//        printArray(array);
        quickSortIterative(array);
        System.out.println();
        printArray(array);
    }

}
