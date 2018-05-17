package csa;

public class CaptainAmericaBike {


    private double sheildCapacity;

    private double gasTankCapacity;
    private double milesPerTank;

    public CaptainAmericaBike(double sheildCapacity, double gasTankCapacity, double milesPerTank) {
        this.sheildCapacity = sheildCapacity;
        this.gasTankCapacity = gasTankCapacity;
        this.milesPerTank = milesPerTank;
    }


    public double getMileage() {
        return milesPerTank/gasTankCapacity;
    }

    public double getSheildCapacity() {
        return sheildCapacity;
    }
}
