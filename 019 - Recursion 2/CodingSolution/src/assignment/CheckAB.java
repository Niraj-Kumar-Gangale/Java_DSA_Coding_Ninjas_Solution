package assignment;

public class CheckAB {
    // my solution works for the "abbbb" input and return true which is wrong
    // my solution work for
    // a----->a
    // a----->bb
    // and
    // bb---->a
    // bb---->bb
    public static boolean checkAB(String input, int startIndex) {

        // base case
        if (startIndex==input.length()){
            return true;
        }

        if (startIndex==0&&input.charAt(startIndex)!='a'){
            return false;
        }
        System.out.println(startIndex);


        if (input.charAt(startIndex)=='a'){
            return checkAB(input,startIndex+1);
        }else if ((input.length()-startIndex)>1&&input.substring(startIndex, startIndex + 2).equals("bb")){
            return checkAB(input,startIndex+2);
        }else{
            return false;
        }


    }

    public static boolean checkAB(String input) {
        // Write your code here
        return checkAB(input,0);

    }

    // this is the correct solution
    // this solution work for
    // a----->a
    // a----->bb
    // and
    // bb---->a

    public static boolean checkABCorrect(String str) {
            if(str.length() == 0){
                return true;
            }

            if(str.charAt(0) == 'a') {
                if(str.substring(1).length() > 1 && str.substring(1, 3).equals("bb")) {
                    return checkABCorrect(str.substring(3));
                } else {
                    return checkABCorrect(str.substring(1));
                }
            }

            return false;
    }


    public static void main(String[] args) {
        String str = "abbb";
        System.out.println(checkAB(str));


    }
}
