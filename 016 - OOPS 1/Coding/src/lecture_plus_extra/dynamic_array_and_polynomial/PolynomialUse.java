package lecture_plus_extra.dynamic_array_and_polynomial;



public class PolynomialUse {

    public static void main(String[] args) {
        // we will use the default constructor

        Polynomial p1 = new Polynomial();

        System.out.println(p1.degree());

        // now we will use the set coefficient to set the values
        p1.setCoefficient(0,5);
        p1.setCoefficient(2,9);
        p1.setCoefficient(5,5);
        p1.print();


        // let's try the get coefficients
//        System.out.println(p1.getCoefficient(5));

        // let's make another polynomial
        Polynomial p2 = new Polynomial();

        p2.setCoefficient(1,2);
        p2.setCoefficient(3,9);
        p2.setCoefficient(5,2);

        p2.print();

        // using the add function
        Polynomial p3 = p1.add(p2);
        p3.print();

        // using the subtract function
        Polynomial p4 = p1.subtract(p2);
        p4.print();

        // using the multiplication function
        p1.print();
        p2.print();
        Polynomial p5 = p1.multiply(p2);
        p5.print();

        // let's try to evaluate the array for the value 3
        System.out.println(p1.evaluate(2));





    }
}
