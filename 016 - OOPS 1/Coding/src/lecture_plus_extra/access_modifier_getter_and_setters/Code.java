package lecture_plus_extra.access_modifier_getter_and_setters;

import lecture_plus_extra.intro_to_oops.Student;

public class Code {

    // access modifier
    // --------------------------DEFAULT-------------------------------
    // int the intro to oops package
    // in the java file of student
    /*

        public class Student {
        String name ;
        int age;

        }
    */
    // both the name and age have Default access modifier assigned to it.
    // in case of default access modifier
    // the name and age can be accessed directly inside the same package
    // i.e  object.age     object.name
    // they cannot be accessed outside the package or inside the sub package

    // -------------------------PUBLIC--------------------------------
    //
    /*

        public class Student {
        String name ;
        public int age;

        }
    */
    // in case of the public access modifier
    // the variable can be accessed from anywhere

    //--------------------------PRIVATE---------------------------
    //
    /*

        public class Student {
        String name ;
        private int age;

        }
    */
    // in case private access modifier
    // the age is accessible inside the class only

    //------------------------GETTER AND SETTER----------------------
    // in case if you want your variable (age) to be indirectly accessible
    // not directly then you will use getter and setter.
    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    // WHY NOT ALLOW DIRECT ACCESS?

    // if we allow direct access to age anybody can change it with irrelevant
    // value like -45 [ object.age = -45 ]
    // so, we do provide access but not directly but indirectly using getter setter


    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++


    public static void main(String[] args) {

        Student secondStudent = new Student();
        // age is private so user getter and setter for the age
        // you cannot access name because of default access modifier
        // secondStudent.name = " Ramesh Kumar ";

        // but you can use getter setter for age as they are public
        // Even though Age itself is private
        secondStudent.setAge(16);
        System.out.println(secondStudent.getAge());
    }



}
