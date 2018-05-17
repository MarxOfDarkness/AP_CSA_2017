package csa;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CarRental {
    private static BufferedReader in = new BufferedReader(
            new InputStreamReader(System.in));
    private static String licensePlateLetters;
    private static int licensePlateNumbers;
    private String make;
    private String model;
    private static String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static char[] alphabet = alpha.toCharArray();
    public String getMake() {return make;}

    public String getModel() {return model;}
    public String getLicensePlateLetters() {return licensePlateLetters;}

    public int getLicensePlateNumbers() {return licensePlateNumbers;}

    public static String getCode() {
        String str = licensePlateLetters.toUpperCase();
        char[] letter = str.toCharArray();
        char a = letter[0];
        char b = letter[1];
        char c = letter[2];
        int ascii1 = (int) a;
        int ascii2 = (int) b;
        int ascii3 = (int) c;
        int newCode = (ascii1 + ascii2 + ascii3 + licensePlateNumbers);
        int num = newCode % 26;
        return ("" + alphabet[num] + newCode);
    }

    public CarRental(String letters, String numbers, String make, String model){
        licensePlateLetters = letters;
        licensePlateNumbers = Integer.parseInt(numbers);
        this.make = make;
        this.model = model;
    }
    public static void main(String[] args)throws Exception{
        System.out.println("Make of the car: ");
        String read1 = in.readLine();
        System.out.println("Model of the car: ");
        String read2 = in.readLine();
        System.out.println("License plate: ");
        String read3 = in.readLine();
        CarRental car = new CarRental(read3.substring(0, 3), read3.substring(3), read1, read2);
        System.out.println("Make = " + car.getMake());
        System.out.println("Model = " + car.getModel());
        System.out.println(getCode());

    }

    public static class Student {

    }
}
