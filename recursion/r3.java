class rec
{
    public int rec(int i) {
        int result = 0;
        if (i == 1)
            return 1;
        else
            result = i * rec(i - 1);
        return result;
    }
}

class r3
{
    public static void main(String[] args) {
        rec r=new rec();
        int result=r.rec(5);
        System.out.println(result);
    }
}