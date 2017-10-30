package csa;

/**
 * Write a description of class Car here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Car{
   int year;
   String make;
   int speed;
   public Car(){
       this(2000, "Honda", 85);
   }
   public Car(int year, String make, int speed){
       this.year = year;
       this.make = make;
       this.speed = speed;
   }
   public int getYear(){
       return this.year;
   }
   public String getMake(){
       return this.make;
   }
   public int getSpeed(){
       return this.speed;
   }
   public void setYear(int year){
       this.year = year;
   }
   public void setMake(String make){
       this.make = make;
   }
   public void setSpeed(int speed){
       this.speed = speed;
   }
   public void upSpeed(int increase){
       this.speed += increase;
   }
   public void downSpeed(int decrease){
       if (this.speed > 0){
           this.speed -= 0;
       }
   }
}
