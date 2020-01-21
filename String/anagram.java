import java.util.Scanner;

public class anagram {

    static boolean isAnagram(String a, String b) 
    {

        if(a.length() != b.length()) 
        return false;
        int c[] = new int[26]; //d[] = new int[26] ;
        a = a.toLowerCase();
        b = b.toLowerCase();
        for(int i=0; i<a.length(); i++){
            c[a.charAt(i) - 'a']++;
            //d[b.charAt(i) - 'a']++;
            c[b.charAt(i) - 'a']--;
        }
        for(int i =0;i<26; i++)
            if(c[i] != 0) 
            return false;
        return true;
        // a=a.toLowerCase();
        // b=b.toLowerCase();
        // // char a1[]=a.toCharArray();
        // // // Arrays.sort(a1);
        // // char b1[]=b.toCharArray();
        // // // Arrays.sort(b1);
        // // String i=new String(a1);
        // // String j=new String(b1);

        // int x=a.compareTo(b);

        // if(x==0)
        // {
        //     return true;
        // }
        // else 
        // {
        //     return false;
        // }
        // char str1[]=a.toCharArray();
        // char str2[]=b.toCharArray();
        // int count1[] = new int[256]; 
        // int count2[] = new int[256]; 
        
        // int i; 
        // for (i = 0; i < str1.length && i < str2.length;i++) 
        // { 
        //     count1[str1[i]]++; 
        //     count2[str2[i]]++; 
        // } 
  
        // if (str1.length != str2.length) 
        //     return false; 
  
        // // Compare count arrays 
        // for (i = 65; i <150; i++) 
        // {
        //     if (count1[i] != count2[i]) 
        //         return false; 
        // }
        // return true; 

      
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
