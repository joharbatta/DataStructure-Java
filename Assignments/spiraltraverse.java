import java.util.*;
public class spiraltraverse
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
     void printrtllevel(Node root , int level)
     {
         if(root == null)
         {
             return;
         }
         if(level == 1)
         {
             System.out.print(root.data + " " );
         }
         else if(level>1)
         {
             printrtllevel(root.right, level-1);
             printrtllevel(root.left, level-1);
         }
     }
     void printlevel(Node root , int level)
     {
         if(root == null)
         {
             return;
         }
         if(level == 1)
         {
             System.out.print(root.data + " " );
         }
         else if(level>1)
         {
             printlevel(root.left, level-1);
             printlevel(root.right, level-1);
         }
     }
     int height()
     {
         int a ;
         a = calHeight(root);
         return a;
     }
     int calHeight(Node root)
     {
         if(root == null)
         {
             return 0;
         }
         else
         {
             int l = calHeight(root.left);
             int r = calHeight(root.right);
             if(l>r)
             {
                 return l+1;
             }
             else
             {
                 return r+1;
             }
         }
     }
     void spiral()
    {
        printinSpiral(root);
    }
     void printinSpiral(Node root)
    {
        int h = height();
        for(int i = 1 ; i<=h ; i++)
        {
            if(i%2==1)
            {
                printrtllevel(root, i);
                System.out.println();
            }
            else
            {
                printlevel(root, i);
                System.out.println();
            }
        }
    }

     public static void main(String []agrs)
    {
        spiraltraverse tree = new spiraltraverse();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of nodes");
        int num = sc.nextInt();
        System.out.println("Enter nodes");
        /*Enter the data nodes in PreOrder or just enter root node first*/
        for(int i =0 ; i<num ; i++)
        {
            tree.insert(sc.nextInt());
        }
        tree.spiral();

       
        
    }



}