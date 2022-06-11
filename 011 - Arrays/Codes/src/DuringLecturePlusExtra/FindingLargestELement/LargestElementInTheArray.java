package DuringLecturePlusExtra.FindingLargestELement;
import java.util.Scanner;

/**
 * Finding the  largest element in the array
 * Solution -  transverse through the array
 *             AND Compare every index with
 *             the max value.
 */


public class LargestElementInTheArray {

    public static void main(String[] args) {
        int[] array = takingInput();
        printArray(array);
        System.out.println(largestInArray(array));
    }
    // largest in the array function
    public static int largestInArray(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i< arr.length ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    // function to print the array
    public static void printArray (int[] arr){
        for (int i = 0; i< arr.length; i++ ){
            System.out.println(arr[i]);
        }
    }
    // function to take input parameter of array.
    public static int[] takingInput(){
        Scanner s = new Scanner(System.in);
        System.out.println(" Enter the Size of the array");
        int size = s.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the element value");
        for (int i = 0; i<size; i++){
            arr[i]= s.nextInt();
        }

        return arr;
    }
}
