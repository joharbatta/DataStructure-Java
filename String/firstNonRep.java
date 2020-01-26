import java.util.*;
 
public class firstNonRep
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine(); 
        int k=0;
        char count[] = new char[256]; 

        for(int i=0;i<s.length();i++)
        {
            count[s.charAt(i)]++;
        }
        for (int i =0; i <s.length();  i++) 
        { 
            if (count[s.charAt(i)] == 1) 
            { 
                k=i; 
                break; 
            }    
        }
        System.out.println(s.charAt(k)); 




    }
}