package lecture_plus_extra.static_keyword_and_static_function;

import javax.print.attribute.standard.PagesPerMinute;

public class DogUse {
    public static void main(String[] args) {
        Dog d1 = new Dog("puppy","german",5);
        Dog d2 = new Dog("puppy2","german2",6);

        Dog d3 = new Dog("puppy3","german3",7);

        System.out.println(d1.getTotalDogCount());
        System.out.println(d2.getTotalDogCount());
        System.out.println(d3.getTotalDogCount());

        // for [ int totalDOgCount ] the output was
        // 1
        // 1
        // 1

        // for [ static int totalDOgCount ] the output was
        // 3
        // 3
        // 3

        // Most of the time we access the static variable
        // using the class NAME because static key word is bound to the class
        // and not to an individual object.
        // we can also make static variable private to stay away from trouble
        // but, then you have to make getter for it
        // AND IF YOU WANT TO ACCESS GETTER BEFORE OBJECT CREATION
        // THEN YOU HAVE TO MAKE THE GETTER FUNCTION ALSO STATIC.
        System.out.println(Dog.getTotalDogCount());


    }
}
