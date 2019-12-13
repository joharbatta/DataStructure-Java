import java.util.*;
public class levelOrder
{
    Node root;
    class Node
    {
        int data;
        Node right,left;
        Node(int data)
        {
            this.data=data;
            right=left=null;
        }
    }
    void insert(int data) { 
        root = insertRec(root,data); 
     } 
     Node insertRec(Node root, int data) { 
         if (root == null) { 
             root = new Node(data); 
             return root; 
         } 
         if (data < root.data) 
             root.left = insertRec(root.left, data); 
         else if (data > root.data) 
             root.right = insertRec(root.right, data); 
         return root; 
     }
     void printLevelOrder() 
    { 
        int h = height(root); 
        int i; 
        for (i=1; i<=h; i++) 
            printGivenLevel(root, i); 
    } 
  
    int height(Node root) 
    { 
        if (root == null) 
           return 0; 
        else
        { 
            int lheight = height(root.left); 
            int rheight = height(root.right); 
            if (lheight > rheight) 
                return(lheight+1); 
            else return(rheight+1);  
        } 
    } 
  

    void printGivenLevel (Node root ,int level) 
    { 
        if (root == null) 
            return; 
        if (level == 1) 
            System.out.print(root.data + " "); 
        else if (level > 1) 
        { 
            printGivenLevel(root.left, level-1); 
            printGivenLevel(root.right, level-1); 
        } 
    } 
    

     public static void main(String []agrs)
    {
        levelOrder tree = new levelOrder();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of nodes");
        int num = sc.nextInt();
        System.out.println("Enter nodes");
        /*Enter the data nodes in PreOrder or just enter root node first*/
        for(int i =0 ; i<num ; i++)
        {
            tree.insert(sc.nextInt());
        }
        tree.printLevelOrder();

       
        
    }



}