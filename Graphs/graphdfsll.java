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
   
    void dfs(int s)  //recursion happening
    {
        System.out.println("---------DFS----------");
        boolean visited[]=new boolean[v];
        DFSutil(visited,s);
    }
    void DFSutil(boolean visited[],int s)
    {
        visited[s]=true;
        System.out.println(s+" ");
        Iterator<Integer> it=adjListArray[s].iterator();
        while(it.hasNext())
        {
            int n=it.next();
            if(!visited[n])
            {
                DFSutil(visited,n);
            }
        }
    }
    
}
 class graphdfsqll 
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
        g.dfs(0);
    }
   
}