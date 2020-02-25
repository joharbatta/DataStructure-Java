import java.io.IOException; 
import java.math.BigInteger; 
class allSubsets
{ 
    static void printSubsets(char set[]) 
    { 
        int n = set.length; 
        for (int i = 0; i < (1<<n); i++) 
        { 
            System.out.print("{ "); 
  
            for (int j = 0; j < n; j++) 
            {
  
                // if ((i & (1 << j)) > 0)  
                //     System.out.print(set[j] + " ");
                if (BigInteger.valueOf(i).testBit(j)) 
                    System.out.print(set[j]+" ");  
            }
  
            System.out.println("}"); 
        } 
    } 
    public static void main(String[] args) 
    { 
        char set[] = {'a', 'b', 'c','d'}; 
        printSubsets(set); 
    } 
} 

// 1<<3
// 1000=8
//basically if left shift add zeros by which times the shift we have to do
//in case of right shift remove that or basically shift towards right
