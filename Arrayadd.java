import java.util.*;
public class Arrayadd
{
	public static void main(String args[])
	{
		/*
		int sum1=0;
		int res=0;
		int arr[]={1,2,3,4};
		for(int i=0;i<arr[3];i++)
		{
		if(arr[i]%2==0)
		{
			sum1=sum1+arr[i];
			
		}
		else
		{
			res+=arr[i];
			//System.out.println(res);
		}
		
		}
		System.out.println(sum1);
		System.out.println(res);
		*/
		int n;
		Scanner sc=new Scanner(System.in);
		int sum=0;
		int res=0;
		n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(arr[i]%2==0)
			{
				sum=sum+arr[i];
			}
			else
			{
				res=res+arr[i];
			}
		}
		System.out.println(sum);
		System.out.println(res);
		
		/*
		int[] x=new int[10];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<=9;i++)
		{
			x[i]=sc.nextInt();
		}
		for(int i=0;i<=9;i++)
			System.out.println(x[i]);*/
	}
	
}