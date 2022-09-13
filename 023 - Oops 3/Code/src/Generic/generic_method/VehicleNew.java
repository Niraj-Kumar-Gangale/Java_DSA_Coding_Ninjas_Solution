package Generic.generic_method;

public class VehicleNew implements PrintInterface{

    public int maxSpeed;
    public void print() {
        System.out.println("maxSpeed " + maxSpeed);
    }
    public VehicleNew (int maxSpeed){
        this.maxSpeed = maxSpeed;
    }
}
