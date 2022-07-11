package lecture_plus_extra.complex_numbers;

import javax.print.CancelablePrintJob;

public class ComplexNumbersUse {
    public static void main(String[] args) {


        ComplexNumbers c1 = new ComplexNumbers(2, 3 );
        c1.print();
        ComplexNumbers c2 = new ComplexNumbers(2, 0 );
        c2.print();
        ComplexNumbers c3 = new ComplexNumbers(2, -6 );
        c3.print();

        c1.setImaginaryNo(21);
        c1.setRealNo(20);
        c1.print();
        c1.plus(c3);
        c1.print();
        c3.print();

        c2.multiply(c1);
        c2.print();
        c1.print();

        ComplexNumbers c4 = ComplexNumbers.add(c2,c1);
        c4.print();
        c4.conjugate();
        c4.print();


    }
}
