package csa.dice;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Write a description of class RollDice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RollDice
{
    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(
            new InputStreamReader(System.in)
        );
        Die die1 = new Die();
        Die die2 = new Die();
        
        while(true){
            System.out.println("Press enter key to roll");
            String read = in.readLine();
            if(read.equals("stop")){
                break;
            }
            System.out.println(die1.roll() + " " + die2.roll());
        }
        
    }
}

