import java.util.*;

public class stackLinked
{
    Node root;
    public class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            //this.next=null;
        }
    
    }
    public void push(int data)
    {
        Node newNode=new Node(data);

        if(root==null)
        {
            root=newNode;
        }
        else
        {
            Node temp=root;
            root=newNode;
            newNode.next=temp;
        } 
        System.out.println(data+" pushed to stack");


    }
    public boolean isEmpty()
    {
        if(root==null)
        {
            return true;
        }
        else
        return false;
    }
    public int pop()
    {
        int popped=Integer.MIN_VALUE;
        if(root==null)
        {
            System.out.println("Stack is empty");
        }
        else
        {
            popped=root.data;
            root=root.next;
        }
        return popped;
    }



    public static void main(String args[])
    {
        stackLinked s=new stackLinked();
        s.push(3);
        s.push(4);
        int x=s.pop();
        System.out.println(x+ " popped");



    }
}