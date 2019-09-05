import java.util.*;
import java.io.*;

class ArrayList  // ek aisi class bnani hajiske object ke andr multiple values store kr skte hain
{
    private int data[];
    private int size;
    private int count;
    ArrayList(int size)
    {
        this.size=size;
        data=new int[size];
        this.count=0;
    }

    public void add(int value) {
        if(this.count==size)
        {
            int old[]=data;
            data=new int[this.size*2];
            this.size=this.size*2;

            for(int i=0;i<this.count;i++)
            {
                data[i]=old[i];
            }
            data[this.count]=value;
            this.count++;
        }
        else
        {
            data[this.count]=value;
            this.count++;
         }
      }

      public void show()
      {

          for (int i=0;i<this.count;i++)
          {
              System.out.println(data[i]);
          }

      }

      public int getSize()
      {
          return this.size;
      }
      public int getCount()
      {
          return this.count;
      }

}
//ArrayList list = new ArrayList(12);

public class Arrlist
{
    public static void main(String args[])
    {
        ArrayList list=new ArrayList(5);

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(30);
        list.add(30);
        list.add(30);
        list.show();

        System.out.println(list.getSize());
        System.out.println(list.getCount());

    }
}

// Acess specifiers

// arraylist is dynamic requitement dekh k size adjust ho jaata


// private same class
//defalut same package
// public
// protected same package but for another package we have to inherit that


