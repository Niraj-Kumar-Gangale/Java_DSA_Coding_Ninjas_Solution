package assignment.trail;

public class Trail2 {

    protected String name ;
    private int number;

    // custom constructor

    public Trail2 (String s){
        System.out.println(s);
        System.out.println(" constructor for parent class called");
    }



    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }


    public void print (){

        System.out.println("Name " + name);
        System.out.println("Number " + number);
    }
}
