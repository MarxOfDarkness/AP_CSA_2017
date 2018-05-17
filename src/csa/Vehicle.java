package csa;

import java.util.Formatter;

public class Vehicle {
    private String myBrand;
    private int myPrice;
    private double myGasMileage;
    private double myGasPrice;
    private int myYearlyMiles;
    Formatter formatter = new Formatter();


    public Vehicle(String myBrand, int myPrice, double myGasMileage, double myGasPrice, int myYearlyMiles) {
        this.myBrand = myBrand;
        this.myPrice = myPrice;
        this.myGasMileage = myGasMileage;
        this.myGasPrice = myGasPrice;
        this.myYearlyMiles = myYearlyMiles;
    }

    public String getBrand() {
        return myBrand;
    }

    public int getPrice() {
        return myPrice;
    }

    public double getGasMileage() {
        return myGasMileage;
    }

    public double getGasPrice() {
        return myGasPrice;
    }

    public int getYearlyMiles() {
        return myYearlyMiles;
    }

    public String toString(){
        return "Your $" + myPrice + " " + myBrand + " costs " + formatter.format("$.2f", myYearlyMiles / myGasMileage) + " in gas each year!";
    }
}
