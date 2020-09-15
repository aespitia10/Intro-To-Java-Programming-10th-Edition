import java.util.*;
public class MyTriangle 
{
    public static void main(String []args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three sides of a triangle: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        System.out.println((isValid(a, b, c)) ? "Area is: " + area(a, b, c) : "Invalid sides" );

        input.close();

    }

    public static boolean isValid(double side1, double side2, double side3) 
    {
        if(side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1)
        {
            return true;
        }
        else 
            return false;
    }

    public static double area(double side1, double side2, double side3)
    {
        double s = (side1 + side2 + side3) / 2.0;
        return Math.sqrt((s) * (s - side1) * (s - side2) * (s - side3));
    }
}