package LectureAndExtra.WhatIsBinarySearch;

public class LinearSearch {
    public static void main(String[] args) {
        // In linear search we will search for NUMBER in the array in a linear manner:
        // 1] we start from first index, we will check if the Array[0]==NUMBER if not we will move to the next one
        // 2] we will repeat the above process for index 1 , 2 , 3 ............ (arr.length -1)

        int[] arr = {1,3,8,5,6,9,4,4,96,45};
        int NUMBER = 45;
        for (int i = 0 ; i < arr.length ; i++){
            if(arr[i]==NUMBER){
                System.out.println("Number is present");
            }
        }
    }
}
