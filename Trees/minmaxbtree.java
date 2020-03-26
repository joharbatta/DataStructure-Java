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
    static int max=Integer.MIN_VALUE;
	public static int findMax(Node root)
	{
	   if(root==null)
	   {
	       return 0;
	   }
	   if(max<root.data)
	   {
	       max=root.data;
	   }
	   findMax(root.left);
       findMax(root.right);
       return max;
	   //return Math.max(root.data,Math.max(findMax(root.left),findMax(root.right)));
	}
    static int min=Integer.MAX_VALUE;
	public static int findMin(Node root)
	{
	   if(root==null)
	   {
	       return 0;
	   }
	   if(min>root.data)
	   {
	       min=root.data;
	   }
	   findMin(root.left);
	   findMin(root.right);
       return min;
       //return Math.min(root.data,Math.min(findMax(root.left),findMax(root.right))); 
	}

}

class minmaxbtree{
    public static void main(String[] args) {

        BinaryTree bt=new BinaryTree(2);
        bt.root.left=new Node(3);
        bt.root.right=new Node(5);
        bt.root.left.right=new Node(9);
        bt.root.right.left=new Node(7);
        System.out.println(bt.findMax(bt.root));
        System.out.println(bt.findMin(bt.root));

        BinaryTree bt1=new BinaryTree(1);
        bt1.root.left=new Node(6);
        bt1.root.right=new Node(5);
        bt1.root.left.right=new Node(12);
        bt1.root.right.left=new Node(7);
        System.out.println(bt1.findMax(bt1.root));
        System.out.println(bt1.findMin(bt1.root));
        
    }
}