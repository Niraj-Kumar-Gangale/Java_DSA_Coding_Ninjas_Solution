package assignment.trail;

public class ExtendsTrail2 extends Trail2{

    String email ;

    public ExtendsTrail2 (String s){
        super(s);
        System.out.println("constructor for child class is called");
        System.out.println(s);
    }
    public void print (){
        super.print();
//        System.out.println("name " + name);
//        System.out.println("number " + getNumber());
        System.out.println("email " + email);
    }

}
