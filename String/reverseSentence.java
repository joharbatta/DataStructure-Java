import java.util.*;

public class reverseSentence {
    public static void reverse(String str)
    {
        String arr[]=str.split("\\s");
        String s="";
        for(int i=arr.length-1;i>=0;i--)
        {
            s=s+arr[i]+" ";
        }

        System.out.print(s);  
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter String sentence");
        String str=sc.nextLine();
        reverse(str);
    }
}

//jatt is life
//life is jatt