package csa;

public class ElectricCar extends VehicleClass{
    private double maxCharge;
    private double milesPerCharge;
    private double maxEnergyUsage;

    public ElectricCar(double charge, double maxEnergy, double milesCharge, String vType, String vName){
        super(vType, vName);
        maxCharge = charge;
        maxEnergyUsage = maxEnergy;
        milesPerCharge = milesCharge;
    }

    public double getMileage() {
        return (maxCharge*milesPerCharge)/maxEnergyUsage;
    }
}
