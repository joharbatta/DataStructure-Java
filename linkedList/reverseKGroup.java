import java.util.*;
import java.lang.*;

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

class reverseKGroup
{
    static Node head;
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            addToTheLast(head);
            for(int i = 1; i < n; i++)
            {
                int a = sc.nextInt();
                addToTheLast(new Node(a));
            }
            
            int k = sc.nextInt();
            GfG gfg = new GfG();
            Node res = gfg.reverse(head, k);
            printList(res);
            System.out.println();
        }
    }
    
    public static void addToTheLast(Node node)
    {
        if(head == null)
        {
            head = node;
        }
        else
        {
            Node temp = head;
            while(temp.next != null)
              temp = temp.next;
              temp.next = node;
        }
    }
    
    public static void printList(Node node)
    {
        while(node != null)
        {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
    
}
class GfG
{
    public static Node reverse(Node node, int k)
    {
        if(node==null)
        return node;
        int c=1;
        Node prev=null;
        Node curr=node;
        Node next=null;
        
        while(c<=k && curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            c++;
        }
        if(next!=null)
        {
            node.next = reverse(next,k);
        }
        return prev;
        
    //     if(node == null || node.next==null) 
    //     return node;
    //   Node new1=node.next;
    //   node.next=null;
    //   Node rev=reverse(new1,k);
    //   new1.next=node;
    //   return rev;
    }
}

