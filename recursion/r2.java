class rec1
{
    public  rec(int i)
    {
        int result=0;
        if(i==5) { //base case
            return 5;
        }
        else { //recursive case
            result = rec(i + 1);
            System.out.println(result);
            return i;
        }
    }
}

class r2
{
    public static void main(String args[])
    {
        int x;
        rec1 r=new rec1();
        x=r.rec(1);
        System.out.println(x);

    }
}
