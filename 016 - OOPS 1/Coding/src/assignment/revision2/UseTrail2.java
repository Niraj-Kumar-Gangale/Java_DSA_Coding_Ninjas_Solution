package assignment.revision2;

import assignment.trail.Trail2;

public class UseTrail2 {

    public static void main(String[] args) {
        Trail2 newObject = new Trail2("bobobobo");
        System.out.println(newObject);
        // can use name because it is public
//        newObject.get = "Neelam";
        // can not use number because it's default access modifier
        // newObject.number
    }
}
