import java.util.Arrays;
public class TestingArrayClasses 
{
    public static void main(String []args)
    {
        double [] numbers = {6.0, 4.4, 1.9, 2.9, 3.4, 3.5};

        Arrays.sort(numbers);
        for(int i = 0; i <= numbers.length - 1; i++)
        {
            System.out.print(numbers[i] + " ");
        }

        Arrays.parallelSort(numbers);
        System.out.println();
        for(int j = 0; j <= numbers.length - 1; j++)
        {
            System.out.print(numbers[j] + " ");
        }

        char[] chars = {'b', 'a', 'q', 'j', 'h', 'm'};

        Arrays.sort(chars, 0, 3);
        System.out.println();
        for(int j = 0; j <= chars.length - 1; j++)
        {
            System.out.print(chars[j] + " ");
        }

        Arrays.parallelSort(chars, 0, 5);
        System.out.println();
        for(int j = 0; j <= chars.length - 1; j++)
        {
            System.out.print(chars[j] + " ");
        }

        int[] list = {2,4,7,10,11,45,50,59,60,66,69,70,79};

        System.out.println("1. Index is " +
        java.util.Arrays.binarySearch(list, 11));

        System.out.println("2. Index is " +
        java.util.Arrays.binarySearch(list, 12));

        char[] charArray = {'a', 'c', 'g', 'x', 'y', 'z'};

        System.out.println("3. Index is " +
        java.util.Arrays.binarySearch(charArray, 'a'));

        System.out.println("4. Index is " +
        java.util.Arrays.binarySearch(charArray, 't'));

        int[] list1 = {2, 3, 7, 10};
        int[] list2 = {2, 3, 7, 10};
        int[] list3 = {4, 3, 7, 10};

        System.out.println(Arrays.equals(list1, list2));
        System.out.println(Arrays.equals(list1, list3));

        int[] list4 = {2,4,7,7,7,10};

        Arrays.fill(list1, 5); // fill up the whole array with 8's

        for(int j = 0; j <= list1.length - 1; j++)
        {
            System.out.print(list1[j] + " ");
        }

        Arrays.fill(list4,1,5,8); //fill up array with 8's from list4[1] through list4[5-1]
        System.out.println();

        for(int j = 0; j <= list4.length - 1; j++)
        {
            System.out.print(list4[j] + " ");
        }

        int[] list5 = {2,3,4,5,6};
        System.out.println();
        System.out.println(Arrays.toString(list5));

    }
}