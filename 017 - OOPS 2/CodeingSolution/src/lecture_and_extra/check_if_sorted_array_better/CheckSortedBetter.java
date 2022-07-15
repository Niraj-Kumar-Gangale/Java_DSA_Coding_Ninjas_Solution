package lecture_and_extra.check_if_sorted_array_better;

public class CheckSortedBetter {

    // if you have previously solved the checkSorted question before
    // than you have noticed tht at every recursion step we make a new array
    // and use a lot of space now we want to avoid that we can do it
    // by limiting the range of operation inside the array
    // thus saving space and energy

    // so as we did earlier
    // arr = {1 2 3 4 5 6 7}
    // smallArr= { 2 3  4 5 6 7 }

    // we will declare a starting index and every recursion we will change the value of the starting index
    // thus limiting the range of operation of the array
    // thus obtaining the similar effect to making a smaller array


    // using m1 approach (general) 123
    public static boolean checkSortedBetter (int[] input, int startIndex){
        //base case
        if (startIndex == input.length-1){
            return true;
        }

        // smaller problem
        boolean smallArray = checkSortedBetter(input, startIndex + 1);

        // solving big using small
        if (!smallArray){
            return false;
        }
        return input[startIndex] <= input[startIndex+1];
    }

    // using the m2 approach (optimized)   132
    public static boolean checkSortedBetter_2 (int[] input, int startIndex){
        //base case
        if (startIndex == input.length-1){
            return true;
        }

        // processing
        if (input[startIndex] > input[startIndex+1]){
            return false;
        }

        // smaller problem
        return checkSortedBetter_2(input, startIndex + 1);
    }



    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,9};
        System.out.println(checkSortedBetter(arr,0));
        System.out.println(checkSortedBetter_2(arr,0));
    }
}
