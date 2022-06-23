package Assignment;

/**
 * Second Largest in array
 * Send Feedback
 *
 * You have been given a random integer array/list(ARR) of size N.
 * You are required to find and return the second largest element present in the array/list.
 * If N <= 1 or all the elements are same in the array/list then return -2147483648 or -2 ^ 31
 * (It is the smallest value for the range of Integer)
 * --------------------Input format :
 * The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
 *
 * The first line of each test case or query contains an integer 'N' representing the size of the array/list.
 *
 * The second line contains 'N' single space separated integers representing the elements in the array/list.
 * -------------------Output Format :
 * For each test case, print the second largest in the array/list if exists, -2147483648 otherwise.
 *
 * Output for every test case will be printed in a separate line.
 * -----------------Constraints :
 * 1 <= t <= 10^2
 * 0 <= N <= 10^5
 *
 * Time Limit: 1 sec
 * -----------------Sample Input 1:
 * 1
 * 7
 * 2 13 4 1 3 6 28
 * Sample Output 1:
 * 13
 * ------------------Sample Input 2:
 * 1
 * 5
 * 9 3 6 2 9
 * Sample Output 2:
 * 6
 * --------------------------Sample Input 3:
 * 2
 * 2
 * 6 6
 * 4
 * 90 8 90 5
 * Sample Output 3:
 * -2147483648
 * 8
 */


public class SecondLargestInArray {

    public static void main(String[] args) {
        //int[] arr = {5 ,5 ,5 ,5 ,5 ,5};
        // int[] arr = {2 ,13 ,4 ,1 ,3, 6 ,28};
        int[] arr = {8 ,9 ,9 ,1 ,7, 5,5 ,10 ,1 ,0 ,7 };
        System.out.println(secondLargestElement(arr));
    }

    public static int secondLargestElement(int[] arr) {
        //Your code goes here

        /*

        // ----------------------------------METHOD 3---------------------
        // method of using bubble  sort two time then printing the index value of  arr[n-2].
        // if N (i.e length of the array) is less than equal to 1 then return the value
        // -2 power 31
        if (arr.length <= 1){
            return Integer.MIN_VALUE;
        }

        for (int i = 0 ; i < 2 ; i++){
            // bubble out the values
            for (int j = 0 ; j < arr.length-1 ; j++){

                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1] = temp;
                }
            }

        }
        if (arr[arr.length-2]==arr[arr.length-1]){
            return Integer.MIN_VALUE;
        }else{
            return arr[arr.length-2];
        }

        // 3 TESTCASE WILL NOT PASS BECAUSE ARRAY CAN BE { 10 , 10 , 9 ,8 ,6 , 2,1}


         */


        // ----------------------------------------METHOD 2---------------
        // Find the maximum value
        // find the second largest by comparing to largest and the rest of the element


        int maxValue = Integer.MIN_VALUE;
        int secondMAxValue = Integer.MIN_VALUE;
        for (int i =0 ; i < arr.length ; i++ ){
            if (maxValue < arr[i] ){
                maxValue = arr[i];
            }
        }
        System.out.println(maxValue);

        // again for loop  to find the second-largest value
        for (int i =0 ; i < arr.length ; i++ ){
            if (arr[i]==maxValue){
                continue;
            }
            System.out.println(secondMAxValue < arr[i] && secondMAxValue < maxValue);
            if (secondMAxValue < arr[i] && secondMAxValue < maxValue  ){

                secondMAxValue = arr[i];

            }
        }


        return secondMAxValue;



        // ------------------------------METHOD 1----------------------
        // sort the whole array
        // if arr[n-2]==arr[n-1] return -2 power 31
        // else return arr[n-2]
        // 3 TESTCASE WILL NOT PASS BECAUSE ARRAY CAN BE { 10 , 10 , 9 ,8 ,6 , 2,1}


        /*
        Coding ninja method

        if (arr.length == 0) {
            return Integer.MIN_VALUE;
        }
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (largest < arr[i]) {
                secondLargest = largest;
                largest = arr[i];
            } else if (secondLargest < arr[i] && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;


         */
    }
}
