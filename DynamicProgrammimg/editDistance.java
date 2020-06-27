public class editDistance {
    public static void main(String[] args)
    {
        int m=4,n=6;
        String st1="geek";
        String st2="gaseek";
        int res=editdistanceTabulated(st1,st2,m,n,new int[m+1][n+1]);
        System.out.println(res);
    }

    static int editdistance(String s1,String s2,int m,int n)
    {
        if(m==0)
        {
            return n;
        }
        if(n==0)
        {
            return m;
        }
        if(s1.charAt(m-1)==s2.charAt(n-1))
        {
            return editdistance(s1,s2,m-1,n-1);
        }
        int a = editdistance(s1,s2,m-1,n);
        int b = editdistance(s1,s2, m,n-1);
        int c = editdistance(s1,s2,m-1,n-1);
        return 1+Math.min(a,Math.min(b,c));
    }
    static int editdistanceMemoized(String st1,String st2,int m,int n,int[][] dp)
    {
        if(m==0)
        {
            return n;
        }
        if(n==0)
        {
            return m;
        }
        if(dp[m][n]!=0)
        {
            return dp[m][n];
        }
        if(st1.charAt(m-1)==st2.charAt(n-1))
        {
            return editdistanceMemoized(st1,st2,m-1,n-1,dp);
        }
        int a = editdistanceMemoized(st1,st2,m-1,n,dp);
        int b = editdistanceMemoized(st1,st2, m,n-1,dp);
        int c = editdistanceMemoized(st1,st2,m-1,n-1,dp);
        dp[m][n]=1+Math.min(a,Math.min(b,c));
        return dp[m][n];
    }
    static int editdistanceTabulated(String s1,String s2,int m,int n,int[][]dp)
    {
        for(int i=0;i<=m;i++)
        {
            for(int j=0;j<=n;j++)
            {
                if(i==0)
                {
                    dp[i][j]=j;
                }
                else if(j==0)
                {
                    dp[i][j]=i;
                }
                else if(s1.charAt(i-1)==s2.charAt(j-1))
                {
                    dp[i][j]=dp[i-1][j-1];
                }
                else
                {
                    dp[i][j]=1+Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i][j-1]));
                }
            }
        }
        return dp[m][n];
    }
}