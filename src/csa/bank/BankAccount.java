package csa.bank;
/**
 * Write a description of class BankAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class BankAccount{
    double ammount;
    String password;
    double rate;
    BankAccount(){
        this(0.0, "password", 0.06);
    }
    BankAccount(double ammount){
        this(ammount, "password", 0.06);
    }
    BankAccount(double ammount, String password){
        this(ammount, password, 0.06);
    }
    BankAccount(double ammount, String password, double rate){
        this.ammount = ammount;
        this.password = password;
        this.rate = rate;
    }
    public void setPassword(){
        System.out.println("Old password: ");
        Scanner scanner = new Scanner(System.in);
        String passIn = scanner.nextLine();
        System.out.println("New password: ");
        String newPass = scanner.nextLine();
        if (passIn.equals(password)){
            this.password = newPass;
            System.out.println("Password has been changed");
        }    
        else{
            System.out.println("Invalid old password.");
        }
        this.password = password;
    }
    public void checkAmmount(){
        System.out.println("Password: ");
        Scanner scanner = new Scanner(System.in);
        String passIn = scanner.nextLine();
        if (passIn.equals(password)){
            System.out.println(ammount);
        }    
        else{
            System.out.println("Invalid password.");
        }
        
    }
    public void Deposit(double ammount){
        System.out.println("Password: ");
        Scanner scanner = new Scanner(System.in);
        String passIn = scanner.nextLine();
        if (passIn.equals(password)){
            System.out.println(ammount);
            this.ammount += ammount;
            System.out.println(ammount);
        }    
        else{
            System.out.println("Invalid password.");
        }
    }
    public void Remove(double ammount){
        System.out.println("Password: ");
        Scanner scanner = new Scanner(System.in);
        String passIn = scanner.nextLine();
        if (passIn.equals(password)){
            System.out.println(ammount);
            this.ammount -= ammount;
            System.out.println(ammount);
        }    
        else{
            System.out.println("Invalid password.");
        }
    }
}
