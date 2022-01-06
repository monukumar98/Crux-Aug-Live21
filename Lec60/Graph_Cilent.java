package Lec60;

import java.util.HashSet;

public class Graph_Cilent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph g = new Graph(7);
		g.addEdge(1, 2, 10);// 1-->2 2-->1
		g.addEdge(1, 4, 4);
		g.addEdge(2, 3, 20);
		g.addEdge(4, 3, 30);
		g.addEdge(4, 5, 80);
		g.addEdge(5, 6, 7);
		g.addEdge(7, 6, 14);
		g.addEdge(5, 7, 15);
		g.display();
		System.out.println(g.noofedge());
		// g.removeEdge(4, 5);
		// g.removevertex(4);
		// g.display();
		System.out.println(g.haspath(1, 6, new HashSet<>()));
		g.Printallpath(1, 6, new HashSet<>(), "");

	}

}
