
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class BinaryTree {
    Node root;

    BinaryTree() {
        root = null;
    }

    BinaryTree(int data) {
        this.root = new Node(data);
    }

    boolean isIsomorphic(Node root1, Node root2)
    {
        if(root1==null && root2==null) 
        return true;
        if(root1==null||root2==null) 
        return false;
        // if(root1.data!=root2.data) 
        // return false;
        // return (isIsomorphic(root1.left,root2.left) &&
        // isIsomorphic(root1.right,root2.right))
        // || (isIsomorphic(root1.left,root2.right) &&
        // isIsomorphic(root1.right,root2.left));

        return root1.data==root2.data && 
        ((isIsomorphic(root1.left,root2.left) &&  isIsomorphic(root1.right,root2.right))
               || (isIsomorphic(root1.left,root2.right) &&  isIsomorphic(root1.right,root2.left))
           );
    }
}

class isomorphicBtree {
    public static void main(String[] args) {

        BinaryTree bt = new BinaryTree(2);
        bt.root.left = new Node(3);
        bt.root.right = new Node(5);
        bt.root.left.right = new Node(9);
        bt.root.right.left = new Node(7);

        BinaryTree bt2 = new BinaryTree(2);// BT with root node 2
        bt2.root.left = new Node(5);// linking explicitly
        bt2.root.right = new Node(3);
        bt2.root.left.right = new Node(7);
        bt2.root.right.left = new Node(9);

        BinaryTree bt3 = new BinaryTree(2);// BT with root node 2
        bt3.root.left = new Node(3);// linking explicitly
        bt3.root.right = new Node(5);
        bt3.root.left.left = new Node(7);
        // bt3.root.right.left=new Node(7);
        bt3.root.right.right = new Node(9);

        System.out.println("isIsomorphic:"+bt.isIsomorphic(bt.root, bt2.root));
        System.out.println("isIsomorphic:" + bt.isIsomorphic(bt.root, bt3.root));

    }
}