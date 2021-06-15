/**
 * This program calculates the areas and the perimeters
 * of the excircle and the incircle of a given rectangle.
 *
 * @author (Yoav Epstein)
 * @version (26/10/20)
 */
import java.util.Scanner;
public class Circle
{
    public static void main (String [] args)
    {
        Scanner scan = new Scanner (System.in);
        
        //Introduction & user guidance  
        System.out.println ("This program calculates the areas " +
            "and the perimeters of the excircle and the incircle " +
            "of a given rectangle ");
        System.out.println ("Please enter the two coordinates of the " +
            "left-upper point of the rectangle");
        int leftUpX = scan.nextInt();
        int leftUpY = scan.nextInt();
        System.out.println ("Please enter the two coordinates of the " +
            "right-lower point of the rectangle" );
        int rightLowX = scan.nextInt();
        int rightLowY = scan.nextInt();
        
        //Incircle measurements
        double inDiameter, inRadius, inArea, inPerimeter;
        inDiameter = Math.sqrt(Math.pow(leftUpY-rightLowY,2));
        //inDiameter is equals to the shorter side of the rectangle
        inRadius = inDiameter/2.0;
        inArea = Math.PI*Math.pow(inRadius,2);
        inPerimeter = 2*Math.PI*inRadius;
        
        //Excircle measurements
        double exDiameter, exRadius, exArea, exPerimeter;
        exDiameter = Math.sqrt(Math.pow(leftUpX-rightLowX,2) + Math.pow(leftUpY-rightLowY,2));
        //exDiameter is equals to the rectangle's diagonal
        exRadius = exDiameter/2.0;
        exArea = Math.PI*Math.pow(exRadius,2);
        exPerimeter = 2*Math.PI*exRadius;
        
        //Measurements output
        System.out.println("Incircle: radius = " + inRadius +",  area = " + inArea + ",  perimeter = " + inPerimeter);
        System.out.println("Excircle: radius = " + exRadius +",  area = " + exArea + ",  perimeter = " + exPerimeter);
    } // end of method main
} //end of class Circle

