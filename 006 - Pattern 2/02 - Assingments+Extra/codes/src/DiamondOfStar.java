/*
Print the following pattern for the given number of rows.
Note: N is always odd.

        *
       ***
      *****
       ***
        *

Pattern for N = 5
The dots represent spaces.

N (Total no. of rows and can only be odd)

* */

import java.util.Scanner;
public class DiamondOfStar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int n1 = n/2+1;
        int n2 = n-n1;
        int i = 1;
        while(i<=n1){

            int j = 1;
            while(j<=(n1-i)){
                System.out.print(" ");
                j++;
            }
            j =1;

            while(j<=2*i-1){
                System.out.print("*");
                j++;
            }

            System.out.println();
            i++;

        }
        // method 1
//        i=1;
//        while(i<=n2){
//
//            int j = 1;
//            while(j<=(i)){
//                System.out.print(" ");
//                j++;
//            }
//            j =1;
//            while(j<=2*(n2-i)+1){
//                System.out.print("*");
//                j++;
//            }
//
//            System.out.println();
//            i++;
//
//        }
        i=n2;
        while(i>0){

            int j = 1;
            while(j<=(n2-i+1)){
                System.out.print(" ");
                j++;
            }
            j =1;
            while(j<=2*i-1){
                System.out.print("*");
                j++;
            }

            System.out.println();
            i--;

        }

    }
}
