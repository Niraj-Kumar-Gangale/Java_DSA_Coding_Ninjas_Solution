import stack_using_linked_list.StackUsingLLGeneric;

import java.util.Stack;

/**
 * Code : Balanced Parenthesis
 * Send Feedback
 * For a given a string expression containing only round brackets or parentheses, check if they are balanced or not. Brackets are said to be balanced if the bracket which opens last, closes first.
 * Example:
 * Expression: (()())
 * Since all the opening brackets have their corresponding closing brackets, we say it is balanced and hence the output will be, 'true'.
 * You need to return a boolean value indicating whether the expression is balanced or not.
 * Note:
 * The input expression will not contain spaces in between.
 * Input Format:
 * The first and the only line of input contains a string expression without any spaces in between.
 *  Output Format:
 * The only line of output prints 'true' or 'false'.
 * Note:
 * You don't have to print anything explicitly. It has been taken care of. Just implement the function.
 * Constraints:
 * 1 <= N <= 10^7
 *  Where N is the length of the expression.
 *
 * Time Limit: 1sec
 * Sample Input 1 :
 * (()()())
 * Sample Output 1 :
 * true
 * Sample Input 2 :
 * ()()(()
 * Sample Output 2 :
 * false
 * Explanation to Sample Input 2:
 * The initial two pairs of brackets are balanced.
 * But when you see, the opening bracket at the fourth index doesn't have its corresponding closing
 * bracket which makes it imbalanced and in turn, making the whole expression imbalanced.
 * Hence the output prints 'false'.
 */
public class BalancedParenthesis {

    // Work for the parenthesis
    // example ())()()
    // time complexity -> O(N)
    // space complexity -> O(N)
    public static boolean isBalanced(String expression) {
        //Your code goes here
        if (expression.length()==0){
            return true;
        }
        if (expression.length()%2!= 0){
            return false;
        }
        // stack to store the open parenthesis
        Stack<Character> newStack = new Stack<>();
        for (int i = 0 ; i < expression.length() ; i++){
            if (expression.charAt(i)== '('){
                newStack.push(expression.charAt(i));
            }
            else{
                if (newStack.size()==0){
                    return false;
                }
                newStack.pop();
            }
        }

        return newStack.size()==0;
    }

    // work for equation that include parenthesis
    // (a+b)+c+(f+y)
    // time complexity -> O(N)
    // space complexity -> O(N)
    public static boolean isBalanced2(String expression) {
        //Your code goes here
        if (expression.length()==0){
            return true;
        }

        // stack to store the open parenthesis
        Stack<Character> newStack = new Stack<>();
        for (int i = 0 ; i < expression.length() ; i++){
            if (expression.charAt(i)== '('){
                newStack.push(expression.charAt(i));
            } else if(expression.charAt(i)== ')'){
                if (newStack.size()==0){
                    return false;
                }
                newStack.pop();
            }
        }

        return newStack.size()==0;
    }

    // Work for equation that include the
    // parenthesis and bracket in equation
    // time complexity -> O(N)
    // space complexity -> O(N)
    public static boolean isBalanced3(String expression) {
        //Your code goes here
        if (expression.length()==0){
            return true;
        }

        // stack to store the open parenthesis
        Stack<Character> newStack = new Stack<>();
        for (int i = 0 ; i < expression.length() ; i++){
            if (expression.charAt(i)== '(' || expression.charAt(i)== '['){
                newStack.push(expression.charAt(i));
            } else if(expression.charAt(i)== ')' ){
                if (newStack.size()==0){
                    return false;
                }
                char newCha = newStack.pop();
                if (newCha != '('){
                    return false;
                }
            }else if(expression.charAt(i)== ']'){
                if (newStack.size()==0){
                    return false;
                }
                char newCha = newStack.pop();
                if (newCha != '['){
                    return false;
                }
            }
        }

        return newStack.size()==0;
    }

    // Work for equation that include the
    // parenthesis, curly bracket and brackets in equation
    // time complexity -> O(N)
    // space complexity -> O(N)
    public static boolean isBalanced4(String expression) {
        //Your code goes here
        if (expression.length()==0){
            return true;
        }

        // stack to store the open parenthesis
        Stack<Character> newStack = new Stack<>();
        for (int i = 0 ; i < expression.length() ; i++){
            if (expression.charAt(i)== '(' || expression.charAt(i)== '[' || expression.charAt(i)== '{'){
                newStack.push(expression.charAt(i));
            } else if(expression.charAt(i)== ')' ){
                if (newStack.size()==0){
                    return false;
                }
                char newCha = newStack.pop();
                if (newCha != '('){
                    return false;
                }
            }else if(expression.charAt(i)== ']'){
                if (newStack.size()==0){
                    return false;
                }
                char newCha = newStack.pop();
                if (newCha != '['){
                    return false;
                }
            }
            else if(expression.charAt(i)== '}'){
                if (newStack.size()==0){
                    return false;
                }
                char newCha = newStack.pop();
                if (newCha != '{'){
                    return false;
                }
            }
        }

        return newStack.size()==0;
    }

    // coding ninjas solution
    // time complexity -> O(N)
    // space complexity -> O(N)
    public static boolean isBalanced5(String expression) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == '(') {
                stack.push(expression.charAt(i));
            } else if (expression.charAt(i) == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                char topChar = stack.pop();
                if (expression.charAt(i) == ')' && topChar == '(') {
                    continue;
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String firstString = "()()()";
        String secString = "(a+b+(c+f))";
        String thirdString = "[[()(a+b)()()]]";
        System.out.println(isBalanced(firstString));
        System.out.println(isBalanced2(secString));
        System.out.println(isBalanced3(thirdString));
    }
}
