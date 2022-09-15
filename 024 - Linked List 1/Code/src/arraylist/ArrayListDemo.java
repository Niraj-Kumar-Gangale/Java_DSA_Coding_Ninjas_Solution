package arraylist;

import java.util.ArrayList;

/**
 * <p></>Java ArrayList class uses a dynamic array for storing the elements.
 * It is like an array, but there is no size limit.
 * We can add or remove elements anytime.
 * So, it is much more flexible than the traditional array.
 * It is found in the java.util package.It is like the Vector in C++</p>
 * <li>Java ArrayList class can contain duplicate elements.</li>
 * <li>Java ArrayList class maintains insertion order.</li>
 * <li>Java ArrayList class is non synchronized.</li>Java ArrayList class is non synchronized.</li>
 * <li>Java ArrayList allows random access because the array works on an index basis.</li>
 * <li>In ArrayList, manipulation is a little bit slower than the LinkedList in Java because
 * a lot of shifting needs to occur if any element is removed from the array list.</li>
 * <li>We can not create an array list of the primitive types, such as int, float, char, etc.
 * It is required to use the required wrapper class in such cases.</li>
 * <img src = "https://static.javatpoint.com/images/arraylist.png"></img>
 */

public class ArrayListDemo {

    public static void main(String[] args) {

        // As the ArrayList Class is Generic thus it won't work with the
        // Primitive data Type
        // Only work with Non-Primitive i.e. Reference  type variable
        ArrayList<Integer> firstList =  new ArrayList<>();

        // check the size of the initialized array here
        System.out.println(firstList.size());  // 0

        // Add three elements in the firstList
        firstList.add(45);
        firstList.add(15);
        firstList.add(90);

        // print the firstList elements
        for (int elem : firstList){
            System.out.print(elem + " ");
        }
        System.out.println();

        // Add an element between the 45 and 15
        firstList.add(1,100);

        for (int elem : firstList){
            System.out.print(elem + " ");
        }
        System.out.println();

        // Remove the element in the last position i.e. 90
        firstList.remove(firstList.size()-1);

        for (int elem : firstList){
            System.out.print(elem + " ");
        }
        System.out.println();

        // set a value at specified index by changing the original one
        firstList.set(1,200);

        for (int elem : firstList){
            System.out.print(elem + " ");
        }
        System.out.println();

        // get the element at a specified index
        int indexElementValue  = firstList.get(1);
        System.out.println(indexElementValue);


        // Similarly you can build the ArrayList for the String
        ArrayList<String> stringArrayList = new ArrayList<>();

        // let's add two elements in the String array
        stringArrayList.add("Niraj");
        stringArrayList.add("Niraj2");
        stringArrayList.add("Niraj3");

        // for each loop good for the transversal only
        for (String elem : stringArrayList){
            System.out.print(elem + " ");
        }
    }
}
