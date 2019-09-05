import java.util.*;
public class Arrsdup
{
    public static void main(String args[])
    {
        int c=0;
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        s.nextLine();
        char arr[]=new char[n];
//        String arr1[]=new String[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=
                    s.next().charAt(0);
        }
//        for(int i=0;i<n;i++)
//        {
//            arr1[i]=arr[i];
//        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j] && i!=j)
                {
                    c++;
                }
            }
            if(c>=1)
            {
                System.out.print(arr[i]+" ");
            }
            c=0;
        }


//        for(int i=0;i<n;i++)
//        {
//            System.out.print(arr1[i]+" ");
//        }

    }
}