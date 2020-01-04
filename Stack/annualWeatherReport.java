import java.util.*;
import java.util.Stack;

public class annualWeatherReport {
    static void difference(int height[], int S[]) 
    {
        //playing with index actually not values here trick
        Stack<Integer> s=new Stack();
        s.push(0); //we push 0 index 
        S[0]=1;  // assignes as first value have 1 count

        for(int i=1;i<height.length;i++)
        {
            while(!s.isEmpty() && height[i]>=height[s.peek()])
            {
                s.pop();
            }
            if(s.isEmpty())
            {
                S[i]=i+1;
            }
            else
            {
                S[i]=i-s.peek();

            }
            s.push(i);

        }
        for(int i=0;i<S.length;i++)
        {
            System.out.print(S[i]+" ");
        }
     
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] height = new int[12];
        for (int i = 0; i < 12; i++) {
            height[i] = in.nextInt();
        }

        // Output array that will store the number of months having rainfall less than the current month 
        int S[] = new int[12];
        difference(height, S);
    } 
}




// The annual rainfall analysis
// Description
// The approximate height of rainfall in Myanmar for all the twelve months is given as input  array. Write a java program that will print the number of months in which the rainfall was less than or equal to the present month.

// Constraints:
// You can use only an extra array for the output and a stack for the solution.
// The time complexity of your code should be O(n) in the worst case.

// Input:
// The program should take the height of rainfall in each of the twelve months as an input integer array.

// Output:
// Your code should display the number of months in which the height of rainfall was less than or equal to the height of rainfall in the current month

// Sample Test case:
//  Input:
// 1 2 2 4 5 6 4 4 3 1 1 0

// Output:
// 1 2 3 4 5 6 1 2 1 1 2 1

// Explanation:
// The first line of input consists of 12 integers representing the height of rainfall (in c.m.) for each month.
// The output consists of 12 integers, the first number is '1' because you cannot compare the data of the first month with any other month but itself and the height of rainfall in the first month are equal to itself; therefore 1 is displayed.

// The second output is '2' because input for the second month is '2' which is higher than the data for the first month hence there are two months which have had rainfall less than or equal to the input data for the second month.

