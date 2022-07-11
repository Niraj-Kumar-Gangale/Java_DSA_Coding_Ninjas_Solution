package lecture_plus_extra.intro_plus_inheritance_and_private_members_function_overriding;

public class Car extends Vehicle{
    int gearNo;
    boolean isConvertible;

    public void print(){
        System.out.println("Name "+ name);
        // if maxSpeed is public then below written is possible
        // System.out.println("maxSpeed "+ maxSpeed);
        // if it is private then you need to set up the getter and setter to access
        System.out.println("maxSpeed "+ getMaxSpeed());

        System.out.println("gearNo "+ gearNo);
        System.out.println("isConvertible "+ isConvertible);

    }

    public void fun(int number){
        System.out.println(" fun(int number) ");
    }



}
