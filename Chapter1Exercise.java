public class Chapter1Exercise
{
    public static void main(String[]args)
    {
        // Exersice 1.1 
        System.out.println("Welcome to Java");
        System.out.println("Welcome to Computer Science");
        System.out.println("Programming is fun");

        // Exercise 1.2 
        System.out.println("Welcome to Java");
        System.out.println("Welcome to Java");
        System.out.println("Welcome to Java");
        System.out.println("Welcome to Java");
        System.out.println("Welcome to Java");

        // Exercise 1.3
        System.out.println("    J     A     V     V    A");
        System.out.println("    J    A A     V   V    A A");
        System.out.println("J   J   AAAAA     V V    AAAAA");
        System.out.println(" J J   A     A     V    A     A");

        // Exercise 1.4
        System.out.println("a\ta^2\ta^3");
        System.out.println("1\t1\t1");
        System.out.println("2\t4\t8");
        System.out.println("3\t9\t27");
        System.out.println("4\t16\t64");

        // Exercise 1.5
        System.out.println((9.5 * 4.5 - 2.5 * 3) / (45.5 - 3.5));

        // Exercise 1.6 
        System.out.println(1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9);

        // Exercise 1.7 
        System.out.print("pi = ");
        System.out.println(4.0* (1.0 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11)));
        System.out.print("pi = ");
        System.out.println(4.0* (1.0 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11) + (1.0/13)));

        // Exercise 1.8 
        double radius = 5.5 ;
        double perimeter = 2 * radius * 3.14159265; 
        double area = radius * radius * 3.14159265;
        System.out.println("perimeter of circle = " + perimeter);
        System.out.println("area of circle = " + area);
       
        // Exercise 1.9 
        double width = 4.5 ;
        double height = 7.9; 
        double rec = width * height;
        System.out.println("area of rec = " + rec);
       
        // Exercise 1.10
        double kilometer = 14.0;
        double miles =  kilometer / 1.6;
        double formula = (45.5 * 60.0 + 30.0) / (3600.0) ;
        double mph = miles / formula;
        System.out.println("The runner runs at: " + mph + " mph");

        // Exercise 1.11
        double currentPopulation = 312032486.0;
        double birthRate = (60.0 * 60.0 * 24.0) / 7.0; 
        double deathRate = (60.0 * 60.0 * 24.0) / 13.0;
        double immagrantRate = (60.0 * 60.0 * 24.0) / 45.0; 
        double fiveYears = 365.0 * 5.0 ;
        double total = (currentPopulation + ((birthRate * fiveYears) - (deathRate * fiveYears) + (immagrantRate * fiveYears)));
        System.out.println("Total population after 5 years is: " + total);

        // Exercise 1.12
        double Miles = 24.0;
        double Kilometers = Miles * 1.6;
        double Formula = (100.5833 * 60.0 + 35.0 ) / 3600.0;
        double kph = Kilometers / Formula;
        System.out.println("The runner runs at: " + kph + " kph");

        // Exercise 1.13
        System.out.println("3.4x + 50.2y = 44.5");
        System.out.println("2.1x + .55y = 5.9");
        double a = 3.4; 
        double b= 50.2;
        double e = 44.5;
        double c = 2.1; 
        double d = .55;
        double f = 5.9;
        double x = ((e * d) - (b * f)) / ((a * d) - (b * c));
        double y = ((a * f) - (e * c)) / ((a * d) - (b * c));
        System.out.println("x = " + x);
        System.out.println("y = " + y); 

    }
}