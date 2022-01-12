package Lec63;

import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;


public class Prims_algo {

	HashMap<Integer, HashMap<Integer, Integer>> map;

	public Prims_algo(int v) {
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

	public class PrimsPair implements Comparable<PrimsPair> {

		int vtx;
		int aqvtx;
		int cost;

		public PrimsPair(int v, int ac, int cost) {
			// TODO Auto-generated constructor stub
			this.vtx = v;
			this.aqvtx = ac;
			this.cost = cost;
		}

		@Override

		public String toString() {
			return this.vtx + " vai " + this.aqvtx + " @ " + this.cost;
		}

		@Override
		public int compareTo(PrimsPair o) {
			// TODO Auto-generated method stub
			return this.cost - o.cost;
		}

	}

	public void primsalgo() {
		HashSet<Integer> visited = new HashSet<>();
		PriorityQueue<PrimsPair> pq = new PriorityQueue<>();

		PrimsPair pp = new PrimsPair(1, 1, 0);
		pq.add(pp);
		while (!pq.isEmpty()) {
			PrimsPair p = pq.remove();

			// if already visited hai to Ignore
			if (visited.contains(p.vtx)) {
				continue;
			}
			visited.add(p.vtx);
			System.out.println(p);

			for (int nbrs : map.get(p.vtx).keySet()) {
				if (!visited.contains(nbrs)) {
					PrimsPair np = new PrimsPair(nbrs, p.vtx, map.get(p.vtx).get(nbrs));
					pq.add(np);
				}
			}

		}

	}

	public static void main(String[] args) {
		Prims_algo pa = new Prims_algo(7);
		pa.addEdge(1, 2, 20);
		pa.addEdge(2, 3, 5);
		pa.addEdge(1, 4, 60);
		pa.addEdge(4, 5, 5);
		pa.addEdge(3, 4, 10);
		pa.addEdge(5, 6, 14);
		pa.addEdge(5, 7, 18);
		pa.addEdge(6, 7, 13);
		pa.primsalgo();

	}

}
