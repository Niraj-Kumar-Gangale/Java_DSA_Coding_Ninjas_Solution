package lecture_plus_extra;

public class BubbleSort {

    // main
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 4, 6, 7};
        bubbleSort(arr);
        for (int i = 0; i < arr.length; ++i) {
            System.out.println(arr[i]);
        }
    }

    private static void bubbleSort(int[] arr) {
//        for (int i = 0; i < arr.length-1 ; ++i){
//            for (int  j = 0 ; j < arr.length-1-i ; ++j){
//                if (arr[j]>arr[j+1]){
//                   // swap
//                   int temp = arr[j];
//                   arr[j] = arr[j+1];
//                   arr[j+1] = temp;
//                }
//            }
//        }

        // <<<<< Time Complexity >>>>>
        // the loop in the worst case runs for ((n)(n-1)) / 2
        // k unit operation for every time inner for loop run
        // TT = k * ((n)(n-1)) / 2
        // Time Complexity  O(n^2)

        // in the best case for above algorithm is O(n^2)

        // you need to modify the algo to have best case time complexity of O (n)

        for (int i = 0; i < arr.length - 1; ++i) {
            boolean isSwapped = false;
            for (int j = 0; j < arr.length - 1 - i; ++j) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSwapped = true;

                }
            }
            if (!isSwapped) {
                break;
            }
        }

        // for above algo
        // for best case = O(n)
        // for worst case = O(n^2)

    }
}
