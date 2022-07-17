package assignment;



public class GeoMetricSum {




    // method 1 0r method 2 same solution
    public static double findGeometricSum(int k){
        // Write your code here
        if (k<0){
            return 0.0;
        }

        // small problem
        // double smallAns = (3*findGeometricSum)/2;

        return findGeometricSum(k-1)+(1/(Math.pow(2,k)));

    }


    // method 2
    public static double findGeometricSum(int k,double sum){
        // Write your code here
        if (k<0){
            return sum;
        }

        //processing / updating
        sum = sum + 1/(Math.pow(2,k));


        return findGeometricSum(k-1,sum);

    }

    public static void main(String[] args) {
        System.out.println(findGeometricSum(5));
        System.out.println(findGeometricSum(5,0.0));
    }
}
