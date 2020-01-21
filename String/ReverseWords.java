import java.util.Scanner;
import java.util.Stack;
public class ReverseWords{
   public static void main(String args[]) 
   {
       Scanner s = new Scanner(System.in);
       String str = s.nextLine();
       reverseWords(str);
       reverseWords1(str);
   }  
   static void reverseWords1(String s)
   {
        String[] words=s.split("\\s");
        StringBuilder d=new StringBuilder();
    //    String result="";
        for(int i=0;i<words.length;i++)
        {
            String reverse="";
            String k=words[i];
            int n=k.length()-1;
           for(int p=n;p>=0;p--)
            {
                reverse = reverse + k.charAt(p);
            }
           //words[i]=reverse;
           d.append(reverse);
           d.append(" ");
        }
        System.out.println(d);
    }


   static void reverseWords(String s) 
   {

        StringBuilder result=new StringBuilder();
        Stack<Character> stack=new Stack<Character>();

        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=' ')
            {
            stack.push(s.charAt(i));
            }
        
            else
            {
                while(!stack.isEmpty())
                {
                    result.append(stack.pop());
                }
                result.append(" ");
            }
         }
                while(!stack.isEmpty())
                {
                    result.append(stack.pop());
                }
                System.out.println(result);

   }
}
