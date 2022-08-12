package lecture_plus_extra;

public class LinearSearch {

    // main function
    // we want to find out the time complexity of the linear search
    public static void main(String[] args) {
        // we want ot search for number 10 inside  the array 1 2 3 4 5 6 7 8

        int [] arra = {1,2,3,4,5,6,7,8};
        System.out.println(linearSearch(arra, 10));


    }

    public static boolean linearSearch (int[] arr , int element){
        for (int i = 0 ; i < arr.length ; ++i){
            if (arr[i]==element){
                return true;
            }
        }
        return false;

        // <<<<< Time Complexity >>>>>
        // the loop in the worst case runs for length of the array i.e. n
        //  k unit operation happen in one loop
        // TT = k * n
        // thus time complexity is O (n)


        // best case time complexity
        // O(1)
    }
}
