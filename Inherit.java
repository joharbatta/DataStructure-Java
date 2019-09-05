class A{
    public void show()
    {

        System.out.println("Parent class method");
    }
}

class B extends A
{
    public void show()
    {
        super.show();
        System.out.println("B class method");
    }
//    public B()
//    {
//        super();
//    }

}
class C extends B
{
    public void show()
    {
        super.show();
        System.out.println("C class method");
    }
}
public class Inherit{
    public static void main(String args[])
    {
        C obj=new C();
        obj.show();
    }
}