import java.util.*;
public class swapll 
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
	static Node head;
	void insert(int data)
	{
		Node tem=new Node(data);
		if(head==null)
		{
			head=tem;
			return;
		}
		Node cur=head;
		while(cur.next!=null)
		{
			cur=cur.next;
		}
		cur.next=tem;
	}
	void swap()
	{
		Node cur=head;
		while(cur!=null&&cur.next!=null)
		{
			int a=cur.data;
			cur.data=cur.next.data;
			cur.next.data=a;
			cur=cur.next.next;
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
		swapll s=new swapll();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		for(int i=0;i<size;i++)
		{
			s.insert(sc.nextInt());
		}
		s.swap();
		s.print();
	}
}