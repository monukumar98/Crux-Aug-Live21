package Lec62;

import java.util.*;

public class Kruskals_Algorithm {
	HashMap<Integer, HashMap<Integer, Integer>> map;

	public Kruskals_Algorithm(int v) {
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

	public class EdgePair implements Comparable<EdgePair> {

		int v1;
		int v2;
		int cost;

		public EdgePair(int v1, int v2, int cost) {
			// TODO Auto-generated constructor stub
			this.v1 = v1;
			this.v2 = v2;
			this.cost = cost;
		}

		@Override
		public int compareTo(EdgePair o) {
			// TODO Auto-generated method stub
			return this.cost - o.cost;
		}

		@Override

		public String toString() {

			return this.v1 + " " + this.v2 + " @ cost " + this.cost;

		}
	}

	public ArrayList<EdgePair> GetAllEdge() {
		ArrayList<EdgePair> list = new ArrayList<>();
		for (int vtx : map.keySet()) {

			for (int nbrs : map.get(vtx).keySet()) {
				EdgePair ep = new EdgePair(vtx, nbrs, map.get(vtx).get(nbrs));
				list.add(ep);
			}

		}
		return list;

	}

	public void Kruskals() {

		Dis_JointSet dsu = new Dis_JointSet();
		for (int vtx : map.keySet()) {
			dsu.Create(vtx);

		}
int ans=0;
		ArrayList<EdgePair> edge_list = GetAllEdge();
		Collections.sort(edge_list);
		for (EdgePair eg : edge_list) {
			int re1 = dsu.find(eg.v1);
			int re2 = dsu.find(eg.v2);
			if (re1 == re2) {
				// notrhing
			}

			else {
				//System.out.println(eg);
				ans=ans+eg.cost;
				dsu.Union(re1, re2);
			}

		}
		System.out.println(ans);

	}

	public static void main(String[] args) {

		Kruskals_Algorithm ka = new Kruskals_Algorithm(7);
		ka.addEdge(1, 2, 1);
		ka.addEdge(1, 4, 2);
		ka.addEdge(3, 2, 5);
		ka.addEdge(3, 4, 7);
		ka.addEdge(4, 5, 8);
		ka.addEdge(5, 6, 6);
		ka.addEdge(5, 7, 3);
		ka.addEdge(6, 7, 4);

		ka.Kruskals();

	}

}
