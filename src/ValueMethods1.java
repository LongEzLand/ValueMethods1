/**
 * Created by Lazarus on 7.11.2016.
 */
public class ValueMethods1 {
    public static double calculateArea(double radius){
        double result = Math.PI * Math.pow(radius,2);
        return result;
    }
    public static void main(String[]args){
        System.out.print(calculateArea(2.0));
    }
}