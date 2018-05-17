package csa;

public class Motorcycle extends VehicleClass{
    private double gasTankCapacity;
    private double milesPerTank;

    public Motorcycle(double miles, double capacity, String vType, String vName){
        super(vType, vName);
        gasTankCapacity = capacity;
        milesPerTank = miles;
    }

    @Override
    public double getMileage() {
        return milesPerTank/gasTankCapacity;
    }
}
