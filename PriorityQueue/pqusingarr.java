import java.util.*;
public class pqusingarr
{
             public static void main(String[] args) 
            {
                
                Scanner sc=new Scanner(System.in);
                pq p=new pq();

                p.add(3);
                p.add(2);
                p.add(5);
                p.print();
                System.out.println();
                System.out.println(p.getPeek());
                System.out.println(p.isEmpty());
                System.out.println("SIZE: "+p.size());
                System.out.println(p.remove());
                System.out.println("SIZE: "+p.size());
                p.print();
                

            }

   
}
class pq
{
    
    int arr[]=new int[10];
    int nitems=0;

        public void add(int d)
        {
            if(nitems==0)
            {
            arr[0]=d;
            nitems++;
            return; //istoh bhar aana matlab eh hai
            }
            int i;
            for(i=nitems-1;i>=0;i--)
            {
                if(d<arr[i])   //jehra apa krya eh ascending h //descending order krn  lyi max to min d>arr[i] 
                {
                    arr[i+1]=arr[i];
                }
                else
                {
                    break;
                }

            }   
            arr[i+1]=d;  // hun i di value ghat gyi eh for toh bhar h
            nitems++;
            // else
            // {
            //     for(int j=0;j<=i;j++)
            //     {
            //     if(d<arr[j])
            //     {
            //         arr[i-1]=

            //     }
            //     else
            //     {
            //         arr[i]=d;
            //         i++;
            //     }
            //     }

            // }
        }
            public void print()
            {
            for(int j=0;j<nitems;j++)
            {
                System.out.print(arr[j]+" ");
            }
            }

        public boolean isEmpty()
        {
            // if(nitems<0)
            // return true;
            // else
            // return false;
            return nitems==0; //another thing

        }
        public int size()
        {
            return nitems;
        }
        public int getPeek()
        {
            return arr[nitems-1];
        }
        public int remove() //poll
        {
            // int val=arr[nitems];
            // nitems--;
            // return val;
            return arr[--nitems]; //pre m=minus both things done in one line
        }



}