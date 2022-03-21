/*
Half Diamond Pattern
        Send Feedback
        Write a program to print N number of rows for Half Diamond pattern using stars and numbers
        Note : There are no spaces between the characters in a single line.


        Input Format :
        A single integer: N
        Output Format :
        Required Pattern

        Constraints :
        0 <= N <= 50

        Sample Input 1 :
        3
        Sample Output 1 :
        *
        *1*
        *121*
        *12321*
        *121*
        *1*
        *

        Sample Input 2 :
        5
        Sample Output 2 :
        *
        *1*
        *121*
        *12321*
        *1234321*
        *123454321*
        *1234321*
        *12321*
        *121*
        *1*
        *

*/
import java.util.Scanner;
public class HalfDiamond {
    public static void main(String[] args) {

        //method 3 coding ninja solution.
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        System.out.println("*");
        while (i<=n){
            System.out.print("*");
            int j = 1;
            while (j<=i){
                System.out.print(j);
                j++;
            }
            j = j-2;
            while(j>=1){
                System.out.print(j);
                j--;
            }
            System.out.print("*");
            System.out.println();
            i++;
        }

        i = 1;
        while (i<=n-1){
            System.out.print("*");
            int j = 1;
            while (j<=n-i){
                System.out.print(j);
                j++;
            }
            j = j-2;
            while(j>=1){
                System.out.print(j);
                j--;
            }
            System.out.print("*");
            System.out.println();
            i++;
        }
        System.out.print("*");

        //method 2
//        Scanner s = new Scanner(System.in);
//        int n = s.nextInt();
//        int n1 = (2*n+3)/2-1;
//        int n2  = (2*n+1)/2-1;
//        int i = 1;
//        System.out.println("*");
//        while (i<=n1){
//            System.out.print("*");
//            int j = 1;
//            while (j<=i){
//                System.out.print(j);
//                j++;
//            }
//            j = 1;
//            while(j<=(i-1)){
//                System.out.print(i-j);
//                j++;
//            }
//            System.out.print("*");
//            System.out.println();
//            i++;
//        }
//
//        i = 1;
//        while (i<=n2){
//            System.out.print("*");
//            int j = 1;
//            while (j<=n2-i+1){
//                System.out.print(j);
//                j++;
//            }
//            j = 1;
//            while(j<=(n2-i)){
//                System.out.print(n2-i-j+1);
//                j++;
//            }
//            System.out.print("*");
//            System.out.println();
//            i++;
//        }
//        System.out.print("*");

        //method 1
        /*
        int n1 = (2*n+3)/2;
        int n2  = (2*n+1)/2;
        int i= 1;
        while (i<=n1){
            System.out.print("*");
            int j = 1;
            while (j<=i-1){
                System.out.print(j);
                j++;
            }
            j = 1;
            while(j<=(i-2)){
                System.out.print(i-j-1);
                j++;
            }
            if(!(i==1)){
                System.out.print("*");
            }
            System.out.println();
            i++;
        }
        i= 1;
        while (i<=n2){
            System.out.print("*");
            int j = 1;
            while (j<=(n2-i)){
                System.out.print(j);
                j++;
            }
            j = 1;
            while(j<=(n2-i-1)){
                System.out.print(n2-i-j);
                j++;
            }
            if(!(i==n2)){
                System.out.print("*");
            }
            System.out.println();
            i++;


        }

         */
    }
}
