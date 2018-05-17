package csa;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double findArea(){
        return radius * Math.PI;
    }

    public double getRadius() {
        return radius;
    }
}
