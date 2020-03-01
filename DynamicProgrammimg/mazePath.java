import java.util.*;
public class mazePath 
{
//recursive
// static int maze_path(int sr,int sc,int dr,int dc)
// {
// if(sr==dr&&sc==dc)
// return 1;
// if(sr>dr ||sc>dc)
// return 0;
// int cstod=0;
// int ch=maze_path(sr,sc+1,dr,dc);
// int cv=maze_path(sr+1,sc,dr,dc);
// cstod=ch+cv;
// return cstod;
// }
// public static void main(String[] args) {
// // TODO Auto-generated method stub
// Scanner s=new Scanner(System.in);
// int sr=s.nextInt();
// int sc=s.nextInt();
// int dr=s.nextInt();
// int dc=s.nextInt();
// System.out.print(maze_path(sr,sc,dr,dc));
// }
// }

//bottom up approach | memoized
public static void main(String args[])
{
    Scanner s=new Scanner(System.in);
    int sr=s.nextInt();
    int sc=s.nextInt();
    int dr=s.nextInt();
    int dc=s.nextInt();
    int dp[][]=new int[dr+1][dc+1];
    System.out.print(maze_path(sr,sc,dr,dc,dp));
}
public static int maze_path(int sr,int sc,int dr,int dc,int dp[][])
{
    if(sr==dr && sc==dc)
    return 1;
    if(sr>dr ||sc>dc)
    return 0;
    if(dp[sr][sc]!=0)
    {
    return dp[sr][sc];
    }
    int cstod=0;
    int ch=maze_path(sr,sc+1,dr,dc,dp);
    int cv=maze_path(sr+1,sc,dr,dc,dp);
    cstod=ch+cv;
    dp[sr][sc]=cstod;
    return cstod;
}
}