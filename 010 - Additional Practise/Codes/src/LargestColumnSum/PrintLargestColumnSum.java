package LargestColumnSum;

import java.util.Scanner;

public class PrintLargestColumnSum {

    // function for the largest column sum
    public static int printLargestColumnSum(int array[][]){
        int max = Integer.MIN_VALUE;
        int sum ;
        int row = array.length;
        int col = array[0].length;

        for (int i = 0; i<col; i++){
            sum = 0;
            for (int[] ints : array) {
                sum = sum + ints[i];
            }
            if (sum>max){
                max = sum;
            }
        }
        return max;

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of row");
        int row = scan.nextInt();
        System.out.println("Enter the value of column");
        int col = scan.nextInt();

        // Define a 2D array
        int [][] arr;
        //  Initialize the 2D array
        arr = new int[row][col];

        for (int i = 0; i<row; i++){
            for (int j= 0; j<col; j++){

                // scan the values of elements of the 2d array
                System.out.println("Enter the value of "+ i + "th row "+ j +"th column");
                arr[i][j] = scan.nextInt();
            }
        }

        System.out.println("Largest Sum "+ printLargestColumnSum(arr));

    }

}
