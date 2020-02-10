import java.util.*;

class fibo{

    static int fiboo(int n)
    { //bottom up - tabulization
        int dp[] = new int[n+2]; 
        int i; 
        dp[0] = 0; 
        dp[1] = 1; 
        for (i = 2; i <= n; i++) 
        { 
            dp[i] = dp[i-1] + dp[i-2]; 
        }  
        return dp[n]; 
    }
    static int fiboo1(int n)
    { //top down - memoization
        int dp[]=new int[n+1];
        if(n==0 || n==1)
        {
            return n;
        }
        if(dp[n]!=0)
        {
            return dp[n];
        }
        dp[n]=fiboo1(n-1)+fiboo(n-2);
        return dp[n];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fiboo(n));
        System.out.println(fiboo1(n));

    }
}