
public class Array_one{
    public static void main(String[] args) 
    {
        int arr[] = new int[10];
        
        for(int i=0;i<arr.length;i++)  
        {
            arr[i] = i;
            System.out.println(arr[i]);
        }

        swap(arr,1,2);
        System.out.println("Element at 1: "+arr[1] + "Element at 2: "+arr[2]);

    }

    public static void swap(int[] arr, int i,int j)
    {
        int temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}