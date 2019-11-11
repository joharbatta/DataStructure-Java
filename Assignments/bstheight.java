//find height of binary serach tree using 2 methods nodes r edges

mport java.util.*;
public class bstheight
{
    Node root;
    class Node
    {
        int data;
        Node right,left;
        Node(int data)
        {
            this.data = data;
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
   
    void printInOrder(Node root)
    {
        if(root == null)
        {
            return;
        }
        else
        {
            printInOrder(root.left);
            System.out.print(root.data + " ");
            printInOrder(root.right);
        }
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
  int height(Node root)
	{
		
		int c=0,c1=0;
		if(root==null)
		{
		return 0;
		}
		if(root!=null)
		{
			c=height(root.left);
			c++;
			c1=height(root.right);
			c1++;
		}
		if(c>c1)
			  return c;
		  else
		return c1;
		 
	} 
 




     public static void main(String []agrs)
    {
        bstheight tree = new bstheight();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of nodes");
        int num = sc.nextInt();
        System.out.println("Enter nodes");
        /*Enter the data nodes in PreOrder or just enter root node first*/
        for(int i =0 ; i<num ; i++)
        {
            tree.insert(sc.nextInt());
        }
        int h=tree.calHeight(tree.root);
        System.out.println("Height of tree "+h);
        int h1=tree.height(tree.root);
        System.out.println("Height of tree "+h1);
      

        // System.out.println("In-order");
        // tree.printInOrder(tree.root);
        // sc.close();
       
        
    }



}