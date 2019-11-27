import java.util.PriorityQueue;

public class inclassimp
{

     public static void main(String[] args) {
         PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
         pq.add(2);
         pq.add(1);
         pq.add(4);
         pq.add(9);
         pq.add(6);
         pq.add(3);
         pq.add(5);
        System.out.println(pq.size());
        System.out.println(pq.isEmpty());
        System.out.println(pq.poll());
        System.out.println(pq.size());
        System.out.println(pq.peek());
        System.out.println(pq.size());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.isEmpty());
        
    }
}