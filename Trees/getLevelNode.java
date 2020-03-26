import java.util.*;
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

    public int getLevelOfNode(Node node, int val, int level) {
        if(node == null) {
          return 0;
        }
        
        int l;
        
        if(node.data == val) {
          return level;
        }
        
        l = getLevelOfNode(node.left, val, level + 1);
        
        if(l != 0) {
          return l;
        }
        
        l = getLevelOfNode(node.right, val, level + 1);
        
        return l;
      }

      void getLevelOfNode1(Node root,int val) 
    {
        if (root == null)
            return;
        Queue<Node> q = new java.util.LinkedList<>();
        q.add(root);
        int level=1;
        while (true) 
        {
            int size = q.size();
            if (size == 0)
                break;
            for (int i = 0; i < size; i++) 
            {
                Node temp = q.remove();
                //System.out.print(temp.data + " ");
                if(val==temp.data)
                {
                    System.out.println(level);
                    System.exit(0);
                }
                if (temp.left != null) {
                    q.add(temp.left);
                }
                if (temp.right != null) {
                    q.add(temp.right);
                }
                
            }
            level++;
        }
    }
}

class getLevelNode{
    public static void main(String[] args) {

        BinaryTree bt=new BinaryTree(2);
        bt.root.left=new Node(3);
        bt.root.right=new Node(5);
        bt.root.left.right=new Node(9);
        bt.root.right.left=new Node(7);
        bt.root.right.left.right=new Node(12);
        System.out.println(bt.getLevelOfNode(bt.root, 7, 1));
        //iterative
        bt.getLevelOfNode1(bt.root, 12);
    }
}