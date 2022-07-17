package assignment_recursion_1;

/**
 * Remove X
 * Send Feedback
 * Given a string, compute recursively a new string where all 'x' chars have been removed.
 * Input format :
 * String S
 * Output format :
 * Modified String
 * Constraints :
 * 1 <= |S| <= 10^3
 * where |S| represents the length of string S.
 * Sample Input 1 :
 * xaxb
 * Sample Output 1:
 * ab
 * Sample Input 2 :
 * abc
 * Sample Output 2:
 * abc
 * Sample Input 3 :
 * xx
 * Sample Output 3:
 */
public class RemoveX {

    // solving using the general approach of recursion method 1 (123)
    public static String removeX(String input){
        // Write your code here

         if (input.length()==0) {
             return "";
         }
         String small = removeX(input.substring(1));
         if (input.charAt(0)=='x'){
             return small;
         }else{
             return input.charAt(0)+small;
         }
    }

    // solving using the method 2 (132)
    public static String removeX2(String input){
        if(input.length() == 0){
            return "";
        }
        if(input.charAt(0) == 'x'){
            return removeX2(input.substring(1));
        }
        return input.charAt(0) + removeX2(input.substring(1));
    }

    // Solving using the helper function
    public static String removeX3(String input, String ans){
        // Write your code here
        if (input.length()==0) {
            return ans;
        }
        if (input.charAt(0)!='x'){
            ans = ans + input.charAt(0);
        }
        return  removeX3(input.substring(1),ans);

    }


    public static void main(String[] args) {

        System.out.println(removeX("NxIxRxAxJ"));
        System.out.println(removeX2("NxIxRxAxJ"));
        System.out.println(removeX3("NxIxRxAxJ",""));
    }
}
