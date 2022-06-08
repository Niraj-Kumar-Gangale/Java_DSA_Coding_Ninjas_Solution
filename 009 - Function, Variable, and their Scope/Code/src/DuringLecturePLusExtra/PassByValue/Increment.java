package DuringLecturePLusExtra.PassByValue;

public class Increment {
    /**
     * here we will show that when function is called
     * the argument passed to it will be using pass by value
     * increment.n = main.n (copied)
     * i.e value is copied and then passed
     * so what ever changes applied to passed value will not
     * reflect on the main value
     */

    // main function
    public static void main(String[] args) {
        int n = 8;
        increment(8);
        System.out.println(n);
    }

    // increment function
    public static void increment(int n){
        n = n+1;
    }
}
