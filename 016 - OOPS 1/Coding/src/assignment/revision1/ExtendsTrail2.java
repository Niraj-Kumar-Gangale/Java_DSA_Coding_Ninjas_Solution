package assignment.revision1;

import assignment.trail.Trail2;

public class ExtendsTrail2 extends Trail2 {

    public String email;
    public int number;

    public ExtendsTrail2 (String s){
        super(s);
    }
    @Override
    public void print() {

            System.out.println("name " + name);
            System.out.println("number " + number);
            System.out.println("email " + email);

    }

    public void setName(String name) {
        this.name = name;

    }

    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public void setNumber(int number) {
        this.number = number;
    }
}
