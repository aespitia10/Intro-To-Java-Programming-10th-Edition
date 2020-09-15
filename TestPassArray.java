public class TestPassArray 
{
    public static void main(String []args)
    {
        int[] a = {1, 2};
        int[] list1 = {1, 2, 3, 4, 5, 6};

        System.out.println("Before invoking the swap");
        System.out.println("array is {" + a[0] +", " + a[1]+ "}");
        swap(a[0],a[1]);
        System.out.println("After invoking swap");
        System.out.println("array is {" + a[0] +", " + a[1]+ "}");

        System.out.println("Before invoking swapFirstTwoInArray");
        System.out.println("array is {" + a[0] +", " + a[1]+ "}");
        swapFirstTwoInArray(a);
        System.out.println("Before invoking swapFirstTwoInArray");
        System.out.println("array is {" + a[0] +", " + a[1]+ "}");
       
        int[] list2 = reverse(list1);
        System.out.println("The reverse array is: ");
        for(int i = 0; i <= list2.length - 1; i++)
        {
            System.out.println(list2[i]);
        }

    }    
    
    public static void swap(int n1, int n2)
    {
        int temp = n1;
        n1 = n2;
        n2 = temp;
    }

    public static void swapFirstTwoInArray(int[] array)
    {
        int temp = array[0];
        array[0] = array[1];
        array[1] = temp; 
    }

    public static int[] reverse(int[] list)
    {
        int[] result = new int[list.length];

        for(int i = 0, j = result.length - 1; i < list.length ; i++,j--)
        {
            result[j] = list[i];
        }

        return result;
    }

}