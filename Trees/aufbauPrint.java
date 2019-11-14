public class aufbauPrint
{
    class Node
    {
        int data;
        Node right,left;
        Node(int data)
        {
            this.data = data;
            right = left = null;
        }
    }
    Node root;
    void insert (int data)
    {
        //System.out.println("*");
        root = insertdata(root,data);
    }
    Node insertdata( Node root,int data )
    { 
        if(root == null)
        {
            //System.out.println("*");
            root = new Node(data);
            return root;
        }
        if(data < root.data)
        {
           root.left = insertdata(root.left,data);
            //System.out.println("*");
        }
        else
        { 
            root.right = insertdata(root.right, data);
            //System.out.println("*");
        }
        return root;
    }
    void display()
    {
        print(root);
    }
    void print(Node root)
    {   
        if(root == null)
        {
            return;
        }
        System.out.print(root.data + " ");
        print(root.left);
        print(root.right);
    }
    public static void main(String []args)
    {
       
        aufbauPrint tree = new aufbauPrint();
        tree.insert(40);
        tree.insert(30);
        tree.insert(20);
        tree.insert(35);
        tree.insert(70);
        tree.insert(50);
        tree.insert(21);
        tree.insert(10);
        tree.insert(36);
        tree.insert(32);
        tree.insert(55);
        tree.insert(60);
        tree.insert(82);
        tree.insert(76);
        tree.display();
        
    } 
}