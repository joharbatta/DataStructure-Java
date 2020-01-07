import java.util.*;
class subArrayGivenSum
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int sum=sc.nextInt();

        int csum=arr[0],start=0;

        for(int i=1;i<=n;i++)
        {
            while (csum>sum && start < i-1) 
            { 
                csum= csum- arr[start]; 
                start++; 
            } 
              
            if (csum==sum)  
            { 
                System.out.println(start +" and "+ (i-1)); 
                    break;
            } 
              
            if (i < n) 
            csum= csum+ arr[i];
        }
    }
}