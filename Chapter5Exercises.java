import java.text.DecimalFormat;
import java.util.*;

public class Chapter5Exercises 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        //Exercise 5.1
        /*
        System.out.print("Enter an integer, the input ends if it is 0: ");
        int userNum = input.nextInt();
        int posCount = 0, negCount = 0;
        double average = 0.0;
        double count = 1.0;

        if(userNum == 0)
        {
            System.out.print("No numbers are entered except 0");
        }
        else
        {
            while(userNum != 0)
            {
                if(userNum >= 1 && userNum <= 2147483647)
                { 
                    posCount++;
                }
                else
                {
                    negCount++;
                }

                count++;
            }
            average = (count / (posCount + negCount));
            System.out.println("The number of positive is " + posCount);
            System.out.println("The number of negative is " + negCount);
            System.out.println("The total is " + count);
            System.out.println("The average is " + average);
        }
        */

        //Exercise 5.2
        /*
        final int NUMBER_OF_QUESTIONS = 10; // Number of questions
        int correctCount = 0; // Count the number of correct answers
        int count = 0; // Count the number of questions
        long startTime = System.currentTimeMillis();
        String output = " "; // output string is initially empty

        while (count < NUMBER_OF_QUESTIONS) 
        {
            // 1. Generate two random single-digit integers
            int number1 = (int)(1 + Math.random() * 15);
            int number2 = (int)(1 + Math.random() * 15);

            // 2. If number1 < number2, swap number1 with number2
            if (number1 < number2) 
            {
                int temp = number1;
                number1 = number2;
                number2 = temp;
            }

            // 3. Prompt the student to answer "What is number1 – number2?"
            System.out.print("What is " + number1 + " - " + number2 + "? ");
            int answer = input.nextInt();

            // 4. Grade the answer and display the result
            if (number1 - number2 == answer) 
            {
                System.out.println("You are correct!");
                correctCount++; // Increase the correct answer count
            }
            else
            {
                System.out.println("Your answer is wrong.\n" + number1 + " - " + number2 + " should be " + (number1 - number2));
            }

            // Increase the question count
            count++;

            output += "\n" + number1 + "-" + number2 + "=" + answer +
            ((number1 - number2 == answer) ? " correct" : " wrong");
        }
        long endTime = System.currentTimeMillis();
        long testTime = endTime - startTime;        
        System.out.println("Correct count is " + correctCount + "\nTest time is " + testTime / 1000 + " seconds\n" + output);
        */

        //Exercise 5.3
        /*
        DecimalFormat df = new DecimalFormat("#.#");
        double pounds = 0.0;
        System.out.println("Kilos\tPounds");
        for(int kilos = 1; kilos < 200; kilos = kilos + 2)
        {
            pounds = (double)(kilos) * 2.2;
            System.out.println( df.format(kilos) + "\t" + df.format(pounds));
        }
        */

        //Exercise 5.4
        /*
        DecimalFormat df = new DecimalFormat("##.###");
        double kilometers = 0.0;
        System.out.println("Miles\tKilometers");
        for(double miles = 1; miles <= 10.0; miles++)
        {
            kilometers = miles * 1.609;
            System.out.println(df.format(miles) + "\t" + df.format(kilometers));
        }
        */

        //Exercise 5.5
        /*
        DecimalFormat df1 = new DecimalFormat("#.#");
        DecimalFormat df2 = new DecimalFormat("#.##");

        System.out.println("Kilograms\tPounds\t\t|\tPounds\t\tKilosgrams");
        double kilosToPounds= 0.0;
        double poundsToKilos = 0.0;

        for(int kilos = 1, pounds = 20; kilos <= 199 && pounds <= 515; kilos = kilos + 2, pounds = pounds + 5)
        {
            kilosToPounds = kilos * 2.2;
            poundsToKilos = pounds / 2.2;
            System.out.println(df1.format(kilos) + "\t\t" + df1.format(kilosToPounds) + "\t\t|\t" + df2.format(pounds) + "\t\t" + df2.format(poundsToKilos));
        }
        */
        
        //Exercise 5.6
        /*
        DecimalFormat df = new DecimalFormat("##.###");
        double milesToKilometers = 0.0;
        double kilometersToMiles = 0.0;

        System.out.println("Miles\tKilometers\t\t|\tKilometers\t\tMiles");
        for(double miles = 1, kilometers = 20; miles <= 10.0 && kilometers <= 65; miles++, kilometers = kilometers + 5)
        {
            milesToKilometers = miles * 1.609;
            kilometersToMiles = kilometers / 1.609;
            System.out.println(df.format(miles) + "\t\t" + df.format(milesToKilometers) + "\t\t|\t" + df.format(kilometers) + "\t\t" + df.format(kilometersToMiles));
        }
        */

        //Exercise 5.7
        /*
        DecimalFormat df = new DecimalFormat("#.##");
        double tuition = 10000;
        int year = 1;
        double totalCost = 0.0;
        do
        {
        double taxPerYear = (tuition * 0.05) + tuition; 
        tuition = taxPerYear; 
        if(year >= 11 && year <= 14)
        {
            
            if(year == 14)
            {
                System.out.println("Tuition of after year 10: $" + df.format(totalCost - tuition));
                break;
            }
            totalCost += tuition;
        }
        if(year >= 1 && year <= 10)
        {
            if(year == 10)
            {
                System.out.println("Tuition of after year 10: $" + df.format(tuition));
            }
        }
        year++;
        }while(year <= 14);
        */

        //Exercise 5.8
        /*
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
        int start = 1;

        String studentName1 = "";
        int studentScore1 = 0;

        String studentName = "";
        int studentScore = 0;

        int highestScore = 0;


        System.out.print("Enter the students Name: " );
        studentName1 = input.next();

        System.out.print("Enter the students Score: ");
        studentScore1 = input.nextInt();
     
        highestScore = studentScore1;
        String highestName = studentName1;

        while(start < numberOfStudents)
        {
            System.out.print("Enter the students Name: " );
            studentName = input.next();
            System.out.print("Enter the students Score: ");
            studentScore = input.nextInt();

            if(highestScore < studentScore)
            {
                highestScore = studentScore;
                highestName = studentName;
            }
            start++;
        }
        System.out.println("The students name with the highest score is: " + highestName);
        System.out.println("The students score is: " + highestScore);
        */

        //Exercise 5.9 !!!!!!!!!!!!!!!!!! NEED TO DO THIS ONE!!!!!!!!!!!!!!!!!!!!!!

        //Exercise 5.10
        /*
        final int NUMBER_PER_LINE = 10;
        int count = 0;
        for(int i = 100; i <= 1000; i++)
        {
            
            if(i % 5 == 0 && i % 6 == 0)
            {
                count++;            
                if(count % NUMBER_PER_LINE == 0)
                {
                    System.out.println(i);
                }
                else
                {
                    System.out.print(i + " ");
                }
            }
        }
        */

        //Exercise 5.11
        /*
        final int NUMBER_PER_LINE = 10;
        int count = 0;
        for(int i = 100; i <= 200; i++)
        {
            if(i % 5 == 0 ^ i % 6 == 0)
            {
                count++;            
                if(count % NUMBER_PER_LINE == 0)
                {
                    System.out.println(i);
                }
                else
                {
                    System.out.print(i + " ");
                }
            }
        }   
        */

        //Exercise 5.12
        /*
        int n = 0;
        while(Math.pow(n,2) < 12000)
        {
            n++;
        }
        System.out.println("The smallest number n can be greater than 12000: " + n);
        */

        //Exercise 5.13
        /*
        int n = 100;
        while(Math.pow(n,3) > 12000)
        {
            n--;
        }
        System.out.println("The smallest number n can be greater than 12000: " + n);
        System.out.println("The smallest number is: " + Math.pow(n, 3));
        */

        //Exercise 5.14
        /*
        System.out.print("Enter integer 1: ");
        int n1 = input.nextInt();
        System.out.print("Enter integer 2: ");
        int n2 = input.nextInt();

        int gcd = n1 < n2 ? n1 : n2;

        while(n1 % gcd != 0 && n2 % gcd != 0)
        {
            gcd--;
            
        }
        System.out.println("The gcd for " + n1 + " & " + n2 + " is: " + gcd);
        */

        //Ezercise 5.15
        /*
        int NUMBER_PER_LINE = 10;
        int count = 33;
        char ch = ' ';
        while(count <= 126)
        {
            ch = (char)(count);
            System.out.print(ch + " ");

            if((count + 7) % NUMBER_PER_LINE == 0)
            {
                System.out.println();
            }
            count++;
        }
        */

        //Exercise 5.16
        /*
        System.out.print("Enter an integer: ");
        int userNum = input.nextInt();
        int count = 2;
        do
        {
            if(userNum % count == 0)
            {
                System.out.print(count + " ");
                userNum /= count;
            }
            else
            {
                count++;
            }
        }while(count <= userNum); 
        */
       
        //Exercise 5.17
        /*
        System.out.print("Enter the number of lines: ");
        int numberOfLine = input.nextInt();

        for(int rows = 1; rows <= numberOfLine; rows++)
        {
            for(int space = numberOfLine - rows; space >= 1; space--)
            {
                System.out.print("  ");
            }
            for(int decending = rows; decending >= 2; decending--)
            {
                System.out.print( decending + " ");
            }
            for(int ascending = 1; ascending <= rows; ascending++)
            {
                System.out.print(ascending + " ");
            }
            System.out.println();

        }
        */
        
        //Exercise 5.18
        /*
        //Pattern A
        for(int i = 1; i <= 6;i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("\n\n");

        //Pattern B
        for(int i = 1; i <= 6; i++)
        {
            for(int j = 1; j <= 7 - i; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }


        //Pattern C
        for(int i = 1; i <= 6; i++)
        {
            for(int j = 1; j <= 6 - i; j++)
            {
                System.out.print("  ");
            } 
            for(int k = 1; k <= i; k++)
            {
                System.out.print(k + " ");
            }
            System.out.println();
        }
        //Patern D
        System.out.println("\n\n");
        for(int i = 1; i <= 6; i++)
        {
            for(int j = i; j > 1; j--)
            {
                System.out.print("  ");
            } 
            for(int k = 1; k <= 7 - i; k++)
            {
                System.out.print(k + " ");
            }
            System.out.println();
        }        
        */
              
        //Exercise 5.19
        /*
        System.out.print("Enter the number of lines: ");
        int numberOfLine = input.nextInt();

        for(int rows = 1; rows <= numberOfLine; rows++)
        {
            for(int space = 1; space <= (numberOfLine - rows); space++)
            {
                System.out.print("    ");
            }
            for(int outter = 0; outter < rows; outter++)
            {
                System.out.printf("%4d", (int)(Math.pow(2,outter)));
            }
            for(int inner = rows - 2; inner >= 0; inner--)
            {
                System.out.printf("%4d", (int)(Math.pow(2,inner)));
            }
            System.out.println();
        }
        */
        
        //Exercise 5.20
        /*
        final int NUMBER_OF_PRIMES = 168;
        final int NUMBER_OF_PRIMES_PER_LINES = 8;

        int number = 2;
        int count = 0;
        System.out.print("The first 50 prime numbers are \n");

        while(count < NUMBER_OF_PRIMES)
        {
            boolean isPrime = true;

            for(int divisor = 2; divisor <= number / 2; divisor++)
            {
                if(number % divisor == 0)
                {
                    isPrime = false;
                    break;
                }
            } 
            if(isPrime)
            {
                count++;
                if(count % NUMBER_OF_PRIMES_PER_LINES == 0 )
                {
                    System.out.println(number);
                }
                else 
                {
                    System.out.print(number + " ");
                }
            }
            number++;
        }
        */

        //exercise 5.21
        /*
        DecimalFormat df3 = new DecimalFormat("#.###");
        DecimalFormat df2 = new DecimalFormat("#.##");

        System.out.print("Loan Amount: ");
        int loan = input.nextInt();
        System.out.print("Number of Years: ");
        int years = input.nextInt();
        double monthlyInterest = 0.0;
        double monthlyPayment = 0.0;
        double totalPayment = 0.0;

        System.out.println("Interest Rate\tMonthly Payment\t\tTotal Payment");

        for(double interest = 5.0; interest <= 8.000; interest = interest + .125)
        {
            monthlyInterest = interest / 1200;
            monthlyPayment = loan * monthlyInterest / (1 - 1/Math.pow(1 + monthlyInterest, years * 12));
            totalPayment = (monthlyPayment * 12) * years;
            System.out.println(df3.format(interest) + "%" + "\t\t" + df2.format(monthlyPayment) + "\t\t\t" + df2.format(totalPayment));
            
        }
        */

        //Exercise 5.22
        /*
        DecimalFormat df = new DecimalFormat("#.##");
        double principal = 0.0;
        double interest = 0.0;

        System.out.print("Enter the loan amount: $");
        double loanAmount = input.nextDouble();
        System.out.print("Number of Years: ");
        int numberOfYears = input.nextInt();
        System.out.print("Annual interest rate: ");
        double annualInterestRate = input.nextDouble();
   
        double monthlyInterestRate = annualInterestRate / 1200 ;

        double monthlyPayment = (loanAmount * monthlyInterestRate) / (1 - 1 / Math.pow(1 + monthlyInterestRate , numberOfYears * 12));
        double totalPayment = (monthlyPayment * numberOfYears * 12);

        System.out.println("The monthly payment is $" + df.format((monthlyPayment * 100) / 100.0));
        System.out.println("The total payment is $" + df.format((totalPayment * 100) / 100.0));

        System.out.println("Payment#\tInterest\tPrincipcal\tBalance");
        
        for(int payment = 1; payment <= numberOfYears * 12; payment++)
        {
            interest = monthlyInterestRate * totalPayment;
            principal = monthlyPayment - interest;
            totalPayment = totalPayment - principal;
            System.out.println(payment + "\t\t" + df.format(interest) + "\t\t" + df.format(principal) + "\t\t" + df.format(totalPayment));
        }
        */

        //Exercise 5.23
        /*
        double resultRL = 0.0; 
        double resultLR = 0.0;

        for(int n = 50000; n >= 1;n--)
        {
            resultRL += (double)(1.0 / n); 
        }
        System.out.println("The result from right to left is: " + resultRL);

        for(int n = 1 ; n <= 50000;n++)
        {
            resultLR += (double)(1.0 / n); 
        }
        System.out.println("The result from left to right: " + resultLR);

        double difference = resultRL - resultLR;
        System.out.println("The difference is " + difference);
        */

        //Exercise 5.24
        /*
        double result = 0.0;
        for(double numerator = 1.0; numerator <= 97.0; numerator += 2.0)
        {
            result += (numerator / (numerator + 2));
        }
        System.out.println("The sum of series is: " + result);
        */

        //Exercise 5.25
        /*
        double result = 0.0;
        System.out.print("Enter the value for i: ");
        double userInput = input.nextDouble();
        for(double i = 1.0; i <= userInput; i += 2)
        {
            result += 1.0 / i;
            i += 2;
            result -= 1 / i;
        }
        System.out.println("PI is equal to: " + (4.0 * result));
        */

        //Exercise 5.26
        /*
        double result = 1.0;
        double number = 100000.0;
        double item = 1.0;
        for(double i = 2.0; i <= number ; i++)
        {
            item /= i;
            result += item;
            if(i % 10000 == 0)
            {
                System.out.println("i is " + i + " and e is " + (4 * result));
            }
        }
        */

        //Exercise 5.27
        /*
        int leapYear = 0;
        for(int i = 101; i <= 2100; i++)
        {
            if(i % 4 == 0)
            {
                leapYear++;
                System.out.print(i + " ");
            }
            if(i % 40 == 0)
            {
                System.out.println();
            }
        }
        System.out.println("Number of leap years: " + leapYear);
        */

        //Exercise 5.28
        /*
        String Month, Day;
        System.out.print("Enter the year: ");
        int year = input.nextInt();
        System.out.print("Enter an day: ");
        int day = input.nextInt();

        for(int month = 1; month <= 12; month++)
        {
            int length = 30 + ((month + (int)(month / 8.0)) % 2);
            if(month == 2)
            {
                if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
                {
                    length = 29;
                }
                else 
                {
                    length = 28;
                }
            }
        
            switch(month)
            {
                case 1: Month = "Jan"; break;
                case 2: Month = "Feb"; break;
                case 3: Month = "Mar"; break;
                case 4: Month = "Apr"; break;
                case 5: Month = "May"; break;
                case 6: Month = "Jun"; break;
                case 7: Month = "Jul"; break;
                case 8: Month = "Aug"; break;
                case 9: Month = "Sep"; break;
                case 10: Month = "Oct"; break;
                case 11: Month = "Nov"; break;
                case 12: Month = "Dec"; break;
                default: Month = " "; break;
            }
            day = day % 7;
            switch(day)
            {
                case 1: Day = "Monday"; break;
                case 2: Day = "Tuesday"; break;
                case 3: Day = "Wednesday"; break;
                case 4: Day = "Thursday"; break;
                case 5: Day = "Friday"; break;
                case 6: Day = "Saturday"; break;
                case 7: Day = "Sunday"; break;
                default: Day = "Sunday"; break;
            }
            System.out.println(Month + " 1, " + year + " is " + Day);
            day += length;
        }
        */

        //Exercise 5.29
        /*
        String Month, Day;
        System.out.print("Enter the year: ");
        int year = input.nextInt();
        System.out.print("Enter an day: ");
        int startDay = input.nextInt();
        int numOfDaysInMonth = 0;

        for(int month = 1; month <= 12; month++)
        {
            System.out.print("          ");      
            switch(month)
            {
                case 1: System.out.println("Jan" + year); numOfDaysInMonth = 31; break;
                case 2: System.out.println("Feb" + year); 
                        if(year % 4 == 0)
                        {
                            numOfDaysInMonth = 29; 
                        }
                        else 
                        {
                            numOfDaysInMonth = 28; 
                        }    
                            break;
                case 3: System.out.println("Mar" + year); numOfDaysInMonth = 31; break;
                case 4: System.out.println("Apr" + year); numOfDaysInMonth = 30; break;
                case 5: System.out.println("May" + year); numOfDaysInMonth = 31;break;
                case 6: System.out.println("Jun" + year); numOfDaysInMonth = 30;break;
                case 7: System.out.println("Jul" + year); numOfDaysInMonth = 31;break;
                case 8: System.out.println("Aug" + year); numOfDaysInMonth = 30; break;
                case 9: System.out.println("Sep" + year); numOfDaysInMonth = 31;break;
                case 10: System.out.println("Oct" + year); numOfDaysInMonth = 30;break;
                case 11: System.out.println("Nov" + year); numOfDaysInMonth = 31;break;
                case 12: System.out.println("Dec" + year); numOfDaysInMonth = 30;break;
                default: Month = " "; break;
            }
            System.out.println("-----------------------------");
            System.out.println(" Sun Mon Tue Wed Thu Fri Sat");


            for (int i = 0; i < startDay; i++) {
                System.out.print("    ");
            }
            for (int i = 1; i <= numOfDaysInMonth; i++)
            {
                if (i < 10) {
                    System.out.print("   " + i);
                } else {
                    System.out.print("  " + i);
                }
                if ((i + startDay) % 7 == 0) {
                    System.out.println();
                }
            }
            System.out.println("");
        }
        */

        //Exercise 5.30
        /*
        DecimalFormat df = new DecimalFormat(".#####");
        System.out.print("Enter an amount: $");
        double amount = input.nextDouble();
        System.out.print("Enter an anual interest rate: ");
        double anualRate = input.nextDouble();
        System.out.print("Enter the amount of months: ");
        double month = input.nextDouble();

        double balance = 0.0;
        double monthlyInterest = (anualRate / 100.0) / 12.0;

        for(int i = 1; i <= month; i++)
        {
            balance = (amount + balance) * (1 + monthlyInterest);
            System.out.printf("The savings for month %d" + " is $%.3f \n", i, balance );
        }
        */

        //Exercise 5.31
        /*
        DecimalFormat df = new DecimalFormat(".##");
        System.out.println("Enter the inital deposit amount: $");
        double amount = input.nextDouble();
        System.out.println("Enter annual percentage yield: ");
        double anualRate = input.nextDouble();
        System.out.println("Enter the maturity period (number of months): ");
        double month = input.nextDouble();
        double monthlyInterest = (anualRate / 100.0) / 12.0;

        System.out.println("Month\tCD Value");
        double balance = 0.0;

        for(int i = 1; i <= month; i++)
        {
            balance = (amount) + (amount * monthlyInterest);
            amount = balance;
            System.out.println(i + "\t" + df.format(balance));
        }
        */

        //Exercise 5.32
        /*
        int lotteryDigit1 = 1 + (int)(Math.random() * 9);
        System.out.println("The lottery digit 1 is " + lotteryDigit1);

        int lotteryDigit2 = 1 + (int)(Math.random() * 9);
        System.out.println("The lottery digit 2 is " + lotteryDigit2);


        while(lotteryDigit1 == lotteryDigit2)
        {
            lotteryDigit2 = 1 + (int)(Math.random() * 9);
            System.out.println("The lottery digit 2 " + lotteryDigit2);
        }

        System.out.print("Enter your lottery pick (two distinct digits): ");
		int guess = input.nextInt();

		int guessDigit1 = guess / 10;
		int guessDigit2 = guess % 10;

        if(guessDigit1 == lotteryDigit1 && guessDigit2 == lotteryDigit2)
        {
                System.out.println("Exact match: you win $10,000");
        }
        else if(guessDigit2 == lotteryDigit1 && guessDigit1 == lotteryDigit2)
        {
            System.out.println("Match all digits: you win $3,000");
        }
        else if(guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 ||
                guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2)
        {
                System.out.println("Match one digit: you win $1,000");
        }else 
            System.out.println("Sorry, no match");
        */

        //Exercise 5.33
        /*
        for(int i = 1; i <= 10000; i++)
        {
            int sum = 0;

            for(int j = 1; j < i; j++)
            {
                if(i % j == 0)
                {
                    sum += j;
                }
            }
            if(i == sum)
            {
                System.out.println(i);
            }

            for(int number = 1; number <= 10000; number++)
            {
                boolean isPerfectNumber = (i == sum);
            }
        }
        */

        //Exercise 5.34
        /*
        String gameName = " ";
        String decisionName = " ";

        int compWin = 0;
        int userWin = 0;
    
        do
        {
            int game = (int)(Math.random() * 3);
            System.out.println("computer is: " + game);

            System.out.print("scissor(0), rock(1), paper(2): ");
            int decision = input.nextInt();

            switch(game)
            {
                case 0: gameName = "Scissor"; break;
                case 1: gameName = "Rock"; break;
                case 2: gameName = "Paper"; break;
                default : System.out.println("Wrong input"); break;
            }

            switch(decision)
            {
                case 0: decisionName = "Scissor"; break;
                case 1: decisionName = "Rock"; break;
                case 2: decisionName = "Paper"; break;
                default : System.out.println("Wrong input"); break;
            }

            if(game == decision)
            {
                System.out.println("The game is " + gameName + ". You are " + decisionName + " too. It is a draw");
            }
            else if((decision == 0 && game == 2) || (decision == 1 && game == 0) ||(decision == 2 && game == 1))
            {
               System.out.println("You win");
               userWin++;
               System.out.println("User win is: " + userWin);
               System.out.println("Comp win is: " + compWin);

            }
            if((decision == 2 && game == 0) || (decision == 0 && game == 1) ||(decision == 1 && game == 2))
            {
                System.out.println("You lost");
                compWin++;
                System.out.println("User win is: " + userWin);
                System.out.println("Computer win is: " + compWin);
            }
        }while(Math.abs(compWin - userWin) < 2);
        System.out.println(userWin == 2 ? "User wins 2 out of 3" : "Computer wins 2 out of 3");
        */

        //Exercise 5.35
        /*
        double result = 0.0;
        for(int i = 1; i <= 624; i++)
        {
            result += 1.0 / (Math.sqrt((double)i) + Math.sqrt((double)(i + 1.0)));
        }
        System.out.print("The result of the sumation is: " + result);
        */

        //Exercise 5.36
        /*
        int equation = 0;
        String ISBN = "";

        for(int i = 1; i <= 9; i++)
        {
            System.out.print("Enter the " + i + " digit: ");
            int number = input.nextInt();
            equation += (number * i);
            ISBN += "" + number;
        }

        System.out.println("The ISBN is: " + ISBN);

        equation = equation % 11;

        switch (equation)
        {
        case 0 : System.out.print("The ISBN-10 number is " + ISBN + "0");break;
        case 1 : System.out.print("The ISBN-10 number is " + ISBN + "1");break;
        case 2 : System.out.print("The ISBN-10 number is " + ISBN + "2");break;
        case 3 : System.out.print("The ISBN-10 number is " + ISBN + "3");break;
        case 4 : System.out.print("The ISBN-10 number is " + ISBN + "4");break;
        case 5 : System.out.print("The ISBN-10 number is " + ISBN + "5");break;
        case 6 : System.out.print("The ISBN-10 number is " + ISBN + "6");break;
        case 7 : System.out.print("The ISBN-10 number is " + ISBN + "7");break;
        case 8 : System.out.print("The ISBN-10 number is " + ISBN + "8");break;
        case 9 : System.out.print("The ISBN-10 number is " + ISBN + "9");break;
        case 10 : System.out.print("The ISBN-10 number is " + ISBN + "X");break;
        }
        */
        
        //Exercise 5.37
        /*
        System.out.print("Enter a decimal number: ");
        int decimal = input.nextInt();
        int binary = 0;
        String decimalToBinary = "";
        String finalBinary = "";
        char ch;

        while(decimal != 0)
        {
            binary = decimal % 2;
            decimalToBinary += binary + "";
            decimal = decimal / 2;
        }

        for(int i = decimalToBinary.length() - 1; i >= 0; i--)
        {
            ch = decimalToBinary.charAt(i);   
            finalBinary += ch + "";
        }
        System.out.print("The binary number is: " + finalBinary);
        */

        //Exercise 5.38
        /*
        System.out.print("Enter a decimal number: ");
        int decimal = input.nextInt();
        int octal = 0;
        String decimalToOctal = "";
        String finalOctal = "";
        char ch;

        while(decimal != 0)
        {
            octal = decimal % 8;
            decimalToOctal += octal + "";
            decimal = decimal / 8;
        }

        for(int i = decimalToOctal.length() - 1; i >= 0; i--)
        {
            ch = decimalToOctal.charAt(i);   
            finalOctal += ch + "";
        }
        System.out.print("The ocatl number is: " + finalOctal);
        */

        //Exercise 5.39 !!!!!!!!!!!!!!!!!!HOLD!!!!!!!!!!!!!!!!!!!!!
        /*
        DecimalFormat df = new DecimalFormat("#.##");
        final double COMISSION_SOUGHT = 30000;
        double saleAmount, commissionRate, balance;
        saleAmount = 0; commissionRate = 0; balance = 0;

        do
        {
            saleAmount += 0.01;
            if(saleAmount > 10000)
            {
                commissionRate += (balance = saleAmount - 10000) * 0.12;
            }
            if(saleAmount > 5000)
            {
                commissionRate += (balance -= saleAmount - 5000) * 0.10;
            }
            if(saleAmount > 0)
            {
                commissionRate += balance * 0.08;
            }
        }while(commissionRate < COMISSION_SOUGHT);

        System.out.println("Minimum sales to earn $30,000 is: " + df.format(saleAmount));
        */

        //Exeercise 5.40
        /*
        int heads = 0;
        int tails = 0;
        int coin;

        for(int i = 1; i <= 1000000; i++)
        {
            coin = (int)(Math.random() * 2);
            if(coin == 0)
            {
                heads++;
            }
            else
            {
                tails++;
            }
        }
        System.out.println("The number of heads is: " + heads);
        System.out.println("The number of tails is: " + tails);
        */

        //Exercise 5.41
        /*
        System.out.print("Enter numbers: ");
        int max = input.nextInt();
        int count = 1;
        int number = 1;

        while(number > 0)
        {
            number = input.nextInt();
            if(number > max)
            {
                max = number;
                count = 1;
            }
            if(number == max)
            {
                count++;
            }
        }
        System.out.println("The largest number is " + max);
        System.out.println("The occurence count of the largest number is " + (count - 1));
        */

        //Exercise 5.42
        /*
        DecimalFormat df = new DecimalFormat("#.##");
        final double COMISSION_SOUGHT = 30000;
        double saleAmount, commissionRate, balance;
        saleAmount = 0; commissionRate = 0; balance = 0;

        for(saleAmount = 0; commissionRate <= COMISSION_SOUGHT;)
        {
            saleAmount += 0.01;
            if(saleAmount > 10000)
            {
                commissionRate += (balance = saleAmount - 10000) * 0.12;
            }
            if(saleAmount > 5000)
            {
                commissionRate += (balance -= saleAmount - 5000) * 0.10;
            }
            if(saleAmount > 0)
            {
                commissionRate += balance * 0.08;
            }
        }

        System.out.println("Minimum sales to earn $30,000 is: " + df.format(saleAmount));
        */

        //Exercise 5.43
        /*
        int count = 0; 
		for (int number1 = 1; number1 < 7; number1++) {
			for (int number2 = number1 + 1; number2 <= 7; number2++) {
				System.out.println(number1 + " " + number2);
				count++; 
			}
		}
		System.out.println("The total number of all combinations is " + count);
        */

        //Exercise 5.44
        /*
        System.out.print("Enter a decimal number: ");
        int number = input.nextInt();
        int decimal = number;
        int binary = 0;
        String decimalToBinary = "";
        String finalBinary = "";
        char ch;

        String positive = "";
        String negative = "";

        if(decimal < 0)
        {
            decimal = (-1) * decimal;
        }

        while(decimal != 0)
        {
            binary = decimal % 2;
            decimalToBinary += binary + "";
            decimal = decimal / 2;
        }

        for(int i = decimalToBinary.length() - 1; i >= 0; i--)
        {
            ch = decimalToBinary.charAt(i);   
            finalBinary += ch + "";
        }

        for(int i = finalBinary.length(); i < 16; i++)
        {
            if(number > 0)
            {
                positive += "0";
            }
            else
            {
                negative += "1";
            }
        }
        System.out.println((number > 0) ? (positive) + "" + finalBinary : (negative) + "" + finalBinary);
        */

        //Exercise 5.45
        /*
        System.out.println("Enter ten numbers");
        double mean = 0.0; 
        double deviation = 0.0;
        double deviationSquareSummation = 0.0;
        double deviationSummationSquared = 0.0;
        double i = 1.0;
        do
        {
            System.out.print("Enter the " + i + " number: ");
            double user = input.nextDouble();

            mean += user;

            deviationSquareSummation += Math.pow(user,2.0);
            deviationSummationSquared += user;

            i++;

        }while(i <= 10.0);

        mean = mean / 10.0;
        deviation = Math.pow(((deviationSquareSummation) - (Math.pow(deviationSummationSquared,2.0) / 10.0)) / (9.0), 0.5);
        System.out.println("The mean is: " + mean);
        System.out.println("The standard deviation is: " + deviation);
        */

        //Exercise 5.46
        /*
        System.out.print("Enter a string: ");
        String myString = input.nextLine();
        char ch ; 
        String newString = "" ;

        for(int i = myString.length() - 1; i >= 0; i--)
        {
            ch = myString.charAt(i);
            newString += "" + ch;
        }
        System.out.println("The reversed string is " + newString);
        */

        //Exercise 5.47
        /*
        System.out.print("Enter the first 12 digits of an ISBN-13 as a string: ");
        String myString = input.nextLine();
        int check = 0;
        char ch;
        String ISBN = "";
        int lastDigit = 0;

        if(myString.length() == 12)
        {
            for(int i = 0; i <= myString.length() - 1; i++)
            {
                if(i % 2 == 0)
                {
                    ch = myString.charAt(i);
                    check += (3 * Character.getNumericValue(ch));
                }
                else
                {
                    ch = myString.charAt(i);
                    check += Character.getNumericValue(ch);
                }
            }
            lastDigit = 10 - (check) % 10;

            switch(lastDigit)
            {
                case 1: System.out.println(myString + "1"); break;
                case 2: System.out.println(myString + "2"); break;
                case 3: System.out.println(myString + "3"); break;
                case 4: System.out.println(myString + "4"); break;
                case 5: System.out.println(myString + "5"); break;
                case 6: System.out.println(myString + "6"); break;
                case 7: System.out.println(myString + "7"); break;
                case 8: System.out.println(myString + "8"); break;
                case 9: System.out.println(myString + "9"); break;
                case 10: System.out.println(myString + "0"); break;
                default: System.out.println("Invalid"); break;
            }
        }
        else
        {
            System.out.println(myString + " is an invalid input");
        }
        */

        //Exercise 5.48
        /*
        System.out.print("Enter a string: ");
        String userString = input.nextLine();
        char ch;
        String oddString = "";

        for(int i = 0; i <= userString.length() - 1; i+= 2)
        {
            ch = userString.charAt(i);
            oddString += "" + ch;
        }
        System.out.println(oddString);
        */

        //Exercise 5.49
        /*
        System.out.print("Enter a string: ");
        String userString = input.nextLine();
        userString = userString.toLowerCase();
        char ch;
        int vowel = 0;
        int constant = 0;

        for(int i = 0; i <= userString.length() - 1; i++)
        {
            ch = userString.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
            {
                vowel++;
            }
            else if(ch == ' ')
            {
                continue;
            }
            else
            {
                constant++;
            }
        }
        System.out.println("The number of vowels is: " + vowel);
        System.out.println("The number of constants is: " + constant);
        */

        //Exercise 5.50
        /*
        System.out.print("Enter a string: ");
        String userString = input.nextLine();
        char ch;
        int upperCase = 0;

        for(int i = 0; i <= userString.length() - 1; i++)
        {
            ch = userString.charAt(i);
            if(Character.isUpperCase(ch))
            {
                upperCase++;
            }
        }
        System.out.println("The number of uppercase letters is: " + upperCase);
        */

        //Exercise 5.51 !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!REVIEWED WRONG!!!!!!!!!!!!!!!!!!!!!!!!
        /*
        System.out.print("Enter the first string: ");
        String userString1 = input.nextLine();

        System.out.print("\nEnter the first string: ");
        String userString2 = input.nextLine();
        
        String longestPrefix = "";

        int index = 0;
        
        while (userString1.charAt(index) == userString2.charAt(index))
        {
            longestPrefix += userString1.charAt(index);
            index++;
        }

        if(longestPrefix.length() > 0)
        {
            System.out.println("The common prefix is " + longestPrefix);
        }
        else
        {
            System.out.println(userString1 + " and " + userString2 + " have no commmon prefix");
        }
        */

    }
}