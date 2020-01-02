import java.util.*;
// Minimum number of increment-other operations to make all array elements equal.
public class minIncAeq
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
       int max=arr[n-1];
        int minop=0;
       for(int i=0;i<n;i++)
       {
           minop+=max-arr[i];
       }
       System.out.print(minop);

    }
}


// 5
// 21 33 9 45 63
// Min operations is 10