import java.util.Scanner;

public class Binary_search {

    static Scanner scn= new Scanner(System.in);
    public static void main(String args[])
    {
        int arr[] = new int[10];
        for(int i=0;i<10;i++)
            arr[i] = scn.nextInt();
        
        for(int i=0;i<10;i++)
            System.out.println("Val: "+arr[i]);

        System.out.println("What are you looking for? ");
        int item = scn.nextInt();
        Binary_Search(item,arr);
        
    }

    public static void Binary_Search(int item, int[] arr)
    {
        int l = arr.length;
        int low=0,high = l;

        while (low<=high)
        {
            int mid = (low+high)/2;
            if (item==arr[mid])
                {
                    System.out.println("Found it at: "+mid);
                    return;
                }

            else if (item>arr[mid])
                low = mid+1;
            else
                high = mid - 1;
            
        }

        System.out.println("Not Present!");
        return;
    }
    
}
