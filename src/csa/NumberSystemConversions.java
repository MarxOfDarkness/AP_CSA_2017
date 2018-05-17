package csa;

public class NumberSystemConversions {
    private static void toBinary(int inBase10){
        if (inBase10 <= 1){
            System.out.print(inBase10);
        }
        else{
            toBinary(inBase10 / 2);
            System.out.print(inBase10 % 2);
        }
    }

    private static int toInteger(String inBase2){
        if (inBase2.length() == 0){
            return 0;
        }
        else{
            inBase2.substring(0, 1);
            return 9;
        }
    }

    public static void main (String[] args){
        toBinary(34);
    }
}
