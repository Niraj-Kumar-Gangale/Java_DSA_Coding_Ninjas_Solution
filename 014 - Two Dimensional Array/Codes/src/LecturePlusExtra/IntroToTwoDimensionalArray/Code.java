package LecturePlusExtra.IntroToTwoDimensionalArray;

import java.util.Scanner;

public class Code {

    public static void main(String[] args) {
        // how  to define 1D arraay
        int [] arr = new int[5];

        // how to define 2D array
        int [][] arr2d = new int[5][5];

        // Define the 2D array Along with the Initialization
        int[][] first2dArray = {{1,2,3},
                                {4,5,6},
                                {7,8,9}};

        // let's define the print and input function for the 2D array
        print2dArray(first2dArray);
        int[][] second2dArray = initialize2dArray();
        print2dArray(arr2d);

    }
    // Print function for 2d Integer array
    public static void print2dArray(int[][] mat){
        for (int i = 0; i < mat.length ;++i){
            for (int j = 0 ; j < mat[0].length ; ++j){
                System.out.print(mat[i][j]+ " ");
            }
            System.out.println();
        }
    }

    // Initialize 2d array function
    public static int[][] initialize2dArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of the rows");
        int rows = sc.nextInt();
        System.out.println("Number of the column");
        int column = sc.nextInt();

        int[][] mat =new int[rows][column];
        for (int i = 0; i < mat.length ;++i){
            for (int j = 0 ; j < mat[0].length ; ++j){
                System.out.println("Enter the value of "+ i + " row and "+ j + " column");
                mat[i][j] = sc.nextInt();
            }

        }
    }
}
