package lecture_and_extra;

public class CheckNumbersInArray {

    // using the general rule we developed for the recursion

    // 1] smaller problem
    // let's say we have an array  1 3 5 9 4 6
    // if we find the Element X in the section  of smallArray 3 5 9 4 6
    // we can use it to solve the bigger problem

    // 2] solve big using the small
    // if we find x in the smaller section then we will return true
    // if not then we will check if the input[0] value is equal to the Element x
    // depending upon that we will return the value

    // 3] basecase
    // for the case in which the length of the array is 1 we will check if
    // input[0]==x
    // and depending upon that we wil return the value


    // the function for the check the number in the array
    // my method
    public static boolean checkNumber(int[] input , int x){
        //base case
        if (input.length == 1){
            return input[0]==x;
        }

        // making the smaller problem

        int[] smallInput = new int[input.length-1];
        for (int i= 1 ; i < input.length ; ++i){
            smallInput[i-1]= input[i];
        }

        // using the small we will try to solve the problem
        boolean isPresent = checkNumber(smallInput, x);

        if (!isPresent){
            return x == input[0];
        }else {
            return true;
        }

    }

    // using the similar method we used in  the question check if the array is sorted
    public static boolean checkNumber_2 (int[] input , int x ){

        // base case
        if (input.length==1){
            return x==input[0];
        }

        // processing
        if (x==input[0]){
            return true;
        }

        // make a smaller problem
        int[] smallInput =  new int[input.length-1];
        for (int i = 1 ; i < input.length ; ++i){
            smallInput[i-1]= input[i];
        }

        //solve big  using the small

        return checkNumber(smallInput,x);
    }



    // we have coding ninja solution also
    /*

    public static boolean checkNumber(int input[], int x, int startIndex) {
        if(startIndex == input.length) {
            return false;
        }
        if(input[startIndex] == x) {
            return true;
        }
        return checkNumber(input, x, startIndex + 1);
    }

    public static boolean checkNumber(int input[], int x) {
        return checkNumber(input, x, 0);
    }

     */

    // CheckNumberInArray better version that saves Space
    public static boolean checkNumberBetter (int[] input,int x, int startIndex) {

            if(startIndex == input.length-1) {
                return x==input[startIndex];
            }
            if(input[startIndex] == x) {
                return true;
            }
            return checkNumberBetter(input, x, startIndex + 1);

    }

    // our main function
    public static void main(String[] args) {
        int[] arr = {21 ,22 ,46 ,12 ,61 ,21, 33, 16, 99, 96 };
        System.out.println(checkNumber(arr, 46));
        System.out.println(checkNumber_2(arr, 46));
        System.out.println(checkNumberBetter(arr, 12,0));
    }
}
