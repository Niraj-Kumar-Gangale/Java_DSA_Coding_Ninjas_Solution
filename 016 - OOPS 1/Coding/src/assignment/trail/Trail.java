package assignment.trail;

import java.io.*;

public class Trail {

        public static void main(String[] args) {
        ExtendsTrail2 newObject = new ExtendsTrail2("haha");
        newObject.name = "first";
//        newObject.number = 01;
        newObject.email = "nkgangale@gmail.com";

        // use the getter and setter to access the number
        newObject.setNumber(56);
        System.out.println(newObject.getNumber());

        newObject.print();





    }


}

