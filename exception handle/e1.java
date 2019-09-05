public class e1
{
    public static void main(String Args[])
    {
        int x[]=new int[10];
        try
        {
            int y=5/0;
            x[12]=100;

        }
        catch (ArithmeticException r)
        {
            System.out.println(r);
        }
        catch (ArrayIndexOutOfBoundsException c)
        {
            System.out.println(c);
        }

    }
}