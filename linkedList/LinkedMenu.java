import java.util.*;

public class LinkedMenu {

    Node head;
    static class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data=d;
            next=null;
        }
    }
    public static LinkedMenu add(LinkedMenu li,int b)
    {
        Node newNode=new Node(b);
        if(li.head==null)
        {
            li.head=newNode;
        }
        else
            {
            Node last=li.head;

            while(last.next!=null)
            {
                last=last.next;
            }
            last.next=newNode;
        }
        return li;
    }
    public static LinkedMenu insert(LinkedMenu li,int index,int data)
    {
        Node newNode=new Node(data);
        Node count=li.head;
        int c=0;
        if(li.head==null)
        {
            li.head=newNode;
        }
        while(count.next!=null)
        {
            c++;
            count=count.next;
        }

        if(c>index)
        {
            if(index==0)
            {
                Node start=li.head;
                li.head=newNode;
                newNode.next=start;
            }
            else if(c==index)
            {
                Node last=li.head;
                while(last.next!=null)
                {
                    last=last.next;
                }
                last.next=newNode;

            }
            else
            {
                Node curr=li.head;
                int a=0;
                Node d=curr.next;
                while(a<index-1)
                {
                    curr=curr.next;
                    d=d.next;
                    a++;
                }
                curr.next=newNode;
                newNode.next=d;

            }

        }
        else
        {
            System.out.println("Invalid index");
        }
        return li;
    }
    public static LinkedMenu delete(LinkedMenu li,int index)
    {
        Node c=li.head;
        if(li.head==null)
        {
            System.out.println("linked list does not exist");
        }
        int count=0;
        while(c.next!=null)
        {

            count++;
            c=c.next;
        }


        if(index>count)
        {
            System.out.println("Invalid input");
        }
        else
        {
            Node d=li.head;
            int a=0;
            if(index==0)
            {
                li.head=d.next;
            }

            else if(index==count)
            {
                d=li.head;
                while(d.next.next!=null)
                {
                    d=d.next;
                }
                d.next=null;
            }
            else
            {

                Node dd=d.next.next;
                while(a<(index-1))
                {
                    d=d.next;
                    dd=dd.next;
                    a++;
                }
                d.next=dd;
            }

        }
        return li;
    }
    public static LinkedMenu display(LinkedMenu li)
    {
        Node curr=li.head;
        if(li.head==null)
        {
            System.out.println("Linked list does not exist");

        }
        else
        {
            while(curr.next!=null)
            {
                System.out.print(curr.data);
                curr=curr.next;
            }
            System.out.print(curr.data);
            //System.out.println("    ");
        }

        return li;
    }
    public static void main(String[] args)
    {
        LinkedMenu li=new LinkedMenu();
        Scanner sc=new Scanner(System.in);
        int index;
        int n;
	  /*  int n=sc.nextInt();

	  for(int i=0;i<n;i++)
	  {
		  int b=sc.nextInt();
		  add(li,b);
	   }*/
        String s="yes";
        while(s.equals("yes")||s.equals("y"))
        {
            System.out.println("enter your choice");
            System.out.println("1:Make a list");
            System.out.println("2:insert");
            System.out.println("3:Delete");
            System.out.println("4:Display");
            int opt=sc.nextInt();
            switch(opt)
            {
                case 1:

                    System.out.println("Enter the number of elements:");
                    n=sc.nextInt();
                    System.out.println("Enter the elements: ");
                    for(int i=0;i<n;i++)
                    {
                        int b=sc.nextInt();
                        add(li,b);
                    }
                    break;

                case 2:
                    if(li.head==null)
                    {
                        System.out.println("no list found ");
                        System.out.println("make a list first");
                        System.out.println("Enter the number of elements:");
                        n=sc.nextInt();
                        System.out.println("Enter the elements: ");
                        for(int i=0;i<n;i++)
                        {
                            int b=sc.nextInt();
                            add(li,b);
                        }

                    }
                    System.out.println("Enter the index where you want to insert");
                    index=sc.nextInt();
                    int data=sc.nextInt();
                    insert(li,index,data);
                    System.out.println("Do you want to continue");
                    s=sc.next();
                    break;
                case 3:
                    if(li.head==null)
                    {
                        System.out.println("no list found ");
                        System.out.println("make a list first");
                        System.out.println("Enter the number of elements:");
                        n=sc.nextInt();
                        System.out.println("Enter the elements: ");
                        for(int i=0;i<n;i++)
                        {
                            int b=sc.nextInt();
                            add(li,b);
                        }

                    }
                    System.out.println("Enter the index where you want to delete");
                    index=sc.nextInt();
                    delete(li,index);
                    System.out.println("Do you want to continue");
                    s=sc.next();
                    break;
                case 4:
                    if(li.head==null)
                    {
                        System.out.println("no list found ");
                        System.out.println("make a list first");
                        System.out.println("Enter the number of elements:");
                        n=sc.nextInt();
                        System.out.println("Enter the elements: ");
                        for(int i=0;i<n;i++)
                        {
                            int b=sc.nextInt();
                            add(li,b);
                        }

                    }
                    System.out.println("The elements of the list are:");
                    display(li);
                    System.out.println("Do you want to continue");
                    s=sc.next();
                    break;
                default:
                    System.out.println("the option tha you have entered is not valid");
                    System.out.println("Do you want to continue");
                    s=sc.next();

            }
        }
        if(s.equals("no")||s.equals("n"))
        {
            System.out.println("Thanks");
        }
    }
}


