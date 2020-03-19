
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
    int LsumBT(Node head)
    {
       
       if(head==null)
       {
           return 0;
       }
       if(head.left==null && head.right==null)
       {
           return head.data;
       }
       return LsumBT(head.left)+LsumBT(head.right);
   }
}

class btreeLeafSum{
    public static void main(String[] args) {

        BinaryTree bt=new BinaryTree(2);
        bt.root.left=new Node(3);
        bt.root.right=new Node(5);
        bt.root.left.right=new Node(9);
        bt.root.right.left=new Node(7);
        System.out.println(bt.LsumBT(bt.root));
    }
}