package assignment;

/**
 * Return subset of an array
 * Send Feedback
 * Given an integer array (of length n), find and return all the subsets of input array.
 * Subsets are of length varying from 0 to n, that contain elements of the array. But the order of elements should remain same as in the input array.
 * Note : The order of subsets are not important.
 * Input format :
 *
 * Line 1 : Size of array
 *
 * Line 2 : Array elements (separated by space)
 *
 * Sample Input:
 * 3
 * 15 20 12
 * Sample Output:
 * [] (this just represents an empty array, don't worry about the square brackets)
 * 12
 * 20
 * 20 12
 * 15
 * 15 12
 * 15 20
 * 15 20 12
 */

public class ReturnSubsetArray {

    public static void main(String[] args) {

        int[][] answer = subsets(new int[]{1,2,3});

        for (int i = 0 ; i < answer.length ; ++i){
            for (int j =  0 ; j < answer[i].length ; ++j){
                System.out.print(answer[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static int[][] subsets(int[] input){
        return subsets(input, input.length-1, new int[1][0]);
    }


    public static int[][] subsets(int input[], int si) {
        // Write your code here

        // base case
        if (si == input.length){
            int[][] array = new int[1][];
            array[0] = new int[0];
            return array;
        }

        // small ans
        int[][] smallAns = subsets(input,si+1);
        // solving the big using the small
        int[][] ans = new int[smallAns.length*2][];

        // for loop
        for (int i = 0 ; i < ans.length ;++i){
            if (i< smallAns.length){
                ans[i]=smallAns[i];
            } else{
                int[] temp = new int[smallAns[i- smallAns.length].length+1];
                temp[0]= input[si];
                for (int j = 1; j < temp.length ;++j ){
                    temp[j] = smallAns[i- smallAns.length][j-1];
                }
                ans[i] = temp;
            }
        }

        return ans;
    }

    // solving by passing the answer to the next recursion
    // same approach different implementation
    public static int[][] subsets(int input[], int si, int[][] ans) {
        // Write your code here

        // base case
        if (si < 0){
            return ans;
        }
        // solving the big using the small
        int[][] tempAns = new int[ans.length*2][];

        // for loop
        for (int i = 0 ; i < tempAns.length ;++i){
            if (i< ans.length){
                tempAns[i]=ans[i];
            } else{
                int[] temp = new int[ans[i- ans.length].length+1];
                temp[0]= input[si];
                for (int j = 1; j < temp.length ;++j ){
                    temp[j] = ans[i- ans.length][j-1];
                }
                tempAns[i] = temp;
            }
        }
        ans = tempAns;
        return subsets(input, si-1, ans);
    }

    // coding ninja solution
    public static int[][] subsetsHelper(int[] input, int startIndex){
        if(startIndex == input.length){
            int[][] output = new int[1][0];
            return output;
        }
        int[][] smallerOutput = subsetsHelper(input, startIndex + 1);
        int[][] output = new int[2*smallerOutput.length][];
        int k = 0;
        for(int i = 0; i < smallerOutput.length; i++){
            output[k] = new int[smallerOutput[i].length];
            for(int j = 0; j<smallerOutput[i].length; j++){
                output[k][j] = smallerOutput[i][j];
            }
            k++;
        }
        for(int i = 0; i < smallerOutput.length; i++){
            output[k] = new int[smallerOutput[i].length+1];
            output[k][0] = input[startIndex];
            for(int j = 1; j <= smallerOutput[i].length; j++){
                output[k][j] = smallerOutput[i][j-1];
            }
            k++;
        }
        return output;
    }

}
