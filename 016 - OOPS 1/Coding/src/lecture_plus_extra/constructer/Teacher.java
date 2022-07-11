package lecture_plus_extra.constructer;

// well okay, so you made a class Student
// NO THE QUESTION IS HOW ARE YOU GOING TO MAKE AN OBJECT FROM THE CLASS
// Answer
// Student s1 = new Student();
// this will give us an object whose reference is stored inside s1 variable
// new = allocate the space
// Student() -> this act like a function and help us to create object with
//              default values inside properties.
// similar to
//  int[]][] arr2d = makeA2dArray();
//  Scanner sc = new Scanner(System.in);
//
// Ok, but we did not make this Student() where does this come from

// well Gentleman when  ever a class is created in java
// something is generated for free which is called CONSTRUCTOR
// and this constructor help us in creating the objects using the class

// IMPORTANT POINT ABOUT CONSTRUCTOR
// 1] when you create your own custom constructor the default one will be deleted
// 2] if you want to use the default one you need to create it from scratch.
// 3] you can create as many constructor as you want


public class Teacher {

    private String name;
    private int age;

    // getter and setter for name and age
    int getAge(){
        return age;
    }
    void setAge(int ageInput){
        age = ageInput;
    }
    String getName(){
        return name;
    }
    void setName(String nameInput){
        name = nameInput;
    }

    // let's setup a method to print the object detail
    void print(){
        System.out.println("name "+ name + " age "+ age);
    }

    // let's define a constructor.
    // constructor have no return type
    // they only have Access modifiers
    // am = default
    Teacher(String nameInput, int ageInput){
        name = nameInput;
        age = ageInput;
    }

    // lets define the default constructor from scratch
    Teacher(){

    }

}
