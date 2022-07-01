package Assignment;


import java.util.Arrays;

/**
 * Check Permutation
 * Send Feedback
 * For a given two strings, 'str1' and 'str2', check whether they are a permutation of each other or not.
 * Permutations of each other
 * Two strings are said to be a permutation of each other when either of the string's characters can be
 * rearranged so that it becomes identical to the other one.
 *
 * Example:
 * str1= "sinrtg"
 * str2 = "string"
 *
 * The character of the first string(str1) can be rearranged to form str2 and hence we can say that the
 * given strings are a permutation of each other.
 * Input Format:
 * The first line of input contains a string without any leading and trailing spaces,
 * representing the first string 'str1'.
 *
 * The second line of input contains a string without any leading and trailing spaces,
 * representing the second string 'str2'.
 * Note:
 * All the characters in the input strings would be in lower case.
 * Output Format:
 * The only line of output prints either 'true' or 'false', denoting whether the two strings
 * are a permutation of each other or not.
 *
 * You are not required to print anything. It has already been taken care of. Just implement the function.
 * Constraints:
 * 0 <= N <= 10^6
 * Where N is the length of the input string.
 *
 * Time Limit: 1 second
 * Sample Input 1:
 * abcde
 * baedc
 * Sample Output 1:
 * true
 * Sample Input 2:
 * abc
 * cbd
 * Sample Output 2:
 * false
 */


public class CheckPermutation {
    public static void main(String[] args) {
        String str1 = "race";
        String str2 = "rate";


        System.out.println();
        System.out.println(isPermutation(str1,str2));
    }
    public static boolean isPermutation(String str1, String str2) {
        //Your code goes here
        //----------------------------------MY METHOD---------------------------------
        // let consider the string values to have non-distinct character value.
        // 1 case show tle error
        /*
        if(str1.length() == str2.length()){
            int count = 0 ;
            StringBuffer strBuffer1 = new StringBuffer(str1);
            StringBuffer strBuffer2 = new StringBuffer(str2);
            for (int i = 0 ; i< strBuffer1.length() ; i++){
                for (int j = 0 ; j < strBuffer2.length() ; j++){
                    if (strBuffer1.charAt(i)==strBuffer2.charAt(j)){
                        count++;
                        //System.out.println("(strBuffer1.charAt(i) "+i+ "   "+ strBuffer1.charAt(i)+ " strBuffer2.charAt(j) "+j+ "   "+ strBuffer2.charAt(j));

                        strBuffer2.deleteCharAt(j);
                        break;
                    }
                }
            }
            return count==str1.length();
        }

        return false;

        */

        //--------------------------------------------CODING NINJA-----------------------------------

        // method by coding ninja 1st way
        // creating frequency array for both the String and then count the frequency
        // of the individual character inside the array
        // Now we will compare the value of both the array

        if(str1.length() == str2.length()){
            //frequency array for str1
            int[] arr1 = new int[256];
            Arrays.fill(arr1,0);
            // frequency array fro str2
            int[] arr2 = new int[256];
            Arrays.fill(arr2,0);


            for (int i = 0 ; i < str1.length() ;i++){
                arr1[str1.charAt(i)]++;
                arr2[str1.charAt(i)]++;
            }
            for (int i = 0 ; i < arr1.length ; ++i){
                System.out.print(arr1[i]);
            }
            System.out.println();
            for (int i = 0 ; i < arr1.length ; ++i){
                System.out.print(arr2[i]);
            }

            return Arrays.equals(arr1, arr2);
        }
        return false;


        // method by coding ninja 2nd way
        // we will use the above method, but we only use one frequency array
        // make it your self


    }

}
