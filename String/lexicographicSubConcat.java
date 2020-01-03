import java.util.*;   
class lexicographicSubConcat
{ 
        static String lexicographicSubConcaty(String s) 
        { 
            int n = s.length(); 
            // if n=3 sub string 3+2+1 like a,b,c ab,bc abc
            int sub_count = n*(n+1)/2; 
            
            String []arr = new String[sub_count];      
        
            int index = 0; 
            for (int i = 0; i < n; i++)  
            {
                for (int len = 1; len <= n - i; len++)  
                { 
                     arr[index++] = s.substring(i, i+len); 
                } 
            }
            Arrays.sort(arr);  
            String res = ""; 
            for (int i = 0; i < sub_count; i++)  
                res += arr[i];      
                
            return res;  
            } 
        public static void main(String[] args)  
        { 
            Scanner sc=new Scanner(System.in);
            String s ="johar";  
            System.out.println(lexicographicSubConcaty(s)); 
        } 
} 

// Lexicographical concatenation of all substrings of a string

// if johar input
// no of possible sub string 5+4+3+2+1
// in lexicographic means alpha we can do by sort