package lecture_plus_extra.protected_and_super_keyword_and_constructor;


import lecture_plus_extra.intro_plus_inheritance_and_private_members_function_overriding.Vehicle;

public class Truck extends Vehicle {

    private int maxLoadCapacity;

    // Truck constructor

    public Truck(int maxLoadCapacity){
        super(56);
        this.maxLoadCapacity = maxLoadCapacity;
    }

    public Truck(){
        super(465);


    }
    public Truck (int i , int k){
        super(i);
        this.maxLoadCapacity =k;
    }



    public void print(){

        // using super keyword we can access the parent function
        super.print();

        System.out.println("maxLoadCapacity "+ maxLoadCapacity );

        // cannot access the color if the color is default access modifier
        System.out.println("name "+ name);
    }


}
