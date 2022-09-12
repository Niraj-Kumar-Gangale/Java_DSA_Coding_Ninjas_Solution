package lecture_plus_extra.intro_plus_inheritance_and_private_members_function_overriding;

public class Vehicle {
    protected String name;
    private int maxSpeed;



    public int getMaxSpeed() {
        System.out.println("Vehicle is called");
        return maxSpeed;
    }

    public Vehicle(int maxSpeed){

        this.maxSpeed = maxSpeed;

    }

    public Vehicle(){
        System.out.println("jkdjf");

    }





    public void setMaxSpeed(int maxSpeed) {
        System.out.println("Vehicle is called");
        this.maxSpeed = maxSpeed;
    }

    public void print(){

        System.out.println("Name "+ name);
        System.out.println("maxSpeed "+ maxSpeed);

    }


    public void fun(double number){
        System.out.println(" fun(double number) ");
    }

}
