//Print the following pattern for the given N number of rows.
//        Pattern for N = 4
//        4444
//        333
//        22
//        1

import java.util.Scanner;
public class InvertedNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i = 1;
        while(i<=n){

            int j = 1;
            while(j<=(n+1-i)){
                System.out.print(n+1-i);
                j++;
            }
            j =1;
            while(j<=(i-1)){
                System.out.print(" ");
                j++;
            }

            System.out.println();
            i++;
        }
    }
}
