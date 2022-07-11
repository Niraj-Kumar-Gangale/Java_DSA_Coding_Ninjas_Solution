package lecture_plus_extra.fraction_class;



public class FractionUse {


    // FOR DENOMINATOR equal TO 0 we will learn how to return exception like IndexOutOfBound

    public static void main(String[] args) {
        Fraction f1 = new Fraction(2,3);
        f1.print();

        f1.setNumerator(12);
        int d = f1.getDenominator();
        System.out.println(d);
        f1.print();

        f1.setDenominator(30);
        f1.setNumerator(10);
        f1.print();

        // using add function
        Fraction f4 = new Fraction(3,4);
        f4.add(f1);
        f4.print();
        f1.print();

        // using the multiplication function
        Fraction f2 = new Fraction(4,5);
        f2.multiply(f1);
        f2.print();
        f1.print();

        // using static add function
        Fraction f3 = Fraction.add(f1,f2);
        f1.print();
        f2.print();
        f3.print();



    }


}
