package lecture_plus_extra;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {1,5,6,4,7,8,9};
        selectionSort(arr);
        for (int i = 0 ; i < arr.length ; ++i){
            System.out.println(arr[i]);
        }
    }

    private static void selectionSort(int[] arr) {
        for (int i = 0 ; i < arr.length -1 ; ++i){
            for (int j = i+1 ; j < arr.length ; ++j){
                if (arr[i] > arr[j]){
                    // swap
                    int temp = arr[i];
                    arr[i] = arr [j];
                    arr[j] = temp;
                }
            }
        }

        // <<<<< Time Complexity >>>>>
        // the loop in the worst case runs for ((n)(n-1)) / 2
        // k unit operation for every time inner for loop run
        // TT = k * ((n)(n-1)) / 2
        // Time Complexity  O(n^2)

        // for the best case
        // time complexity is O(n^2)
    }

}
