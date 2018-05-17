package csa;

public class Truck extends Vehicle {
    private String myTruckType;
    private int myHaulingPounds;
    private int myTowingPounds;

    public Truck(String myBrand, int myPrice, double myGasMileage, double myGasPrice, int myYearlyMiles, String myTruckType, int myHaulingPounds, int myTowingPounds) {
        super(myBrand, myPrice, myGasMileage, myGasPrice, myYearlyMiles);
        this.myTruckType = myTruckType;
        this.myHaulingPounds = myHaulingPounds;
        this.myTowingPounds = myTowingPounds;
    }

    public String getTruckType() {
        return myTruckType;
    }

    public int getHaulingPounds() {
        return myHaulingPounds;
    }

    public int getMyTowingPounds() {
        return myTowingPounds;
    }

    @Override
    public String toString() {
        return super.toString() +  "\nThis " + myTruckType + " can carry " + myHaulingPounds + " pounds and can tow " + myTowingPounds + " pounds";
    }
}
