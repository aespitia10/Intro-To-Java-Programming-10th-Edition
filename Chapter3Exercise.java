// import java.text.DecimalFormat;
// import java.util.*;

// public class Chapter3Exercise 
// {
//     public static void main(String[]args)
//     {
//         Scanner input = new Scanner(System.in);
//         DecimalFormat df6 = new DecimalFormat("#.######");
//         DecimalFormat df5 = new DecimalFormat("#.#####");
//         DecimalFormat df2 = new DecimalFormat("#.##");


//         //Exercise 3.1
//         // System.out.print("Enter a integer for a, b, and c: ");
//         // double a = input.nextDouble();
//         // double b = input.nextDouble();
//         // double c = input.nextDouble();
//         // double discriminant = Math.pow(b, 2) - (4 * a * c);

//         // if(discriminant > 0)
//         // {
//         //     double root1 = ((-b + Math.pow(discriminant, 0.5)) / (2 * a));
//         //     double root2 = ((-b - Math.pow(discriminant, 0.5)) / (2 * a));
//         //     System.out.print("The equation has two roots " + df6.format(root1) + " and " + df6.format(root2));
//         // }
//         // else if(discriminant == 0)
//         // {
//         //     double root1 = ((-b + Math.pow(discriminant, 0.5)) / (2 * a));
//         //     System.out.print("The equation has one root " + df6.format(root1));
//         // }
//         // else 
//         //     System.out.print("The equation has no real roots");

//         //Exercise 3.3
//         // System.out.print("Enter a, b, c, d, e, f: ");
//         // double a = input.nextDouble(); 
//         // double b = input.nextDouble();
//         // double c = input.nextDouble();
//         // double d = input.nextDouble(); 
//         // double e = input.nextDouble();
//         // double f = input.nextDouble();
//         // double x = ((e * d) - (b * f)) / ((a * d) - (b * c));
//         // double y = ((a * f) - (e * c)) / ((a * d) - (b * c));

//         // if((a * d) - (b * c) > 0 || (a * d) - (b * c) < 0 )
//         // {
//         //     System.out.println("x = " + x);
//         //     System.out.println("y = " + y); 
//         // }
//         // else
//         // System.out.println("The equation has no solution");

//         //Exercise 3.4
//         // int month = 1 + (int)(Math.random() * 12); 
//         // switch(month)
//         // {
//         //     case 1: System.out.println("Jan");
//         //             break;
//         //     case 2: System.out.println("Feb");
//         //             break;
//         //     case 3: System.out.println("Mar");
//         //             break;
//         //     case 4: System.out.println("Apr");
//         //             break;
//         //     case 5: System.out.println("May");
//         //             break;
//         //     case 6: System.out.println("Jun");
//         //             break;
//         //     case 7: System.out.println("Jul");
//         //             break;
//         //     case 8: System.out.println("Aug");
//         //             break;
//         //     case 9: System.out.println("Sep");
//         //             break;
//         //     case 10: System.out.println("Oct");
//         //             break;
//         //     case 11: System.out.println("Nov");
//         //             break;
//         //     case 12: System.out.println("Dec");
//         //             break;
//         //     default: 
//         //         System.out.println("Error");
//         //     break;
//         // }

//         //Exercise 3.5
//         // System.out.print("Enter today's date: ");
//         // int currentDay = input.nextInt();
//         // System.out.print("Enter the number of the days elapsed since today: ");
//         // int elapsedDay = input.nextInt();
//         // String dayOfWeek = " ";

//         // switch (currentDay)
//         // {
//         //     case 0: dayOfWeek = "Sunday";
//         //             break;
//         //     case 1: dayOfWeek = "Monday";
//         //             break;
//         //     case 2: dayOfWeek = "Tuesday";
//         //             break;
//         //     case 3: dayOfWeek = "Wednesday";
//         //             break;
//         //     case 4: dayOfWeek = "Thursday";
//         //             break;
//         //     case 5: dayOfWeek = "Friday";
//         //             break;
//         //     case 6: dayOfWeek = "Saturday";
//         //             break;
//         // }

//         // int futureDay = (currentDay + elapsedDay) % 7;
        
//         // switch(futureDay)
//         // {
//         //     case 0: System.out.println("Today is " + dayOfWeek + " and the future day is Sunday");
//         //             break;
//         //     case 1: System.out.println("Today is " + dayOfWeek + " and the future day is Monday");
//         //             break;
//         //     case 2: System.out.println("Today is " + dayOfWeek + " and the future day is Tuesday");
//         //             break;
//         //     case 3: System.out.println("Today is " + dayOfWeek + " and the future day is Wednesday");
//         //             break;
//         //     case 4: System.out.println("Today is " + dayOfWeek + " and the future day is Thursday");
//         //             break;
//         //     case 5: System.out.println("Today is " + dayOfWeek + " and the future day is Friday");
//         //             break;
//         //     case 6: System.out.println("Today is " + dayOfWeek + " and the future day is Saturday");
//         //             break;
//         // } 

//         //Exercise 3.6
//         // System.out.print("Enter the weight in pounds: ");
//         // double pounds = input.nextDouble();
//         // System.out.print("Enter feet: ");
//         // double feet = input.nextDouble();
//         // System.out.print("Enter inches: ");
//         // double inches = input.nextDouble();
//         // double feetToInch = feet * 12;
//         // double kilograms = pounds * 0.45359237;
//         // double meters = (inches + feetToInch) * 0.0254;
//         // double bmi = kilograms / Math.pow(meters, 2);

//         // System.out.println("BMI is " + bmi);
//         // if(bmi < 18.5)
//         //     System.out.println("Underwieght");
//         // else if(bmi < 25.0)
//         // System.out.println("Normal");
//         // else if(bmi < 30.0)
//         // System.out.println("Overweight");
//         // else 
//         //     System.out.println("Obese");

//         //Exercise 3.7
//         // System.out.print("Enter the amount of money in decimal number: $");
//         // double totalAmount = input.nextDouble();
        
//         // int remainderCents = (int)(totalAmount * 100);

//         // int dollars = remainderCents / 100;
//         // remainderCents = remainderCents % 100;

//         // int quarters = remainderCents / 25 ; 
//         // remainderCents = remainderCents % 25 ;

//         // int dimes = remainderCents / 10 ; 
//         // remainderCents = remainderCents % 10; 

//         // int nickles = remainderCents / 5; 
//         // remainderCents = remainderCents % 5; 

//         // int pennies = remainderCents; 
//         // System.out.println("Your amount " + totalAmount + " consists of");
        
//         // if(dollars > 1){
//         //     System.out.println(" " + dollars + " dollars");
//         // }
//         // else
//         //     System.err.println(" " + dollars + " dollar");
//         // if(quarters > 1){
//         //     System.out.println(" " + quarters + " quarters ");
//         // }
//         // else 
//         //     System.out.println(" " + quarters + " quarter ");
//         // if(dimes > 1)
//         // {
//         //     System.out.println(" " + dimes + " dimes");
//         // }
//         // else 
//         //     System.err.println(" " + dimes + " dime");
//         // if(nickles > 1)
//         // {
//         //     System.out.println(" " + nickles + " nickels");
//         // }
//         // else 
//         //     System.out.println(" " + nickles + " nickel");
//         // if(pennies > 1)
//         // {
//         //     System.out.println(" " + pennies + " pennies");
//         // }
//         // else 
//         //     System.out.println(" " + pennies + " penny");

//         //Exercise 3.8
//         // System.out.print("Enter three integers in any order: ");
//         // int a = input.nextInt();
//         // int b = input.nextInt();
//         // int c = input.nextInt();
//         // int temp;
//         // if(b < a || c < a)
//         // {
//         //     if(b < a)
//         //     {
//         //         temp = a;
//         //         a = b;
//         //         b = temp;
//         //     }
//         //     if(c < a)
//         //     {
//         //         temp = a;
//         //         a = c;
//         //         c = temp;
//         //     }
//         // }
//         // if(c < b)
//         // {
//         //     temp = b;
//         //     b = c;
//         //     c = temp;
//         // }
//         // System.out.println("Non-Decreasing order: " + a + " " + b + " " + c);
        
//         // Exercise 3.9
//         System.err.print("Enter a 9 digit: ");
//         int ISBN = input.nextInt();
//         int d1 = ISBN / 100000000;
//           ISBN = ISBN % 100000000;
//         int d2 = ISBN / 10000000;
//           ISBN = ISBN % 10000000;
//         int d3 = ISBN / 1000000;
//           ISBN = ISBN % 1000000;
//         int d4 = ISBN / 100000;
//           ISBN = ISBN % 100000;
//         int d5 = ISBN / 10000;
//           ISBN = ISBN % 10000;
//         int d6 = ISBN / 1000;
//           ISBN = ISBN % 1000;
//         int d7 = ISBN / 100;
//           ISBN = ISBN % 100;
//         int d8 = ISBN / 10;
//           ISBN = ISBN % 10;
//         int d9 = ISBN / 1;
//         int equation = ((d1 * 1) + (d2 * 2) + (d3 * 3) + (d4 * 4) + (d5 * 5) +
//                        (d6 * 6) + (d7 * 7) + (d8 * 8) + (d9 * 9)) % 11; 
//         switch (equation)
//         {
//             case 0 : System.out.print("The ISBN-10 number is " + d1 + "" + d2 + "" + d3 + "" + d4 + "" + d5 + 
//             "" + d6 + "" + d7 + "" + d8 + "" + d9 + "0");
//             break;
//             case 1 : System.out.print("The ISBN-10 number is " + d1 + "" + d2 + "" + d3 + "" + d4 + "" + d5 + 
//             "" + d6 + "" + d7 + "" + d8 + "" + d9 + "1");
//             break;
//             case 2 : System.out.print("The ISBN-10 number is " + d1 + "" + d2 + "" + d3 + "" + d4 + "" + d5 + 
//             "" + d6 + "" + d7 + "" + d8 + "" + d9 + "2");
//             break;
//             case 3 : System.out.print("The ISBN-10 number is " + d1 + "" + d2 + "" + d3 + "" + d4 + "" + d5 + 
//             "" + d6 + "" + d7 + "" + d8 + "" + d9 + "3");
//             break;
//             case 4 : System.out.print("The ISBN-10 number is " + d1 + "" + d2 + "" + d3 + "" + d4 + "" + d5 + 
//             "" + d6 + "" + d7 + "" + d8 + "" + d9 + "4");
//             break;
//             case 5 : System.out.print("The ISBN-10 number is " + d1 + "" + d2 + "" + d3 + "" + d4 + "" + d5 + 
//             "" + d6 + "" + d7 + "" + d8 + "" + d9 + "5");
//             break;
//             case 6 : System.out.print(d1 + "" + d2 + "" + d3 + "" + d4 + "" + d5 + 
//             "" + d6 + "" + d7 + "" + d8 + "" + d9 + "6");
//             break;
//             case 7 : System.out.print("The ISBN-10 number is " + d1 + "" + d2 + "" + d3 + "" + d4 + "" + d5 + 
//             "" + d6 + "" + d7 + "" + d8 + "" + d9 + "7");
//             break;
//             case 8 : System.out.print("The ISBN-10 number is " + d1 + "" + d2 + "" + d3 + "" + d4 + "" + d5 + 
//             "" + d6 + "" + d7 + "" + d8 + "" + d9 + "8");
//             break;
//             case 9 : System.out.print("The ISBN-10 number is " + d1 + "" + d2 + "" + d3 + "" + d4 + "" + d5 + 
//             "" + d6 + "" + d7 + "" + d8 + "" + d9 + "9");
//             break;
//             case 10 : System.out.print("The ISBN-10 number is " + d1 + "" + d2 + "" + d3 + "" + d4 + "" + d5 + 
//             "" + d6 + "" + d7 + "" + d8 + "" + d9 + "X");
//             break;
//         }

//         //Exercise 3.10
//         // int number1 = (int)(Math.random() * 100);
//         // int number2 = (int)(Math.random() * 100);
//         // System.out.println("What is " + number1 + " + " + number2 + "?");
//         // int myAnswer = input.nextInt();
//         // Faster more effecient way to do one single if-else
//         //    System.out.print(myAnswer == number1 + number2 ? "Answer is correct" : "Answer is incorrect");
//         // other way to do an if-else
//             // if(myAnswer == number1 + number2)
//             //     System.out.println("Answer is corrrect");
//             // else 
//             //     System.out.println("Answer is incorrect");

//         //Exercise 3.11
//         // System.out.print("Enter the month 1 through 12: ");
//         // int month = input.nextInt();
//         // System.out.print("Enter the year: ");
//         // int year = input.nextInt();
//         // boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);

//         // switch (month)
// 		// {
// 		// 	case 1: System.out.println(
// 		// 			 "January " + year + " had 31 days"); break;
//         //     case 2: if(isLeapYear)
//         //             {
//         //                 System.out.print("Febuary " + year + " had 29 days");
//         //             }  
//         //             else 
//         //                 System.out.print("Febuary " + year + " had 28 days");     
//         //             break;
// 		// 	case 3: System.out.println(
// 		// 			 "March " + year + " had 31 days"); break;
// 		// 	case 4: System.out.println(
// 		// 			 "April " + year + " had 30 days"); break;
// 		// 	case 5: System.out.println(
// 		// 			 "May " + year + " had 31 days"); break;
// 		// 	case 6: System.out.println(
// 		// 			 "June " + year + " had 30 days"); break;
// 		// 	case 7: System.out.println(
// 		// 			 "July " + year + " had 31 days"); break;
// 		// 	case 8: System.out.println(
// 		// 			 "August " + year + " had 31 days"); break;
// 		// 	case 9: System.out.println(
// 		// 			 "September " + year + " had 30 days"); break;
// 		// 	case 10: System.out.println(
// 		// 			 "October " + year + " had 31 days"); break;
// 		// 	case 11: System.out.println(
// 		// 			 "November " + year + " had 30 days"); break;
// 		// 	case 12: System.out.println(
// 		// 			 "December " + year + " had 31 days");
//         // }

//         //Exercise 3.12
//         // System.err.println("Enter a three-digit integer: ");
//         //     int userInt = input.nextInt();
//         //     int temp = userInt;

//         //     int first = userInt / 100;
//         //     userInt = userInt % 100;

//         //     int second = userInt / 10;
//         //     userInt = userInt % 10;

//         //     int third = userInt;
//         //     System.out.print(first == third ? temp + " is a palindrome": temp + " is not a palindrome");
        
//         // Exercise 3.13 (is completed in ComputeTax file)

//         //Exercise 3.14
//         // int coinFlip = (int)(Math.random() * 2);
//         // System.out.print("Enter a 0 for heads or a 1 for tails: ");
//         // int guess = input.nextInt(); 
//         // System.out.println(guess == coinFlip ? "correct" : "incorrect");

//         // Exercise 3.15
//         // int lottery = 100 + (int)(Math.random() * 899);
//         // int lotteryDigit1 =  lottery / 100;
//         // lottery = lottery % 100;
//         // int lotteryDigit2 = lottery % 10;
//         // lottery = lottery % 10;
//         // int lotteryDigit3 = lottery;

//         // System.out.println(lotteryDigit1);
//         // System.out.println(lotteryDigit2);
//         // System.out.println(lotteryDigit3);

//         // System.out.println("Enter your lottery pick(three digits): ");
//         // int guess = input.nextInt(); 

//         // int guessDigit1 =  guess / 100;
//         // guess = guess % 100;
//         // int guessDigit2 = guess / 10;
//         // guess = guess % 10;
//         // int guessDigit3 = guess;

//         // if(guess == lottery)
//         // {
//         //         System.out.println("Exact match: you win $10,000");
//         // }
//         // else if(guessDigit2 == lotteryDigit1 && guessDigit1 == lotteryDigit2 && guessDigit3 == lotteryDigit3)
//         // {
//         //     System.out.println("Match all digits: you win $3,000");
//         // }
//         // else if(guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 ||
//         //         guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2 ||
//         //         guessDigit3 == lotteryDigit3)
//         // {
//         //         System.out.println("Match one digit: you win $1,000");
//         // }else 
//         //     System.out.println("Sorry, no match");
        
//         // Exercise 3.16
//         // int width = 100 + 1;
//         // int height = 200 + 1;
//         // int x = -50 + (int)(Math.random() * width);
//         // int y = -100 + (int)(Math.random() * height);
//         // System.out.println("A coordinate in a rectangle with width(100) and height(200) is: " + "(" + x + "," + y + ")");

//         //Exercise 3.17
//         // int game = (int)(Math.random() * 3);
//         // System.out.print("scissor(0), rock(1), paper(2): ");
//         // System.out.println("computer is: " + game);
//         // int decision = input.nextInt();
//         // String gameName = " ";
//         // String decisionName = " ";

//         // switch(game)
//         // {
//         //     case 0: gameName = "Scissor"; break;
//         //     case 1: gameName = "Rock"; break;
//         //     case 2: gameName = "Paper"; break;
//         //     default : System.out.println("Wrong input"); break;
//         // }
//         // switch(decision)
//         // {
//         //     case 0: decisionName = "Scissor"; break;
//         //     case 1: decisionName = "Rock"; break;
//         //     case 2: decisionName = "Paper"; break;
//         //     default : System.out.println("Wrong input"); break;
//         // }
//         // if(game == decision)
//         // {
//         //     System.out.println("The game is " + gameName + ". You are " + decisionName + " too. It is a draw");
//         // }
//         // else 
//         // {
//         //     boolean win = (decision == 0 && game == 2) || (decision == 1 && game == 0) ||(decision == 2 && game == 1);
//         //     System.out.println((win) ? "The computer is " + gameName + ". You are " + decisionName + ". You won." : "The computer is " + gameName + ". You are " + decisionName + ". You lost.");
//         // }

//         // Exercise 3.18
//         // System.out.println("Please enter the weight of the package: ");
//         // double weight = input.nextDouble();
//         // double costPerWeight;
//         // if(0 < weight && weight <= 1)
//         // {
//         //     costPerWeight = 3.5 * weight;
//         //     System.out.println("The cost for shipping is $" + df2.format(costPerWeight));
//         // }
//         // else if(1 < weight && weight <= 3)
//         // {
//         //     costPerWeight = 5.5 * weight;
//         //     System.out.println("The cost for shipping is $" + df2.format(costPerWeight));
//         // }
//         // else if(3 < weight && weight <= 10)
//         // {            
//         //     costPerWeight = 8.5 * weight;
//         //     System.out.println("The cost for shipping is $" + df2.format(costPerWeight));
//         // }
//         // else if(10 < weight && weight <= 20)
//         // {            
//         //     costPerWeight = 10.5 * weight;
//         //     System.out.println("The cost for shipping is $" + df2.format(costPerWeight));
//         // }
//         // else if(weight > 50)
//         // {           
//         //     costPerWeight = 5.5 * weight;
//         //     System.out.println("The cost for shipping is $" + df2.format(costPerWeight));
//         // }

//         //Exercise 3.19
//         // System.out.print("Enter three sides of a triangle: ");
//         // double side1 = input.nextDouble();
//         // double side2 = input.nextDouble();
//         // double side3 = input.nextDouble();
//         // boolean valid = (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1);
//         // double perimeter;
//         // System.out.println(valid ? "The perimter is: " + (perimeter = side1 + side2 + side3) : "Invalid" );
        
//         //Exercise 3.20
//         // System.out.print("Enter the temperature in Fahrenheit between -58F" +
//         // " and 41F: ");
//         // double ta = input.nextDouble(); 
//         // System.out.print("Enter the wind speed (>=2) in miles per hour: ");
//         // double v = input.nextDouble();
        
//         // if((-58 < ta && ta < 41 ) && 2 <= v)
//         // {
//         //     double twc = 35.74 + (0.6215 * ta) - (35.75 * Math.pow(v, 0.16)) + (0.4275 * ta * Math.pow(v , 0.16));
//         //     System.out.println("The wind chill indez is " + twc);
//         // }
//         // else 
//         // {
//         //     System.out.println("The temperature and or wind inputed is invalid.");
//         // }

//         //Exercise 3.21
//         // System.out.print("Enter year: ");
//         // int year = input.nextInt();
//         // System.out.print("Enter month: 1-12:  ");
//         // int month = input.nextInt();
//         // System.out.print("Enter the day of the month: 1-31: ");
//         // int day = input.nextInt();
//         // String dayOfWeek = " ";
//         // int q = day;
//         // switch (month)
//         // {
//         //     case 1: month = 13; year = year - 1 ; break;
//         //     case 2: month = 14; year = year - 1 ; break; 
//         // }
//         // int j = year / 100;
//         // int k = year % 100;
//         // int h = (q + ((26 * (month + 1)) / 10) + k + ( k / 4) + (j / 4) + (5 * j)) % 7;
//         // switch (h)
//         // {
//         //     case 0: dayOfWeek = "Saturday"; break;
//         //     case 1: dayOfWeek = "Sunday"; break;
//         //     case 2: dayOfWeek = "Monday"; break; 
//         //     case 3: dayOfWeek = "Tuesday"; break;
//         //     case 4: dayOfWeek = "Wednesday"; break; 
//         //     case 5: dayOfWeek = "Thursday"; break;
//         //     case 6: dayOfWeek = "Friday"; break;
//         // }
//         // System.out.println("Day of the week is " + dayOfWeek);
        
//         //Exercise 2.22
//         // System.out.print("Enter a point with two coordinates: ");
//         // double x = input.nextInt();
//         // double y = input.nextInt();
//         // double radius = 10;
//         // double distance = Math.pow((Math.pow(x,2) + Math.pow(y, 2)), 0.5);
//         // if(distance <= radius)
//         // {
//         //     System.out.print("Point (" + x + "," + y + ") is in the circle");
//         // }
//         // else
//         // {
//         //     System.out.print("Point (" + x + "," + y + ") is not in the circle");
//         // }

//         //Exercise 2.23
//         // System.out.print("Enter a point with two coordinates: ");
//         // double x = input.nextInt();
//         // double y = input.nextInt();
//         // double width = 10;
//         // double height = 5;
//         // double distance = Math.pow((Math.pow(x,2) + Math.pow(y, 2)), 0.5);
//         // if((distance <= width / x) || (distance <= height / y)) 
//         // {
//         //     System.out.print("Point (" + x + "," + y + ") is in the rectangle");
//         // }
//         // else
//         // {
//         //     System.out.print("Point (" + x + "," + y + ") is not in the rectangle");
//         // }
        
//         // Exercise 3.24
//         // int card = (int)(1 + Math.random() * 12);
//         // int suit = (int)(1 + Math.random() * 3);
//         // String nameCard = " ";
//         // String nameSuit = " ";

//         // switch (card)
//         // {
//         //     case 1: nameCard = "Ace"; break;
//         //     case 11: nameCard = "Jace"; break;
//         //     case 12: nameCard = "Queen"; break;
//         //     case 13: nameCard = "King"; break;
//         // }
//         // switch (suit)
//         // {
//         //     case 1: nameSuit = "Clubs"; break;
//         //     case 2: nameSuit = "Diamnods"; break;
//         //     case 3: nameSuit = "Hearts"; break;
//         //     case 4: nameSuit = "Spades"; break;
//         // }

//         // if(card == 1 || card == 11 || card == 12 || card == 13)
//         // {
//         //     System.out.print("The card you picked is " + nameCard + " of " + nameSuit );
//         // }
//         // else 
//         // {
//         //     System.out.print("The card you picked is " + card + " of " + nameSuit );

//         // }
//         // Exercise 3.25
//         // System.out.print("Enter x1 and y1: ");
//         // double x1 = input.nextDouble();
//         // double y1 = input.nextDouble();
//         // System.out.print("Enter x2 and y2: ");
//         // double x2 = input.nextDouble();
//         // double y2 = input.nextDouble();
//         // System.out.print("Enter x3 and y3: ");
//         // double x3 = input.nextDouble();
//         // double y3 = input.nextDouble();
//         // System.out.print("Enter x4 and y4: ");
//         // double x4 = input.nextDouble();
//         // double y4 = input.nextDouble();
//         // double a = y1 - y2;
//         // double b = -1 * (x1 - x2);
//         // double c = y3 - y4;
//         // double d = -1 * (x3 - x4);
//         // double e = ((y1 - y2) * x1) - ((x1 - x2) * y1);
//         // double f = ((y3 - y4) * x3) - ((x3 - x4) * y3);
//         // double x =  ((e * d) - (b * f)) / ((a * d) - (b * c));
//         // double y =  ((a * f) - (e * c)) / ((a * d) - (b * c));

//         // if((a * d) - (b * c) == 0)
//         // {
//         //     System.out.println("The two lines are parallel");
//         // }
//         // else 
//         // {
//         //     System.out.println("The intersecting point is at (" + df5.format(x) + "," + df5.format(y) + ")");
//         // }

//         // Exercise 3.26
//         // System.out.print("Enter an integer: ");
//         // int userInt = input.nextInt();
//         // System.out.println((userInt % 5 == 0 && userInt % 6 == 0 ? "Is " + userInt + " divisible by 5 and 6? true" : "Is " + userInt + " divisible by 5 and 6? false"));
//         // System.out.println((userInt % 5 == 0 || userInt % 6 == 0 ? "Is " + userInt + " divisible by 5 or 6? true" : "Is " + userInt + " divisible by 5 or 6? false"));
//         // System.out.println((userInt % 5 == 0 ^ userInt % 6 == 0 ? "Is " + userInt + " divisible by 5 and 6, but not both? true" : "Is " + userInt + " divisible by 5 and 6, but not both? false"));
      
//         //Exercise 3.27
//         // System.out.print("Enter a point's x-coordinate and y-coordinates: ");
//         // double x = input.nextDouble();
//         // double y = input.nextDouble();
//         // double slope = ((double)(0 - 100) / (double)(200 - 0));
//         // double b = 100 + slope * 0;
//         // double y1 = slope * x + b;
//         // System.out.print(y <= y1 ? "The point is in the triangle":"The point is not in the triangle");
       
//         //Exercise 3.28
//         // System.out.print("Enter r1's center x-,y-coordinates, width and height: ");
//         // double x1 = input.nextDouble();
//         // double y1 = input.nextDouble();
//         // double w1 = input.nextDouble();
//         // double h1 = input.nextDouble();

//         // System.out.print("Enter r2's center x-,y-coordinates, width and height: ");
//         // double x2 = input.nextDouble();
//         // double y2 = input.nextDouble();
//         // double w2 = input.nextDouble();
//         // double h2 = input.nextDouble();

//         // double left1 = x1 - (w1 / 2d);
//         // double right1 = x1 + (w1 / 2d);
//         // double up1 = y1 + (h1 / 2d);
//         // double down1 = y1 - (h1 / 2d);

//         // double left2 = x2 - (w2 / 2d);
//         // double right2 = x2 + (w2 / 2d);
//         // double up2 = y2 + (h2 / 2d);
//         // double down2 = y2 - (h2 / 2d);

//         // if(left1 == left2 && right1 == right2 && up1 == up2 && down1 == down2)
//         // {
//         //     System.out.println("r1 and r2 are identical");
//         // }
//         // else if(right2 <= right1 && left2 >= left1 && up2 <= up1 && down2 >= down1)
//         // {
//         //     System.out.println("r2 is inside r1");
//         // }
//         // else if(right1 <= right2 && left1 >= left2 && up1 <= up2 && down1 >= down2)
//         // {
//         //     System.out.println("r1 is inside r2");
//         // }
//         // else if(right1 < left2 || left1 > right2 || up1 < down2 || down2 > up1)
//         // {
//         //     System.out.println("r2 does not overlaps r1");
//         // }
//         // else 
//         // {
//         //     System.out.println("r2 overlaps r1");
//         // }

//         // Exercise 3.29
//         // System.out.print("Enter circle1's center x-,y-coordinates, and radius: ");
//         // double x1  = input.nextDouble(); 
//         // double y1  = input.nextDouble(); 
//         // double radius1 = input.nextDouble(); 
//         // System.out.print("Enter circle2's center x-,y-coordinates, and radius: ");
//         // double x2  = input.nextDouble(); 
//         // double y2  = input.nextDouble(); 
//         // double radius2 = input.nextDouble(); 
//         // double distance = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1 , 2), 0.5);
//         // if(radius1 >= radius2)
//         // {
//         //     if(distance <= (radius1 - radius2))
//         //     {
//         //         System.out.println("circle 2 is inside circle1");
//         //     }
//         //     else if(distance <= radius1 + radius2)
//         //     {
//         //         System.out.println("circle 2 overlaps circle1");
//         //     }
//         //     else if(distance > radius1 + radius2)
//         //     {
//         //         System.out.println("circle2 does not overlap circle1");
//         //     }
//         // }
//         // else if(radius2 >= radius1)
//         // {
//         //     if(distance <= (radius2 - radius1))
//         //     {
//         //         System.out.println("circle 1 is inside circle2");
//         //     }
//         //     else if(distance <= radius1 + radius2)
//         //     {
//         //         System.out.println("circle 1 overlaps circle2");
//         //     }
//         //     else if(distance > radius1 + radius2)
//         //     {
//         //         System.out.println("circle1 does not overlap circle2");
//         //     }
//         // }

//         // Exercise 3.30
//         // Obtain the total milliseconds since midnight, Jan 1, 1970
//         //  System.out.print("Enter the time zone offset to GMT: ");
//         //  int offset = input.nextInt();

//         //  long totalMilliseconds = System.currentTimeMillis();
    
//         //  // Obtain the total milliseconds since midnight, Jan 1, 1970
//         //  long totalSeconds = totalMilliseconds / 1000;

//         //  // Compute the current seconds in the minute in the hour
//         //  long currentSecond = totalSeconds % 60;

//         //  // Obtain the total minutes 
//         //  long totalMinutes = totalSeconds / 60;

//         //  // Compute the current minute in thw hour 
//         //  long currentMinute = totalMinutes % 60; 

//         //  // Obtain the total hours 
//         //  long totalHours = totalMinutes / 60; 

//         //  // Compute the current hour 
//         //  long currentHour = totalHours % 12;
//         // currentHour = currentHour - offset;

//         //  // Display results 
//         //  if(currentHour == 1 ||currentHour == 2 || currentHour == 3 ||currentHour == 4 || currentHour == 5 ||currentHour == 6 || currentHour == 7 ||currentHour == 8 ||
//         //     currentHour == 9 ||currentHour == 10 || currentHour == 11 ||currentHour == 12)
//         // {
//         //     currentHour = currentHour % 12;
//         //     if(currentHour == 0)
//         //     {
//         //         currentHour = 12;
//         //         System.out.println("Current time is " + currentHour +  ":" + currentMinute + ":" + currentSecond + " AM");
//         //     }
//         //     else 
//         //     System.out.println("Current time is " + currentHour +  ":" + currentMinute + ":" + currentSecond + " AM");
//         // }
//         // else 
//         // {
//         //     currentHour = currentHour % 12;
//         //     if(currentHour == 0)
//         //     {
//         //         currentHour = 12;
//         //         System.out.println("Current time is " + currentHour +  ":" + currentMinute + ":" + currentSecond + " PM");
//         //     }
//         //     else 
//         //     System.out.println("Current time is " + currentHour +  ":" + currentMinute + ":" + currentSecond + " PM");
            
//         // }

//         //Exercise 3.31
//         // System.out.print("Enter the exchange rate from dollars to RMB: ");
//         // double exchangeRate = input.nextDouble();
//         // System.out.print("Enter 0 to convert dollars to RBM and 1 vice versa: ");
//         // int convert = input.nextInt();
           
//         // if(convert == 0 || convert == 1)
//         // {
//         //     System.out.print(convert == 0 ? "Enter the dollar amount: " : "Enter the RMB amount: ");
//         //     double amount = input.nextDouble();
//         //     System.out.println(convert == 0 ? "$" + df2.format(amount) + " is " + df2.format(amount * exchangeRate) + " yuan" :
//         //     "$" + df2.format(amount) + " yuan is " + "$" + df2.format(amount / exchangeRate) );
//         // }
//         // else 
//         // {
//         //  System.out.println("Incorrect input");
//         // }

//         //Exercise 3.32
//         // System.out.print("Enter three points for p0, p1, and p2: ");
//         // double x0 = input.nextDouble();
//         // double y0 = input.nextDouble();
//         // double x1 = input.nextDouble();
//         // double y1 = input.nextDouble();
//         // double x2 = input.nextDouble();
//         // double y2 = input.nextDouble();
//         // double location = ((x1 - x0) * (y2 - y0)) - ((x2 - x0) * (y1 - y0));
//         // if(location > 0)
//         // {
//         //     System.out.println("(" + x2 + "," + y2 + ")"+ " is on the left side of the line from (" + 
//         //                         x0 + "," + y0 + ")" + " to (" + x1 + "," + y1 + ")");
//         // }
//         // else 
//         // {
//         //     System.out.println(location == 0 ? "(" + x2 + "," + y2 + ")" + "is on the same line from (" + x0 + "," + y0 + ")" + " to (" + x1 + "," + y1 + ")" : 
//         //                                     "(" + x2 + "," + y2 + ")"+" is on the right side of the line from (" + x0 + "," + y0 + ")" + " to (" + x1 + "," + y1 + ")");
//         // }

//         //Exercise 3.33
//         // System.out.print("Enter the weight and the price for package 1: ");
//         // double weight1 = input.nextDouble();
//         // double price1 = input.nextDouble();
//         // System.out.print("Enter the weight and the price for package 2: ");
//         // double weight2 = input.nextDouble();
//         // double price2 = input.nextDouble();
        
//         // boolean doublePrice1 = (price1 % price2 == 0);
//         // boolean doublePrice2 = (price2 % price1 == 0);
//         // boolean doubleWeight1 = (weight1 % weight2 == 0);
//         // boolean doubleWeight2 = (weight2 % weight1 == 0);

        
//         // if((doublePrice1 || doublePrice2) && (doubleWeight1 || doubleWeight2))
//         // {
//         //     System.out.println("Two packages have the same price.");
//         // }
//         // else if(price1 / weight1 > price2 / weight2)
//         // {
//         //     System.out.println("Package 2 has a better price.");
//         // }
//         // else if(price1 / weight1 < price2 / weight2)
//         // {
//         //     System.out.println("Package 1 has a better price.");
//         // }

//         // Exercise 3.34
//         // System.out.print("Enter three points for p0, p1, and p2: ");
//         // double x0 = input.nextDouble();
//         // double y0 = input.nextDouble();
//         // double x1 = input.nextDouble();
//         // double y1 = input.nextDouble();
//         // double x2 = input.nextDouble();
//         // double y2 = input.nextDouble();
//         // double location = ((x1 - x0) * (y2 - y0)) - ((x2 - x0) * (y1 - y0));
       
//         // if(location > 0 || location < 0 || x2 < x0 || y2 < y0 || x2 > x1 || y2 > y1)
//         // {
//         //     System.out.println("(" + x2 + "," + y2 + ")"+ " is not on the line segment from (" + 
//         //                         x0 + "," + y0 + ")" + " to (" + x1 + "," + y1 + ")");
//         // }
//         // else 
//         // {
//         //     System.out.println("(" + x2 + "," + y2 + ")" + "is on the same line from (" + x0 + "," + y0 + ")" + " to (" + x1 + "," + y1 + ")");
//         // }
        
//         // input.close();
//     }
// }