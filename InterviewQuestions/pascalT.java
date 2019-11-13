import java.util.*;

public class pascalT {
   public static void main(String args[]) {
       Scanner s = new Scanner(System.in);
       int n = s.nextInt();
       printPascalTriangle(n);
   }
   

   // Method to print all primes less than or equal to n in descending order
   static void printPascalTriangle(int n) {
       // Write your code here
       int res=1;
     if(n>0)
     {
                for(int line=0;line<n;line++)
                {
                    for(int k=n-1; k>line; k--)
                        {
                            System.out.print(" ");
                        }
                for(int t=0;t<=line;t++)
                {
                    System.out.print(binomial(line,t)+" ");
                }
                System.out.println();
                }
     }
   }
   static int binomial(int n,int r)
   {
         return fact(n)/(fact(n-r)*fact(r));
       
   }
        static int fact(int value)
        {
            int res=1;
            for(int i=value;i>=1;i--)
            {
                res*=i;
            }
            return res;
            
        }
}
