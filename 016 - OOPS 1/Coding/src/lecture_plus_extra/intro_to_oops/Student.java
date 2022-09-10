package lecture_plus_extra.intro_to_oops;

//
// Why object-oriented programming ?
// Answer -> we want our code to solve
//           real world problem and to solve these problems we
//           want our code to be as close as possible to the real world
//           entities
//              lets take an example of delivery system
//              from sender to receiver and movement of the package.
//              it's all about the interaction of real world entities.
//           we want our code to be able to show this real word interaction of entities.
//           this is possible with the help of OOPS paradigm
//           Here we take real world entities as objects and just like in real world
//           objects which have properties and functionality we define it inside our code to.
//           rest of the code is about the interaction of these objects, there function and properties.
//           we also define a class ( blueprint / Template ) to make similar type of objects easily.
//

// let's make a class Student, so we can make the students using the blueprints of class.



public class Student {
     public String name ;
     private int age;

     public char section;

     //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
     // WHY NOT ALLOW DIRECT ACCESS? WHY MAKE AGE PRIVATE?

     // if we allow direct access to age anybody can change it with irrelevant
     // value like -45 [ object.age = -45 ]
     // so, we do provide access but not directly but indirectly using getter setter


     //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

     public int getAge(){
          return age;
     }

     public void setAge(int ageInput){
          // we will not accept -ve value for age
          if (ageInput<0){
               return;
          }
          age = ageInput;
     }

}
