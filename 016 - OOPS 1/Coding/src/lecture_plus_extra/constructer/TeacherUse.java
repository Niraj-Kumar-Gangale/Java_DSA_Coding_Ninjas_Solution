package lecture_plus_extra.constructer;

public class TeacherUse {
    public static void main(String[] args) {

        // let's make a Teacher Object
        Teacher t1 = new Teacher();

        t1.setAge(46);
        t1.setName("Heroin");
        t1.print();

        Teacher t4 = new Teacher();
        t4.setName("ramesh");
        t4.setAge(36);
        t4.print();



        Teacher t2;
        t2 = new Teacher("Laura",45);
        t2.print();

        Teacher t3;
        t3 = new Teacher("No1",25);
        t3.print();

    }
}
