package lecture_plus_extra.return_keypad;



public class Keypad {

    public static  char[] charIn (int n){
        switch (n){
            case 2:
                return new char[]{'a', 'b', 'c'};
            case 3:
                return new char[]{'d', 'e', 'f'};

            case 4:
                return new char[]{'g', 'h', 'i'};

            case 5:
                return new char[]{'j', 'k', 'l'};

            case 6:
                return new char[]{'m', 'n', 'o'};

            case 7:
                return new char[]{'p', 'q', 'r','s'};

            case 8:
                return new char[]{'t', 'u', 'v'};

            case 9:
                return new char[]{'w', 'x', 'y','z'};


            default:
                return new char[0];
        }
    }


    // method 1 solving the number from backward
    public static String[] keypad(int n){
        // base case
        if (n==0){
            return new String[]{""};
        }

        // small problem

        String[] smallAns = keypad(n/10);
        char[] charInNum = charIn(n%10);
        String[] ans = new String[smallAns.length*charInNum.length];
        int k = 0 ;
        for (int i = 0 ; i < smallAns.length;++i){
            for (int j = 0 ; j < charInNum.length ; ++j){
                ans[k]= smallAns[i]+charInNum[j];
                k++;
            }
        }
        return ans;

    }


    // method 1 solving the number from forward
    public static String[] keypad2(int n){
        // base case
        if (n==0){
            return new String[]{""};
        }
        String s = Integer.toString(n);
        int lengthOfNum = s.length();

        int num = (int)Math.pow(10,lengthOfNum-1);

        String[] smallAns = keypad2(n%num);
        char[] charInNum = charIn(n/num);
        String[] ans = new String[smallAns.length*charInNum.length];
        int k = 0 ;
        for (int i = 0 ; i < smallAns.length;++i){
            for (int j = 0 ; j < charInNum.length ; ++j){
                ans[k]= charInNum[j]+smallAns[i];
                k++;
            }
        }
        return ans;

    }

    // solving the number by passing the ans to the next recursion
    public static String[] keypad3(int n,String[] ans){
        // base case
        if (n==0){
            return ans;
        }

        // small problem

//        String[] smallAns = keypad(n/10);
        char[] charInNum = charIn(n%10);
        String[] temp = new String[ans.length*charInNum.length];
        int k = 0 ;
        for (int i = 0 ; i < ans.length;++i){
            for (int j = 0 ; j < charInNum.length ; ++j){
                temp[k]= charInNum[j]+ans[i];
                k++;
            }
        }
        ans = temp;
        return keypad3(n/10,ans);

    }

    public static void main(String[] args) {
        String[] ans = keypad(234);
        for (int i = 0 ; i < ans.length ;++i){
            System.out.print(ans[i] +" ");
        }
        System.out.println();
        String[] ans2 = keypad2(234);
        for (int i = 0 ; i < ans2.length ;++i){
            System.out.print(ans2[i]+" ");
        }

        System.out.println();
        String[] ans3 = keypad3(234,new String[]{""});
        for (int i = 0 ; i < ans3.length ;++i){
            System.out.print(ans3[i]+" ");
        }


    }


}
