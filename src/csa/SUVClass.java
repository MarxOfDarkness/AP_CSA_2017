package csa;

public class SUVClass extends VehicleClass {
    private double gasTankCapacity;
    private double milesPerTank;

    public SUVClass(double capacity, double miles, String vType, String vName){
        super(vType, vName);
        gasTankCapacity = capacity;
        milesPerTank = miles;
    }

    @Override
    public double getMileage() {
        return milesPerTank/gasTankCapacity;
    }
}
