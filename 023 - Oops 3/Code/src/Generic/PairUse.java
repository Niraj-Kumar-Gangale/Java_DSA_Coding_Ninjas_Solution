package Generic;


/**
 * using the pair one and pair2 classes
 */
public class PairUse {

    public static void main(String[] args) {
        // pair with Integer
        Pair<Integer> p = new Pair<>(1, 5);
        System.out.println(p.getFirst());

        // pair with String
        Pair<String> str  = new Pair<>("first", "second");
        System.out.println(str.getFirst());

        // pair without any input
        // here T WILL BECOME  Object
        // Every class is somehow derived from the  Object class
        // so just like
        // >>>Vehicle can point to its subclass i.e. Vehicle v = new Car();
        // >>>Object class can point toward its all subclass i.e. Object ob = new _______();
        // _______ --> this an be integer or String or Array or Vehicle etc
        Pair pp = new Pair(1,2);
        System.out.println(pp.getSecond());
        // object can take string
        pp.setFirst("happy");
        System.out.println(pp.getFirst());
        // it can take the array also
        pp.setFirst(new int[]{4,5,6,98,});
        System.out.println(pp.getFirst());


        // Pair with two generic generator
        // using Pair2 Class
        Pair2<Integer, String> is = new Pair2<>(12,"Great");
        System.out.println(is.getFirst());
        System.out.println(is.getSecond());

        // Now lets say you want a pair class that have a third data member
        // with its own generic value
        // Two Option
        // 1] make a new one
        // 2] or make use of already existing Pair2 class to implement the pair class
        // with 3 Pair with their own generic.

        Pair2<Integer, Integer>  pairWithTwoInput = new Pair2<>(1,2);

        Pair2<Pair2<Integer,Integer>, Integer> pairWithThereInput = new Pair2<>(pairWithTwoInput, 5);

        // let's get the last input
        System.out.println(pairWithThereInput.getSecond());
        // let's get the second input
        System.out.println(pairWithThereInput.getFirst().getSecond());
        // let's get the first input
        System.out.println(pairWithThereInput.getFirst().getFirst());


        // Similarly you can make the pair with 4 or 5 or 6 or ....etc



    }
}
