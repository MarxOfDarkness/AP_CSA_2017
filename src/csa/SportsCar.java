package csa;

public class SportsCar extends Car{
    private String myColor;
    private double myEngine;
    private String mySuspension;
    private String myTires;

    public SportsCar(String myBrand, int myPrice, double myGasMileage, double myGasPrice, int myYearlyMiles, String myCarType, int myNumPassengers, int myNumDoors, String myColor, double myEngine, String mySuspension, String myTires) {
        super(myBrand, myPrice, myGasMileage, myGasPrice, myYearlyMiles, myCarType, myNumPassengers, myNumDoors);
        this.myColor = myColor;
        this.myEngine = myEngine;
        this.mySuspension = mySuspension;
        this.myTires = myTires;
    }

    @Override
    public String toString() {
        return super.toString() + "\n Your cool" + myColor + " sports car has a " + myEngine + " liter engine, " + mySuspension + " suspension and " + myTires + " tires.";
    }
}
