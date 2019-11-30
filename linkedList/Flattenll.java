import java.util.Scanner;

class Node {

   int data;
   Node next;
   Node below;

   Node(int value) {
       data = value;
       next = null;
       below = null;
   }
}

class Flattenll {
    
     Node merge(Node a, Node b) 
    { 
        // if first linked list is empty then second 
        // is the answer 
        if (a == null)     
        return b; 
  
        // if second linked list is empty then first 
        // is the result 
        if (b == null)      
        return a; 
  
        // compare the data members of the two linked lists 
        // and put the larger one in the result 
        Node result; 
  
        if (a.data < b.data) 
        { 
            result = a; 
            result.below =  merge(a.below, b); 
        } 
  
        else
        { 
            result = b; 
            result.below = merge(a, b.below); 
        } 
  
        return result; 
    } 
  
    Node flatten(Node root) 
    { 
        if (root == null || root.next == null) 
            return root; 
  
        // recur for list on right 
        root.next = flatten(root.next); 
  
        // now merge 
        root = merge(root, root.next); 
  
        // return the root 
        // it will be in turn merged with its left 
        return root; 
    } 
    void printList() 
    { 
        Node temp = headNode; 
        while (temp != null) 
        { 
            System.out.print(temp.data + " "); 
            temp = temp.below; 
        } 
        System.out.println(); 
    } 
   Node headNode;
   

   public static void main(String args[]) {
       Scanner scan = new Scanner(System.in);

       Flattenll linkedList = new Flattenll();

      
       int nHoriz = scan.nextInt();

      /* Create an array of 'nHoriz' integers to store the number
      of nodes in each vertical list */
       int allVertSize[] = new int[nHoriz];
       for (int i = 0; i < nHoriz; i++) {
           allVertSize[i] = scan.nextInt();
       }

       Node currHorizNode = null;
       Node currVertNode = null;
       Node preHorizNode = null;
       Node preVertNode = null;

       /* Create the input linlked list */
       for (int i = 0; i < nHoriz; i++) 
       {
 
           /* Get the current vertical linked lists size */
           int eachVertSize = allVertSize[i];

           eachVertSize--;

           /* Get the data of the current node */
           int nodeData = scan.nextInt();
           currHorizNode = new Node(nodeData);

          /* If this is the first node then make this node as the
           head node */
           if (i == 0) {
               linkedList.headNode = currHorizNode;
           }

          /* If there is nodeA previous node in the horizontal linked list
          then add this node to its next */
           if (preHorizNode != null) {
               preHorizNode.next = currHorizNode;
           }

          /* Make this node as previous node in the horizontal linked list
           for the next iteration, that is, for next value of i*/
           preHorizNode = currHorizNode;

           /* Now, get all the nodes in the current vertical linked list */
           for (int j = 0; j < eachVertSize; j++) {

               /* Create nodeA current node of vertical linked list */
               int nodeA = scan.nextInt();
               currVertNode = new Node(nodeA);

              /* If the current node is the second node of the vertical linked
              list, then make the previous vertical node as the current horizontal
               node */
               if (j == 0) {
                   preVertNode = currHorizNode;
               }

              /* Now, add the current vertical nod as the next node to the
               previous vertical node */
               preVertNode.below = currVertNode;

               /* Move the cuurent 'preVertNode' to its next below node */
               preVertNode = preVertNode.below;
           }
       }
         linkedList.flatten(linkedList.headNode); 
        linkedList.printList();
      
      
   }
}
