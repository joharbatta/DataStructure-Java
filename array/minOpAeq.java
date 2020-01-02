import java.util.*;
// Minimum operation to make all elements equal in array
public class minOpAeq
{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        HashMap<Integer,Integer> h=new HashMap<>();

        for(int i=0;i<n;i++)
        {
            if(h.containsKey(arr[i]))
            {
                h.put(arr[i],h.get(arr[i])+1);
            }
            else
            {
                h.put(arr[i],1);
            }
        }
        int max=0;
        for(int i:h.keySet())
        {
            if(max<h.get(i))
            {
                max=h.get(i);
            }
        }
        System.out.print("Min operations is "+(n-max));

    }
}