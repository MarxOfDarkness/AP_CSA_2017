package csa;

public class RandomDemo {
    public static void main(String[] args){
        int num = 0;

        for (int i = 0; i < 5; i++){
            num = (int) (Math.random() * -50) + (int) (Math.random() * 50);
            System.out.print(num + " ");
        }

        System.out.println();

        for (int i = 0; i < 5; i++){
            num = (int) Math.random() * 6 + 1;
            System.out.print(num + " ");
        }
    }
}
