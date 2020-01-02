import java.util.*;

// Given a string S of lowercase aplhabets, check if it is isogram or not. 
// An Isogram is a string in which no letter occurs more than once.

public class IsogramSt {
   public static void main(String args[]) {
       Scanner s = new Scanner(System.in);
       String str = s.nextLine();
       isIso(str);
   }
   static void isIso(String str) 
   {
    str = str.toLowerCase(); 
    int len = str.length(); 

    char arr[] = str.toCharArray(); 

    Arrays.sort(arr); 
    for (int i = 0; i < len - 1; i++) 
    { 
        if (arr[i] == arr[i + 1]) 
        {
            System.out.println("No");
            break;
        }
        else
        {
            System.out.println("Yes It is Isogram");
        }
    } 
    
    

   }
        
}