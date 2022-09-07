package assignment;

import java.util.Arrays;

/**
 * Pair sum in array
 * Send Feedback
 * You have been given an integer array/list(ARR) and a number 'num'. Find and return the total number of pairs in the array/list which sum to 'num'.
 * Note:
 * Given array/list can contain duplicate elements.
 * Input format :
 * The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
 *
 * First line of each test case or query contains an integer 'N' representing the size of the first array/list.
 *
 * Second line contains 'N' single space separated integers representing the elements in the array/list.
 *
 * Third line contains an integer 'num'.
 * Output format :
 * For each test case, print the total number of pairs present in the array/list.
 *
 * Output for every test case will be printed in a separate line.
 * Constraints :
 * 1 <= t <= 10^2
 * 0 <= N <= 10^4
 * 0 <= num <= 10^9
 *
 * Time Limit: 1 sec
 * Sample Input 1:
 * 1
 * 9
 * 1 3 6 2 5 4 3 2 4
 * 7
 * Sample Output 1:
 * 7
 * Sample Input 2:
 * 2
 * 9
 * 1 3 6 2 5 4 3 2 4
 * 12
 * 6
 * 2 8 10 5 -2 5
 * 10
 * Sample Output 2:
 * 0
 * 2
 *
 *
 *  Explanation for Input 2:
 * Since there doesn't exist any pair with sum equal to 12 for the first query, we print 0.
 *
 * For the second query, we have 2 pairs in total that sum up to 10. They are, (2, 8) and (5, 5).
 */


public class PairSum {


    public static void main(String[] args) {
        int[] arr = {0,6,0,0};
        pairSum2(arr,6);
    }



    // <<<<<<<<<<<<<<< Method 1 >>>>>>>>>>>>>>
    //             BRUTE FORCE
    public static int pairSum(int[] arr, int num) {
        //Your code goes here
        int totalPairSum = 0;
        // pick one index at a time using for loop
        for (int i = 0 ; i < arr.length ; i++){
            // pick one index element at a time using for loop
            for (int j = i + 1 ; j < arr.length ; ++j){
                // check if summation of the index element is equal to the sum
                if (arr[i] +  arr[j] == num){
                    totalPairSum++;
                }
            }
        }
        return totalPairSum;
    }

    // <<<<<<<<<<<<<<<<<<< METHOD 2 >>>>>>>>>>>>>>>>>
    //                 2 POINTER
    public static int pairSum2 (int[] arr, int num){
        Arrays.sort(arr);


        int totalPairSum = 0 ;
        int i = 0; int j = arr.length-1;
        // while loop
        while(i < j){
            if ((arr[i]+arr[j])< num){
                i++;
            }else if ((arr[i]+arr[j])>num){
                j--;
            }else{
                // ------ For distinct array elements --------
                // totalPairSum++;
                // i++; j--;
                // ------ For non distinct array element
                if (arr[i] == arr[j]){
                    return totalPairSum + ((j-i+1)*(j-i))/2;
                }
                int firstNumDuplicateCount = 0;
                while (arr[i+1]==arr[i]){
                    firstNumDuplicateCount++;
                    i++;
                }
                System.out.println(i);
                int secondNumDuplicateCount = 0 ;
                while (arr[j-1]==arr[j]){
                    secondNumDuplicateCount++;
                    j--;
                }
                totalPairSum += (firstNumDuplicateCount+1)*(secondNumDuplicateCount+1);
                i = i + 1;
                j = j - 1;
            }
        }
        return totalPairSum;
    }


    // coding ninja solution
    public static int pairSumCN(int[] arr, int num) {
        Arrays.sort(arr);
        int startIndex = 0;
        int endIndex = (arr.length - 1);
        int numPair = 0;
        while(startIndex < endIndex) {
            if(arr[startIndex] + arr[endIndex] < num) {
                startIndex++;
            }
            else if (arr[startIndex] + arr[endIndex] > num) {
                endIndex--;
            } else {
                int elementAtStart = arr[startIndex];
                int elementAtEnd = arr[endIndex];

                if (elementAtStart == elementAtEnd) {
                    int totalElementsFromStartToEnd = (endIndex - startIndex) + 1;
                    numPair += (totalElementsFromStartToEnd * (totalElementsFromStartToEnd - 1) / 2);

                    return numPair;
                }

                int tempStartIndex = startIndex + 1;
                int tempEndIndex = endIndex - 1;
                while (tempStartIndex <= tempEndIndex && arr[tempStartIndex] == elementAtStart) {
                    tempStartIndex += 1;
                }

                while(tempEndIndex >= tempStartIndex && arr[tempEndIndex] == elementAtEnd) {
                    tempEndIndex -= 1;
                }
                int totalElementsFromStart = (tempStartIndex - startIndex);
                int totalElementsFromEnd = (endIndex - tempEndIndex);

                numPair += (totalElementsFromStart * totalElementsFromEnd);
                startIndex = tempStartIndex;
                endIndex = tempEndIndex;
            }
        }
        return numPair;
    }
}
