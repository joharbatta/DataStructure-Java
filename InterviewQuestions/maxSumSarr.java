import java.util.*;

public class maxSumSarr
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
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                int sum=0;
                for(int k=i;k<=j;k++)
                {
                    sum+=arr[k];
                }
                if(sum>max)
                {
                    max=sum;
                }
            }
        }
        System.out.println(max);


        // kadane algo o(n)

        int maxSum=Integer.MIN_VALUE;
        int currSum=0;

        for(int i=0;i<n;i++)
        {
            currSum+=arr[i];

            if(currSum>maxSum)
            {
                maxSum=currSum;
            }
            if(currSum<0)
            {
                currSum=0;

            }
        }
        System.out.print(maxSum);
        



    }
}