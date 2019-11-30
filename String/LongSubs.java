import java.util.*;

public class LongSubs{
   public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       String str = s.nextLine();
       longestDistinctSubString(str);
   }

   
   static void longestDistinctSubString(String s) {
    int start=0;
    int current=0;
    String output="";
    HashSet<Character> set=new LinkedHashSet<Character>();
    
   while(current<s.length())
    {
        if(!set.contains(s.charAt(current)))
        {
            set.add(s.charAt(current));
            String temp=s.substring(start,start+set.size());
            if(temp.length()>output.length())
            {
                output=temp;
            }
            current++;
         }
         else
         {
             set.remove(s.charAt(start));
             start++;
             
         }
    }
    System.out.print(output);
}
}
