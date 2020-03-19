
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

    int sumBT(Node head)
     {
        
        if(head==null)
        {
            return 0;
        }
        return head.data+ sumBT(head.left)+sumBT(head.right);
    }

    //method 2
    static int sum=0;
    public int sumBT1(Node root)
    {
    sum=0;
    return sum(root);
    }
    public int sum(Node root){
    if(root == null)
    return 0;
    sum(root.left);
    sum(root.right);
    sum += root.data;
    return sum;
    }
}

class treeSum{
    public static void main(String[] args) {

        BinaryTree bt=new BinaryTree(2);
        bt.root.left=new Node(3);
        bt.root.right=new Node(5);
        bt.root.left.right=new Node(9);
        bt.root.right.left=new Node(7);
        System.out.println(bt.sumBT(bt.root));
        System.out.println(bt.sumBT1(bt.root));

        //2nd binary tree
        BinaryTree bt1=new BinaryTree(2);
        bt1.root.left=new Node(3);
        bt1.root.right=new Node(10);
        bt1.root.left.right=new Node(9);
        bt1.root.right.left=new Node(6);
        System.out.println(bt1.sumBT(bt1.root));
        System.out.println(bt1.sumBT1(bt1.root));
        
    }
}