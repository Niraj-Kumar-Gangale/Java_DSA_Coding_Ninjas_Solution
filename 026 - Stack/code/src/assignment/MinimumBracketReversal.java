package assignment;
import java.util.Stack;
/**
 * Minimum bracket Reversal
 * Send Feedback
 * For a given expression in the form of a string, find the minimum number of brackets that can be reversed in order to make the expression balanced. The expression will only contain curly brackets.
 * If the expression can't be balanced, return -1.
 * Example:
 * Expression: {{{{
 * If we reverse the second and the fourth opening brackets,
 * the whole expression will get balanced. Since we have to reverse two brackets to make the expression balanced, the expected output will be 2.
 *
 * Expression: {{{
 * In this example, even if we reverse the last opening bracket,
 * we would be left with the first opening bracket and hence will not be able to make the expression balanced and the output will be -1.
 * Input Format :
 * The first and the only line of input contains a string expression,
 * without any spaces in between.
 * Output Format :
 * The only line of output will print the number of reversals required to
 * balance the whole expression. Prints -1, otherwise.
 * Note:
 * You don't have to print anything. It has already been taken care of.
 * Constraints:
 * 0 <= N <= 10^6
 * Where N is the length of the expression.
 *
 * Time Limit: 1sec
 * Sample Input 1:
 * {{{
 * Sample Output 1:
 * -1
 * Sample Input 2:
 * {{{{}}
 * Sample Output 2:
 * 1
 */

public class MinimumBracketReversal {


    // my solution
    // time complexity -> O(N)
    // space complexity -> O(N)
    public static int countBracketReversals1(String input) {
        //Your code goes here
        // if string length is zero
        if (input.length() == 0){
            return 0;
        }
        if (input.length()%2 != 0){
            return -1;
        }
        Stack<Character> stack1 = new Stack<>();
         Stack<Character> stack2 = new Stack<>();
        for (int i = 0 ; i < input.length() ; i++){

            if (input.charAt(i) == '{'){
                stack1.push('{');
            }else{
                if (stack1.size() == 0){
                    stack2.push('}');
                }else{
                    stack1.pop();
                }
            }
        }


         int sizeOfStack1 = stack1.size();
         int sizeOfStack2 = stack2.size();

         int possibleReversal =(sizeOfStack1+sizeOfStack2)/2;

         if ((sizeOfStack1*sizeOfStack2)%2 != 0){
             return possibleReversal+1;
         }else{
             return possibleReversal;
         }

    }

    // coding ninja solution
    // Time complexity -> O(M)
    // Space complexity -> O(M)
    public static int countBracketReversals2(String input) {
        //Your code goes here
        // if string length is zero
        if (input.length() == 0){
            return 0;
        }
        if (input.length()%2 != 0){
            return -1;
        }
        Stack<Character> stack1 = new Stack<>();

        for (int i = 0 ; i < input.length() ; i++){

            if (input.charAt(i) == '{'){
                stack1.push('{');
            }else{
                if (stack1.size() == 0){
                    // store in stack 2
                    stack1.push('}');
                }else{
                    char temp = stack1.peek();
                    if (temp == '{'){
                        stack1.pop();
                    }else{
                        stack1.push('}');
                    }
                }
            }
        }
        int count = 0;

        while(!stack1.isEmpty()){
            char c1 = stack1.pop();
            char c2 = stack1.pop();
            if (c1==c2){
                count++;
            }else{
                count+=2;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        String str = "{}{}{}{}{}}}";
        System.out.println(countBracketReversals1(str));
        System.out.println(countBracketReversals2(str));
    }


}
