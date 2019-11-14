//o(n) time complexity
import java.util.*;
public class nextLargestNo
{

    public static void main(String args[])
    {
     String str;
     Scanner sc=new Scanner(System.in);
     str=sc.nextLine();
     nextLargestNo1(str);

    }

    static void nextLargestNo1(String str)
    {
        int n=str.length();
        StringBuilder s=new StringBuilder(str);

        int i=n-1;

        while(i>0 && s.charAt(i)<=s.charAt(i-1))
        {
            i--;
        }
        int j=i-1; //first candidate
        System.out.println(s.charAt(j));

        if(j>=0)
        {
            int secondCandidate=i;
            i++;
                while(i<n && s.charAt(i)>s.charAt(j))
                {
                    if(s.charAt(i)<=s.charAt(secondCandidate))
                    {
                        secondCandidate=i;
                    }
                    i++;
                }
                System.out.println(s.charAt(secondCandidate));

                swap(s,j,secondCandidate);
                System.out.println(s.toString());
        }
    }
    private static void swap(StringBuilder s,int i,int secondCandidate)
    {

        char temp=s.charAt(i);
        s.setCharAt(i,s.charAt(secondCandidate));
        s.setCharAt(secondCandidate,temp);

    }

}