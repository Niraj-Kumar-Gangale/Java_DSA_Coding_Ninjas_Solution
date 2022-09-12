package lecture_plus_extra.fraction_class;

public class Fraction {

    // properties
    private int numerator;
    private int denominator;



    // First thing is constructor
    public Fraction (int numerator , int denominator)   {
        if (denominator== 0){
            return;
        }else {
            this.denominator = denominator;
        }
        this.numerator = numerator;

        simplify();
    }

    // we want to store it in a simplified manner
    // so, we will simplify the numerator and denominator
    private void simplify(){
        int divisor = 2;
        while((divisor<=numerator)&&(divisor<=denominator)){
            if (numerator%divisor == 0 && denominator%divisor == 0){
                numerator /=divisor;
                denominator /=divisor;
                divisor--;
            }
               divisor++;
        }
    }

    // we want to print the data
    public void print(){
        if (denominator == 0) {
            System.out.println(numerator);
        }else{
            System.out.println(numerator+"/"+denominator);
        }
    }


    // we need getter setter for both the numerator and denominator
    public int getNumerator(){
        return numerator;
    }

    public int getDenominator(){
        return denominator;
    }

    public void setNumerator(int numerator){
        this.numerator = numerator;
        simplify();
    }

    public void setDenominator(int denominator) throws ZeroDenominatorException {
        if (denominator== 0){
            ZeroDenominatorException e = new ZeroDenominatorException("Hello brother");
            throw e;
        }else {
            this.denominator = denominator;
        }
        simplify();
    }

    // now we want the non-static add function
    public void add (Fraction f2) {
        numerator = numerator*f2.denominator + denominator*f2.numerator;
        denominator = denominator*f2.denominator;
        simplify();
    }

    // now we want the non-static multiply function
    public void multiply (Fraction f3){
        numerator = numerator*f3.numerator;
        denominator = f3.denominator*denominator;
        simplify();
    }

    // now we want static add function
    public static Fraction add(Fraction frac1, Fraction frac2)  {
        int tempNumerator = frac1.numerator* frac2.denominator + frac2.numerator* frac1.denominator;
        int tempDenominator =  frac1.denominator * frac2.denominator;

        return new Fraction(tempNumerator, tempDenominator);
    }


//--------------------------------------------------------------------------------------
//                 when i crested simplify function I have a doubt
//                           this down below is solution
//    
//    public static void main(String[] args) {
//        int i = 99;
//        int a = 300;
//        while ( i < a ){ // it is similar to start < end [ 01 sorting ]
//        // spiral formation from matrix
//        // we made a condition like
//            // while ((colStart >= colEnd) && (rowStart >= rowEnd))
//            // all four are changing simultaneously
//            a= a/2;
//            i+=10;
//            System.out.println("i "+ i);
//            System.out.println("a "+a);
//        }
//    }
//
//---------------------------------------------------------------------------------------


}
