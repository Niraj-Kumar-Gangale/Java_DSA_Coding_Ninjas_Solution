package lecture_plus_extra.intro_plus_inheritance_and_private_members_function_overriding;

import java.sql.SQLOutput;

public class VehicleUse {

    // we will mainly talk about the 4 main pillar of OOPs //
    /*
    1. Encapsulation - Hiding data from the outside world
                       (i.e putting all the properties + function and data inside  single class)
    2. Abstraction -   only showing the necessary details to the user Ex light turn on/off switch/
    3. Polymorphism - we will study later
    4. Inheritance -  Help you move common things to one class.
                      the common class is called Parent
     */

    // we are studying the inheritance here :-
    // we have Parent Class - Vehicle
    // And we have class called Car which inherit/extends the Vehicle class

    // Here we also discussed about
    // 1. Function Overriding.
    // 2. Function Overloading across Derived classes.
    public static void main(String[] args) {
        Vehicle v = new Vehicle(56);
        v.name = "Maruti";
        v.setMaxSpeed(511);
        v.print();

        Car c = new Car(56);
        c.name = "Hero";
        c.setMaxSpeed(56);
        c.gearNo= 45;
        c.isConvertible = true;
        System.out.println("_---------------------------");
        c.printName();
        System.out.println(c.name);

        // System.out.println(c.printName());
        /*

        #### Console Output ####

        super.name Hero
        name Hero
        -----------------

        // well answer for the both will come as same because we did not  define
        // an extra name here in the  <<< Car class >>> if we did then
        // name will tell the name for the car
        // super.name will tell not tell the name for the vehicle
        // because there i no relation between the objects of the
        // VEHICLE AND CAR class

         */

        // after we define the name property inside the car class also

        // System.out.println(c.printName());
        ////    public boolean printName(){
        ////        super.name = ""dumboo";
        ////        System.out.println("super.name "+ super.name);
        ////        System.out.println("name "+ name);
        ////        return false;
        ////    }
        // #### console ####
        /*
        super.name dumboo
        name Hero
         */


        //-------------------------------------------------------------------------
        // Function Overriding.
        c.print();
        // first it will check if print is available inside
        // the derived class itself if not then go UP  in Hierarchy.
        //------------------------------------------------------------------------
        //------------------------------------------------------------------------
        // Function Overloading
        // is possible in Derived class
        // we made a fun Function and depending upon the
        // input we provide the function will be called from
        // CAR OR VEHICLE

        // let's call from the vehicle, i.e. double
        c.fun(45.156);

        // let's call from the car, i.e. integer
        c.fun(45);
        //-------------------------------------------------------------------------

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        Car c1 = new Car(23);
        c1.name = "uibdiuch";
        // super value setting
        c1.setSuperName("Lambu");

        // the super print
        c1.printName();

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        Car c2 = new Car(89);
        c2.maxSpeed = 651;
        c2.setMaxSpeed(46);
        System.out.println(c2.getMaxSpeed());
        c2.printMaxSpeed();
        c2.setSuperMaxSpeed(5);
        System.out.println(c2.getSuperMaxSpeed());
        c2.printMaxSpeed();



    }

}
