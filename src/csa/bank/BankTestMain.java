package csa.bank;

/**
 * Write a description of class BankTestMain here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankTestMain {
    public static void main(String[] args) {
        /**PiggyBank piggy = new PiggyBank();
         *piggy.addQuarters(14);
         *piggy.addNickles(20);
         *piggy.addPennies(87);
         *piggy.addPennies(-87);
         */
        BankAccount myAccount = new BankAccount();
        myAccount.setPassword();
        myAccount.checkAmmount();
        myAccount.Deposit(200);
    }
}
