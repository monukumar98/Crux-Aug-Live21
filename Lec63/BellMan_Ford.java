package Lec63;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class BellMan_Ford {

	HashMap<Integer, HashMap<Integer, Integer>> map;

	public BellMan_Ford(int v) {
		// TODO Auto-generated constructor stub
		this.map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());

		}

	}

	public void addEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);

	}

	public class Edge {

		int v1;
		int v2;
		int cost;

		public Edge(int v1, int v2, int cost) {
			// TODO Auto-generated constructor stub
			this.v1 = v1;
			this.v2 = v2;
			this.cost = cost;
		}

		@Override

		public String toString() {

			return this.v1 + " " + this.v2 + " @ cost " + this.cost;

		}

	}

	public ArrayList<Edge> GetAllEdge() {
		ArrayList<Edge> list = new ArrayList<>();

		for (int vtx : map.keySet()) {

			for (int nbrs : map.get(vtx).keySet()) {
				Edge ep = new Edge(vtx, nbrs, map.get(vtx).get(nbrs));
				list.add(ep);
			}

		}
		return list;

	}

	public void bellmanford() {
		int v = map.size();
		int[] distance = new int[v + 1];
		Arrays.fill(distance, 1000000);
		distance[1] = 0;
		ArrayList<Edge> alledge = GetAllEdge();
		for (int i = 1; i <= v; i++) {
			for (Edge eg : alledge) {

				int oldcost = distance[eg.v2];
				int newcost = distance[eg.v1] + eg.cost;

				if (oldcost > newcost) {
					if (i != v) {
						distance[eg.v2] = newcost;
					} else {
						System.out.println("-ve cycle h");
						return;
					}
				}

			}

		}

		for (int i = 1; i < distance.length; i++) {

			System.out.println(i + " --> " + distance[i]);
		}

	}

	public static void main(String[] args) {

		BellMan_Ford bf = new BellMan_Ford(5);
		bf.addEdge(1, 2, 8);
		bf.addEdge(1, 3, 4);
		bf.addEdge(1, 4, 5);
		bf.addEdge(2, 5, 1);
		bf.addEdge(5, 2, 2);
		bf.addEdge(3, 4, -3);
		bf.addEdge(4, 5, 1);
		bf.bellmanford();

	}

}
