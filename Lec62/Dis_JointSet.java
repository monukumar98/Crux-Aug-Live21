package Lec62;

import java.util.HashMap;

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
