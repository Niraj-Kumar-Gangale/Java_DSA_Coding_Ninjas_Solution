package lecture_plus_extra;

/**
 * Array Intersection
 * Send Feedback
 * You have been given two integer arrays/list(ARR1 and ARR2) of size N and M, respectively. You need to print their intersection; An intersection for this problem can be defined when both the arrays/lists contain a particular value or to put it in other words, when there is a common value that exists in both the arrays/lists.
 * Note :
 * Input arrays/lists can contain duplicate elements.
 *
 * The intersection elements printed would be in ascending order.
 *
 *
 * Input format :
 * The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
 *
 * The first line of each test case or query contains an integer 'N' representing the size of the first array/list.
 *
 * The second line contains 'N' single space separated integers representing the elements of the first the array/list.
 *
 * The third line contains an integer 'M' representing the size of the second array/list.
 *
 * The fourth line contains 'M' single space separated integers representing the elements of the second array/list.
 * Output format :
 * For each test case, print the intersection elements in a row, separated by a single space.
 *
 * Output for every test case will be printed in a separate line.
 * Constraints :
 * 1 <= t <= 10^2
 * 0 <= N <= 10^6
 * 0 <= M <= 10^6
 *
 * Time Limit: 1 sec
 * Sample Input 1 :
 * 2
 * 6
 * 2 6 8 5 4 3
 * 4
 * 2 3 4 7
 * 2
 * 10 10
 * 1
 * 10
 * Sample Output 1 :
 * 2 3 4
 * 10
 * Sample Input 2 :
 * 1
 * 4
 * 2 6 1 2
 * 5
 * 1 2 3 4 2
 * Sample Output 2 :
 * 1 2 2
 * Explanation for Sample Output 2 :
 * Since, both input arrays have two '2's, the intersection of the arrays also have two '2's. The first '2' of first array matches with the first '2' of the second array.
 * Similarly, the second '2' of the first array matches with the second '2' if the second array.
 */

import java.util.Arrays;

public class ArrayIntersection {

    public static void main(String[] args) {
        int[] arr1 = {2,6,1,2};
        int[] arr2 = {1,2,3,4,2};
        printArrayIntersection3(arr1,arr2);
    }

    // Method 1 [ brute force approach ]
    public static void printArrayIntersection(int[] arr1, int[] arr2){
        int arr1length = arr1.length;
        int arr2length = arr2.length;

        int i = 0 ;
        int k = 0 ;
        int ansArrayLength = Math.max(arr1length, arr2length);
        int[] ansArray = new int[ansArrayLength];
        for (; i < arr1length ;++i){
            for (int j = 0 ; j < arr2length ;++j){
                if (arr1[i]== arr2[j]){
                    ansArray[k]= arr1[i];
                    k++;
                    // using the insertion sort method so thar ansArray will be sorted
                    for (int l = k-1 ; l > 0 ; --l){
                        if (ansArray[l]< ansArray[l-1]){
                            // swap
                            int temp = ansArray[l];
                            ansArray[l] = ansArray[l-1];
                            ansArray[l-1] = temp;

                        }
                    }
                    arr1[i] = Integer.MIN_VALUE;
                    arr2[j] = Integer.MIN_VALUE;
                    break;
                }
            }
        }

        for (int j = 0; j < k ; j++ ){
            System.out.print(ansArray[j]+" ");
        }
    }
    // Time complexity for the above algo is ->    O(n*m)
    // space complexity for the above algo is ->   O(min(n,m))


    // Method 2 [ sorting and then applying nested for loop to look for common values in array ]
    public static void printArrayIntersection2 (int[] arr1, int[] arr2){
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i]==arr2[j]){
                    System.out.println(arr1[i]);
                    arr1[i] = Integer.MIN_VALUE;
                    arr2[j] = Integer.MIN_VALUE;
                    break;
                }
            }
        }
    }
    // Time complexity for the above algo is ->    O(n*m)
    // space complexity for the above algo is ->   O(1)

    // Method 3 [sorting and using the two pointer approach ]
    public static void printArrayIntersection3 (int[] arr1 , int[] arr2){
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i = 0 ; int j = 0 ;
        while ((i<arr1.length)&&(j<arr2.length)){
            if (arr1[i]==arr2[j]){
                System.out.println(arr1[i]);
                i++;j++;
            }
            else if (arr1[i]> arr2[j]){
                j++;
            }else{
                i++;
            }
        }
    }




}
