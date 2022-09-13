package Generic.generic_method;

import interfaces.Vehicle;

/**
 * let's make a generic method
 */
public class GeneticStaticMethod {

    // let's make a generic method to print the array elements for different
    // array type i.e. array with int elements or double array or String array

    /**
     * Generic function to print the array element of different datatype.
     * @param array contain the reference of the array
     */
    public static <T> void printArray(T[] array){
        for (T t : array) {
            System.out.println(t);
        }
    }

    /**
     *  New Generic function to handle The vehicle class.
     * But this can only handle the Vehicle Class and it's subclasses.
     * @param array reference to the input array
     */
    public static <T extends Vehicle> void printArray2 (T[] array){
        for (T t : array) {
            t.print();
        }

    }

    /**
     * Works for every class that implements the PrintInterface
     * Now range is <b>increased</b>
     */
    public static <T extends PrintInterface> void printArray3 (T[] array){
        for (T t : array) {
            t.print();
        }

    }

    /**
     * main function of the array
     */
    public static void main(String[] args) {
        // for generic method you have use object-oriented approach
        // i.e. non-primitive data type
        // for primitive data type it will not work
        Integer[] a = new Integer[]{1,5,7,9};
        printArray(a);
        String[] b = new String[]{"s","d","f","f"};
        printArray(b);

        // it will also work for the vehicle class
        // the below is the Vehicle array which will contain the vehicle object reference in
        // the future currently they are empty
        Vehicle[] vh = new Vehicle[10];

        System.out.println(vh[2]); // null output

        for (int i = 0 ; i < vh.length ; i++){
            vh[i] =  new Vehicle(12+i);
        }

        printArray(vh);  // it just prints the address of the object present in the array.
        // but we don't want that. we want to print the values of data member in the vehicle object
        // for that we have to change the earlier generic method

        printArray2(vh);  // works well with the new generic but it' restricted to the vehicle subclasses


        // with this new method you can get a solution which is in the middle
        // define a new printInterface
        // make the Vehicle implements it.
        // make every class that use the print the implements it.
        // so our range expended
        VehicleNew[] vhNew = new VehicleNew[12];

        for (int i = 0 ;i < vhNew.length ; i++){
            vhNew[i] = new VehicleNew(45+i);
        }

        printArray3(vhNew);
    }
}
