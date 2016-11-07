/**
 * Created by Lazarus on 7.11.2016.
 */
public class ValueMethods1 {
    public static double calculateArea(double radius){
        double result = Math.PI * Math.pow(radius,2);
        return result;
    }
    /*
    public static void main(String[]args){
        System.out.print(calculateArea(2.0));
    }

    */
   public static double distance(double x1, double y1, double x2, double y2){
       double dx=x2-x1;
       double dy=y2-y1;
       double dsquared = dx * dx + dy * dy;
       double result = Math.sqrt(dsquared);
       return result;
   }
   public static void main(String[]args){
       double radius= distance(2.0, 2.5, 2.8, 4.2);
       System.out.printf("radius is %.3f\n", radius);
       calculateArea(radius);
       System.out.printf("Circle area is %.3f", calculateArea(radius));
   }
}
