import java.util.LinkedList;
import java.util.Queue;

class Node
{
    int data;
    Node left;
    Node right;
    Node(int data)
    {
        this.data=data;
        left=right=null;
    }
}

class BinaryTree{
    Node root;
    BinaryTree() 
    { 
        root = null; 
    } 
    BinaryTree(int data)
    {
        this.root=new Node(data);
    }

    int levelPrint=1;
    void rightView(Node root,int level)
    {
        if(root==null)
        return;
        if(level==levelPrint)
        {
            System.out.print(root.data+" ");
            levelPrint++;
        }
        rightView(root.right,level+1);
        rightView(root.left,level+1);
       
    }
    //iterative
    void rightView1(Node root)
    {
        if(root==null) 
        return;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(true)
        {
            int size=q.size();
            if(size==0)
            {
            break;
            }
            for(int i=0;i<size;i++)
            {
                Node temp=q.remove();
                if(i==size-1)
                {
                    System.out.print(temp.data+" ");
                }
                if(temp.left!=null)
                {
                    q.add(temp.left);
                }
                if(temp.right!=null)
                {
                    q.add(temp.right);
                }
            }

        }
    }

}

class rightView{
    public static void main(String[] args) {

        BinaryTree bt=new BinaryTree(2);
        bt.root.left=new Node(3);
        bt.root.right=new Node(5);
        bt.root.left.right=new Node(9);
        bt.root.right.left=new Node(7);
        bt.rightView(bt.root,1);
        bt.rightView1(bt.root);
        
    }
}