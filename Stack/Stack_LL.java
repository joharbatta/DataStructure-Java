public class Stack_LL 
{
	class Node
	{
		Node next;
		int data;
		public Node(int d)
		{
			next=null;
			data=d;
		}
	}
	Node head;
	public void push(int d)
	{
		Node newNode=new Node(d);
		newNode.next=head;
		head=newNode;
	}
	public void display()
	{
		Node n=head;
		while(n!=null)
		{
			System.out.println(n.data);
			n=n.next;
		}
	}
	public int pop()
	{
		Node temp=head;
		head=head.next;
		return temp.data;
	}
	public static void main(String args[])
	{
		Stack_LL s  = new Stack_LL();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		int x= s.pop();
		System.out.println("Element popped is "+x);
		int y = s.pop();
		System.out.println("Element popped is "+y);
		s.display();
	}

}