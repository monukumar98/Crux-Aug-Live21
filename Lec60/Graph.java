package Lec60;

import java.util.HashMap;
import java.util.HashSet;

public class Graph {
	HashMap<Integer, HashMap<Integer, Integer>> map;

	public Graph(int v) {
		// TODO Auto-generated constructor stub
		this.map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());

		}

	}

	public int noofvertex() {
		return map.size();

	}

	public int noofedge() {

		int ans = 0;
		for (int key : map.keySet()) {
			ans = ans + map.get(key).size();
		}
		return ans / 2;

	}

	public void addEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);

	}

	public void addvertex(int v) {
		if (Containsvertex(v)) {
			return;
		}
		map.put(v, new HashMap<>());
	}

	public boolean Containsvertex(int v) {
		return map.containsKey(v);

	}

	public boolean ContainsEdge(int v1, int v2) {
		return map.get(v1).containsKey(v2) && map.get(v2).containsKey(v1);

	}

	public void removeEdge(int v1, int v2) {
		if (ContainsEdge(v1, v2)) {
			map.get(v1).remove(v2);
			map.get(v2).remove(v1);
		}

	}

	public void removevertex(int v) {
		for (int nbrs : map.get(v).keySet()) {
			map.get(nbrs).remove(v);
		}
		map.remove(v);

	}

	public void display() {
		for (int key : map.keySet()) {
			System.out.println(key + " -->" + map.get(key));

		}
	}

	public boolean haspath(int src, int dis, HashSet<Integer> visited) {

		if (src == dis) {
			return true;
		}
		visited.add(src);
		for (int nbrs : map.get(src).keySet()) {
			if (!visited.contains(nbrs)) {
				boolean res = haspath(nbrs, dis, visited);
				if (res) {

					return res;
				}
			}
		}
		visited.remove(src);
		return false;
	}

	public void Printallpath(int src, int dis, HashSet<Integer> visited, String str) {

		if (src == dis) {
           System.out.println(str+dis);
          
		}
		visited.add(src);
		for (int nbrs : map.get(src).keySet()) {
			if (!visited.contains(nbrs)) {
				Printallpath(nbrs, dis, visited, str + src + "->");

			}
		}
		visited.remove(src);

	}

}
