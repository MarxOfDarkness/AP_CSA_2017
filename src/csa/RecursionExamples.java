package csa;

public class RecursionExamples {
    public static void main(String[] args){
        System.out.println(mist(12));
        System.out.println(power(2,4));
        System.out.println("The final answer is " + identity(10));
        System.out.println("The final answer is " + negative(-3));
        System.out.println("The final answer is " + product(1));
        weirdo(40);
        weirdom(40);
        System.out.println(testMethod("Happy Halloween"));
        System.out.println(occurrenceCount("", ""));
    }

    private static int mist(int n){
        if (n == 1){
            return 3;
        }
        else {
            return 3 * mist(n-1);
        }
    }

    private static int identity(int num){
        if (num < 1){
            return 10;
        }
        else {
            return num + identity(num - 2);
        }
    }

    private static int negative (int num){
        if (num >= 20){
            return - 5;
        }
        else{
            return negative(num + 4) * num;
        }
    }

    private static int product (int num){
        if (num > 20){
            return -1;
        }
        else {
            return num * product(-2 * num);
        }
    }

    private static void weirdo (int x){
        if (x > 1){
            weirdo(x/2);
        }
        System.out.print(x + " ");
    }

    private static void weirdom (int x){
        System.out.print(x + " ");
        if (x > 1){
            weirdom(x/2);
        }
    }

    private static String testMethod (String s){
        for(int i = 0; i < s.length(); i += 3){
            s = s.substring(0, i) + "-" + s.substring(i + 1);
        }
        return s;
    }

    private static int occurrenceCount (String a, String b){
        int count = 0;
        for (int i = 0; i < a.length(); i += b.length()){
            if (a.substring(i, i + b.length()).equals(b)){
                count += 1;
            }
        }
        return count;
    }
    private static int power(int base, int exp){
        if (exp == 0){
            return 1;
        }
        else {
            return base * power(base, exp - 1);
        }
    }

    //private static int nega(int num);
}
