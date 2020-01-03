import java.util.Scanner;

class snakePattern
{
    public static String snake(String str,int n)
    {
        if(n==1)
        {
            return str;
        }
        char str1[]=str.toCharArray();
        int len=str.length();

        String arr[]=new String[n];
        java.util.Arrays.fill(arr,"");

        int row=0;
        boolean down=true;

        for(int i=0;i<len;i++)
        {
            arr[row]+=str1[i];

            if(row==n-1)
            {
                down=false;
            }
            else if (row == 0)  
            { 
                down = true; 
            } 
            if (down) 
            { 
                row++; 
            }  
            else 
            { 
                row--; 
            } 

        }
        String j="";
        for (int i = 0; i < n; i++)  
        { 
            j+=arr[i];
        }
        return j; 

    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int n=sc.nextInt();
        String x=snake(str,n);
        System.out.print(x);
    }
}














// Print Concatenation of Zig-Zag String in ‘n’ Rows
// Given a string and number of rows ‘n’. 
// Print the string formed by concatenating n rows when input 
// string is written in row-wise Zig-Zag fashion.



// Input: str = "ABCDEFGH"
//        n = 2
// Output: "ACEGBDFH"
// Explanation: Let us write input string in Zig-Zag fashion
//              in 2 rows.
// A   C   E   G   
//   B   D   F   H
// Now concatenate the two rows and ignore spaces 
// in every row. We get "ACEGBDFH"

// Input: str = "GEEKSFORGEEKS"
//        n = 3
// Output: GSGSEKFREKEOE
// Explanation: Let us write input string in Zig-Zag fashion
//              in 3 rows.
// G       S       G       S
//   E   K   F   R   E   K
//     E       O       E
// Now concatenate the two rows and ignore spaces 
// in every row. We get "GSGSEKFREKEOE"