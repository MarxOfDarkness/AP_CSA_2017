package csa;

public class VTruck extends VehicleClass{
    private double gasTankCapacity;
    private double milesPerTank;

    public VTruck(double capacity, double miles, String vType, String vName){
        super(vType, vName);
        gasTankCapacity = capacity;
        milesPerTank = miles;
    }

    public double getMileage(){
        return milesPerTank/gasTankCapacity;
    }
}
