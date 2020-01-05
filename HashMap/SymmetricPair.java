import java.util.*;

class SymmetricPair
{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]=new int[n][2];
        for(int i=0;i<n;i++)
        {
            arr[i][0]=sc.nextInt();
            arr[i][1]=sc.nextInt();
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        boolean isFound=false;
        for(int i=0;i<arr.length;i++)
        {
            int first=arr[i][0];
            int second=arr[i][1];
            Integer data=map.get(second);

            if(data!=null &&  data==first)
            {
                System.out.println(second+" "+first);
                isFound=true;
            }
            else
            {
                map.put(first,second);
            }
        }
        if(!isFound)
        {
            System.out.println("Not Found");
        }


        
    }
}
// (a,b) (c,d) means c=b and a=d is symetric
// i/o
// 5
// 1 2
// 2 1
// 1 3
// 3 1
// 4 5
// o/p
// 1 2
// 1 3