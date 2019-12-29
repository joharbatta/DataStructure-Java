import java.util.*;

public class customCase {
   public static void main(String args[]) {
       Scanner s = new Scanner(System.in);
       String str = s.nextLine();
       customcase(str);
   }
   static void customcase(String s1) {
         String str = s1.toUpperCase(); 
          StringBuilder s = new StringBuilder(); 
        char ch = ' '; 
        for (int i = 0; i < str.length(); i++) 
        { 
            if (ch == ' ' && str.charAt(i) != ' ') 
                s.append(Character.toLowerCase(str.charAt(i))); 
            else
            s.append(str.charAt(i)); 
            ch = str.charAt(i); 
        } 
        System.out.println(s.toString());
   }
}