import java.util.*;

public class middlell {
    class Node {
        int data;
        Node next;

        Node(int value) {
            data = value;
            next = null;
        }
    }

    public static Node head = null;   
    public static Node last;
    public void add(int value) {
     
        Node newNode = new Node(value);
        if (head == null) {
            head = new Node(value);
            return;
        }
        last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
        return;
    }

    public static void printMiddleElement(Node head) 
    {
         if(head==null || head.next==null)
         {
             System.out.println("middle element does not exist");
             return;
         }
         Node sptr=head;
         Node fptr=head;
         while(fptr!=null && fptr.next!=null)
         { 
             sptr=sptr.next;
             fptr=fptr.next.next;
         }
         System.out.println("Middle Element is "+sptr.data);
    }


    public static void main(String[] arg) {
       middlell obj = new middlell();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            obj.add(in.nextInt());
        }
        printMiddleElement(obj.head);

    }
}