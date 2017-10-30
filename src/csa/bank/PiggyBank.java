package csa.bank;

/**
 * Creates a piggy bank with various coins that can be added
 *
 * @author Corbin Estes
 * @version 10-23-17
 */
public class PiggyBank{
   public double pennies;
   public double nickles;
   public double dimes;
   public double quarters;
   public double totalCents;
   public PiggyBank(){
       this(0, 0, 0, 0);
   }
   public PiggyBank(int pennies){
       this(pennies, 0, 0, 0);
   }
   public PiggyBank(int pennies, int nickles){
       this(pennies, nickles, 0, 0);
   }
   public PiggyBank(int pennies, int nickles, int dimes){
       this(pennies, nickles, dimes, 0);
   }
   public PiggyBank(int pennies, int nickles, int dimes, int quarters){
       this.pennies = pennies;
       this.nickles = nickles;
       this.dimes = dimes;
       this.quarters = quarters;
       this.totalCents = pennies + (nickles * 5) + (dimes * 10) + (quarters * 25);
   }
   public double getPennies(){
       return this.pennies;
   }
    public double getNickles(){
       return this.nickles;
   }
    public double getDimes(){
       return this.dimes;
   }
    public double getQuarters(){
       return this.quarters;
   }
   public void addPennies(int numPennies){
       System.out.println("Old number of pennies: " + this.pennies);
       System.out.println("Old total : " + this.totalCents/100 + " dollars ");
       this.pennies += numPennies;
       this.totalCents += numPennies * 1;
       System.out.println("New number of pennies: " + this.pennies);
       System.out.println("New total : " + this.totalCents/100 + " dollars ");
   }
   public void addNickles(int numNickles){
       System.out.println("Old number of nickles: " + this.nickles);
       System.out.println("Old total : " + this.totalCents/100 + " dollars ");
       this.nickles += numNickles;
       this.totalCents += (numNickles * 5);
       System.out.println("New number of nickles: " + this.nickles);
       System.out.println("New total : " + this.totalCents/100 + " dollars ");
   }
   public void addDimes(int numDimes){
       System.out.println("Old number of dimes: " + this.dimes);
       System.out.println("Old total : " + this.totalCents/100 + " dollars ");
       this.dimes += numDimes;
       this.totalCents += (numDimes * 10);
       System.out.println("New number of dimes: " + this.dimes);
       System.out.println("New total : " + this.totalCents/100 + " dollars ");
   }
   public void addQuarters(int numQuarters){
       System.out.println("Old number of quarters: " + this.quarters);
       System.out.println("Old total : " + this.totalCents/100 + " dollars ");
       this.quarters += numQuarters;
       this.totalCents += (numQuarters * 25);
       System.out.println("New number of quarters: " + this.quarters);
       System.out.println("New total : " + this.totalCents/100 + " dollars ");
   }
   public void getTotal(){
       System.out.println("The total ammount is " + this.totalCents/100 + " dollars ");
   }
}
