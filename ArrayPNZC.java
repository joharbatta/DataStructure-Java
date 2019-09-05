import java.util.*;
public class ArrayPNZC
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int cpos=0,cneg=0,czero=0;
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(arr[i]>0)
			{
				cpos++;
			}
			if(arr[i]<0)
			{
				cneg++;
			}
			if(arr[i]==0)
			{
				czero++;
			}
		}
		System.out.println(cpos);
		System.out.println(cneg);
		System.out.println(czero);
		
}}