import java.util.*;
public class Arrsdup1
{
    public static void main(String args[]) {
        int c = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String arr[] = new String[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.next();
        }
        for (int i = 0; i < n; i++)
        {
            for (int j = i + 1; j < n; j++)
            {
                if (arr[i].equals(arr[j]))
                {
                    c++;
                }

            }
            if (c >= 1) {
                System.out.print(arr[i]+" ");
            }c=0;

        }
    }
}