package csa.dice;

public class PairOfDice{
   public static void main(String[] args){
          Die die1 = new Die();
          Die die2 = new Die();
          final int ROLLS = 1000;
          int boxCars = 0, num1, num2;
       for (int roll = 1; roll <= ROLLS; roll++){
           num1 = die1.roll();
           num2 = die2.roll();
           
           if (num1 == 6 && num2 == 6){
               boxCars++;
           }
       }
       System.out.println ("Number of rolls: " + ROLLS);
       System.out.println ("Number of box cars: " + boxCars);
       System.out.println ("Ratio: " + (double)boxCars/ROLLS);
   }
}
