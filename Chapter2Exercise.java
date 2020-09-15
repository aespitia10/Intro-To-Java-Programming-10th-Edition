// import java.text.DecimalFormat;
// import java.util.*;
// public class Chapter2Exercise 
// {
//     public static void main(String [] args)
//     {
        // DecimalFormat df1 = new DecimalFormat(".#");
        // DecimalFormat df2 = new DecimalFormat(".##");
        // DecimalFormat df3 = new DecimalFormat(".###");
        // DecimalFormat df4 = new DecimalFormat(".####");
        // DecimalFormat df5 = new DecimalFormat(".#####");

        // Scanner input = new Scanner(System.in);
        // final double PI = 3.14159;
        /*
        // Exercise 2.1
        
        System.out.print("Enter a Celsius degree in double: ");
        double celsius = input.nextDouble();
        double fahrenheit = (9d / 5) * celsius + 32;
        System.out.println(celsius + " Celsuis is " + fahrenheit + " Fahrenheit");
        
        //Exercise 2.2
        System.out.print("Enter the radius and length of a cylinder: ");
        double radius = input.nextDouble();
        double length = input.nextDouble();
        double area = Math.pow(radius,2) * PI;
        double volume = area * length; 
        System.out.println("The area is " + df4.format(area) + "\n" +
        "The volume is " + df1.format(volume) + "\n");
        
        // Exercise 2.3 
        System.out.print("Enter a value for feet: ");
        double feet = input.nextDouble();
        double meters = feet * 0.305;
        System.out.println(feet + " feet is " + meters + " meters");
        
        
        //Exercise 2.4
        System.out.print("Enter a number in punds: ");
        double pounds = input.nextDouble();
        double kilograms = pounds * 0.454;
        System.out.println(pounds + " pounds is " + kilograms + " kilograms");
  

        //Exercise 2.5
        System.out.print("Enter the subtotal and a gratuity rate: ");
        double subtotal = input.nextDouble();
        double gratuityRate = input.nextDouble();
        double gratuity = subtotal * (gratuityRate / 100);
        double total = subtotal + gratuity ; 
        System.out.println("The gratuity is $" + gratuity + " and total is $" + total );

        // Exercise 2.6
        System.out.print("Enter a number between 0 and 1000: ");
        int myNumber = input.nextInt();
        int msb = myNumber / 100;
        myNumber = myNumber % 100;
        int middle = myNumber / 10;
        myNumber = myNumber % 10; 
        int lsb = myNumber;
        int sumOfDigits = msb + middle + lsb;
        System.out.println("The sum of the digita is " + sumOfDigits);
       
        
        // Exercise 2.7 
        System.out.print("Enter the number if minutes: ");
        int minutes = input.nextInt();
        int hours = minutes / 60 ;
        System.out.print(minutes);
        int days = hours / 24;
        int years = days / 365;
        days = days % 365;
        System.out.print(" minutes is approximately " + years +
        " years and " + days + " days");
        

        // Exercise 2.8
         // Obtain the total milliseconds since midnight, Jan 1, 1970
         System.out.print("Enter the time zone offset to GMT: ");
         int offset = input.nextInt();

         long totalMilliseconds = System.currentTimeMillis();
    
         // Obtain the total milliseconds since midnight, Jan 1, 1970
         long totalSeconds = totalMilliseconds / 1000;

         // Compute the current seconds in the minute in the hour
         long currentSecond = totalSeconds % 60;

         // Obtain the total minutes 
         long totalMinutes = totalSeconds / 60;

         // Compute the current minute in thw hour 
         long currentMinute = totalMinutes % 60; 

         // Obtain the total hours 
         long totalHours = totalMinutes / 60; 

         // Compute the current hour 
         long currentHour = totalHours % 24;
        currentHour = currentHour - offset;

         // Display results 
         System.out.println("Current time is " + currentHour +  ":" 
         + currentMinute + ":" + currentSecond + " GMT");
    
        // Exercise 2.9
        System.out.print("Enter v0, v1, and t: ");
        double v0 = input.nextDouble();
        double v1 = input.nextDouble();
        double time = input.nextDouble();
        double acceleration = (v1 - v0) / time ;
        System.out.println("The average acceleration is " + df4.format(acceleration));
         
        //Exercise 2.10
        System.out.print("Enter the amount of water in kilograms: ");
        double M = input.nextDouble();
        System.out.print("Enter the initial temperature: ");
        double initialTemperature = input.nextDouble();
        System.out.print("Enter the final temperature: ");
        double finalTemperature = input.nextDouble();
        double energy = M * (finalTemperature - initialTemperature) * 4184; 
        System.out.print("The energy needed is " + energy);

        // Exersice 2.11
        System.out.print("Enter the number of years: ");
        int myInput = input.nextInt();
        double currentPopulation = 312032486.0;
        double birthRate = (60.0 * 60.0 * 24.0) / 7; 
        double deathRate = (60.0 * 60.0 * 24.0) / 13;
        double immagrantRate = (60.0 * 60.0 * 24.0) / 45; 
        double numberOfYears = 365.0 * myInput ;
        int total = ((int)currentPopulation + (((int)birthRate * (int)numberOfYears) - ((int)deathRate * (int)numberOfYears) + ((int)immagrantRate * (int)numberOfYears)));
        System.out.println("Total population after 5 years is: " + total);
        

        // Exercise 2.12
        System.out.print("Enter speed and scceleration: ");
        double v = input.nextDouble();
        double a = input.nextDouble();
        double l = Math.pow(v , 2) / (2 * a);
        System.out.print("The minimum runway length for this airplane is " + df3.format(l)); 

        // Exercise 2.13
        System.out.print("Enter the monthy saving amount: ");
        double ammount = input.nextDouble();
        double annualInterest = 5d / 100d;
        double monthlyInterestRate = annualInterest / 12d;
        final double FixedInterest = 1 + monthlyInterestRate;
        double firstMonth = ammount * FixedInterest;
        double secondMonth = (ammount + firstMonth) * FixedInterest;
        double thirdMonth = (ammount + secondMonth) * FixedInterest;
        double fourthMonth = (ammount + thirdMonth) * FixedInterest;
        double fifthMonth = (ammount + fourthMonth) * FixedInterest;
        double sixthMonth = (ammount + fifthMonth) * FixedInterest;
        System.out.println("After the sixth month, the account value is $" + df2.format(sixthMonth));

        // Exercise 2.14
        System.out.print("Enter the wieght in pounds: ");
        double lbs = input.nextDouble();
        System.out.print("Enter the height in inches: ");
        double in = input.nextDouble();
        double kilograms = lbs * 0.45359237;
        double meters = in * 0.0254;
        double BMI = kilograms / Math.pow(meters , 2);
        System.out.println("BMI is " + df4.format(BMI));

        // Exercise 2.15 
        System.out.print("Enter x1 and y1: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        System.out.print("Enter x2 and y2: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double insideRoot = Math.pow(x2 - x1 , 2) + Math.pow(y2 - y1 , 2);
        double distance = Math.pow(insideRoot , 1d / 2d);
        System.out.print("The distance between the two points is " + distance);

        // Exercise 2.16
        System.out.print("Enter the side: ");
        double sides = input.nextDouble();
        double area = ((3 * Math.pow(3 , 0.5)) / 2 ) * Math.pow(sides , 2) ;
        System.out.println("The area of the hexagon is " + df4.format(area));

        // Exercise 2.17
        System.out.print("Enter the temperature in Fahrenheit between -58F" +
        " and 41F: ");
        double ta = input.nextDouble(); 
        System.out.print("Enter the wind speed (>=2) in miles per hour: ");
        double v = input.nextDouble();
        double twc = 35.74 + (0.6215 * ta) - (35.75 * Math.pow(v, 0.16)) + (0.4275 * ta * Math.pow(v , 0.16));
        System.out.println("The wind chill indez is " + twc);
        

        // Exercise 2.18 
        float a1 = 1, a2 = 2, a3 = 3, a4 = 4, a5 = 5;
        float b1 = 2, b2 = 3, b3 = 4, b4 = 5, b5 = 6;
        System.out.println("a\tb\tpow(a, b)"); 
        System.out.println((int)a1 +"\t" + (int)b1 + "\t" + (int)Math.pow(a1, b1)); 
        System.out.println((int)a2 +"\t" + (int)b2 + "\t" + (int)Math.pow(a2, b2)); 
        System.out.println((int)a3 +"\t" + (int)b3 + "\t" + (int)Math.pow(a3, b3)); 
        System.out.println((int)a4 +"\t" + (int)b4 + "\t" + (int)Math.pow(a4, b4)); 
        System.out.println((int)a5 +"\t" + (int)b5 + "\t" + (int)Math.pow(a5, b5)); 
        System.out.println(); 
        
        //Exercise 2.19
        System.out.print("Enter three points for a triangle: ");
        double x1= input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        double side1 = Math.pow(x2 - x1 , 2) + Math.pow(y2 - y1 , 2);
        side1 = Math.pow(side1 , 0.5);
        double side2 = Math.pow(x3 - x2 , 2) + Math.pow(y3 - y2 , 2);
        side2 = Math.pow(side2 , 0.5);
        double side3 = Math.pow(x3 - x1 , 2) + Math.pow(y3 - y1 , 2);
        side3 = Math.pow(side3 , 0.5);
        double s = (side1 + side2 + side3) / 2;
        double insideRoot = s * (s - side1) * (s - side2) * (s - side3);
        double area = Math.pow(insideRoot , 0.5);
        System.out.println("The area of the traingle is " + df1.format(area));
    
        // Exersice 2.20
        System.out.print("Enter balance and interest rate: ");
        double balance = input.nextDouble();
        double annualInterestRate = input.nextDouble();
        double monthlyInterest = balance * (annualInterestRate / 1200); 
        System.out.println("The interest is: " + df5.format(monthlyInterest));
        
        //Exercise 2.21
        System.out.print("Enter investment amount: ");
        double investmentAmount = input.nextDouble();
        System.out.print("Enter annual interest rate in percentage: ");
        double annualInterestRate = input.nextDouble();
        annualInterestRate = annualInterestRate / 100 ; 
        System.out.print("Enter number of years: ");
        double numberOfYears = input.nextDouble();
        double monthlyInterestRate = annualInterestRate / 12 ; 
        double futureInvestmentValue = investmentAmount * Math.pow(1 + monthlyInterestRate, numberOfYears * 12);
        System.out.println("Accumulated value is $" + df2.format(futureInvestmentValue));

        // Exercise 2.22 REDO THIS ONE CAME TO A STOP
        System.out.print("Enter the amount of money in decimal number: $");
        int totalAmount = input.nextInt();
        int remainderCents = totalAmount;

        int dollars = remainderCents / 100;
        remainderCents = remainderCents % 100;

        int quarters = remainderCents / 25 ; 
        remainderCents = remainderCents % 25 ;

        int dimes = remainderCents / 10 ; 
        remainderCents = remainderCents % 10; 

        int nickles = remainderCents / 5; 
        remainderCents = remainderCents % 5; 

        int pennies = remainderCents; 

        System.out.println("Your amount " + totalAmount + " consists of");
        System.out.println(" " + dollars + " dollars");
        System.out.println(" " + quarters + " quarters ");
        System.out.println(" " + dimes + " dimes");
        System.out.println(" " + nickles + " nickels");
        System.out.println(" " + pennies + " pennies");
        
        //Exercise 2.23
        System.out.print("Enter the driving distance: ");
        double distance = input.nextDouble();
        System.out.print("Enter miles per gallon: ");
        double mpg = input.nextDouble();
        System.out.print("Enter price per gallon: ");
        double ppg = input.nextDouble();
        double trip = distance / mpg; 
        double costOfDrving = trip * ppg;
        System.err.print("The cost of driving is $" + df2.format(costOfDrving));
        */ 
        
//         input.close();
//     }
// }