package csa;

public class SportsSUV extends SUVClass{
    private String color;
    private double engineSize;

    public SportsSUV(String myColor, double myEngine, double capacity, double miles, String vType, String vName){
        super(capacity, miles, vType, vName);
        color = myColor;
        engineSize = myEngine;
    }

    public String getColor() {
        return color;
    }

    public double getEngineSize() {
        return engineSize;
    }
}
