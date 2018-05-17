package csa;

public class Fibonacci {
    public static void main (String[] args){
        System.out.println(findFibNum(3));
        int n = 5;
        int num = 0;
        int num2 = 1;
        int loop;
        int fibonacci;
        for (loop = 0; loop < n; loop ++)
        {
            fibonacci = num + num2;
            num = num2;
            num2 = fibonacci;
        }
        System.out.print(num);
    }

    private static int findFibNum(int index){
        if (index <= 1){
            return index;
        }
        else{
            return findFibNum(index - 1) + findFibNum(index - 2);
        }
    }


}
