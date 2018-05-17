package csa;


public class TronCycle extends Motorcycle{
    private double maxCharge;
    private double milesPerCharge;
    private double maxEnergyUsage;


    public TronCycle(double charge, double maxEnergy, double milesCharge, String vType, String vName, double capacity, double miles){
        super(miles, capacity, vType, vName);
        maxCharge = charge;
        maxEnergyUsage = maxEnergy;
        milesPerCharge = milesCharge;
    }

    public double getMileage() {
        return (maxCharge*milesPerCharge)/maxEnergyUsage;
    }

}
