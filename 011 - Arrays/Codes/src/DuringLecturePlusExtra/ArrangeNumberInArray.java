package DuringLecturePlusExtra;

public class ArrangeNumberInArray {
    public static void main(String[] args) {

        int[] arr = new int[8];
        arrange(arr, 8);
    }


    public static void arrange(int[] arr, int n) {

        // brute force method
        //------------------------------------------------------------------
        // transverse through the array and check if (i+1) is even or odd
        // if odd start printing from the left hand.
        // if even start printing from the right hand.

        int right = n - 1;
        int left = 0;
        for (int i = 0; i < n; i++) {
            // check if (i+1) is even or odd
            if ((i + 1) % 2 == 1) {
                // odd, then print from right-hand side
                arr[left] = i + 1;
                left++;
            } else {
                arr[right] = i + 1;
                right--;
            }
        }
        printArray(arr);
        //-----------------------------------------------------------

        // Optimized solution

        /*

        // transverse from [1 to n-1]
        // look for even and odd
        // allocate  them in  the array according to the condition
        int right = n-1;
        int left = 0;
        for(int i = 1 ; i<=n ; i++){
            // check if (i+1) is even or odd
            if(i%2==1){
                // odd, then print from right-hand side
                arr[left]= i;
                left++;
            }else{
                // even, then print from left-hand Side.
                arr[right]= i;
                right--;
            }
        }
        printArray(arr);

         */

        /*

        // Coding Ninja solution

        public class Solution {

            public static void arrange(int[] arr, int n) {
                int left = 0;
                int right = n - 1;
                int counter = 1;

                while (left <= right) {

                    if (counter % 2 == 1) {
                        arr[left] = counter;
                        counter += 1;
                        left += 1;
                    } else {
                        arr[right] = counter;
                        counter += 1;
                        right -= 1;
                    }
                }
            }
        }
        */


    }

    // print the array
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
