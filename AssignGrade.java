import java.util.*;
public class AssignGrade 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int size = input.nextInt();
        int[] scores = new int[size];

        System.out.print("Enter " + size + " scores: ");

        for(int i = 0; i <= scores.length - 1; i++)
        {
            scores[i] = input.nextInt();
        }

        assignGrade(scores, getBestScore(scores));

        input.close();


    }
    public static int getBestScore(int[] scores)
    {
        int max = scores[0];

        for(int i = 1; i <= scores.length - 1; i++)
        {
            if(max < scores[i])
            {
                max = scores[i];
            }
        }
        return max;
    }

    public static void assignGrade(int[] scores, int best)
    {
        for(int i = 0; i <= scores.length - 1; i++)
        {
            if(scores[i] >= best - 10)
            {
                System.out.println("Student " + i + " score is " + scores[i] + " and the grade is A");
            }
            else if(scores[i] >= best - 20)
            {
                System.out.println("Student " + i + " score is " + scores[i] + " and the grade is B");
            }
            else if(scores[i] >= best - 30)
            {
                System.out.println("Student " + i + " score is " + scores[i] + " and the grade is C");
            }
            else if(scores[i] >= best - 40)
            {
                System.out.println("Student " + i + " score is " + scores[i] + " and the grade is D");
            }
            else 
            {
                System.out.println("Student " + i + " score is " + scores[i] + " and the grade is F");
            }
        }
    }
}