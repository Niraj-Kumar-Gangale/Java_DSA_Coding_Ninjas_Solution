package SumOfNNumber;

import java.util.Scanner;

public class SumOfNNumber {
   // sum of n Number
   public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int n = scan.nextInt();
       int sum = 0;
       int i = 1;
       while(i<=n){
           sum += i;
           i++;
       }
       System.out.println(sum);
   }

}
