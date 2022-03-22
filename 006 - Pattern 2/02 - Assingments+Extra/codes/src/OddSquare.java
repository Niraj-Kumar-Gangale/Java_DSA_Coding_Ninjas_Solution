/*          Odd Square

Write a program to print the pattern for the given N number of rows.
For N = 4
1357
3571
5713
7135

Input Format :
A single integer: N
Output Format :
Required Pattern

Constraints :
0 <= N <= 50

Sample Input 1 :
3
Sample Output 1 :
135
351
513

Sample Input 2 :
 5
Sample Output 2 :
13579
35791
57913
79135
91357
*/

import java.util.Scanner;
public class OddSquare {
    public static void main(String[] args) {

      //method 1
         Scanner s = new Scanner(System.in);
         int n = s.nextInt();
         int row = 1;
        while(row<=n){

            int coloumn = 1,numToPrint=2*row-1;
            while(coloumn<=n){
                if (numToPrint>2*n-1){
                    numToPrint=1;
                }
                System.out.print(numToPrint);
                numToPrint+=2;
                coloumn++;
            }
            System.out.println();
            row++;
        }


        //method 2
//        Scanner s = new Scanner(System.in);
//        int n = s.nextInt();
//        int row = 1;
//        while(row<=n){
//
//            int coloumn = 1;
//            while(coloumn<=n){
//                if (2*(row+coloumn)-3>2*n-1){
//                    System.out.print(2*(row+coloumn)-3-2*n);
//                }else {
//                    System.out.print(2 * (row + coloumn) - 3 );
//                }
//                coloumn++;
//            }
//            System.out.println();
//            row++;
//        }
    }
}
