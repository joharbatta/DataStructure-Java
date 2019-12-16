import java.util.*;
public class removeDuplicatell
{
	static class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
			next=null;
		}
	}
	Node head;
	void insert(int data)
	{
		Node temp=new Node(data);
		if(head==null)
		{
			head=temp;
			return;
		}
		Node cur=head;
		while(cur.next!=null)
		{
			cur=cur.next;
		}
		cur.next=temp;
	}
	void remove()
	{
		Node cur=head;
		while(cur!=null)
		{
			Node temp=cur;
			while(temp.next!=null)
			{
				if(cur.data==temp.next.data)
				{
					temp.next=temp.next.next;
				}
				else
				{
					temp=temp.next;
				}
			}
			cur=cur.next;
		}
	}
	void print()
	{
		Node cur=head;
		while(cur!=null)
		{
			System.out.print(cur.data+" ");
			cur=cur.next;
		}
	}
	public static void main(String args[])
	{
		removeDuplicatell d=new removeDuplicatell();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		for(int i=0;i<size;i++)
		{
			d.insert(sc.nextInt());
		}
		d.remove();
		d.print();
	}
}