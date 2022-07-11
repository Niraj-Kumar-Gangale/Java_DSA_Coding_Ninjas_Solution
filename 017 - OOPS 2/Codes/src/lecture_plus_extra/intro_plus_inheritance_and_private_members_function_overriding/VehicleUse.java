package lecture_plus_extra.intro_plus_inheritance_and_private_members_function_overriding;

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
        Vehicle v = new Vehicle();
        v.name = "Maruti";
        v.setMaxSpeed(511);
        v.print();

        Car c = new Car();
        c.name = "Hero";
        c.setMaxSpeed(56);
        c.gearNo= 45;
        c.isConvertible = true;
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

    }

}
