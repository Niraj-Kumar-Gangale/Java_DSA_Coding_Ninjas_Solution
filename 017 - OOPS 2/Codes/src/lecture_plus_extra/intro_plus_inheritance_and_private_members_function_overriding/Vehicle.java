package lecture_plus_extra.intro_plus_inheritance_and_private_members_function_overriding;

public class Vehicle {
    String name;
    private int maxSpeed;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
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
