import java.util.*;
class palindrome
{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int x=0,k=s.length()-1;
        for(int i=0;i<k;i++)
        {
            if(s.charAt(i)==s.charAt(k-i))
            {
                x=1;
            }
            else
            {
                x=0;
                break;
            } 
        }
        if(x==1)
        {
            System.out.println("TRUE");
        }
        else
        System.out.println("FALSE");

    }
}