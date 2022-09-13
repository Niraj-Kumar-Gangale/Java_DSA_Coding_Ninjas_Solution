package interfaces;

public class Vehicle implements VehicleInterface {

    public int  maxSpeed ;

    public Vehicle(){

    }
    public Vehicle(int i) {
        maxSpeed = i;
    }

    public int getMaxSpeed(){
        return 45;
    }


    public void print(){
        System.out.println("print the function");
    }


}
