package csa;

public abstract class VehicleClass {
    private String type;
    private String vehicleName;

    public VehicleClass(String vType, String vName) {
        type = vType;
        vehicleName = vName;
    }

    public abstract double getMileage();
}

