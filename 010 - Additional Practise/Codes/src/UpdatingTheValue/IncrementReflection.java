package UpdatingTheValue;

public class IncrementReflection {
    public static void main(String[] args) {

        int a = 45;
        a = increment(a);
        System.out.println(a);
    }

    private static int increment(int a) {
        return a+1;
    }
}
