package PrintAllPairs;

import java.util.Scanner;

public class PrintAllPairs {

    // How to print all the pairs inside the array
    //  total pair can be counted using formula of
    // combination Nc2

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // lest define a array.
        int [] arr = {1,7,8,9,6,7,8};
        int count=0;
        // let's print using for loop
        for(int j = 0; j< arr.length-1 ; j++){

            for (int i = j+1; i<arr.length ; i++){
                System.out.println("("+ arr[j]+ ","+arr[i]+")");
                count++;
            }
        }
        System.out.println(count);
    }

}

