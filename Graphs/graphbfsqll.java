import java.util.*;

class graph
{
     int v;
     LinkedList<Integer> adjListArray[];
    graph(int v)
    {
        this.v=v;
        adjListArray =new LinkedList[v];
        for(int i=0;i<v;i++)
        {
            adjListArray[i]=new LinkedList<>();
        }
    }
    void addEdge(int a,int b)
    {
        adjListArray[a].add(b);
        adjListArray[b].add(a);//beacause undirectional graph
    }
    void print()
    {
        for(int i=0;i<v;i++)
        {
           System.out.println("Adjancy List of vertex:"+adjListArray[i]);
           for(Integer n:adjListArray[i])
           {
               System.out.println(n+"");
           }
        }
    }
   
    void bfs(int s)
    {
        System.out.println("---------bfs----------");
        boolean visted[]= new boolean[v];
        Queue<Integer> queue=new LinkedList<>();
        queue.add(s);
        visted[s]=true;
        while(!queue.isEmpty())
        {
             s = queue.poll();
            System.out.println(s+" ");
            for( Integer n:adjListArray[s])
            {
                if(!visted[n])
                {
                    queue.add(n);
                    visted[n]=true;
                }
            }
        }
        System.out.println();

    }
}
public class graphbfsqll 
{
        public static void main(String[] args) 
    {
        graph g= new graph(5);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1,3);
        g.addEdge(3,4);
        g.addEdge(4,2);
        g.print();
        g.bfs(0);
    }
   
}