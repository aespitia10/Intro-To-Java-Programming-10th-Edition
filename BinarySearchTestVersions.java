public class BinarySearchTestVersions
{
    public static void main(String [] args)
    {
        int [] list = {2,4,7,10,11,45,50,59,60,66,69,70,79};
        System.out.println(list.length);

        // int i = binarySearchV1(list, 66);
        // System.out.println("i is: " + i);

        int j = binarySearchV2(list, 59);
        System.out.println("\nj is: " + j);
    }    

    // public static int binarySearchV1(int[] list, int key)
    // {
    //     int low = 0;
    //     int high = list.length - 1;

    //     int mid = (low + high) / 2;
    //     if(key < list[mid])
    //     {
    //        high = mid - 1;
    //     }
    //     else if(key == list[mid])
    //     {
    //         return mid;
    //     }
    //     else 
    //         low = mid + 1;
    // }

    public static int binarySearchV2(int[] list, int key)
    {
        int low = 0;
        int high = list.length - 1;

        while(high >= low)
        {
            int mid = (low + high) / 2;

            if(key < list[mid])
            {
                high = mid - 1;
            }
            else if(key == list[mid])
            {
                return mid;
            }
            else 
                low = mid + 1;
        }
        return -low - 1;
    }
}