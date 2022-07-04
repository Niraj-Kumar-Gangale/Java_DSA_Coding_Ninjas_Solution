package TestQuestion;

/**
 * Leaders in array
 * Send Feedback
 * Given an integer array A of size n. Find and print all the leaders present in the input array. An array element A[i] is called Leader, if all the elements following it (i.e. present at its right) are less than or equal to A[i].
 * Print all the leader elements separated by space and in the same order they are present in the input array.
 *
 * Input Format :
 * Line 1 : Integer n, size of array
 * Line 2 : Array A elements (separated by space)
 *
 * Output Format :
 *  leaders of array (separated by space)
 *
 * Constraints :
 * 1 <= n <= 10^6
 *
 * Sample Input 1 :
 * 6
 * 3 12 34 2 0 -1
 * Sample Output 1 :
 * 34 2 0 -1
 *
 * Sample Input 2 :
 * 5
 * 13 17 5 4 6
 * Sample Output 2 :
 * 17 6
 */

public class LeaderInArray {

    public static void main(String[] args) {
        int [] arr = {15,17,5,4,5,6};
        leaders(arr);
    }




    public static void leaders(int[] input) {
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Print output and don't return it.
         * Taking input is handled automatically.
         */

        // let's use nested for loop //
        // time complexity O(N^2)
        for (int i = 0 ; i < input.length ; i++){
            int j = i;
            for ( ; j <input.length ; ++j ){
                if (input[j] > input[i]){
                    break;
                }
            }
            if (j==input.length){
                System.out.print(input[i]+" ");
            }

        }

        // Coding ninja solution
        // time complexity is O(N)

        int j = 0 ;
        int[] temp = new int[input.length];
        int largest = Integer.MIN_VALUE;
        for (int i = input.length-1 ; i >= 0 ; i--){

            if(input[i] >= largest){
                temp[j]=input[i];
                j++;
                largest = input[i];
            }
        }

        while(j>0){
            System.out.print(temp[j-1]+" ");
            j--;
        }

        //Start in reverse order save all the values greater than the last checked valu
        //then print in the reverse order
        //-----------------------------------------------------------------------------
        /*
        int j=0;
        int *save = new int[len];
        int largest=INT_MIN; //largest contains the maximum value of leading array.
        for(int i=len-1;i>=0;i--)
        {
            if(arr[i]>=largest) // if element at current index is greater than largest then put it in array and make ot largest;
            {
                save[j]=arr[i];
                j++;
                largest=arr[i];
            }
        }
        for(int i=j-1;i>=0;i--) // Print the array in reverse order...
        {
            cout<<save[i] << " ";
        }

         */
        //-----------------------------------------------------------------------------


    }
}
