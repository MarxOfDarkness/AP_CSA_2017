package csa;

/**
 * Write a description of class Rational here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rational{
   private int numerator, denominator;
   //Sets up the rational number ensuring a nonzero denominator and
   //making only the numerator signed.
   public Rational (int numer, int denom){
       if (denom == 0)
           denom = 1;
       
       // make the numerator "store" the sign
       if (denom < 0){
           numer = numer * -1;
           denom *= -1;
       }
       
       numerator = numer;
       denominator = denom;
       
       reduce();
   }

    private void reduce() {
    }

    //Returns the denominator
   public int getDenominator(){
       return denominator;
   }
   
   //Returns the reciprocal
}
