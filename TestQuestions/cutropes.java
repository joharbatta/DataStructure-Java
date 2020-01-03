
import java.util.*;
public class cutropes
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int z;

        for(int i=0;i<n-1;i++)
        {
            if(arr[i]==arr[i+1])
            {
                i++;
                z=n-i-1;
                if(z>0) {
                    System.out.print(z);
                }
            }
            else
            {
                z=n-i-1;
                if(z>0) {
                    System.out.print(z);
                }


            }

        }
    }

}
