import java.util.*;

class alrev
{
    public static void main(String args[])
    {
        ArrayList<Integer> list=new ArrayList();
        ArrayList<Integer> list1=new ArrayList();

        list.add(1);
        list.add(2);
        list.add(3);

        for(int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i));
        }
        for(int i=list.size()-1;i>=0;i--)
            {
                list1.add(list.get(i));
            }
        System.out.println();

        for(int i=0;i<list1.size();i++)
        {
            System.out.print(list1.get(i));
        }


    }
}