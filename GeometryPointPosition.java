import java.util.*;
public class GeometryPointPosition 
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three points for p0, p1, and p2: ");
        double x0 = input.nextDouble();
        double y0 = input.nextDouble();
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        if(leftOfTheLine(x0, y0, x1, y1, x2, y2))
        {
            System.out.printf("(%.2f, %.2f) is on the left side of the line from (%.2f, %.2f) to (%.2f, %.2f)", x2,y2, x0, y0, x1, y1);
        }
        else if(onTheSameLine(x0, y0, x1, y1, x2, y2))
        {
            System.out.printf("(%.2f, %.2f) is on the same line from (%.2f, %.2f) to (%.2f, %.2f)", x2,y2, x0, y0, x1, y1);

        }
        else if(onTheLineSegment(x0, y0, x1, y1, x2, y2))
        {
            System.out.printf("(%.2f, %.2f) is on the line segment from (%.2f, %.2f) to (%.2f, %.2f)", x2,y2, x0, y0, x1, y1);
        }
        else
        System.out.printf("(%.2f, %.2f) is on the right side of the line from (%.2f, %.2f) to (%.2f, %.2f)", x2,y2, x0, y0, x1, y1);

        input.close();
    }

    public static boolean leftOfTheLine(double x0, double y0, double x1, double y1, double x2, double y2)
    {
        double d = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
        if(d > 0)
        {
            return true;
        }
        return false;
    }

    public static boolean onTheSameLine(double x0, double y0, double x1, double y1, double x2, double y2)
    {
        double d = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
        if(d == 0)
        {
            return true;
        }
        return false;
    }

    public static boolean onTheLineSegment(double x0, double y0, double x1, double y1, double x2, double y2)
    {
        double d = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
        if((d == 0) && (x2 > x0) && (y2 > y0) && (x2 < x1) && (y2 < y1))
        {
            return true;
        }
        else 
            return false;
    }
}