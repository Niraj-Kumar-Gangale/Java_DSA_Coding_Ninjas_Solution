package lecture_plus_extra.dynamic_array_and_polynomial;

/***
 * Polynomial class
 * Send Feedback
 * Implement a polynomial class, that contains following functions -
 *
 * 1. setCoefficient -
 * This function sets coefficient for a particular degree value.
 * If term with given degree is not there in the polynomial,
 * then corresponding term (with specified degree and value) is added.
 * If the term is already present in the polynomial,
 * then previous coefficient value is replaced by given coefficient value.
 *
 * 2. add -
 * Adds two polynomials and returns a new polynomial which has the result.
 *
 * 3. subtract -
 * Subtracts two polynomials and returns a new polynomial which has the result.
 *
 * 4. multiply -
 * Multiplies two polynomials and returns a new polynomial which has the result.
 *
 * 5. print -
 * Prints all the terms (only terms with non zero coefficients are to be printed) in increasing order of degree.
 * Print pattern for a single term : "x"
 * And multiple terms should be printed separated by space. For more clarity, refer sample test cases.
 *
 * Note : Only keep those terms which have non - zero coefficients.
 *
 * Input Format:
 * The first line of input contains count of the number of coefficients in polynomial 1(C1)
 * The next line of input has C1 degrees for polynomial 1.
 * The next line of input has C1 coefficients for polynomial 1.
 * The next line of input contains count of the number of coefficients in polynomial 2(C2)
 * The next line of input has C2 degrees for polynomial 2.
 * The next line of input has C2 coefficients for polynomial 2.
 * The next line of input has the choice for the function you want to implement.
 *
 * Output Format:
 *
 * The output will be printed in case of print function same as that of print function format.
 *
 * Sample Input 1 :
 * P1 : 1x2 2x3 4x6
 * P2 : 3x4 1x2
 *
 *  Sample Output 1 :
 * P1 + P2 = 2x2 2x3 3x4 4x6
 *
 * Sample Input 2 :
 * P1 : 1x2 2x3 4x6
 * P2 : 3x4 1x2
 *
 * Sample Output 2 :
 * P1 - P2 = 2x3 -3x4 4x6
 */

/* -------------------MAIN CODE----------------------------

/* Signature of four required functions is given in the code. You can create other functions as well if you need.
*  Also you should submit your code even if you are not done with all the functions.
*/

// Main used internally is shown here just for your reference.
/*public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int degree1[] = new int[n];
		for(int i = 0; i < n; i++){
			degree1[i] = s.nextInt();
		}
		int coeff1[] = new int[n];
		for(int i = 0; i < n; i++){
			coeff1[i] = s.nextInt();
		}
		Polynomial first = new Polynomial();
		for(int i = 0; i < n; i++){
			first.setCoefficient(degree1[i],coeff1[i]);
		}
		n = s.nextInt();
		int degree2[] = new int[n];
		for(int i = 0; i < n; i++){
			degree2[i] = s.nextInt();
		}
		 int coeff2[] = new int[n];
		for(int i = 0; i < n; i++){
			coeff2[i] = s.nextInt();
		}
		Polynomial second = new Polynomial();
		for(int i = 0; i < n; i++){
			second.setCoefficient(degree2[i],coeff2[i]);
		}
		int choice = s.nextInt();
		Polynomial result;
		switch(choice){
		// Add
		case 1:
			 result = first.add(second);
			result.print();
			break;
		// Subtract
		case 2 :
			 result = first.subtract(second);
			result.print();
			break;
		// Multiply
		case 3 :
			 result = first.multiply(second);
			result.print();
			break;
		}

	}
  */

/*----------------------MY SOLUTION----------------------------
public class Polynomial {

    // // properties

    DynamicArray coefficients = new DynamicArray();

    // constructor
    // public Polynomial(){
    //     coefficients = new DynamicArray();
    // }


	/* This function sets coefficient for a particular degree value, if degree is not there in the polynomial
	 *  then corresponding term(with specified degree and value is added int the polynomial. If the degree
	 *  is already present in the polynomial then previous coefficient is replaced by
	 *  new coefficient value passed as function argument
	*/


/*

public void setCoefficient(int degree, int coeff){
        if (degree < coefficients.size()){
        coefficients.set(degree, coeff);
        }else{
        for (int i = coefficients.size(); i < degree ; i++){
        coefficients.add(0);
        }
        coefficients.add(coeff);
        }

        }


public int getCoefficient(int degree){
        if (degree < coefficients.size()){
        return coefficients.get(degree);
        }
        return -1;

        }

// Prints all the terms(only terms with non zero coefficients are to be printed) in increasing order of degree.
public void print(){
        for (int i = 0 ; i < coefficients.size() ; i++){
        if (coefficients.get(i)==0){
        continue;
        }
        System.out.print(coefficients.get(i)+"x"+i+" ");
        }
        System.out.println();
        }

// degree function
public int degree (){
        return coefficients.size();
        }


// Adds two polynomials and returns a new polynomial which has result
public Polynomial add(Polynomial p){
        Polynomial p3 = new Polynomial();
        int max = Math.max(degree(), p.degree());
        int min = Math.min(degree(), p.degree());
        int value = 0 ;
        for (int i = 0 ; i < max ; ++i){
        if (i< min){
        value = getCoefficient(i) + p.getCoefficient(i);
        }else if(i < degree() ){
        value = getCoefficient(i);
        }else{
        value = p.getCoefficient(i);
        }
        p3.setCoefficient(i,value);
        }

        return p3;

        }

// Subtracts two polynomials and returns a new polynomial which has result
public Polynomial subtract(Polynomial p){

        Polynomial p3 = new Polynomial();
        int max = Math.max(degree(), p.degree());
        int min = Math.min(degree(), p.degree());
        int value = 0 ;
        for (int i = 0 ; i < max ; ++i){
        if (i< min){
        value = getCoefficient(i) - p.getCoefficient(i);
        }else if(i < degree() ){
        value = getCoefficient(i);
        }else{
        value = -p.getCoefficient(i);
        }
        p3.setCoefficient(i,value);
        }

        return p3;
        }

// Multiply two polynomials and returns a new polynomial which has result
public Polynomial multiply(Polynomial p){
        Polynomial pFinal = new Polynomial();
        Polynomial temp ;
        for (int i = 0 ; i < degree() ; ++i){
        if (getCoefficient(i)==0){
        continue;
        }
        temp = new Polynomial();
        for (int j = 0 ; j < p.degree() ; ++j ){
        if (p.getCoefficient(j)!=0) {
        temp.setCoefficient(i+j,getCoefficient(i)* p.getCoefficient(j));
        }
        }
        pFinal = pFinal.add(temp);
        }
        return pFinal;
        }


        }


// Dynamic Array
class DynamicArray {

    // properties
    private int data[];
    private int nextIndex;

    // 1] constructor
    public DynamicArray(){
        data = new int[5];
        nextIndex = 0;
    }

    // 2] add function
    public void add (int element){
        if (nextIndex==data.length){
            restructure();
        }
        data[nextIndex]= element;
        nextIndex++;
    }

    // restructure
    private void restructure(){
        int[] temp = new int[2* data.length];
        for (int i = 0 ; i < data.length ; i ++){
            temp[i]= data[i];
        }
        data = temp;
    }


    // print function to print the dynamic array
    public void print(){
        for (int i = 0 ; i< nextIndex ; i++){
            System.out.println(data[i]);
        }
    }

    // to print the size of the current we have to return
    // the nextIndex value
    public int size(){
        return nextIndex;
    }

    // now we have to set and get for a particular index
    public void set(int position, int element){
        if (position > nextIndex){
            return;
        }
        if (position < nextIndex){
            data[position]=element;
        }else{
            add(element);
        }

    }

    // now we will make a function that return value at particular position
    public int get(int position){
        if (position >= nextIndex){
            return -1;
        }else{
            return data[position];
        }
    }


    // now we are going to make a function to remove the last value
    public int removeLast(){
        if (nextIndex==0){
            return -1;
            // we will return array when we learn how to do so
        }
        int temp = get(nextIndex-1);
        set(nextIndex-1,0);
        nextIndex--;
        return temp;
    }

    // function to check if the array is empty or not
    public boolean isEmpty(){
        return nextIndex == 0;
    }
}

*/


//############  CODING NINJA SOLUTION FOR POLYNOMIAL  ############//
    /*
public class Polynomial{
    int degCoeff[];


    Polynomial() {
        degCoeff = new int[10];
    }
    public void setCoefficient(int degree, int coeff) {
        if(degree > degCoeff.length-1) {
            //create a new array with size= degree+1
            int temp[] = degCoeff;
            degCoeff = new int[degree+1];
            //copy values from temp to degCoeff
            for(int i = 0; i < temp.length; i++) {
                degCoeff[i] = temp[i];
            }
        }
        degCoeff[degree] = coeff;
    }

    // Prints all the terms(only terms with non zero coefficients are to be printed) in increasing order of degree.
    public void print(){
        for(int i = 0;i < degCoeff.length; i++) {
            if(degCoeff[i] != 0) {
                System.out.print(degCoeff[i] + "x" + i + " ");
            }
        }
    }
    // Adds two polynomials and returns a new polynomial which has result
    public Polynomial add(Polynomial p) {
        Polynomial ans = new Polynomial();
        int plen1 = this.degCoeff.length;
        int plen2 = p.degCoeff.length;
        int len = Math.min(plen1, plen2);
        int i;
        for (i = 0; i < len; i++) {
            ans.setCoefficient(i, this.degCoeff[i] + p.degCoeff[i]);
        }
        while (i < plen1) {
            ans.setCoefficient(i, this.degCoeff[i]);
            i++;
        }
        while (i < plen2) {
            ans.setCoefficient(i, p.degCoeff[i]);
            i++;
        }
        return ans;
    }
    // Subtracts two polynomials and returns a new polynomial which has result
    public Polynomial subtract(Polynomial p){
        int plen1 = this.degCoeff.length;
        int plen2 = p.degCoeff.length;
        int len = Math.min(plen1, plen2);
        Polynomial ans = new Polynomial();
        int i;
        for(i = 0; i < len; i++) {
            ans.setCoefficient(i, this.degCoeff[i] - p.degCoeff[i]);
        }
        while(i < plen1){
            ans.setCoefficient(i, this.degCoeff[i]);
            i++;
        }
        while(i < plen2){
            ans.setCoefficient(i, -p.degCoeff[i]);
            i++;
        }
        return ans;
    }

    public int getCoeff(int degree) {
        if(degree < this.degCoeff.length) {
            return degCoeff[degree];
        }
        else {
            return 0;
        }
    }
    // Multiply two polynomials and returns a new polynomial which has result
    public Polynomial multiply(Polynomial p){
        Polynomial ans = new Polynomial();
        for(int i = 0; i < this.degCoeff.length; i++){
            for(int j = 0; j < p.degCoeff.length; j+=1){
                int termdeg = i + j;
                int termCoeff = this.degCoeff[i] * p.degCoeff[j];
                int oldCoeff = ans.getCoeff(termdeg);
                ans.setCoefficient(termdeg, termCoeff + oldCoeff);
            }
        }
        return ans;
    }
}
*/



public class Polynomial {

    // Solving using the hint given in the hint section
    // properties

    DynamicArray coefficients;


    public Polynomial(){
        coefficients = new DynamicArray();
    }


    /* This function sets coefficient for a particular degree value, if degree is not there in the polynomial
     *  then corresponding term with specified degree and value is added in the polynomial. If the degree
     *  is already present in the polynomial then previous coefficient is replaced by
     *  new coefficient value passed as function argument
     */
    public void setCoefficient(int degree, int coeff){
       // coefficients = new DynamicArray(); // you can't do this stupid every time new Dynamic will be created
        //  old data will be removed so make a new constructor and initialize dynamic array inside it.
        if (degree < coefficients.size()){
            coefficients.set(degree, coeff);
        }else{
            for (int i = coefficients.size(); i < degree ; i++){
                coefficients.add(0);
            }
            coefficients.add(coeff);
        }
    }

    // we also make a getCoefficient to make it easy to solve the question
    public int getCoefficient(int degree){
        if (degree < coefficients.size()){
            return coefficients.get(degree);
        }
        return -1;

    }

    // Prints all the terms(only terms with non-zero coefficients are to be printed) in increasing order of degree.
    public void print(){
        for (int i = 0 ; i < coefficients.size() ; i++){
            if (coefficients.get(i)==0){
                continue;
            }
            System.out.print(coefficients.get(i)+"x"+i+" ");
        }
        System.out.println();
    }

    // if we make the coefficients PRIVATE then we wll not be able to get the size
    // we will only able to set the value and get the value of at particular degree
    // so we will maka function to return the size of the of polynomial
    public int degree (){
        return coefficients.size();
    }


    // Adds two polynomials and returns a new polynomial which has result
    public Polynomial add(Polynomial p){

        Polynomial p3 = new Polynomial();
        int max = Math.max(degree(), p.degree());
        int min = Math.min(degree(), p.degree());
        int value = 0 ;
        for (int i = 0 ; i < max ; ++i){
            if (i< min){
                value = getCoefficient(i) + p.getCoefficient(i);
            }else if(i < degree() ){
                value = getCoefficient(i);
            }else{
                value = p.getCoefficient(i);
            }
            p3.setCoefficient(i,value);
        }

        return p3;

    }


    // Subtracts two polynomials and returns a new polynomial which has result
    public Polynomial subtract(Polynomial p){
        Polynomial p3 = new Polynomial();
        int max = Math.max(degree(), p.degree());
        int min = Math.min(degree(), p.degree());
        int value = 0 ;
        for (int i = 0 ; i < max ; ++i){
            if (i< min){
                value = getCoefficient(i) - p.getCoefficient(i);
            }else if(i < degree() ){
                value = getCoefficient(i);
            }else{
                value = -p.getCoefficient(i);
            }
            p3.setCoefficient(i,value);
        }

        return p3;
    }

    // Multiply two polynomials and returns a new polynomial which has result
    public Polynomial multiply(Polynomial p){
        Polynomial pFinal = new Polynomial();
        Polynomial temp ;
        for (int i = 0 ; i < degree() ; ++i){
            if (getCoefficient(i)==0){
                continue;
            }
            temp = new Polynomial();
            for (int j = 0 ; j < p.degree() ; ++j ){
                if (p.getCoefficient(j)==0) {
                    continue;
                }
                temp.setCoefficient(i+j,getCoefficient(i)* p.getCoefficient(j));
            }
            pFinal = pFinal.add(temp);

        }

        return pFinal;

    }

    public int evaluate (int element){
        int sum = 0;
        for (int i = 0 ; i < coefficients.size() ; ++i){
            if (getCoefficient(i)!=0){
                sum += getCoefficient(i)*Math.pow(element, i);
            }
        }

        return sum;
    }


}