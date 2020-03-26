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
    void leftView(Node root,int level)
    {
        if(root==null) return;
        if(level==levelPrint)
        {
            System.out.print(root.data+" ");
            levelPrint++;
        }
        leftView(root.left,level+1);
        leftView(root.right,level+1);
    }

}

class btree{
    public static void main(String[] args) {

        BinaryTree bt=new BinaryTree(2);
        bt.root.left=new Node(3);
        bt.root.right=new Node(5);
        bt.root.left.right=new Node(9);
        bt.root.right.left=new Node(7);
        
    }
}