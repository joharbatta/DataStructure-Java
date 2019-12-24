import java.util.*;

public class revSpecial {
   public static void main(String args[]) {
       Scanner s = new Scanner(System.in);
       String str = s.nextLine();
       reverseTheString(str);
   }
   static void reverseTheString(String s) {
       char str[]=s.toCharArray();
       int r = str.length - 1, l = 0; 
        while (l < r) 
        { 
            if (!Character.isAlphabetic(str[l])) 
                l++; 
            else if(!Character.isAlphabetic(str[r])) 
                r--;
            else 
            { 
                char tmp = str[l]; 
                str[l] = str[r]; 
                str[r] = tmp; 
                l++; 
                r--; 
            } 
        } 
         String rev= new String(str); 
        System.out.println(rev);
   }
}