package assignment_recursion_1;

/**
 * Replace pi (recursive)
 * Send Feedback
 * Given a string, compute recursively a new string where all appearances of "pi" have been replaced by "3.14".
 * Constraints :
 * 1 <= |S| <= 50
 * where |S| represents the length of string S.
 * Sample Input 1 :
 * xpix
 * Sample Output :
 * x3.14x
 * Sample Input 2 :
 * pipi
 * Sample Output :
 * 3.143.14
 * Sample Input 3 :
 * pip
 * Sample Output :
 * 3.14p
 * Constraints:-
 * 1<=|S|<=50
 */

public class ReplacePi {

    public static void main(String[] args) {
        String str = "xpixpixxpi";
        System.out.println(replaceBrut(str));
        System.out.println(replace(str));
        System.out.println(replace2(str));


    }

    // solving the question without recursion
    public static String replaceBrut(String input){
        // Write your code here
        String ans = "";
        int n = input.length();

        for (int i = 0 ; i < n ; ++i){

            if((i+2)<=n&& input.substring(i, i + 2).equals("pi")){
                ans = ans + "3.14";
                i++;
            }else{
                ans = ans + input.charAt(i);
            }

        }

        return ans;

    }

    public static String replace(String input){

        // base case
        if (input.length()<=1){

            return input;
        }

        // calculation / processing / condition check

        if (input.substring(0,2).equals("pi")){

            return 3.14+replace(input.substring(2));
        }else{

            return input.charAt(0)+replace(input.substring(1));
        }
    }

    // coding ninja solution
    public static String replace2(String input){
        String output;
        if(input.length() <= 1){
            return input;
        }
        String small = replace2(input.substring(1));
        if(input.charAt(0) == 'p' && small.charAt(0) == 'i') {
            output = "3.14" + small.substring(1);
        }
        else {
            output = input.charAt(0) + small;
        }
        return output;
    }
}
