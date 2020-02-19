import java.util.Scanner;

public class subArraySumLessK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i =0; i < n;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        countSubArray(n,arr,k);
    }

    static void countSubArray(int n,int arr[],int k)
    {
        int start=0;
        int end=0;
        int sum=arr[0];
        int count=0;

        while(end<n && start<n)
        {

            if(sum<k)
            {
                end++;
                count+=end-start;
                if(end<n)
                {
                    sum+=arr[end];
                }
            }
            else{
                sum-=arr[start];
                start++;
            }
        }
        if(count>=0)
            System.out.println(count);
        else
            System.out.println("0");
    }

    // static void countSubArray(int n, int[] arr,int k){
    //     // Write your code here 
    //     int c=0;
    //     int max=Integer.MIN_VALUE;
    //     for(int i=0;i<n;i++)
    //     {
    //         for(int j=i;j<n;j++)
    //         {
    //             int sum=0;
    //             for(int d=i;d<=j;d++)
    //             {
    //                 sum+=arr[d];
    //             }
    //              //System.out.print(sum+" ");
    //             if(sum<k)
    //             {
    //                 c++;
    //                 //System.out.println(sum);
    //             }
    //         }
            
    //     }
    //     System.out.print(c); 
    // }
}