import java.util.*;

class Node
{
    int data;
    Node next;
}

class LinkedList
{

    private Node head;
    int size=0;

    LinkedList()
    {
        head=null;
    }

    public void addB(int data)
    {
        Node node=new Node();
        if(head==null)
        {
            node.data=data;
            node.next=null;
            head=node;
        }
        else
        {
            node.data=data;
            node.next=head;
            head=node;
        }
        size++;
    }
    
    public void addL(int data)
    {

        Node node=new Node();
        Node temp=head;
        if(head==null)
        {
            node.data=data;
            node.next=null;
            head=node;
        }
        else
        {
            node.data=data;
            while(temp.next!=null)
            {
                temp=temp.next;

            }
            temp.next=node;
        }
          size++;
    }

    public void show()
    {
        if(head==null)
        {
            System.out.print("Emplty list");
        }
        else
        {
            Node temp=head;
            while(temp!=null)
            {
                System.out.print(temp.data+" --> ");
                temp = temp.next;   
            }
             System.out.println(temp);
            

            
        }

    }
    public void delB()
    {
        if(head==null)
        {
            
        }
        else
        {
            Node temp=head;
            head=head.next;
            temp.next=null;
              size--;

        }
    }
    public void delL()
    {
         if(head==null)
        {
            
        }
        else
        {
           Node temp=head;
           Node tail=null;
           while(temp.next!=null)
           {
               tail=temp;
               temp=temp.next;
           }
           tail.next=null;
             size--;



        }

    }

    public void insertpos(int data,int pos)
    {
        if(pos==1)
        {
            addB(data);
        }
        else if(pos==size+1)
        {
            addL(data); 
        }
        else if(pos>1 && pos<=size)
        {
            Node node=new Node();
            node.data=data;
            Node temp=head;
            for(int i=1;i<pos-1;i++)
            {
                temp=temp.next;
            }
            node.next=temp.next;
            temp.next=node;
            size++;
        }
        else
        {
            System.out.println("Inserion not posibile");
        }
    }
    public void delpos(int index)
    {
        if(index==1)
        {
            delB();
        }        
        else if(index==size)
        {
            delL();
        }
        else if(index>1 && index<size)
        {
            Node temp=head;
            for(int i=1;i<index-1;i++)
            {
                temp=temp.next;
            }
            Node current=temp.next;
            temp.next=temp.next.next;
            current.next=null;
        }
    }

    public void search(int data)
    {
        Node temp=head;
        int c=1;
        int x=0;
        while(temp!=null)
        {
            if(temp.data==data)
            {
                x++;
                break;
            }
            else
            {
                temp=temp.next;
                c++;
            }
        }
        if(x>=1)
        {
          System.out.println("found " + data + " at pos "+ c);
        }
        else
        {      
              System.out.println("not found " + data);
        }



        // for(int i=1;i<index;i++)
        // {
        //     temp=temp.next;

        // }
        // System.out.println(temp.data);

    }




}

public class link2
{
    public static void main(String[] args) 
     {

        
        LinkedList l1=new LinkedList();
        l1.addL(1);
        l1.addL(2);
        l1.addL(3);
        l1.addL(4);
        //l1.addB(1);
        //l1.addB(2);
        // l1.show();
        // l1.delB();
        // System.out.println("after del front");
        // l1.show();
        //  System.out.println(l1.size);
        // l1.delL();
        //  System.out.println("after del back");
        //  //System.out.println(l1.size);
        // l1.show();
        l1.insertpos(0,1);
        l1.show();
         System.out.println(l1.size);
         l1.delpos(1);
         l1.show();
         l1.search(40);
        
    }


}