package LecturePLusExtra.CheckPalindromeHint;


import java.util.Scanner;

public class Code {
    public static void main(String[] args) {
        // let's check for palindrome
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println("The input is palindrome ? " + isPalindrome(str));
    }
    public static boolean isPalindrome(String str){
        /*

        String temp = "";
        for (int i = 0 ; i < str.length() ; i++){
            temp = str.charAt(i) + temp;
        }
        System.out.println(temp);
        return temp.equals(str);

         */

        // Method 2
        for (int i = 0 ; i < str.length()/2 ; i++){
            if (str.charAt(i)!=str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}
