package csa;

/**
 * Write a description of class DriveCar here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DriveCar{
    public static void main(String[] args){
        Car car1 = new Car();
        Car car2 = new Car(2002, "Honda", 85);
        Car car3 = new Car(2003, "Honda", 105);
        car1.setYear(2001);
        car1.setMake("Toyota");
        car1.setSpeed(120);
        car2.upSpeed(10);
        car3.downSpeed(10);
        System.out.println("Year: " + car1.year);
        System.out.println("Year: " + car2.year);
        System.out.println("Year: " + car3.year);
        System.out.println("Make: " + car1.make);
        System.out.println("Make: " + car2.make);
        System.out.println("Make: " + car3.make);
        System.out.println("Speed: " + car1.speed);
        System.out.println("Speed: " + car2.speed);
        System.out.println("Speed: " + car3.speed);
    }
}
