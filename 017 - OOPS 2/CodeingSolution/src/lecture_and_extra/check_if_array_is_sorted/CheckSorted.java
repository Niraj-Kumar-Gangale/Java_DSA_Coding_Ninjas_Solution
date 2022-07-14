package lecture_and_extra.check_if_array_is_sorted;

public class CheckSorted {

    // we have to check if the given array is sorted.

    // again same principle
    // 1] smaller problem
    /*
        let's say you have an array
        1 2 3 4 5
        now if the smaller array is sorted i.e. 2 3 4 5
        then we can use it to solve our bigger problem
     */
    // 2] solve bigger using the smaller
    /*
        >>>> if the Smaller Problem itself false then we can simply return FALSE
        if(!isSorted){
            return false;
        }
        >>>> if it's true then we have to check
        if(input[0]<input[1]{
            return true
        }
        else{
            return false
        }
     */
    // 3} base case
    /*
        >>>> if array length is less than 1 than you can return the false
     */

    // the checkSorted function
    public static boolean checkedSorted (int[] input){
        // base case
        if (input.length<=1){
            return true;
        }

        /*
        if i take the input.length < 1
        Exception will come
        ArrayIndexOutOfBoundsException
         */

        // creating a smaller problem
        int[] smallerInput = new int[input.length-1];


        int i = 1;

        for ( ; i < input.length ; ++i ){
            smallerInput[i-1]= input[i];
        }


        // If we have solution of smaller problem then we can give answer for the bigger problem
        boolean isSorted = checkedSorted(smallerInput);



        if (!isSorted){
            return false;
        }

        if (input[0]<input[1]){
            return true;
        }else{
            return false;
        }

    }


    // method 2
    // Well imagine a scenario in which array is >>>>> 11 2 3 4 5 6 7 8 9
    // after checking all the n-1 array element doing so much hard work
    // which wil ruined by arr[0] = 11;
    // so we made this method
    public static boolean checkSorted (int[] input ){
        // base case
        if (input.length <= 1){
            return true;
        }

        // processing
        if (input[0] > input[1]){
            return false;
        }

        // make a smaller problem
        int[] smallerInput = new int[input.length-1];


        int i = 1;

        for ( ; i < input.length ; ++i ){
            smallerInput[i-1]= input[i];
        }


        // If we have solution of smaller problem then we can give answer for the bigger problem
        boolean isSorted = checkedSorted(smallerInput);

        return isSorted;
    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,45,9};
        System.out.println(checkedSorted(arr));
        System.out.println(checkSorted(arr));
    }
}
