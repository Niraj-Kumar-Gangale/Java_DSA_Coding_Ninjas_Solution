package assignment;

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
