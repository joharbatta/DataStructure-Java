import java.util.*;

public class larSarrSumzero
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        int lmin=0;
        for(int i=0;i<n;i++)
        {
            int sum=0;
            int l=0;
            for(int j=i;j<n;j++)
            {
                sum+=arr[j];
                l++;
                if(sum==0)
                {
                if(l>lmin)
                {
                    lmin=l;
                }
                }

            }
            
        }
        System.out.println("Length of subarray with zero sum "+lmin);


    }
}