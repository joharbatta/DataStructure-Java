import java.util.*;
public class reverseTT
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
    void insert(int data)
    {
        root=insertRec(root,data);
    }
    Node insertRec(Node root,int data)
    {
        if(root==null)
        {
            root=new Node(data);
            return root;
        }
        if(data<root.data)
        {
            root.left=insertRec(root.left, data);
        }
        else if(data>root.data)
        {
            root.right=insertRec(root.right, data);
        }
        return root;
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
    void print(Node root)
    {
        int height=height(root);
        for(int i=height;i>=1;i--)
        {
        revlevprint(root,i); 
        }

    }
    // reverse level printing of bst
    void revlevprint(Node root,int level)
    {
        if(root==null)
        return;
        if(level==1)
        System.out.print(root.data+" ");
        else
        revlevprint(root.left,level-1);
        revlevprint(root.right,level-1);


    }

    public static void main(String args[])
    {
        reverseTT tree=new reverseTT();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of nodes");
        int num = sc.nextInt();
        System.out.println("Enter nodes");
        /*Enter the data nodes in PreOrder or just enter root node first*/
        for(int i =0 ; i<num ; i++)
        {
            tree.insert(sc.nextInt());
        }
        tree.print(tree.root);
        // int h1=tree.height(tree.root);
        // System.out.println("Height of tree "+h1);


    }

}