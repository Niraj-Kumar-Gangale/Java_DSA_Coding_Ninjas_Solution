package lecture_plus_extra.intro_plus_inheritance_and_private_members_function_overriding;

public class Car extends Vehicle{
    int gearNo;
    boolean isConvertible;

    String name;

    int maxSpeed;

    public Car(int maxSpeed){
        super(maxSpeed);
    }



    public void printMaxSpeed(){
        System.out.println(super.getMaxSpeed());
    }

    @Override
    public void setMaxSpeed(int maxSpeed) {
        System.out.println("Car is Called");
        this.maxSpeed = maxSpeed;
    }

    @Override
    public int getMaxSpeed() {
        System.out.println("Car is Called");
        return maxSpeed;
    }


    public int getSuperMaxSpeed() {
        return super.getMaxSpeed();
    }


    public void setSuperMaxSpeed(int maxSpeed) {
        super.setMaxSpeed(maxSpeed);
    }

    // let's define name again to see the working of super keyword
//    String name;
//
//    // print name function to check for the working of the super keyword
//        public boolean printName(){
//            super.name = "dumboo";
//        System.out.println("super.name "+ super.name);
//        System.out.println("name "+ name);
//        return false;
//    }

    public void print(){
        System.out.println("Name "+ name);
        // if maxSpeed is public then below written is possible
        // System.out.println("maxSpeed "+ maxSpeed);
        // if it is private then you need to set up the getter and setter to access
        System.out.println("maxSpeed "+ getMaxSpeed());

        System.out.println("gearNo "+ gearNo);
        System.out.println("isConvertible "+ isConvertible);

    }


    public void printName() {

        System.out.println(super.name);
    }

    public void setSuperName(String name){
        super.name = name;
    }
//------------------------------------------------------------------------------------------------
    // well answer for the both will come as same because we did not  define
    // an extra name here if we did then
    // name will tell the name for the car
    // super.name will tell not tell the name for the vehicle
    // because there i no relation between the objects of the
    // VEHICLE AND CAR class

//    public boolean printName(){
//        System.out.println("super.name "+ super.name);
//        System.out.println("name "+ name);
//        return false;
//    }
//------------------------------------------------------------------------------------------------
    public void fun(int number){
        System.out.println(" fun(int number) ");
    }



}
