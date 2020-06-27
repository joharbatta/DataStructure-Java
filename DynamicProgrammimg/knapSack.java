import java.util.*;
import java.lang.*;
import java.io.*;

class knapSack {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int k=0;k<t;k++)
		{
		    int n=sc.nextInt();
		    int w=sc.nextInt();
		    int val[]=new int [n];
		    int wt[]=new int [n];
		   
		    for(int i=0;i<n;i++)
		    {
		        val[i]=sc.nextInt();
		    }
		     
		    for(int j=0;j<n;j++)
		    {
		        wt[j]=sc.nextInt();
		    }
		    System.out.println(knapsack(n,w,val,wt));
		   
		}
	}
	static int knapsack(int n,int w,int val[],int wt[])
{
   
    // if(n==0||w==0)
    // {
    //     return 0;
    // }
    
    // if(wt[n-1]>w)
    // {
    //     return knapsack(n-1,w,val,wt);
    // }
    // int a=knapsack(n-1,w,val,wt);
    // int b=val[n-1]+knapsack(n-1,w-wt[n-1],val,wt);
    // return Math.max(a,b);
     int dp[][]=new int[n+1][w+1];
    for(int i=0;i<=n;i++)
    {
        for(int j=0;j<=w;j++)
        {
            if(i==0||j==0)
            {
                dp[i][j]=0;
            }
            else if(wt[i-1]>j)
            {
               dp[i][j]=dp[i-1][j]; 
            }
            else
            {
                   dp[i][j]=Math.max(dp[i-1][j],(val[i-1]+dp[i-1][j-wt[i-1]]));   
            }
        }
     
    }
    return dp[n][w];
}

}