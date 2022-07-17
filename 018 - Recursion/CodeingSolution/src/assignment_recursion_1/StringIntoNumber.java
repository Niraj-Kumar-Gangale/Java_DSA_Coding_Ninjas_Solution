package assignment_recursion_1;

public class StringIntoNumber {

    public static void main(String[] args) {

        System.out.println(convertStringToInteger("1"));




//        String str = "12345";
//        char number =  str.charAt(0);
//
//        System.out.println(number);
//        int  num = Character.getNumericValue(str.charAt(0));
//        int  num1 = Integer.parseInt(String.valueOf(str.charAt(0)));
//        String str1 = "00001236";
//        System.out.println(Integer.valueOf(str1));

    }


    public static int convertStringToInt(String input){
        // Write your code here
        int num = Integer.parseInt(input);
        String str = ""+num;
        return convertStringToInt2(str);
    }

    // solving using the helper function
    private static int convertStringToInt2(String str) {

        // base case
        if (str.length() ==0){
            return 0;
        }

        //calculation
        int small = convertStringToInt2(str.substring(1));


        return Character.getNumericValue(str.charAt(0))*(int)Math.pow(10,str.length()-1)+ small;
    }

    // solving using the coding ninja hint
    // 1] first your base case is wrong in helper function
    /*

     */
    // 2] you don't have to worry about such case 00002313
    /*

     */
    public static int convertStringToIntCn(String str) {

        // base case
        if (str.length() ==1){
            int b = str.charAt(0);
            b = b-48;
            return b;
        }

        //calculation
        int small = convertStringToInt(str.substring(1));


        return Character.getNumericValue(str.charAt(0))*(int)Math.pow(10,str.length()-1)+ small;
    }

    // solving backward because hint is given by coding ninja that it is  possible
    // so let's try it out

    public static int convertStringToInteger(String input){
        // here in this question we do in a backward manner
        // i.e.  num = 6549;
        // we will let the recursion handle the 654 part
        // and we will handle the                9 part

        //base case
        if (input.length()==1){
            return input.charAt(0)-'0';
        }

        // the recursion part
        int smallAns = convertStringToInteger(input.substring(0,input.length()-1));

        // The part 'we'
        int lastDigit = input.charAt(input.length()-1)-'0';

        // Using the recursion we solve the whole question
        return smallAns*10 + lastDigit;


    }

}
