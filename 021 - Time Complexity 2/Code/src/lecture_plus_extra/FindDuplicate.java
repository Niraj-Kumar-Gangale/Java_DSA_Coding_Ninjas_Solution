package lecture_plus_extra;

import java.util.Arrays;

public class FindDuplicate {


    public static void main(String[] args) {
        int[] arr = {0,1,3,2,3};
        // function to find the unique Element
        System.out.println(findDuplicate1(arr));
        System.out.println(findDuplicate2(arr));
        System.out.println(findDuplicate3(arr));


    }


    // METHOD 1 [ using the brute force ]
    public static int findDuplicate1(int[] arr){
        int arrLength = arr.length;
        // loop to select individual index element
        for (int i = 0 ; i < arrLength-1 ; ++i){
            // loop to check if element with value similar to arr[i] is present in the array
            for (int j = i+1; j < arrLength ; ++j){

                if (arr[j]==arr[i]){
                    return arr[j];
                }
            }
        }
        return -1;
    }
    // Time complexity for the above algo is ->    O(n^2)
    // space complexity for the above algo is ->   O(1)


   // Method 2 [ sorting and checking for consecutive similar value ]
    public static int findDuplicate2(int[] arr){
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
    // Time complexity for the above algo is ->    O(nlog(n))
    // space complexity for the above algo is ->   O(n)

    // METHOD 3 [ (sum of all index element ) - (sum of 0 to n-2 integer ) ]
    public static int findDuplicate3(int[] arr){

        // array indices sum
        int arraysum = 0;
        for (int j : arr) {
            arraysum += j;
        }
        int sumUptoNMinusTwo = 0;
        for(int i = 0 ; i < arr.length-1 ; ++i){
            sumUptoNMinusTwo += i ;
        }

        return arraysum-sumUptoNMinusTwo;

    }
    // Time complexity for the above algo is ->    O(n)
    // space complexity for the above algo is ->   O(1)

}


