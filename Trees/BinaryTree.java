class Node 
{ 
    int key; 
    Node left, right; 
  
    public Node(int item) 
    { 
        key = item; 
        left = right = null; 
    } 
} 
  
class BinaryTree 
{ 
    Node root; 
  
    BinaryTree() 
    { 
        root = null; 
    } 
    void insert(int key) { 
        root = insertRec(root, key); 
     } 
     Node insertRec(Node root, int key) { 
         if (root == null) { 
             root = new Node(key); 
             return root; 
         } 
         if (key < root.key) 
             root.left = insertRec(root.left, key); 
         else if (key > root.key) 
             root.right = insertRec(root.right, key); 
         return root; 
     } 
    void printPostorder(Node node) 
    { 
        if (node == null) 
            return; 
        printPostorder(node.left);
        printPostorder(node.right); 
  
        System.out.print(node.key + " "); 
    } 
    void printInorder(Node node) 
    { 
        if (node == null) 
            return; 
        printInorder(node.left); 
        System.out.print(node.key + " "); 
        printInorder(node.right); 
    } 
    void printPreorder(Node node) 
    { 
        if (node == null) 
            return; 
        System.out.print(node.key + " "); 
        printPreorder(node.left); 
        printPreorder(node.right); 
    } 
  
    // Wrappers over above recursive functions 
    void printPostorder()  {     printPostorder(root);  } 
    void printInorder()    {     printInorder(root);   } 
    void printPreorder()   {     printPreorder(root);  } 
  
    // Driver method 
    public static void main(String[] args) 
    { 
        BinaryTree tree = new BinaryTree(); 
        /*
        tree.root = new Node(1); 
        tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(5); 
  */
        tree.insert(50); 
        tree.insert(30); 
        tree.insert(20); 
        tree.insert(40); 
        tree.insert(70); 
        tree.insert(60); 
        tree.insert(80); 
        System.out.println("Preorder traversal of binary tree is "); 
        tree.printPreorder(); 
  
        System.out.println("\nInorder traversal of binary tree is "); 
        tree.printInorder(); 
  
        System.out.println("\nPostorder traversal of binary tree is "); 
        tree.printPostorder(); 
    }
}