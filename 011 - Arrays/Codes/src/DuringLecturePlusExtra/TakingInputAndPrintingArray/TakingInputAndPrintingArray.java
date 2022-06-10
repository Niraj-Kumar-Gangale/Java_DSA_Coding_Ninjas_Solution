package DuringLecturePlusExtra.TakingInputAndPrintingArray;

import java.util.Scanner;

public class TakingInputAndPrintingArray {

    // Main Function
    public static void main(String[] args) {
        //----------------------------------------------------
        // Taking input for the Array
        Scanner scan = new Scanner(System.in);
        // scan the size of the Array
        int size = scan.nextInt();
        // let's define the Array of Integer type
        int [] array = new int[size];

        // Now Transverse the Array and read input for every Index of the array
        for(int i = 0; i< size; i++){
            array[i]= scan.nextInt();
        }
        //------------------------------------------------
        System.out.println();
        // Now Print the Array
        for (int i = 0; i<size; i++){
            System.out.print(array[i]+ " ");
        }

    }
}
