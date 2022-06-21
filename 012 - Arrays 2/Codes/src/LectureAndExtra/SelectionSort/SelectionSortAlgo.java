package LectureAndExtra.SelectionSort;

public class SelectionSortAlgo {
    public static void main(String[] args) {
        // no code only theory
        int[] arr = {1, 5, 8, 6, 44, 9};
        selectionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void selectionSort(int[] arr) {
        //Your code goes here
        // Two for loop required

        // pick up the index starting from zero
        for (int i = 0; i < arr.length - 1; i++) {
            int min = arr[i];
            int minIndex = i;
            // compare the min value with rest of the array index ( i.e 1+1 ) to find minimum
            for (int j = i + 1; j < arr.length; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    minIndex = j;
                }
            }
            arr[minIndex] = arr[i];
            arr[i] = min;
        }
    }
}
