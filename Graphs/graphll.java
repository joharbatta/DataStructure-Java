 import java.util.*;
 class graph
 {
     int v;
     LinkedList<Integer> adjli[];
     graph(int v)
     {
         this.v=v;
         adjli=new LinkedList[v];
         for(int i=0;i<v;i++)
         {
             adjli[i]=new LinkedList<>();
         }
     }
     void addEdge(int a,int b)
     {
         adjli[a].add(b);
         adjli[b].add(a); //because undirected graph
     }
     void print()
     {
         for(int i=0;i<v;i++)
         {
             System.out.println("Adjacency List of vertes:"+i);
             for(Integer n:adjli[i])
             { 
                System.out.print(n+" ");
             }
             System.out.println();   
         }
     }


 }
 class graphll
{
    public static void main(String[] args) {

        graph g=new graph(5);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1,3);
        g.addEdge(3,4);
        g.addEdge(4,2);
        g.print();
        
        
        
         
    }

}