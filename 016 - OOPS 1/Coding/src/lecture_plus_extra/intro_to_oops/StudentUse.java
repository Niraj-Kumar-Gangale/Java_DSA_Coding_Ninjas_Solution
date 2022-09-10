package lecture_plus_extra.intro_to_oops;


import java.util.Scanner;

public class StudentUse {
    // inside the same package we don't have to import the class
    // which means i can use the Student class without import.

    public static void main(String[] args) {
        // for Scanner class we have to import it
        // because Scanner class is not defined here
        Scanner scan  = new Scanner(System.in);

        // let's make a student class object
        Student firstStudent = new Student();
        // new keyWord allocate memory to the object and
        // allocate object memory address to the firstStudent variable.

        // let's print object memory location address
        System.out.println(firstStudent);

        // let's define properties of the objects
        // you cannot directly access age as it made private
        //firstStudent.age = 45;
        firstStudent.setAge(45);
        firstStudent.name = "Noble";

        // let's print properties of the objects
        // age is made private
        //System.out.println(firstStudent.age);
        System.out.println(firstStudent.getAge());
        System.out.println(firstStudent.name);


    }
}
