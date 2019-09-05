import java.util.*;
public class primeno
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();

        for(int n=2;n<x;n++)
        {
            int flag=0;
            for(int i=2;i<n;i++)
            {
                if(n%i==0)
                {
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            {
                System.out.println(n);
            }

        }
    }
}