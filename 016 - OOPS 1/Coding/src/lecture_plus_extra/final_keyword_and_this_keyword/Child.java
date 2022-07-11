package lecture_plus_extra.final_keyword_and_this_keyword;


// if you make any properties [data member] finale
// then you can only set it vale once after that it will
// not change, the value become final value for the
// data member .

// FINAL is the key word used to make it final
// you are only given one chance to initialize it.
// And there is only two ways to initialize it
//-------------------------------------------------------------------
// 1] when you declare a data member final initialize it there only.
//              public class Child {
//                  private String name;
//                  private int age = 45;
//              }
//-------------------------------------------------------------------
// 2] inside the constructor, if yoU chose this option
// THEN YOU HAVE TO INITIALIZE IT INSIDE EVERY CONSTRUCTOR
// because java give only one chance to set the value for the final
// data member and that to at the time of object formation by using the constructor
// so if you use a constructor without final data member initialization
//                 Child(){
//
//                 }
// then you have lost the only opportunity given to you set the value of final data member
//  the only given chance is wasted and the value for final data member is not set
//                  this is a blunder BLUNDER !!!!!!!!!!!
// AND JAVA WANT US TO USE THIS OPPORTUNITY SO IT WILL FORCE US TO INITIALIZE THE VALUE
// INSIDE THE CONSTRUCTOR AND WITHOUT INITIALIZATION YOU CAN NOT MAKE A CONSTRUCTOR




class Child {
    // as we make name final then there is no need for the setter for name
    final private String name;
    private int age;

    // ####################################################
    // ####################################################
    // ####################################################

    // let's do some math for this key word
    //----------------------------------------------
    /*
        {
            int a = 45;
            if (a%2==0){
                int a =45; // not possible inside main function
            }
        }
     */
    //-------------------------------------------
    //-------------------------------------------
    /*
        what about using inside class lets try it
                ||||||||
                  ||||
                  ||||
                  ||||
                \\||||//
                 \\||//
                   \/

        int a = 90;
            // function which uses the value of a
        public int returnA(){
            // return value have value 90.
            return a;

         }


         int a = 90;
         // function which uses the value of a
         public int returnA(){

            // if a is defined then the local variable is returned.
            int a = 89;
            return a;
        }

        int a = 100;
        public int returnAPlusB(int b){
            a = 200;
            return a+b;
        }


      <<<<<- CONCLUSION ->>>>>
        if you do not initialize a local variable [a]
        then the value of data member will be used inside function.

        But if you initialize a variable with same name as data member
        then local variable will  be given preference inside the function
        at any place.

        so, if you want to use the data member inside the same function with
        same name as local variable then you can use this keyword.
     <<<<<- CONCLUSION ->>>>>

     */
    //------------------------------------------
    public int returnAUsingThisKeyWord(int a){
        return this.a;
    }

    public int returnA(int a){
        return a;
    }

    public int printA(){
        // return value have value 90.
        //return a;

        // if a is defined then the local variable is returned.
        int a = 100;
     //this.printThis();
        return a;
    }

    public int returnAPlusB(int b){
        a = 200;

    //this.printThis();
        return a+b;
    }

    int a = 90;

    public void printThis(){
        System.out.println(this);

    }


    // ################################################
    // ################################################
    // ################################################



    // getter and  setter for the Child properties
    int getAge(){
        return age;
    }
    void setAge(int ageInput){
        age = ageInput;
    }

    String getName(){
        return name;
    }
// <<<<<< we set the name as final >>>>>>>
//    void setName(String nameInput){
//        name = nameInput;
//    }

    // make printing of data easy\
    public void print(){
        System.out.println("Name "+ name + " Age "+ age);
    }

    // let's make some constructor for us
    // name is made final so initialize it brother

    public Child(String nameInput){
        name = nameInput;
    }

    // you can something like this
    // make NPC

    public Child (){
        this("NPC");
        //this will not create any problem
        //for final keyword
    }
}
