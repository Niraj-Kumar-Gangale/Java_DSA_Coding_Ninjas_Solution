import java.util.Arrays;
import java.util.Scanner;

/**
 * Maximum Profit on App
 * Send Feedback
 * You have made a smartphone app and want to set its subscription price such that the profit earned is maximised. There are certain users who will subscribe to your app only if their budget is greater than or equal to your price.
 * You will be provided with a list of size N having budgets of subscribers and you need to return the maximum profit that you can earn.
 * Lets say you decide that price of your app is Rs. x and there are N number of subscribers. So maximum profit you can earn is :
 *  m * x
 * where m is total number of subscribers whose budget is greater than or equal to x.
 * Input format :
 * Line 1 : N (No. of subscribers)
 * Line 2 : Budget of subscribers (separated by space)
 * Output Format :
 *  Maximum profit
 * Constraints :
 * 1 <= N <= 10^6
 * 1 <=budget[i]<=9999
 * Sample Input 1 :
 * 4
 * 30 20 53 14
 * Sample Output 1 :
 * 60
 * Sample Output 1 Explanation :
 * Price of your app should be Rs. 20 or Rs. 30. For both prices, you can get the profit Rs. 60.
 * Sample Input 2 :
 * 5
 * 34 78 90 15 67
 * Sample Output 2 :
 * 201
 * Sample Output 2 Explanation :
 * Price of your app should be Rs. 67. You can get the profit Rs. 201 (i.e. 3 * 67).
 */


public class MaxProfit {
    public static void main(String[] args) {
        int[] arr = new int[1000];
//        System.out.println(maxProfit2(arr));
        Scanner scan = new Scanner(System.in);
        for (int i = 0 ;  i < 1000 ; i++){
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 0 ;  i < 1000 ; i++){
            System.out.println(arr[i]);;
        }
    }

    // --- Method 1 ------
    // Brute force
    public static int maxProfit (int[] arr){
        int maxProfit = 0;

        for (int i = 0 ;  i < arr.length  ; i++){

            int count = 0;
            for (int j = 0 ;  j < arr.length ; j++){

                    if (arr[i]<=arr[j]){
                        count++;
                    }

            }

            System.out.println(count*arr[i]);
            if (maxProfit<(count*arr[i])){
                maxProfit = count*arr[i];
            }
        }
        return maxProfit;
    }

    public static int totalCountLessThanAndEqual (int [] arr, int num){
        int count = 0;
        for (int i = 0 ; i < arr.length ; i++){
            if (arr[i]>=num){
                count++;
            }
        }
        return count;
    }

    //---------  Method 2   -----------
    // works for distinct element only
    public static int maxProfit2 (int[] arr){

        // soort the array
        Arrays.sort(arr);
        int maxProfit = 0 ;
        // find if the array is even or odd
//        System.out.println();
        if (arr.length%2 == 0){
            //even array
            int profitFromPriceA= arr[arr.length/2-1]*totalCountLessThanAndEqual(arr,arr[arr.length/2 - 1]);
            int profitFromPriceB= arr[arr.length/2]*totalCountLessThanAndEqual(arr,arr[arr.length/2 ]);
//            System.out.println(profitFromPriceA);
//            System.out.println(profitFromPriceB);
            maxProfit = Math.max(profitFromPriceA, profitFromPriceB);

        }else{
            // odd array
            maxProfit = arr[arr.length/2]*totalCountLessThanAndEqual(arr,arr[arr.length/2]);
        }
        return maxProfit;
    }

    // method by coding ninja
    public static int maximumProfit3(int[] budget) {
        Arrays.sort(budget);
        int[] cost = new int[budget.length];
        for(int i=0;i<budget.length;i++)
            cost[i] = budget[i] * (budget.length-i);
        int max = Integer.MIN_VALUE;
        for(int i:cost)
        {
            if(i > max)
                max = i;
        }
        return max;
    }
}
