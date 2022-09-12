package lecture_plus_extra.dynamic_array_and_polynomial;

public class DynamicArrayUse {

    public static void main(String[] args) {
        // this will initialize an array of the length 5
        DynamicArray d1 = new DynamicArray();
        // now we made a function ADD to add element at the last position
        d1.add(4);
        d1.add(50);
        d1.add(8);
        d1.add(9);
        d1.add(95);
        d1.add(74);
        d1.print();


        // to print the size of the array
        System.out.println(d1.size());

        // let's change the value at position of nextIndex using the set function
        d1.set(6,4545);
        d1.print();

        // using the get to get the value ata particular position
        // value at position 1
        System.out.println(d1.get(1));
        System.out.println(d1.removeLast());
    }


}
