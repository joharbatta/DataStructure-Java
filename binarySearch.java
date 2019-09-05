// binary search only works on sorted arrays
import java.util.*;
class binarySearch
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        int beg,mid,end;
        for(int i=0;i<=4;i++)
        {
            arr[i]=sc.nextInt();

        }
        int k=sc.nextInt();

        beg=0;
        end=arr.length-1;

        while(beg<=end)
        {
            mid=(beg+end)/2;

            if(arr[mid]==k)
            {
                System.out.println("Value found at: "+(mid+1));
                break;
            }
            if(k>arr[mid])
            {
                beg=mid+1;
            }
            if(k<arr[mid])
            {
                end=mid-1;
            }

        }




    }
}