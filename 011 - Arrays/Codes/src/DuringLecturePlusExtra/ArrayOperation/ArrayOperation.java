package DuringLecturePlusExtra.ArrayOperation;

public class ArrayOperation {
    public static void main(String[] args) {
        // We already know how to declare an array

        // method 1
        int[] firstArray = new int[]{1, 2, 3, 4, 5};

        // method 2
        int[] nor = {12,21,12,2};

        // the array indices ranges from [0 to (n-1)].
        // Here n is the count of total element in the array

        // If you try to access the element outside the range
        // java will through Exception ( i.e  ArrayIndexOutOfBoundException )
        // For Example;

        /*
         * firstArray[6]= 45;
         */



        // array can have different data type.

        // char / boolean
        char[] firstCharArray = new char[5];

        // Short / byte / long / int
        short[] firstShortArray = new short[5];

        // float / double
        double[] firstDoubleArray = new double[5];

        // String Array
        String[] firstStringArray = new String[5];

        // For Char And String default value is NULL

    }

}
