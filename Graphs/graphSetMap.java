import java.util.*;
public class graphSetMap {
	//keys=Integer,values,neighbours=HashSet
	HashMap<Integer,HashSet<Integer>> graph=new HashMap<>();
	boolean addVertex(int vertex)
	{
		if(!graph.containsKey(vertex))
		{
			graph.put(vertex, new HashSet<>());
			return true;
		}
		return false;
	}
	void addEdge(int u,int v)
	{
		//purane set ko vapis leke aane ke liye
		// HashSet<Integer> neighbour=graph.get(u);
		// neighbour.add(v);
		// graph.put(u, neighbour);
		graph.get(u).add(v);
		  //instead of upper 3 line
		
		// neighbour=graph.get(v);
		// neighbour.add(u);
		// graph.put(v,neighbour);
		graph.get(v).add(u);
	}
	void bfs(int s)
    {
        System.out.println("---------bfs----------");
        HashSet<Integer> visited=new HashSet<>();
        Queue<Integer> queue=new LinkedList<>();
        queue.add(s);
        visited.add(s);
        while(!queue.isEmpty())
        {
             s = queue.poll();
            System.out.println(s+" ");
            for( Integer n:graph.get(s))
            {
                if(!visited.contains(n))
                {
                    queue.add(n);
                    visited.add(n);
                }
            }
        }
        System.out.println();

    }
	void print()
	{
		//vertex shi print hogye
		System.out.println(graph.keySet());
		System.out.println();
		for(Integer key:graph.keySet())
		{
			System.out.println("Adjaency List for Node: "+key);
			System.out.println(graph.get(key));
			
		}
	}
	public static void main(String[] args) {

		graphSetMap g=new graphSetMap();
		g.addVertex(0);
		g.addVertex(1);
		g.addVertex(2);
		g.addVertex(3);
		g.addVertex(4);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(0, 3);
		//no error ,only copy of this element is store
//		g.addEdge(0, 3);
		g.addEdge(1,3);
		g.addEdge(2,4);
		g.addEdge(3,4);
		g.print();
		g.bfs(0);
	}

}
