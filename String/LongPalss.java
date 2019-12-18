import java.util.Scanner;

public class LongPalss {
   public static void main(String args[]) {
       Scanner s = new Scanner(System.in);
       String str = s.nextLine();
       longestPalindromicSubString(str);
   }
    public static int max=0;
    public static int start=0;

   static void longestPalindromicSubString(String s) {
       if(s.length()<2)
       {
           System.out.println(s);
           return;
       }
       for(int i=0 ;i<s.length()-1;i++)
       {
           extendPalindrome(s,i,i);
           extendPalindrome(s,i,i+1);
       }
       System.out.println(s.substring(start,start+max));   
   }
   private static void extendPalindrome(String s,int i,int j)
   {
       while( j>=0 && i<s.length() && s.charAt(i)==s.charAt(j))
       {
           j--;
           i++;
       }
       int windowSize=i-j-1;
       if(max<windowSize)
       {
           start=j+1;
           max=windowSize;
       }
   }
}
