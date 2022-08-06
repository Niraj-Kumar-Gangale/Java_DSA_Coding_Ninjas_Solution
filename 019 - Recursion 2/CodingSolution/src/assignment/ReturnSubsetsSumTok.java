package assignment;

/**
 * Return subsets sum to K
 * Send Feedback
 * Given an array A of size n and an integer K, return all subsets of A which sum to K.
 * Subsets are of length varying from 0 to n, that contain elements of the array. But the order of elements should remain same as in the input array.
 * Note : The order of subsets are not important.
 * Input format :
 * Line 1 : Integer n, Size of input array
 * Line 2 : Array elements separated by space
 * Line 3 : K
 * Constraints :
 * 1 <= n <= 20
 * Sample Input :
 * 9
 * 5 12 3 17 1 18 15 3 17
 * 6
 * Sample Output :
 * 3 3
 * 5 1
 */

public class ReturnSubsetsSumTok {
    public static void main(String[] args) {
        int[] arr = {5 ,12, 3 ,17 ,1 ,18 ,15, 3 ,17 };
        int[][] ans = subsetsSumK(arr, 0,new int[0], 6);
        for (int i = 0 ; i < ans.length ; ++i){
            for (int j = 0 ; j <ans[i].length ; ++j){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
        int[][] ans2 = subsetsSumKCN(arr, 0,new int[0], 6);
        for (int i = 0 ; i < ans2.length ; ++i){
            for (int j = 0 ; j <ans2[i].length ; ++j){
                System.out.print(ans2[i][j]+" ");
            }
            System.out.println();
        }
        int[] arr2 = {1,4,2,3};
        int[][] ans3 = subsetsSumKHelper(arr2, 0, 5);
        for (int i = 0 ; i < ans3.length ; ++i){
            for (int j = 0 ; j <ans3[i].length ; ++j){
                System.out.print(ans3[i][j]+" ");
            }
            System.out.println();
        }
        int[][] ans4 = subsetsSumK(arr2, 0, 5);
        for (int i = 0 ; i < ans4.length ; ++i){
            for (int j = 0 ; j <ans4[i].length ; ++j){
                System.out.print(ans4[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println( " -------------------- ");


        int[][] ans5 = subsetsSumKOpt(arr2, 0, 5);
        for (int i = 0 ; i < ans5.length ; ++i){
            for (int j = 0 ; j <ans5[i].length ; ++j){
                System.out.print(ans5[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println( " -------------------- ");


        int[][] ans6 = subsetsSumKCNew(arr2, 0, new int[0], 5);
        for (int i = 0 ; i < ans6.length ; ++i){
            for (int j = 0 ; j <ans6[i].length ; ++j){
                System.out.print(ans6[i][j]+" ");
            }
            System.out.println();
        }

    }




    // converting the print subsetsSumK code to return by some modification
    public static int[][] subsetsSumK(int[] input, int beginIndex, int[] output, int k){
        if(beginIndex == input.length){
            if(k == 0){
                int[][] answer = new int[1][];
                answer[0] = output;
                return answer;
            }else{
                return new int[0][0];
            }
        }
        int[] newOutput = new int[output.length+1];
        int j = 0;
        for(; j < output.length; j++){
            newOutput[j] = output[j];
        }
        newOutput[j] = input[beginIndex];
        int[][] smallAns1 = subsetsSumK(input, beginIndex + 1, output, k);
        int[][] smallAns2 = subsetsSumK(input, beginIndex + 1, newOutput, k - input[beginIndex]);

        int[][] ans = new int[smallAns1.length+ smallAns2.length][];
        for (int i = 0 ; i < ans.length ; ++i){
            if (i< smallAns1.length){
                ans[i]= smallAns1[i];
            }else{
                ans[i]= smallAns2[i- smallAns1.length];
            }
        }
        return ans;
    }

    // converting my method of print subsets sum to k code to return code
    public static  void subsetsSumK(int[] input, int k){
        subsetsSumK(input,0,new int[0],k);
    }
    public static int[][] subsetsSumKCN (int[] input, int si, int[] outputSoFar, int k){
        // base case
        if (si == input.length){
            return new int[0][0];
        }

        // without input[si]
        int[][] smallAns1 = subsetsSumKCN(input,si +1,outputSoFar,k);
        int[][] smallAns2 = new int[0][0];

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
            smallAns2 = subsetsSumKCN(input,si+1,newOutputSoFar,k);
        }
        int[][] ans;
        if (sum==0){
            ans = new int[smallAns1.length+ 1][];
        } else{
            ans = new int[smallAns1.length+ smallAns2.length][];
        }

        for (int i = 0 ; i < ans.length ; ++i){
            if (i< smallAns1.length){
                ans[i]= smallAns1[i];
            }else if (sum<0){
                ans[i]= smallAns2[i- smallAns1.length];
            }else if (sum==0){
                ans[i]= newOutputSoFar;
            }
        }
        return ans;
    }

    // let's optimize the above method because
    // direct working with sum before passing the new output so far create to many complication
    // let's operate after it is passed
    public static int[][] subsetsSumKCNew (int[] input, int si, int[] outputSoFar, int k){

        int sum = 0;
        for (int i = 0 ; i < outputSoFar.length ; ++i){
            sum = sum + outputSoFar[i];
        }
        if (sum == k){
            int temp[][] = new int[1][];
            temp[0] = outputSoFar;
            return temp;
        }

        if (sum>k || si == input.length){
            return new int[0][0];
        }


        // without input[si]
        int[][] smallAns1 = subsetsSumKCNew(input,si +1,outputSoFar,k);

        // with input[si]

        int[] newOutputSoFar = new int[outputSoFar.length+1];
        for (int i = 0 ; i < newOutputSoFar.length ; ++i ) {
            if (i < outputSoFar.length) {
                newOutputSoFar[i] = outputSoFar[i];
            } else {
                newOutputSoFar[i] = input[si];
            }
        }

        int[][] smallAns2 =  subsetsSumKCNew(input,si +1,newOutputSoFar,k);

        int[][] ans = new int[smallAns1.length+ smallAns2.length][];

        for (int i = 0 ; i < ans.length ; ++i){
            if (i< smallAns1.length){
                ans[i]= smallAns1[i];
            }else{
                ans[i]= smallAns2[i- smallAns1.length];
            }
        }
        return ans;
    }

    // the solution by coding ninja
    public static int[][] subsetsSumKHelper(int[] input, int beginIndex, int k) {
        if (beginIndex == input.length) {
            if (k == 0) {
                return new int[1][0];
            } else {
                return new int[0][0];
            }
        }
        int[][] smallOutput1 = subsetsSumKHelper(input, beginIndex + 1, k);
        int[][] smallOutput2 = subsetsSumKHelper(input, beginIndex + 1, k - input[beginIndex]);
        int[][] output = new int[smallOutput1.length + smallOutput2.length][];
        System.out.println(smallOutput1.length +"   "+ smallOutput2.length);
        System.out.println(smallOutput1.length + smallOutput2.length);

        for (int i = 0; i < output.length; ++i) {
            if (i < smallOutput1.length) {
                output[i] = smallOutput1[i];
            } else {
                int[] temp = new int[smallOutput2[i- smallOutput1.length].length + 1];
                temp[0] = input[beginIndex];
                for (int j = 1; j < temp.length; ++j) {
                    temp[j] = smallOutput2[i - smallOutput1.length][j - 1];
                }
                output[i] = temp;
            }
        }
        return output;
    }

    // using the above method but not going to the end to check the values k,
    // and then we return the value depending on the value of k.
    //
    // if we find our k value become zero, then no need to go forward.
    // just create a jagged array containing the index responsible for making value of k = 0.
    //
    // if k is greater than 0, we will continue it to go forward in hope to achieve zero.
    //
    // if our k value is negative we dont do anything
    //
    public static int[][] subsetsSumK(int[] input , int si, int k){

        // base case
        if (si == input.length){
            return new int[0][0];
        }

        int[][] smallAns1 = subsetsSumK(input, si+1, k);
        int[][] smallAns2 = new int[0][0];

        if ((k - input[si])>0){
            smallAns2 = subsetsSumK(input, si +1,  k - input[si]);
        } else if ((k - input[si])==0) {
            smallAns2 = new int[1][];
            smallAns2[0] = new int[]{input[si]};
        }

        int[][] ans = new int[smallAns1.length+ smallAns2.length][];

        int index = 0;
        for (int i = 0 ; i < smallAns1.length ; i++){
            ans[index] = smallAns1[i];
            index++;
        }

        if ((k - input[si])>0){
            for (int i = 0 ; i < smallAns2.length ; ++i){
                ans[index] = new int[smallAns2[i].length+1];
                ans[index][0] = input[si];
                for (int j = 0 ; j < smallAns2[i].length ; ++j){
                    ans[index][j+1] = smallAns2[i][j];
                }
                index++;
            }
        } else if ((k - input[si])==0) {
            ans[index] = smallAns2[0];
        }

        return ans;


    }

    // let's optimize the above solution more
    // working with k- input[si]  complicates the solution
    public static int[][] subsetsSumKOpt(int[] input, int beginIndex, int k) {


        if (k==0){
            return new int[1][0];
        }
        if (k<0 || beginIndex == input.length) {
            return new int[0][0];
        }

        int[][] smallOutput1 = subsetsSumKOpt(input, beginIndex + 1, k);
        int[][] smallOutput2 = subsetsSumKOpt(input, beginIndex + 1, k - input[beginIndex]);
        int[][] output = new int[smallOutput1.length + smallOutput2.length][];


        for (int i = 0; i < output.length; ++i) {
            if (i < smallOutput1.length) {
                output[i] = smallOutput1[i];
            } else {
                int[] temp = new int[smallOutput2[i- smallOutput1.length].length + 1];
                temp[0] = input[beginIndex];
                System.out.println(temp[0]);
                for (int j = 1; j < temp.length; ++j) {
                    temp[j] = smallOutput2[i - smallOutput1.length][j - 1];
                }
                output[i] = temp;
            }
        }
        return output;
    }

}
