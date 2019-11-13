import java.util.*;
public class checkarrsub
{
 
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int n1=sc.nextInt();
        int arr1[]=new int[n1];
        //int n2=sc.nextInt();
        //int arr2[]=new int[n2];

      

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n1;i++)
        {
            arr1[i]=sc.nextInt();
        }
        // for(int i=0;i<n2;i++)
        // {
        //     arr2[i]=sc.nextInt();
        // }

       
        if(isSubset(arr, arr1, n, n1)) 
        System.out.println("arr2 is a subset of arr1"); 
        else
        System.out.println("arr2 is not a subset of arr1"); 
     



    }


    static boolean isSubset(int arr[], int arr1[], int n, int n1) 
    {
        int j=0;
        for(int i=0;i<n1;i++)
        {
            for(j=0;j<n;j++)
            {
                if(arr1[i]==arr[j])
                break;
            }
            if(j==n)
            {
            return false;
            }
        }
        return true;
    
    }
}