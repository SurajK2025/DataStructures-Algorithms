package com.graph;

public class Tester {

	public static void main(String[] args) {
		Graph g = new Graph(9);
        g.display();
        g.bfs(0);
        g.dfs(0);
	}
}