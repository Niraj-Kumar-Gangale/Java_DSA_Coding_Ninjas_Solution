package LectureAndExtra.WhatIsBinarySearch;

public class BinarySearch {

    public static void main(String[] args) {
        /*

        Binary search is different from linear search
        ##########################################
        ARRAY MUST BE SORTED TO USE BINARY SEARCH
        ##########################################

        Here we use MiD = (START + END)/2
        START = 0 , END = n-1.

        we will check
        ----------------------------------------
        if [ arr[MID]==NUMBER ]{
            RETURN arr[MID]
        }
        else if( arr[MID]> NUMBER){
        we will go to the left side by using

            end = mid-1;
        }
        else if( arr[MID] < NUMBER ){
        we will go to the right side using

            start = mid + 1;
        }
        -----------------------------------------

        we will above process till

        START <= END

        */

        int[] firstArray = {1,2,5,9,15,18,26,65,88,95};
        // NUMBER = 5
        int n = 5;

        int start = 0;
        int end = firstArray.length-1;
        int mid;
        while(start<=end){
            mid = (start + end)/2 ;
        if (n == firstArray[mid] ){
                System.out.println(firstArray[mid]);
                return;
        }
        else if( firstArray[mid]> n){
            end = mid-1;
            }
        else {
            start = mid + 1;
            }

        }
    }
}
