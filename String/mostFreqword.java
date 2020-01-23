import java.util.*;

public class mostfreqword{
   public static void main(String args[]) 
   {
       Scanner s = new Scanner(System.in);
       String str = s.nextLine();
       freqWords(str);
   }  
   static void freqWords(String s)
   {
        String[] words=s.split("\\s");
        HashMap<String, Integer> hs = new HashMap<String, Integer>(); 
        for (int i = 0; i < words.length; i++) 
        { 
            if(hs.containsKey(words[i])) 
            { 
                hs.put(words[i], hs.get(words[i]) + 1); 
            } 
            else 
            { 
                hs.put(words[i], 1); 
            } 
        }
        int max=0;   
        String key = ""; 
        for (String x: hs.keySet()) 
        {
            if(max<hs.get(x))
            { 
                max=hs.get(x);
                key=x;
            }
            // System.out.println("key: " + x + " value: " + hs.get(x)+" "+max); 
        }
        System.out.println("Most Frequent Word is "+key);
    }

}
