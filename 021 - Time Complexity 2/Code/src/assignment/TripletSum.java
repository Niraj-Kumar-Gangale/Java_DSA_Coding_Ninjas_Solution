package assignment;

/**
 * Triplet sum
 * Send Feedback
 * You have been given a random integer array/list(ARR) and a number X. Find and return the triplet(s) in the array/list which sum to X.
 * Note :
 * Given array/list can contain duplicate elements.
 * Input format :
 * The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
 *
 * First line of each test case or query contains an integer 'N' representing the size of the first array/list.
 *
 * Second line contains 'N' single space separated integers representing the elements in the array/list.
 *
 * Third line contains an integer 'X'.
 * Output format :
 * For each test case, print the total number of triplets present in the array/list.
 *
 * Output for every test case will be printed in a separate line.
 * Constraints :
 * 1 <= t <= 10^2
 * 0 <= N <= 10^3
 * 0 <= X <= 10^9
 *
 * Time Limit: 1 sec
 * Sample Input 1:
 * 1
 * 7
 * 1 2 3 4 5 6 7
 * 12
 * Sample Output 1:
 * 5
 * Sample Input 2:
 * 2
 * 7
 * 1 2 3 4 5 6 7
 * 19
 * 9
 * 2 -5 8 -6 0 5 10 11 -3
 * 10
 * Sample Output 2:
 * 0
 * 5
 *
 *
 *  Explanation for Input 2:
 * Since there doesn't exist any triplet with sum equal to 19 for the first query, we print 0.
 *
 * For the second query, we have 5 triplets in total that sum up to 10.
 * They are, (2, 8, 0), (2, 11, -3), (-5, 5, 10), (8, 5, -3) and (-6, 5, 11)
 */

import java.util.Arrays;

public class TripletSum {


    public static void main(String[] args) {
        int[] arr = {6 ,1 ,6 ,5 ,3 ,2};
        tripletSum2(arr,6);
    }

    // --------------------- Method 1 -------------------
    // > Brute Force
    public static int tripletSum(int[] arr, int num) {
        //Your code goes here
        int count = 0;
        for (int i = 0; i < arr.length ; i++){
            for (int j = i+1 ; j < arr.length ; j++){
                for (int k = j+1 ; k < arr.length ; k++){
                    if ((arr[i]+arr[j]+ arr[k]) == num){
                        count++;
                    }
                }
            }
        }
        return count;
    }

    // ---------------------  Method 2  ------------
    // > After sorting

    public static int tripletSum2(int[] arr, int num) {
        //Your code goes here
        int count = 0;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length ; i++){
//            count +=pairSumCN2 (arr,i+1,num-arr[i]);
            System.out.println(pairSumCN2 (arr,i+1,num-arr[i]));
        }
        return count;
    }

    // coding ninja solution
    public static int pairSumCN2(int[] arr,int start, int num) {

        int startIndex = start;
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
