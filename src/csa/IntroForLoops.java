package csa;

import java.util.*;
public class IntroForLoops{
    public static void main(String [] args) {
        int count, number, sum;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter a number: ");
        number = keyboard.nextInt();


        sum = 0;
        // add even numbers
        for(count = 1; count<=number; count++){
            if (count %2 == 0){
                sum = sum + count;
            }
        }
        System.out.println("Sum of even numbers from  1 to "+number+" is "+sum);

        sum = 0;
        // add odd numbers
        for(count = 1; count<=number; count++){
            if (count %2 == 1){
                sum = sum + count;
            }
            count++;
        }
        System.out.println("Sum of odd numbers from  1 to "+number+" is "+sum);


    }
}

