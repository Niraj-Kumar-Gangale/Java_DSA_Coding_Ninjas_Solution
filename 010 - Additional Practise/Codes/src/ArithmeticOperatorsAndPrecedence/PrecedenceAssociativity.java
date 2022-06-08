package ArithmeticOperatorsAndPrecedence;

public class PrecedenceAssociativity {
    public static void main(String[] args) {

        // precedence
        int c = 3+10/5;
        System.out.println(c);

        // (/ * %) have same precedence, so we do it using associativity.
        // associativity for (/ * %) is from left to right
        int d = 10/2*3;
    }
}
