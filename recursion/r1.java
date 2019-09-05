class rec
{
    public void rc()
    {
        System.out.println("HELLO JATT");
                rc();
    }

}


public class r1
{
    public static void main(String args[])
    {
        rec r=new rec();
        r.rc();

    }
}