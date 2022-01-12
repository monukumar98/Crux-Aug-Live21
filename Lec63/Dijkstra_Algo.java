package Lec63;

import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

public class Dijkstra_Algo {
	HashMap<Integer, HashMap<Integer, Integer>> map;

	public Dijkstra_Algo(int v) {
		// TODO Auto-generated constructor stub
		this.map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());

		}

	}

	public void addEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);

	}

	public class DikstraPair implements Comparable<DikstraPair> {

		int vtx;
		String Acqpath;
		int cost;

		public DikstraPair(int v, String ac, int cost) {
			// TODO Auto-generated constructor stub
			this.vtx = v;
			this.Acqpath = ac;
			this.cost = cost;
		}

		@Override

		public String toString() {
			return this.vtx + " vai " + this.Acqpath + " @ " + this.cost;
		}

		@Override
		public int compareTo(DikstraPair o) {
			// TODO Auto-generated method stub
			return this.cost - o.cost;
		}

	}

	public void Dijkstraalgo() {
		HashSet<Integer> visited = new HashSet<>();
		PriorityQueue<DikstraPair> pq = new PriorityQueue<>();

		DikstraPair pp = new DikstraPair(1, "1", 0);
		pq.add(pp);
		while (!pq.isEmpty()) {
			DikstraPair p = pq.remove();

			// if already visited hai to Ignore
			if (visited.contains(p.vtx)) {
				continue;
			}
			visited.add(p.vtx);
			System.out.println(p);

			for (int nbrs : map.get(p.vtx).keySet()) {
				if (!visited.contains(nbrs)) {
					DikstraPair np = new DikstraPair(nbrs, p.Acqpath + nbrs, p.cost + map.get(p.vtx).get(nbrs));
					pq.add(np);
				}
			}

		}

	}

	public static void main(String[] args) {
		Dijkstra_Algo pa = new Dijkstra_Algo(7);
		pa.addEdge(1, 2, 2);
		pa.addEdge(2, 3, 3);
		pa.addEdge(1, 4, 10);
		pa.addEdge(4, 5, 8);
		pa.addEdge(3, 4, 1);
		pa.addEdge(5, 6, 5);
		pa.addEdge(5, 7, 6);
		pa.addEdge(6, 7, 4);
		pa.Dijkstraalgo();

	}

}
