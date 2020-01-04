import java.util.*;
import java.util.Stack;
//pop costly
class stackUsing2QueuePopc
{
    Queue<Integer> q1=new  LinkedList<>();
    Queue<Integer> q2=new  LinkedList<>();
    int size;
    public stackUsing2QueuePopc()
    {
        int size=0;
    }
    public void push(int x)
    {
        q1.add(x);
        size++;   
    }

    public void pop()
    {
        if (q1.isEmpty()) 
        {
            return; 
        }

        while(q1.size()!=1)
        {
            q2.add(q1.peek());
            q1.remove();
        }
        q1.remove(); 
        size--;
  
        // swap the names of two queues 
        Queue<Integer> q = q1; 
        q1 = q2; 
        q2 = q; 
        
    }
    public  int size()
    {
        return size;
    }
    public int top()
    {
        if(q1.isEmpty())
        {
            return -1;
        }
        while(q1.size()!=1)
        {
            q2.add(q1.peek());
            q1.remove();
        }
       int temp=q1.peek();
       q1.remove(); 
        q2.add(temp);
        // swap the names of two queues 
        Queue<Integer> q = q1; 
        q1 = q2; 
        q2 = q; 
        return temp;
        
    }

    public static void main(String[] args) 
    {
        stackUsing2QueuePopc s=new stackUsing2QueuePopc(); 
        s.push(2);
        s.push(5);
        s.push(7);
        s.push(9);
        System.out.println("current size: " + s.size());
        System.out.println(s.top());
        s.pop();
        System.out.println("current size: " + s.size());
        System.out.println(s.top());
        s.pop();
        System.out.println("current size: " + s.size());
        System.out.println(s.top());
        s.pop();
        System.out.println("current size: " + s.size());
        System.out.println(s.top());
        s.pop();
        System.out.println("current size: " + s.size());
        System.out.println(s.top());
        

    }
}