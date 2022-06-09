package ForLoopVariation;

public class ForLoops {
    public static void main(String[] args) {
        // for loop 1st declaration
        for (int i = 1; i<=5 ; i++){
            System.out.println(i);
        }

        // for second type declaration
        int j = 1;
        for (;j<=8 ; j++){
            System.out.println(j);
        }

        // for 3d type declaration
        int k;
        for (k=1; k<=4;k++){
            System.out.println("5");
        }

        // for 4th type declaration
        int l = 8;
        for (int o = l; o<=12; o++){
            System.out.println(o);
        }
        // 2 variable of same type declaration
        // inside for loop

        int small = 4;
        int big = 45;

        for (int e = small , r =big ; e<=small && r <=big; e++, r++ ){
            System.out.println(" e "+e+" r "+r);
        }

        // nesting of for loop

        for (int s= 1; s<=4 ;s++){
            for (int h = 1 ; h<=4 ; h++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
