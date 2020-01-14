import java.util.*;
class missingnum
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n-1];
        int total=n*(n+1)/2;
        int sum=0;
        for(int  i=0;i<n-1;i++)
        {
            arr[i]=sc.nextInt();
            total-=arr[i];
        } 
        System.out.println(total);

    }
}