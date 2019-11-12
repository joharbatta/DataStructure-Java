import java.io.*;
import java.util.*;

public class queuebystack
{
   
    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();
    void enqueue(int a)
    {
        s1.push(a);
       
    }
    int dequeue()
    {
        if(s1.empty())
        {
            return 0;
        }
        while(!s1.empty())
        {
            s2.push(s1.pop());
        }
        int a = s2.pop();
        while(!s2.empty())
        {
            s1.push(s2.pop());
        }
        
        return a;
    }
    void show()
    {
        if(s1.empty())
        {
            System.out.println("Empty queue");
            return;
        }
        while(!s1.empty())
        {
            s2.push(s1.pop());
        }
        while(!s2.empty())
        {
            int a = s2.peek();
            s1.push(s2.pop());
            System.out.print(a+" ");
        }
    }


    public static void main(String []agrs)
    {
        queuebystack q = new queuebystack();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(6);
        q.show();

        //System.out.print(q.dequeue());
        System.out.println("\n"+q.dequeue());
        q.enqueue(7);
        System.out.println(q.dequeue());
        q.show();
       
    }
}