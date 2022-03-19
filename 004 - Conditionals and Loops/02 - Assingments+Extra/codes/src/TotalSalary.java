import java.util.Scanner;

public class TotalSalary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int basic = scan.nextInt();
        char grade = scan.next().charAt(0);
        double hra = (.20)*basic;

        double da = (.50)*basic;

        double pf = (.11)*basic;

        int allow ;

        if (grade=='A'){
            allow =  1700;
        }
        else if (grade == 'B'){
            allow = 1500;
        }
        else{
            allow = 1300;
        }
        double totalSalary = basic + allow +(hra + da -pf);
        double r = totalSalary- (int)totalSalary;
        if (r>0.5){
            System.out.println((int)totalSalary+1);
        }
        else{
            System.out.println((int)totalSalary);
        }
    }
}
