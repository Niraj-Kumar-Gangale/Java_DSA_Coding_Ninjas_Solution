package Generic.generic_method;

public class NonGenericIntoGenericClass<T> {

    public T oni;

    public NonGenericIntoGenericClass(T oni) {
        this.oni = oni;
        System.out.println("generic constructor in generic class");
    }

    // non-generic constructor for generic class
    public NonGenericIntoGenericClass() {
//        this.oni = 45; // type problem provided (int) and required (T)
        System.out.println("non generic constructor in generic class");
    }

    // non generic method for generic class
    public void display() {
        System.out.println("non generic method in generic class");
    }

    public static void display2() {
        System.out.println("non generic static method in generic class");
    }

    public static void main(String[] args) {
        NonGenericIntoGenericClass<String> obj = new NonGenericIntoGenericClass<>("Nelu");
        System.out.println(obj.oni);

        NonGenericIntoGenericClass obj2 = new NonGenericIntoGenericClass();
        System.out.println(obj2.oni);
        obj2.display();
        obj2.display2();
    }


}
