package DuringLecturePlusExtra;

public class ReturnArraySum {

    // function to sum the elements of array
    public static int sum(int[] arr) {
        //Your code goes here

        int sum = 0;
        for(int i = 0 ; i< arr.length ;i ++){
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        System.out.println(sum(array));
    }


}
