package LecturePLusExtra.HowStringAreStored;

public class Code {
    public static void main(String[] args) {
        // String is non-primitive type
        // there are two type of memory in java
        // 1] Stack
        // 2] Heap
        // Stack ->> Stores the primitive type and local variable and function call and reference variable
        // Heap ->> stores the values of reference variable for example
        // ### when you define array
        // ### the reference variable is stored stack the >>>> arr = @address value
        // ### the reference value is stored in the Heap that is >>>>> [1,2,3,4,5,6,4]

        // For String data type we have String pool inside the Heap for
        // Data type defined in this manner
        // String str = "Hello World";
        String str = "Hello World";
        String str1 = "Hello World";
        // both str and str1  both refer to same value inside String pool

        // But When you define by using new key world
        // the value defined will be outside the string pool
        // String str3 = new String( "Hello World" );
        String str3 = new String("Hello World");
        String str4 = new String("Hello World");

        System.out.println(str3==str4);
    }
}
