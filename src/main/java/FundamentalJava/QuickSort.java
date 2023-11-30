package FundamentalJava;
import java.util.Arrays;
public class QuickSort
{ public static void quicksort(int [] arr,int low,int high)
    {
        if(low>high)
            return;
        int start=low;
        int end=high;
        int mid=(high+low)/2;
        int pivot=arr[mid];
        while (start<=end)
        {
            while (arr[start]<pivot)
                start++;
            while (arr[end]>pivot)
                end--;
            if((start<=end))
            {
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
        }
        quicksort(arr, low, end);
        quicksort(arr,start,high);

    }
    public static void main(String[] args)
    {
        int [] arrayss={5,9,5,4,6,7,1,2,8,9};
        System.out.println("Before sort :"+ Arrays.toString(arrayss));
        quicksort(arrayss,0, arrayss.length-1);
        System.out.println("After sort :"+ Arrays.toString(arrayss));
    }
}
