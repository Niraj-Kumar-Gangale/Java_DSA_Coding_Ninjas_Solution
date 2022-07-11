package lecture_plus_extra.complex_numbers;

/***
 * Complex Number Class
 * Send Feedback
 * A ComplexNumber class contains two data members : one is the real part (R) and the other is imaginary (I) (both integers).
 * Implement the Complex numbers class that contains following functions -
 * 1. constructor
 * You need to create the appropriate constructor.
 * 2. plus -
 * This function adds two given complex numbers and updates the first complex number.
 * e.g.
 * if C1 = 4 + i5 and C2 = 3 +i1
 * C1.plus(C2) results in:
 * C1 = 7 + i6 and C2 = 3 + i1
 * 3. multiply -
 * This function multiplies two given complex numbers and updates the first complex number.
 * e.g.
 * if C1 = 4 + i5 and C2 = 1 + i2
 * C1.multiply(C2) results in:
 * C1 = -6 + i13 and C2 = 1 + i2
 * 4. print -
 * This function prints the given complex number in the following format :
 * a + ib
 * Note : There is space before and after '+' (plus sign) and no space between 'i' (iota symbol) and b.
 * Input Format :
 * Line 1 : Two integers - real and imaginary part of 1st complex number
 * Line 2 : Two integers - real and imaginary part of 2nd complex number
 * Line 3 : An integer representing choice (1 or 2) (1 represents plus function will be called and 2 represents multiply function will be called)
 * Output format :
 * Check details of 'print' function given above.
 * Sample Input 1 :
 * 4 5
 * 6 7
 * 1
 * Sample Output 1 :
 * 10 + i12
 * Sample Input 2 :
 * 4 5
 * 6 7
 * 2
 * Sample Output 2 :
 * -11 + i58
 *
 *
 */

/*
/******************
 * Following is the main function we are using internally.
 * Refer this for completing the ComplexNumbers class
 *

 public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int real1 = s.nextInt();
		int imaginary1 = s.nextInt();

		int real2 = s.nextInt();
		int imaginary2 = s.nextInt();

		ComplexNumbers c1 = new ComplexNumbers(real1, imaginary1);
		ComplexNumbers c2 = new ComplexNumbers(real2, imaginary2);

		int choice = s.nextInt();

		if(choice == 1) {
			// Add
			c1.plus(c2);
			c1.print();
		}
		else if(choice == 2) {
			// Multiply
			c1.multiply(c2);
			c1.print();
		}
		else {
			return;
		}
	}
 ******************/
/*--------------Answer my solution--------------------

public class ComplexNumbers {
    // Complete this class
    private int realNo;
    private int imaginaryNo;

    // constructor
    public ComplexNumbers(int realNo, int imaginaryNo){
        this.realNo = realNo;
        this.imaginaryNo = imaginaryNo;
    }

    // print function
    public void print(){
        if(imaginaryNo<0){
            System.out.println(realNo+" - i"+(-imaginaryNo));
        }else if(imaginaryNo>=0){
            System.out.println(realNo+" + i"+(imaginaryNo));
        }
    }

    // getter setter
    public int getRealNo(){
        return realNo;
    }
    public int getImaginaryNo(){
        return imaginaryNo;
    }

    public void setRealNo(int realNo){
        this.realNo = realNo;
    }

    public void setImaginaryNo(int imaginaryNo){
        this.imaginaryNo = imaginaryNo;
    }

    // non-static add function
    public void plus(ComplexNumbers c1){
        realNo = realNo + c1.realNo;
        imaginaryNo = imaginaryNo + c1.imaginaryNo;
    }

    // non-static multiply function
    public void multiply(ComplexNumbers c2){
        // realNo = realNo * c1.realNo;
        // imaginaryNo = imaginaryNo * c1.imaginaryNo;

        // Above method of multiplication is wrong
        // below method is correct
        int a = realNo;
        int b = imaginaryNo;
        int c = c2.realNo;
        int d = c2.imaginaryNo;

        realNo = a*c -(b*d);
        imaginaryNo = a*d + b*c;
    }


}
 */


public class ComplexNumbers {
    // Complete this class
    private int realNo;
    private int imaginaryNo;

    // constructor
    public ComplexNumbers(int realNo, int imaginaryNo){
        this.realNo = realNo;
        this.imaginaryNo = imaginaryNo;
    }

    // print function
    public void print(){
        if(imaginaryNo<0){
            System.out.println(realNo+" - i"+(-imaginaryNo));
        }else if(imaginaryNo>0){
            System.out.println(realNo+" + i"+(imaginaryNo));
        }else{
            System.out.println(realNo);
        }
    }

    // getter setter
    public int getRealNo(){
        return realNo;
    }
    public int getImaginaryNo(){
        return imaginaryNo;
    }

    public void setRealNo(int realNo){
        this.realNo = realNo;
    }

    public void setImaginaryNo(int imaginaryNo){
        this.imaginaryNo = imaginaryNo;
    }

    // non-static add function
    public void plus(ComplexNumbers c1){
        realNo = realNo + c1.realNo;
        imaginaryNo = imaginaryNo + c1.imaginaryNo;
    }

    // non-static multiply function
    public void multiply(ComplexNumbers c2){
        // realNo = realNo * c1.realNo;
        // imaginaryNo = imaginaryNo * c1.imaginaryNo;

        // Above method of multiplication is wrong
        // below method is correct
        int a = realNo;
        int b = imaginaryNo;
        int c = c2.realNo;
        int d = c2.imaginaryNo;

        realNo = a*c -(b*d);
        imaginaryNo = a*d + b*c;
    }

    // static add function
    public static ComplexNumbers add(ComplexNumbers com1, ComplexNumbers com2){
        int tempReal = com1.realNo + com2.realNo;
        int tempImag = com1.imaginaryNo + com2.imaginaryNo;
        return new ComplexNumbers(tempReal, tempImag);
    }

    // non Static conjugate
    public void conjugate(){
        this.imaginaryNo =(-this.imaginaryNo);
    }
}
