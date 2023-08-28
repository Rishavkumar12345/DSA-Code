package graph;
import java.util.*;

class graphnode{
	static int val;
	Vector<graphnode>neigh;
	
	graphnode(int x){
		val=x;
		neigh=new Vector<graphnode>();
	}
}



public class clone_graph {
	
	public static graphnode clonegraph(graphnode source) {
		
		Queue<graphnode>q=new LinkedList<>();
		HashMap<graphnode,graphnode>hm=new HashMap<>();
		
		q.add(source);
		HashMap<graphnode, graphnode> hs = new HashMap<graphnode, graphnode>();
		hs.put(source, new graphnode(graphnode.val));
		
		while(!q.isEmpty()) {
			graphnode curr=q.poll();
			
			for(graphnode h:curr.neigh) {
				if(!hs.containsKey(h)) {
					hs.put(h, new graphnode(h.val));
					q.add(h);
				}
				hs.get(h).neigh.add(hs.get(h));
			}
		}
		return hs.get(source);
	}
	
	public static graphnode builtgraph() {
		
		graphnode node1=new graphnode(1);
		graphnode node2=new graphnode(2);
		graphnode node3=new graphnode(3);
		graphnode node4=new graphnode(4);
		
		Vector<graphnode>v=new Vector<>();
		v.add(node2);
		v.add(node4);
		node1.neigh=v;
		
		v=new Vector<graphnode>();
		v.add(node1);
		v.add(node3);
		node2.neigh=v;
		
		v=new Vector<graphnode>();
		v.add(node2);
		v.add(node4);
		node3.neigh=v;
		
		v=new Vector<graphnode>();
		v.add(node1);
		v.add(node3);
		node4.neigh=v;
		
		return node1;
	}
		
	 public static void bfs(graphnode source){
		 
	        Queue<graphnode> q = new LinkedList<graphnode>();
	        q.add(source);
	        HashMap<graphnode,Boolean> visit =new HashMap<>();
	        
	        visit.put(source,true);
	        while (!q.isEmpty())
	        {
	        	graphnode u = q.poll();
	            System.out.println("Value of Node " + u.val);
	            System.out.println("Address of Node " + u);
	            if (u.neigh != null)
	            {
	                Vector<graphnode> v = u.neigh;
	                for (graphnode g : v)
	                {
	                    if (visit.get(g) == null)
	                    {
	                        q.add(g);
	                        visit.put(g,true);
	                    }
	                }
	            }
	        }
	        System.out.println();
	    }
	
	public static void main(String args[]) {
		
		//clone_graph graph=new clone_graph();
		graphnode source=builtgraph();
		System.out.println("original graph");
		bfs(source);
		
		graphnode newsource=clonegraph(source);
		System.out.println("clone graph");
		bfs(newsource);
		
	}
}
