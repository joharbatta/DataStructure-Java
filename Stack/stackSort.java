
import java.util.*;
import java.util.Stack;
public class stackSort{

    public static void main(String args[]) 
    {
        Stack<Integer> stack = new Stack();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-->0)
        {
            stack.push(s.nextInt());
        }
        sort(stack);
    }
    static void sort(Stack<Integer> stack) {
        Stack<Integer> temp = new Stack();
        while (!stack.isEmpty()) {
            int n = stack.pop();
           while (!temp.isEmpty() && temp.peek() > n)
                stack.push(temp.pop());
            temp.push(n);
        }
        System.out.println(temp);

        // method 2

        //Collections.sort(stack);
        //System.out.println(stack);

    }
}