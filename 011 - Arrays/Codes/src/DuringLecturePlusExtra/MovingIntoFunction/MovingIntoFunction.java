package DuringLecturePlusExtra.MovingIntoFunction;

import java.util.Scanner;

public class MovingIntoFunction {

    public static void main(String[] args) {

        // when ever we create  an array we have to scan the values of array,
        // and we have to print element of the array. which is repeatable task.
        // so let's create a function for the taking and printing the values in array.

        int[] array =  takingInput();
        printArray(array);

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
