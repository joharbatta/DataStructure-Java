public class preorder
{
    public Tnode root;
    public class Tnode
    {
        public Tnode left;
        public Tnode right;
        public int data;

        public Tnode(int data)
        {
            this.data=data;
        }

    }
    public void createTree()
    {
        Tnode first=new Tnode(1);
        Tnode second=new Tnode(2);
        Tnode third=new Tnode(3);
        Tnode fourth=new Tnode(4);
        Tnode fifth=new Tnode(5);
        root=first;
        first.left=second;
        first.right=third;
        second.left=fourth;
        second.right=fifth;

    }
    public void preOrder(Tnode root)
    {
        if(root==null)
        {
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);

    }

    public static void main(String args[])
    {
        preorder b=new preorder();
        b.createTree();
        b.preOrder(b.root);

    }

}