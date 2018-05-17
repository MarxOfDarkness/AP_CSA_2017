package csa;

public class Car extends Vehicle {
    private String myCarType;
    private int myNumPassengers;
    private int myNumDoors;

    public Car(String myBrand, int myPrice, double myGasMileage, double myGasPrice, int myYearlyMiles, String myCarType, int myNumPassengers, int myNumDoors) {
        super(myBrand, myPrice, myGasMileage, myGasPrice, myYearlyMiles);
        this.myCarType = myCarType;
        this.myNumPassengers = myNumPassengers;
        this.myNumDoors = myNumDoors;
    }

    public String getCarType(){
        return myCarType;
    }
    public int getNumPassengers(){
        return myNumPassengers;
    }
    public int getNumDoors(){
        return myNumDoors;
    }

    public String toString(){
        return "Your $" + getPrice() + " " + getBrand() + " " + myCarType + " costs " + formatter.format("$%.2f", getYearlyMiles() / getGasMileage() * getGasPrice()) + " in gas each year!\nIt has " + myNumDoors + " doors and carries " + myNumDoors + " passengers.";
    }
}
