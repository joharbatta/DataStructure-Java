
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

    void print(Node root,int level)
    {
        if(root==null)
        {
            return;
        }
        if(level==1)
        {
            System.out.print(root.data+" ");
        }
        print(root.left,level-1);
        print(root.right,level-1);
    }
}

class printAtlevel{
    public static void main(String[] args) {

        BinaryTree bt=new BinaryTree(2);
        bt.root.left=new Node(3);
        bt.root.right=new Node(5);
        bt.root.left.right=new Node(9);
        bt.root.right.left=new Node(7);
        bt.print(bt.root,3);
    }
}