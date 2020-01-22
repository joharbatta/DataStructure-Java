import java.util.Scanner;

// The quick brown fox jumps over the lazy dog

public class panagram {

    static boolean isPanagram(String str) 
    {
        String a;
        int c[] = new int[26];
        a=str.replaceAll(" ","");
        a =a.toLowerCase();
        for(int i=0; i<a.length(); i++)
        {
            c[a.charAt(i) - 'a']++;
        }
        for(int i =0;i<26;i++)
        {
            if(c[i]<1)
            {
               return false;
            }
        }  
        return true;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        scan.close();
        boolean ret = isPanagram(a);
        System.out.println( (ret) ? "Panagram" : "Not Panagrams" );
    }
}
