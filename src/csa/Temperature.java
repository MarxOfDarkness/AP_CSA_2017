package csa;

/**
 * Convert and compare user defined temperatures
 *
 * @author Corbin Estes
 * @version 10-18-17
 */
public class Temperature{
   private double value;
   private char scale;
   public Temperature(){
       this(0.0, 'C');
   }
   public Temperature(char scale){
       this(0.0, scale);
   }
   public Temperature(double value){
       this(value, 'C');
   }
    public Temperature(double value, char scale){
       this.value = value;
       this.scale = scale;
   }
   private static String format(double value, char scale){
       return String.format("%.1f degrees " + scale, value);
   }
   public String getAsCelsius(){
       return format(getAsCelsiusValue(), 'C');
   }
   public double getAsCelsiusValue(){
       if (scale == 'C'){
           return value;
       }
       return (value * (9d/5d)) + 32;
   }
   public String getAsFahrenheit(){
       return format(getAsFahrenheitValue(), 'F');
   }
   public double getAsFahrenheitValue(){
       if (scale == 'F'){
           return value;
       }
       return (value - 32) * (5d/9d);
   }
   public void resetScale(char scale){
       //Should this scale the value?
       this.scale = scale;
   }
   public void resetValue(double value){
       this.value = value;
   }
   public void reset(char scale, double value){
       this.value = value;
       this.scale = scale;
   }
   public static boolean testEqual(Temperature temp1, Temperature temp2){
       return temp1.getAsCelsius().equals(temp2.getAsCelsius());
   }
   public static boolean testGreaterThan(Temperature temp1, Temperature temp2){
       return temp1.getAsCelsiusValue() > temp2.getAsCelsiusValue();
   }
   public static boolean testLessThan(Temperature temp1, Temperature temp2){
       return temp1.getAsCelsiusValue() < temp2.getAsCelsiusValue();
   }
   public static void main(String[] args){
       render(new Temperature());
       render(new Temperature('F'));
       render(new Temperature(10.0));
       render(new Temperature(10.0, 'F'));
       System.out.println(Temperature.testEqual(new Temperature('C'), new Temperature(32.0, 'F')));
       System.out.println(Temperature.testEqual(new Temperature(-40.0, 'C'), new Temperature(-40.0, 'F')));
       System.out.println(Temperature.testEqual(new Temperature(100.0, 'C'), new Temperature(212.0, 'F')));
   }
   public static void render(Temperature temp){
       System.out.println(temp.getAsCelsiusValue());
       System.out.println(temp.getAsFahrenheitValue());
   }
}
