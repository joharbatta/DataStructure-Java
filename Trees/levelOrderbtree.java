import java.util.Queue;
import java.util.*;

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

    int height(Node root) {
        if (root == null)
            return -1;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    void printAtLevel(Node root, int level) {
        if (root == null)
            return;
        if (level == 1) {
            System.out.print(root.data + " ");
            return;
        }
        printAtLevel(root.left, level - 1);
        printAtLevel(root.right, level - 1);
    }

    void levrec(Node root) {
        if (root == null)
            return;
        int h = height(root);
        for (int i = 1; i <= h + 1; i++) {
            printAtLevel(root, i);
            System.out.println();
        }
    }

    // iterative method single line
    void levitr(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node temp = q.remove();
            System.out.print(temp.data + " ");
            if (temp.left != null) {
                q.add(temp.left);
            }
            if (temp.right != null) {
                q.add(temp.right);
            }
        }
        System.out.println();
    }
  // iterative level wise
    void levlineitr(Node root) 
    {
        if (root == null)
            return;
        Queue<Node> q = new java.util.LinkedList<>();
        q.add(root);
        while (true) {
            int size = q.size();
            if (size == 0)
                break;
            // while(size>0)
            for (int i = 0; i < size; i++) 
            {
                Node temp = q.remove();
                System.out.print(temp.data + " ");
                if (temp.left != null) {
                    q.add(temp.left);
                }
                if (temp.right != null) {
                    q.add(temp.right);
                }
                // size--;
            }
            System.out.println();
        }
    }
}

class levelOrderbtree {
    public static void main(String[] args) {

        BinaryTree bt = new BinaryTree(2);
        bt.root.left = new Node(3);
        bt.root.right = new Node(5);
        bt.root.left.right = new Node(9);
        bt.root.right.left = new Node(7);
        bt.levrec(bt.root);
        // iterative
        bt.levitr(bt.root);
        bt.levlineitr(bt.root);
    }

}