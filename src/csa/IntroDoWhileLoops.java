package csa;

import java.util.*;
public class IntroDoWhileLoops{
    public static void main(String [] args) {
        int count, number, sum;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter a number: ");
        number = keyboard.nextInt();

        count = 1;
        sum = 0;
        // add even numbers
        do {
            if (count %2 == 0)
            {
                sum = sum + count;
            }
            count++;
        }while(count<=number);
        System.out.println("Sum of even numbers from  1 to "+number+" is "+sum);

        count = 1;
        sum = 0;
        // add odd numbers
        do {
            if (count %2 == 1)
            {
                sum = sum + count;
            }
            count++;
        }while(count<=number);
        System.out.println("Sum of odd numbers from  1 to "+number+" is "+sum);

    }
}
