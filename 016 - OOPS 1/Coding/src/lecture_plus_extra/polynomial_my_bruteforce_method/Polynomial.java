package lecture_plus_extra.polynomial_my_bruteforce_method;

import lecture_plus_extra.dynamic_array_and_polynomial.DynamicArray;

import javax.swing.*;

public class Polynomial {
    // my brute force approach
    DynamicArray coefficients;
    DynamicArray degrees;


    // constructor
    public  Polynomial(){
        coefficients = new DynamicArray();
        degrees = new DynamicArray();
    }

    // set the coefficients
    public void setCoefficients(int degree, int coefficient){
        for (int i = 0 ; i < degrees.size() ; ++i){
            if (degrees.get(i)==degree){
                coefficients.set(i,coefficient);
                return;
            }
        }
        degrees.add(degree);
        coefficients.add(coefficient);
    }

    // making the add function
//    public Polynomial add(Polynomial p){
//        Polynomial ans = new Polynomial();
//
//
//
//
//    }
}
