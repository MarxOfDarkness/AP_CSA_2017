package csa;

public class SUV extends Car {
    private String myColor;
    public SUV(String myBrand, int myPrice, double myGasMileage, double myGasPrice, int myYearlyMiles, String myCarType, int myNumPassengers, int myNumDoors, String myColor) {
        super(myBrand, myPrice, myGasMileage, myGasPrice, myYearlyMiles, myCarType, myNumPassengers, myNumDoors);
        this.myColor = myColor;
    }
}
