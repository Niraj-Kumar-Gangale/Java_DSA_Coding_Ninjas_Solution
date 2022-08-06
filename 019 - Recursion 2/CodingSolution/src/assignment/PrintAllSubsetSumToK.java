package assignment;

/**
 * Print Subset Sum to K
 * Send Feedback
 * Given an array A and an integer K, print all subsets of A which sum to K.
 * Subsets are of length varying from 0 to n, that contain elements of the array. But the order of elements should remain same as in the input array.
 * Note : The order of subsets are not important. Just print them in different lines.
 * Input format :
 * Line 1 : Size of input array
 * Line 2 : Array elements separated by space
 * Line 3 : K
 * Sample Input:
 * 9
 * 5 12 3 17 1 18 15 3 17
 * 6
 * Sample Output:
 * 3 3
 * 5 1
 */

public class PrintAllSubsetSumToK {

    public static void main(String[] args) {
        int[] arr = {1,4,2,3};
        printAllSubsetsSumToK(arr,5);
    }


    // function to print all the possible output
    // my method
    // si -> StartingIndex

    public static  void printAllSubsetsSumToK(int[] input, int k){
        printAllSubsetsSumToKOpt(input,0,new int[0],k);
    }
    public static void printAllSubsetsSumToK (int[] input, int si, int[] outputSoFar, int k){
        // base case
        if (si == input.length){
            return;
        }

        // without input[si]
        printAllSubsetsSumToK(input,si +1,outputSoFar,k);

        // with input[si]
        int sum = 0 ;
        int[] newOutputSoFar = new int[outputSoFar.length+1];
        for (int i = 0 ; i < newOutputSoFar.length ; ++i ){
            if (i < outputSoFar.length){
                newOutputSoFar[i] = outputSoFar[i];
            }else{
                newOutputSoFar[i] = input[si];
            }
            sum = sum + newOutputSoFar[i];
        }
        if (sum == k){
            for (int i = 0 ; i < newOutputSoFar.length ; ++i){
                System.out.print(newOutputSoFar[i]+" ");
            }
            System.out.println();
        }else if(sum < k){
            printAllSubsetsSumToK(input,si+1,newOutputSoFar,k);
        }
    }

    // let's optimize the above code
    public static void printAllSubsetsSumToKOpt (int[] input, int si, int[] outputSoFar, int k){


        int sum = 0;
        for (int i = 0 ; i < outputSoFar.length ; ++i){
            sum = sum + outputSoFar[i];
        }
        if (sum == k){
            for (int i = 0 ; i < outputSoFar.length ; ++i){
                System.out.print(outputSoFar[i]+" ");
            }
            System.out.println();
            return;
        }

        // base case
        if (si == input.length){
            return;
        }

        if (sum>k){
            return;
        }

        // without input[si]
        printAllSubsetsSumToKOpt(input,si +1,outputSoFar,k);

        // with input[si]
        int[] newOutputSoFar = new int[outputSoFar.length+1];
        for (int i = 0 ; i < newOutputSoFar.length ; ++i ){
            if (i < outputSoFar.length){
                newOutputSoFar[i] = outputSoFar[i];
            }else{
                newOutputSoFar[i] = input[si];
            }
        }
        printAllSubsetsSumToKOpt(input,si+1,newOutputSoFar,k);

    }


    // Coding ninja method

    public static void printSubsetsSumTokHelper(int[] input, int beginIndex, int[] output, int k){
        if(beginIndex == input.length){
            if(k == 0){
                for(int i : output){
                    System.out.print(i+" ");
                }
                System.out.println();
                return;
            }else{
                return;
            }
        }
        int[] newOutput = new int[output.length+1];
        int i = 0;
        for(; i < output.length; i++){
            newOutput[i] = output[i];
        }
        newOutput[i] = input[beginIndex];
        printSubsetsSumTokHelper(input, beginIndex + 1, output, k);
        printSubsetsSumTokHelper(input, beginIndex + 1, newOutput, k - input[beginIndex]);
    }
}
