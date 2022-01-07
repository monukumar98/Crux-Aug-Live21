package Lec61;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class Valid_Tree {
	public boolean validTree(int n, int[][] edges) {

		HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();

		for (int i = 0; i < n; i++) {
			map.put(i, new HashMap<>());
		}
		for (int i = 0; i < edges.length; i++) {
			int a = edges[i][0];
			int b = edges[i][1];
			map.get(a).put(b, 1);
			map.get(b).put(a, 1);

		}

		HashSet<Integer> visited = new HashSet<>();
		int count = 0;
		Queue<Integer> q = new LinkedList<>();
		for (int src : map.keySet()) {

			if (visited.contains(src)) {
				continue;
			}
			count++;

			q.add(src);// last me Addition
			while (!q.isEmpty()) {
				// remove
				int rv = q.remove();// fast se remove

				// Ignore if already visited
				if (visited.contains(rv)) {
					return false;
				}

				// Visited Marked
				visited.add(rv);
				// nbrs ko add kr rahe
				for (int nbrs : map.get(rv).keySet()) {
					if (!visited.contains(nbrs)) {
						q.add(nbrs);
					}
				}

			}
		}
		return count == 1;

	}

}
