package dfs;

import java.util.ArrayList;
import java.util.List;

public class DFSRecursive {
	private static List<List<Integer>> graph = new ArrayList<>();
	private static boolean[] visited;

	public static void main(String[] args) {
		int numberOfNodes = 6;
		visited = new boolean[numberOfNodes + 1];

		for (int i = 0; i < numberOfNodes; i++) {
			graph.add(new ArrayList<>());
		}

		graph.get(1).add(2);
		graph.get(1).add(3);
		graph.get(2).add(4);
		graph.get(2).add(5);
		graph.get(3).add(6);
		graph.get(5).add(6);
		dfs(1);
	}

	private static void dfs(int node) {
		visited[node] = true;
		System.out.println(node + " ");

		for (int neighbor : graph.get(node)) {
			if (!visited[neighbor]) {
				dfs(neighbor);
			}
		}
	}
}
