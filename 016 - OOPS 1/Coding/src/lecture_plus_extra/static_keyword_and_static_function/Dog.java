package lecture_plus_extra.static_keyword_and_static_function;

public class Dog {

    String name ;
    String breed;
    int age;

    //-------------------------------------------
    // private int totalDogCount;
    //-------------------------------------------
    // every one will have their own totalDogCount value.
    // they have nothing in common so there is no way to relate them
    // thus making it impossible to calculate the value of total number of Dog.
    // Thus, we will create a value/data which will be common for all the object
    // using a KEYWORD <<<<<<< Static >>>>>>>>
    private static int totalDogCount;


    // getter for the totalDogCount
    static int getTotalDogCount(){
        return totalDogCount;
    }

    Dog(String name , String breed , int age){
        this.name = name;
        this.breed = breed;
        this.age = age;
        totalDogCount++;
    }

    public void barking(){
        System.out.println("Woof Woof");

    }

    // you can make getter setter for the individual data member
    // after declaring them private

    // your can also make print function to make printing easy

}
