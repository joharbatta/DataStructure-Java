import java.util.*;
class Node
{
    int data;
    Node next;
    Node prev;
    Node(int data)
    {
        this.data=data;
    }

}
class DoublyLinkedList
{
    private Node head;
    private Node tail;
    int size;
    DoublyLinkedList()
    {
        head=null;
        tail=null;
        size=0;
    }

    public void insertLast(int data)
    {
        Node newNode=new Node(data);
        if(isEmpty())
        {
            head=newNode;
        }
        else
        {
            tail.next=newNode;
        }
        newNode.prev=tail;
        tail=newNode;
        size++;

    }
    public int deleteFirst()
    {
    }

    public void displayForward()
    {
        if(head==null)
        {
            return;
        }
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println("Null");

    }


    public boolean isEmpty()
    {
        return size==0; //head==null
    }

    public int length()
    {
        return size;
    }
}
class dlink
{
    public static void main(String[] args) {

        DoublyLinkedList d=new DoublyLinkedList();
        d.insertLast(3);
        d.insertLast(4);
        d.insertLast(8);
        d.displayForward();


    }
}