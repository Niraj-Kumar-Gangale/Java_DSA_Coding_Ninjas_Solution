package interfaces;

/**
 * Car Class extends the Vehicle and Implements VehicleInterface CarInterface
 */

public class Car extends Vehicle implements  CarInterface {

    public String getCompany(){
        return null;
    }



    @Override
    public void print() {
        System.out.println(" inside car ");
    }

    public static void main(String[] args) {
        System.out.println("this is inside the car");
    }

}
