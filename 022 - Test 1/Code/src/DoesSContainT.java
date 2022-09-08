/**
 * Does s contain t ?
 * Send Feedback
 * Given two string s and t, write a function to check if s contains all characters of t (in the same order as they are in string t).
 * Return true or false.
 * Do it recursively.
 * E.g. : s = “abchjsgsuohhdhyrikkknddg” contains all characters of t=”coding” in the same order. So function will return true.
 * Input Format :
 * Line 1 : String s
 * Line 2 : String t
 * Output Format :
 * true or false
 * Sample Input 1 :
 * abchjsgsuohhdhyrikkknddg
 * coding
 * Sample Output 1 :
 * true
 * Sample Input 2 :
 * abcde
 * aeb
 * Sample Output 2 :
 * false
 */

public class DoesSContainT {

    public static void main(String[] args) {

        String  a = "abchjsgsuohhdhyrikkknddg";
        String b = "coding";
        System.out.println(checkSequence2(a,b));
//        System.out.println((b.substring(6).length()));
    }

    // -------------- Method 1 --------------
    // >>>>> Non Recursive <<<<<
    public static boolean checkSequence(String a, String b) {

        int i = 0 ;
        int j = 0 ;

        for (; i < b.length() ; i++){
            boolean isCharPresent = false;
            for (; j < a.length() ; j++){
                if (b.charAt(i)==a.charAt(j)){
                    isCharPresent = true;
                    j++;
                    break;
                }
            }

            if (!isCharPresent){
                return false;
            }

        }

        return true;

    }
    // -------------- Method 2 --------------
    // >>>>> Recursive <<<<<
    public static boolean checkSequence2 (String a , String b){
        // base case
        if ((b.length()==0)){
            return true;
        }
        if (a.length() == 0){
            return false;
        }

        boolean isCharPresent = false;
        char firstChar = b.charAt(0);
        int j = 0;
        for (; j < a.length() ; j++){
            if (firstChar==a.charAt(j)){
                isCharPresent = true;
                j++;
                break;
            }
        }

        return checkSequence2(a.substring(j), b.substring(1));
    }

    // Answer by coding ninja
    public static boolean checkSequenceCN(String a, String b) {
        if(b.length() == 0) {
            return true;
        }

        if(a.length() == 0) {
            return false;
        }

        if(a.charAt(0) == b.charAt(0)) {
            return checkSequenceCN(a.substring(1), b.substring(1));
        } else {
            return checkSequenceCN(a.substring(1), b);
        }
    }
}
