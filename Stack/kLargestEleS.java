import java.util.*;
import java.util.Stack;

public class kLargestEleS {

   public static Stack <Integer> sortStack(Stack <Integer> input) 
   {
       Stack<Integer> tempStack=new Stack<Integer>();
       while(!input.isEmpty())
       {
           int value=input.pop();
           while(!tempStack.isEmpty() && value<tempStack.peek())
           {
               int tempValue=tempStack.pop();
               input.push(tempValue);
           }
           tempStack.push(value);
       }
       return tempStack;
    
   }

   public static void findKthLargestNum(Stack <Integer> sortedStack, int k) 
   {

      int i=1;
      while(i<k)
      {
          sortedStack.pop();
          i++;
      }
      System.out.println(sortedStack.peek());
   } 


  public static void main(String args[]) {
        Stack < Integer > inputStack = new Stack < Integer > ();
        Scanner in = new Scanner(System.in);
        int n = in .nextInt();
        for (int i = 0; i < n; i++) {
            inputStack.add( in .nextInt());
        }

        if (inputStack.isEmpty()) {
            System.out.println("stack is empty");
            System.exit(0);
        }

        int k = in .nextInt();
        if (k > inputStack.size()) {
            System.out.println("invalid input");
            System.exit(0);
        }

        Stack < Integer > temp = sortStack(inputStack);
        findKthLargestNum(temp, k);

    }
}
