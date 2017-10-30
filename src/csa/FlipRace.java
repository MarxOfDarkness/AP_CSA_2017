package csa;

/**
 * Write a description of class FlipRace here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FlipRace
{
    public static void main(String[] args){
        final int GOAL = 3;
        int count1 = 0, count2 = 0;
        
        Coin coin1 = new Coin();
        Coin coin2 = new Coin();
        while (count1 < GOAL && count2 < GOAL){
            coin1.flip();
            coin2.flip();
            
            //print the flip results (uses Coin's toString method)
            System.out.print ("Coin 1: " + coin1);
            System.out.println ("   Coin 2: " + coin2);
            
            //increment or reset the counters
            if (coin1.isHeads())
                count1++;
            else
                count1 = 0;
            if (coin2.isHeads())
                count2++;
            else
                count2 = 0;
        }
        
        //Determine the winner
        if (count1 < GOAL)
            System.out.println("Coin 2 Wins!");
        else
            if (count2 < GOAL)
                System.out.println("Coin 1 Wins!");
    }
}
