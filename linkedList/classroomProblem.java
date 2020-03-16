import java.util.*;
//reverse after k linked list
class classroomProblem {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    Node reverse(Node temp) {

        Node prev = null;
        Node next = null;
        Node curr=temp;

         while (curr != null) 
         {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public void reverseAfter(int k) {

        Node temp = head;
        if (head == null) {
            System.out.println("no arrangement feasible");
        } else 
        {
             int count = 0;
            while (count != k - 1) 
            {
                temp = temp.next;
                count++;
            }
            temp.next = reverse(temp.next);
        }
    }

      public void push(int new_data) {
        Node temp = head;
        Node new_node = new Node(new_data);
        if (head == null) {
            head = new_node;
        } else {
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new_node;
        }
    }

      public void printList() {
        Node tnode = head;
        while (tnode != null) {
            System.out.print(tnode.data + " ");
            tnode = tnode.next;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        classroomProblem obj = new classroomProblem();
        int no = in.nextInt();
        for (int i = 0; i < no; i++) {
            int element = in.nextInt();
            obj.push(element);
        }
        int pos = in.nextInt();
        obj.reverseAfter(pos);
        obj.printList();
    }
}