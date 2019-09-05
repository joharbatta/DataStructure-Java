import java.util.*;

class selectionSort
{
    public static void main(String args[])
    {
        int min,index=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            min=i;

            for(int j=i+1;j<n;j++)
            {
                if(arr[j]<arr[min])
                {
                   min=j;
                }
            }
            if(min!=i)
            {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}