package graphs;

import java.util.Iterator;
import java.util.LinkedList;

class Node {
	
	int edge;
	
	public Node(int edge) {
		
		this.edge = edge;
	}
}

public class Graph {

	LinkedList<Node>[] graph;
	
	@SuppressWarnings("unchecked")
	public Graph(int numNodes) {
		
		graph = new LinkedList[numNodes];
		
		for (int i = 0; i < numNodes; i++) {
		
			graph[i] = new LinkedList<Node>();
		}
	}
	
	public void printGraph() {
		
		System.out.println("Navigating through the Graph...");
		
		for (int i = 0; i < graph.length; i++) {
			
			System.out.print("Accessing Node " + i + " = ");
			
			Iterator<Node> it = graph[i].iterator();
			
			while(it.hasNext()) {
				
				System.out.print(it.next().edge + " ");
			}
			
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		Graph g = new Graph(3);
		
		Node node1 = new Node(3);
		Node node2 = new Node(2);
		
		g.graph[0].add(node1);
		g.graph[0].add(node2);
		
		g.printGraph();
	}
}
