import java.util.Scanner;

public class array2_input {
    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args)
    {
        int arr[] = take();
        display(arr);
    }

    public static int[] take()
    {
        System.out.println("Enter size: ");
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            {
                arr[i] = scn.nextInt();
                //System.out.println(' '+arr[i]+' ');
            }
        return arr;
    }


    public static void display(int arr[])
    {
        for(int i=0;i<arr.length;i++)
            System.out.println(arr[i]);
    }
    
}
