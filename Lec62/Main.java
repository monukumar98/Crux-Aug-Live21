package Lec62;

import java.util.*;

public class Main {
	HashMap<Integer, HashMap<Integer, Integer>> map;

	public Main(int v) {
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
		int ans = 0;
		ArrayList<EdgePair> edge_list = GetAllEdge();
		Collections.sort(edge_list);
		for (EdgePair eg : edge_list) {
			int re1 = dsu.find(eg.v1);
			int re2 = dsu.find(eg.v2);
			if (re1 == re2) {
				// notrhing
			}

			else {
				// System.out.println(eg);
				ans = ans + eg.cost;
				dsu.Union(re1, re2);
			}

		}
		System.out.println(ans);

	}

	public class Dis_JointSet {

		public class Node {

			int val;
			Node parent;
			int rank;

		}

		private HashMap<Integer, Node> ds = new HashMap<>();

		public void Create(int v) {
			Node nn = new Node();
			nn.val = v;
			nn.parent = nn;
			nn.rank = 0;
			ds.put(v, nn);

		}

		public int find(int v) {
			Node nn = ds.get(v);
			return find(nn).val;

		}

		private Node find(Node nn) {
			// TODO Auto-generated method stub
			if (nn.parent == nn) {
				return nn;
			}

			return find(nn.parent);

		}

		public void Union(int v1, int v2) {
			Node n1 = ds.get(v1);
			Node n2 = ds.get(v2);

			Node rn1 = find(n1);
			Node rn2 = find(n2);
			if (rn1.rank == rn2.rank) {
				rn1.parent = rn2;
				rn2.rank = rn2.rank + 1;

			} else if (rn1.rank > rn2.rank) {
				rn2.parent = rn1;

			} else {
				rn1.parent = rn2;
			}

		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int v = sc.nextInt();
		Main ka = new Main(v);
		int e =sc.nextInt();
		for (int i = 0; i <e; i++) {
			int v1=sc.nextInt();
			int v2=sc.nextInt();
			int cost=sc.nextInt();
			ka.addEdge(v1, v2, cost);
			
		}
//		ka.addEdge(1, 2, 1);
//		ka.addEdge(1, 4, 2);
//		ka.addEdge(3, 2, 5);
//		ka.addEdge(3, 4, 7);
//		ka.addEdge(4, 5, 8);
//		ka.addEdge(5, 6, 6);
//		ka.addEdge(5, 7, 3);
//		ka.addEdge(6, 7, 4);

		ka.Kruskals();

	}

}
