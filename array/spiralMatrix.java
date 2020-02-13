import java.util.*;

public class spiralMatrix {
   public static void main(String args[]) {
       Scanner s = new Scanner(System.in);
       int n = s.nextInt();
       int m = s.nextInt();
       int[][] arr = new int[n][m];
       for (int i = 0; i < n; i++)
           for (int j = 0; j < m; j++)
               arr[i][j] = s.nextInt();
       spiral(arr, n, m);
   }

   
   static void spiral(int[][] arr, int n, int m) {

       int top=0;
       int left=0;
       int right=arr[0].length-1;
       int bottom=arr.length-1;
       
       while(left<=right)
       {
           
           for(int i=left;i<=right;i++)
           {
               System.out.print(arr[top][i]+" ");
           }
           top++;
           if(top>bottom)
           {
               break;
           }
            for(int i=top;i<=bottom;i++)
           {
               System.out.print(arr[i][right]+" ");
           }
           right--;
            for(int i=right;i>=left;i--)
           {
               System.out.print(arr[bottom][i]+" ");
           }
           bottom--;
            if(top>bottom)
           {
               break;
           }
            for(int i=bottom;i>=top;i--)
           {
               System.out.print(arr[i][left]+" ");
           }
           left++;
           
       }
   }
}
