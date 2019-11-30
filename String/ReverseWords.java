import java.util.*;

public class ReverseWords{
   public static void main(String args[]) 
   {
       Scanner s = new Scanner(System.in);
       String str = s.nextLine();
       reverseWords(str);
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
