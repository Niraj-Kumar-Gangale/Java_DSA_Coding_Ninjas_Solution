package Assignment;

import java.util.Arrays;

/**
 * Triplet sum
 * Send Feedback
 * You have been given a random integer array/list(ARR) and a number X.
 * Find and return the triplet(s) in the array/list which sum to X.
 * Note :
 * Given array/list can contain duplicate elements.
 * Input format :
 * The first line contains an Integer 't' which denotes the number of test cases or queries to be run.
 * Then the test cases follow.
 * <p>
 * First line of each test case or query contains an integer 'N' representing the size of the first array/list.
 * <p>
 * Second line contains 'N' single space separated integers representing the elements in the array/list.
 * <p>
 * Third line contains an integer 'X'.
 * Output format :
 * For each test case, print the total number of triplets present in the array/list.
 * <p>
 * Output for every test case will be printed in a separate line.
 * Constraints :
 * 1 <= t <= 10^2
 * 0 <= N <= 10^3
 * 0 <= X <= 10^9
 * <p>
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
 * <p>
 * <p>
 * Explanation for Input 2:
 * Since there doesn't exist any triplet with sum equal to 19 for the first query, we print 0.
 * <p>
 * For the second query, we have 5 triplets in total that sum up to 10.
 * They are, (2, 8, 0), (2, 11, -3), (-5, 5, 10), (8, 5, -3) and (-6, 5, 11)
 */

public class TripletSum {

    // brute force / method 1 / direct approach
    // test case produce TLE
    // time complexity O(n^3)
    public static int tripletSum(int[] arr, int num) {
        //Your code goes here
        int count = 0;
        for (int i = 0; i < arr.length; ++i) {
            for (int j = i + 1; j < arr.length; ++j) {
                for (int k = j + 1; k < arr.length; ++k) {
                    if ((arr[i] + arr[j] + arr[k]) == num) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    // Method 2
    // We try to develop method after sorting the array
    public static int tripletSum2(int[] arr, int num) {
        // sort
        Arrays.sort(arr);
        int count = 0;
        // for loop
        for (int k = 0; k < arr.length - 2; ++k) {
            int i = k + 1;
            int j = arr.length - 1;
            int newNum = num - arr[k];

            while (i < j) {
                if ((arr[i] + arr[j]) > newNum) {
                    j--;
                } else if ((arr[i] + arr[j]) < newNum) {
                    i++;
                } else {
                    if (arr[i] == arr[j]) {
                        int length = j - i + 1;
                        count = count + (length) * (length - 1) / 2;
                        // no need to return
                        // because if the array is 1 1 1 2 2 2 2 2   and num = 5
                        // then newNum = 4
                        // for index[0] then count = 10
                        // if you return here you will lose your data for index[1] and index[2]
                        break;
                    } else {

                        int start = i;

                        while (arr[start + 1] == arr[start]) {
                            start++;
                        }
                        int end = j;

                        while (arr[end - 1] == arr[end]) {
                            end--;
                        }

                        int totalFromStart = start - i + 1;

                        int totalFromEnd = j - end + 1;

                        count += totalFromEnd * totalFromStart;

                        i = start + 1;
                        j = end - 1;
                    }
                }
            }
        }
        return count;
    }

    // modify the above function
    // this is also coding ninja solution
    public static int tripletSum3(int[] arr, int num) {
        // sort
        Arrays.sort(arr);
        int count = 0;
        // for loop
        for (int k = 0; k < arr.length - 2; ++k) {
            int i = k + 1;
            int j = arr.length - 1;
            int newNum = num - arr[k];
            System.out.println(count);
            count =  count + pairSumCN2(arr, k+1, j, newNum);
        }
        return count;
    }

    public static int pairSumCN2(int[] arr,int start,int end, int num) {
        Arrays.sort(arr);
        int startIndex = start;
        int endIndex = end;
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
                //tempStartIndex <= tempEndIndex [ just for sake of convenience ]
                while (tempStartIndex <= tempEndIndex && arr[tempStartIndex] == elementAtStart) {
                    tempStartIndex += 1;
                }

                while(tempEndIndex >= tempStartIndex && arr[tempEndIndex] == elementAtEnd) {
                    tempEndIndex -= 1;
                }
                int totalElementsFromStart = (tempStartIndex - startIndex);
                int totalElementsFromEnd = (endIndex - tempEndIndex);
                System.out.println(numPair);

                numPair += (totalElementsFromStart * totalElementsFromEnd);
                startIndex = tempStartIndex;
                endIndex = tempEndIndex;
            }
        }
        return numPair;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(tripletSum2(array, 12));
    }


}
