import java.util.*;
//stack using single queue
public class stackUsingSQueue {

    /*implementing queue using linked list */
    Queue < Integer > q = new LinkedList < Integer > ();

    /* Push operation of stack using queue*/
    void push(int x) {
        
        int size=q.size();
        q.add(x);
        for(int i=0;i<size;i++)
        {
            int temp=q.remove();
            q.add(temp);
        }

    }

    /*Removes the top element of the stack*/
    int pop() {
        //write your code herei
        if(!q.isEmpty())
        {
        int x=q.remove();
        return x;
        }
        return -1     ;
    }

    /*Returns the element at the top of the stack */
    int top() 
    {
        if(!q.isEmpty())
        {
        return q.peek();
        }
        return -1;
       
    }
    int size()
    {
        return q.size();
    }


    public static void main(String[] args) {
        stackUsingSQueue obj = new stackUsingSQueue();
        Scanner in = new Scanner(System.in);

        /*Enter the number of elements you want to add in the stack */

        int n = in .nextInt();
        
        if(n==0)
        {
            System.out.println("Stack is empty");
        }
        else
        {

        /*Enter the elements of the stack */
        for (int i = 0; i < n; i++) {
            obj.push( in .nextInt());
        }

        for(int i=0;i<n;i++)
        {
        System.out.println("Top "+obj.top());
        obj.pop();
        }
        
        }
    }
}