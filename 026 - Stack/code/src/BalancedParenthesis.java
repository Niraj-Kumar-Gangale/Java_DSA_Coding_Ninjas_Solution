import stack_using_linked_list.StackUsingLLGeneric;

import java.util.Stack;

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
