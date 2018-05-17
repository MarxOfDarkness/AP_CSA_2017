package csa;

public class TestThis {
    public static void main(String[] args) {
        int result = identity(10);
        System.out.println("The final answer is " + result);
        int result2 = negative(-3);
        System.out.println("The final answer is " + result2);
        int result3 = product(1);
        System.out.println("The final answer is " + result3);
    }

    private static int identity(int num){
        if(num < 1){
            return 10;
        }else{
            return num + identity(num - 2);
        }
    }

    private static int negative(int num){
        if(num >= 20){
            return -5;
        }else{
            return negative(num + 4) + 2 * num;
        }
    }

    private static int product(int num){
        if(num > 20){
            return -1;
        }else{
            return num * product(-2 * num);
        }
    }
}
