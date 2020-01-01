import java.util.*;
//count pairs with given sum
public class cPairsSum {
	public static void main (String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int j=0;j<n;j++)
		{
		int t=sc.nextInt();
		int sum=sc.nextInt();
		int arr[]=new int[t];
		for(int i=0;i<t;i++)
		{
		    arr[i]=sc.nextInt();
		}
		getPairsCount(arr,sum);
		}
	}
	public static void getPairsCount(int[] arr,int B)
	{
	    int n = arr.length, i=0, j=n-1, c=0;
        while(i<j){
            int sum = arr[i] + arr[j];
            if(sum==B ){
                c++;
                i++;
            }
            else if(sum>B)
                j--;
            else
                i++;
        }
        System.out.println(c);
	    
	}
}