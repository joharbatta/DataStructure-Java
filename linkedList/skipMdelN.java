import java.util.*;
public class skipMdelN 
{
    static class node
    {
        int data;
        node next;
        node(int d)
        {
            this.data=d;
            next=null;
        }
    }
    static node head;
    public static node insert(node head,int data)
    {
        node temp=new node(data);
        if(head==null)
        {
            head=temp;
        }
        else
        {
            node p=head;
            while(p.next!=null)
            {
                p=p.next;
            }
            p.next=temp;
        }
        return head;
    }
    public static void display(node head,int a,int b)
    {
            node p=head;
            while(p.next!=null)
            {
               int e=0;
               int f=0;
               while(e!=a && p.next!=null)
               {
                   System.out.print(p.data+" ");
                   p=p.next;
                   e++;  
               }
               while(f!=b && p.next!=null)
               {
                    p=p.next; 
                    f++;
               }  
            }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=0;
        System.out.println("please enter the entries and prss and -1 to exit");
        while(num!=-1)
        { 
            num=sc.nextInt();
            head= insert(head,num);
        }
        System.out.println("enter m-sKip");
        int a=sc.nextInt();
        System.out.println("enter n-Delete");
        int b=sc.nextInt();
        display(head,a,b);
    }
}