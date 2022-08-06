package assignment;

/**
 * Return Permutations - String
 * Send Feedback
 * Given a string S, find and return all the possible permutations of the input string.
 * Note 1 : The order of permutations is not important.
 * Note 2 : If original string contains duplicate characters, permutations will also be duplicates.
 * Input Format :
 * String S
 * Output Format :
 * All permutations (in different lines)
 * Sample Input :
 * abc
 * Sample Output :
 * abc
 * acb
 * bac
 * bca
 * cab
 * cba
 */


public class ReturnPermutationOfString {
    public static void main(String[] args) {

        // let's run the function returnPermutation
        String[] answer = returnPermutationOfString("abc");
        for (int i = 0 ; i < answer.length ; ++i){
            System.out.println(answer[i]);
        }
    }

    // The function for return permutation String
    // Method 2 same as one of the method given by coding ninja
    public static String[] returnPermutation(String input){
        // Base Case
        if (input.length()==0){
            return new String[]{""};
        }

        // Small ans
        String[] smallAns = returnPermutation(input.substring(1));

        // Solving the big using the small
        String[] ans = new String[smallAns.length*input.length()];

        int k = 0 ;
        // for loop to select the string values from smallAns
        for (int i = 0 ; i < smallAns.length ;++i){
            // for loop to do operation on the selected index value
            for (int j = 0 ; j < input.length() ; j++){
                ans[k] = smallAns[i].substring(0, j) + input.charAt(0) + smallAns[i].substring(j);
                k++;
            }
        }
        return ans;

    }

    // coding ninja solution for solving the question by method 2
    public static String[] permutationOfString(String input){
        if (input.length() == 0){
            String output[] = {""};
            return output;
        }
        String[] smallerOutput = permutationOfString(input.substring(1));

        String output[] = new String[input.length()*smallerOutput.length];
        int k =0;
        for(int i = 0; i < smallerOutput.length; i++){
            String currentString = smallerOutput[i];
            for(int j = 0; j <= currentString.length(); j++){
                output[k] = currentString.substring(0, j) + input.charAt(0) + currentString.substring(j);
                k++;
            }
        }
        return output;
    }

    // Method 1 to solve same question
    public static String[] returnPermutationOfString (String input){

        // base case
        if (input.length()==0){
            return new String[]{""};
        }

        // factorial value
        int factorialValue = 1;
        for (int i = 1 ; i <= input.length() ; ++i){
            factorialValue = factorialValue * i;
        }

        // answer
        String[] ans = new String[factorialValue];
        int k = 0 ;

        // for loop
        for (int j = 0 ; j < input.length() ; j++){
            String smallInput = input.substring(0,j) + input.substring(j+1);
            String[] smallAns = returnPermutationOfString(smallInput);
            for (int i = 0 ; i < smallAns.length ; ++i){
                ans[k] = input.charAt(j)+ smallAns[i];
                k++;
            }
        }
        return ans;
    }
}
