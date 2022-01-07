package Lec61;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class Graph_Bipartite {
	public boolean isBipartite(int[][] graph) {
		HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();

		for (int i = 0; i < graph.length; i++) {
			map.put(i, new HashMap<>());
		}

		for (int i = 0; i < graph.length; i++) {
			for (int j = 0; j < graph[i].length; j++) {
				map.get(i).put(graph[i][j], 1);

			}
		}
		for (int i = 0; i < graph.length; i++) {
			System.out.println(i+" "+map.get(i));
		}

		HashMap<Integer, BipartitePair> visited = new HashMap<>();

		Queue<BipartitePair> q = new LinkedList<>();
		for (int src : map.keySet()) {

			if (visited.containsKey(src)) {
				continue;
			}
			
			BipartitePair bp = new BipartitePair(src, 0);
			q.add(bp);// last me Addition
			while (!q.isEmpty()) {
				// remove
				BipartitePair rp = q.remove();// fast se remove

				// Ignore if already visited
				if (visited.containsKey(rp.vt)) {
					if (visited.get(rp.vt).lv != rp.lv) {
						return false;
					}

				}

				// Visited Marked
				visited.put(rp.vt, rp);
				// nbrs ko add kr rahe
				for (int nbrs : map.get(rp.vt).keySet()) {
					if (!visited.containsKey(nbrs)) {
						BipartitePair np = new BipartitePair(nbrs, rp.lv + 1);
						q.add(np);
					}
				}

			}
		}

		return true;

	}

	public class BipartitePair {
		public BipartitePair(int src, int i) {
			// TODO Auto-generated constructor stub
			this.vt = src;
			this.lv = i;
		}

		int vt;
		int lv;

	}
}
