package csa;

public class LoopsDemo {
    public static void main(String[] args){
        for(int A = 0; A <= 20; A++){
            if(A % 2 == 0){
                System.out.print(A + " ");
            }
        }
        System.out.println();

        for (int B = 24; B >= 4; B --){
            if (B % 4 == 0){
                System.out.print(B + " ");
            }
        }
        System.out.println();

        int count = 0;
        for (int C = 1; C <= 1000000; C++){
            count += C;
        }
        System.out.println("Sum of numbers from 1 to 1000000: " + count);
        System.out.println();

        count = 0;
        int nums = 0;
        for(int D = 1; D <= 1000001; D++){
            count += D;
            nums += 1;
        }
        System.out.println("Average of numbers from 1 to " + nums + ": " + count/nums);
        System.out.println();

        for(int E = 0; E < 5; E++){
            int num = (int) (Math.random() * 100) + 1;
            System.out.print(num + " ");
        }
        System.out.println();

        for (int F = 0; F < 10; F++){
            int num = (int) (Math.random() * 20) + 1;
            System.out.print(num + " ");
            if (num == 10){
                System.out.println("10 was found!");
            }
            else{
                System.out.println("10 was not found");
            }
        }
        System.out.println();

        int largest = 0;
        for (int G = 0; G < 20; G++){
            int num = (int) (Math.random() * -50) + (int) (Math.random() * 50);
            System.out.print(num + " ");
            if (num > largest){
                largest = num;
            }
        }
        System.out.println(largest);
        System.out.println();


    }
}
