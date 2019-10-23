import java.util.*;
class Node
{
    int data;
    Node next;
}
class LinkedList
{
    private Node head;
    int size;
    LinkedList()
    {
        head=null;
    }
    LinkedList(int data)
    {
        Node node=new Node();
        node.data=data;
        node.next=null;
        head=node;
    }
    public void insertBeg(int data)
    {
        if (head == null)
        {
         Node node = new Node();
            node.data = data;
            node.next = null;
            head = node;
        } else
            {
            Node node = new Node();
            node.data = data;
            node.next = head;
            head = node;
        }
        size++;
    }

    public void insertLast(int data)
    {
        Node node=new Node();
        node.data=data;
        Node temp=head;
        if(temp==null)
            head=node;
        else
        {
            while(temp.next!=null)
            {
                temp = temp.next;
            }
            temp.next = node;

        }
        size++;
    }
    public int getListSize()
    {
        return size;
    }

    public void insertpos(int data,int pos)
    {
        if(pos==1)
        {
            insertBeg(data);
        }
        else if(pos==size+1)
        {
            insertLast(data); 
        }
        else if(pos>1 && pos<=size)
        {
            Node node=new Node();
            node.data=data;
            node.next=null;
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

    public void transverse() {
        if (head == null) {
            System.out.println("List is empty");
        } else
            {
            Node temp = head;
            while (temp.next != null) {
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println(temp.data);
        }
    }
    public void deleteBeg()
    {
        if(head==null)
        {
            System.out.println("List is empty");
        }
        else
        {
            Node temp=head;
            head=head.next;
            temp.next=null;
            size--;
        }

    }
    public void deletelast()
    {
        if(head==null)
            System.out.println("List is emppty");
        else
            {
            Node temp = head;
            Node tail=null;
            Node prev=null;
            while(temp.next!=tail)
            {
                prev=temp;
                temp = temp.next;
            }
            tail=prev;
            tail.next=null;
            size--;
             }
    }

}

class link1 {
    public static void main(String args[]) {
        LinkedList list = new LinkedList();
        list.insertBeg(10);
        list.insertBeg(20);
        list.insertBeg(30);
        list.insertBeg(40);
        //list.deleteBeg();
        //list.deleteBeg();
        list.insertLast(60);
        list.insertpos(100,3);
        list.deletelast();
        list.transverse();
        //list.deletelast();
        //list.transverse();

        System.out.println(list.getListSize());




    }

}



