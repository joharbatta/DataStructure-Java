import java.util.*;
class removeDup
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int temp[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int j=0;
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]!=arr[i+1])
            {
                temp[j++]=arr[i];
            }
        }
        temp[j++]=arr[n-1];
        for(int i=0;i<j;i++)
        {
            System.out.print(temp[i]+" ");
        }
        System.out.println();
        System.out.println("hash set method");
        // 2nd mwthod using hashser
        HashSet<Integer> h=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            h.add(arr[i]);
        }
        for(int x:h)
        {
            System.out.print(x+" ");
        }
        
    }
}