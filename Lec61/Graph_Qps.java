package Lec61;

import Lec60.Graph;

public class Graph_Qps {

	public static void main(String[] args) {
		// TODO Auto-generated method stubGraph g = new Graph(7);
		Graph g = new Graph(7);
		g.addEdge(1, 2, 10);// 1-->2 2-->1
		g.addEdge(1, 4, 4);
		g.addEdge(2, 3, 20);
		g.addEdge(4, 3, 30);
		g.addEdge(4, 5, 80);
		g.addEdge(5, 6, 7);
		g.addEdge(7, 6, 14);
		g.addEdge(5, 7, 15);
		g.removeEdge(4, 5);
		g.addvertex(8);
		g.display();
//		System.out.println(g.BFS(1, 6));
//		g.BFT();
//		g.DFT();
//		System.out.println(g.isCycle());
		System.out.println(g.isConected());
		g.GetAllComponent();
		

	}

}
