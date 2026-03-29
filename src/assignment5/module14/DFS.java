package assignment5.module14;

import java.util.ArrayList;

public class DFS {

    int vertices;
    ArrayList<ArrayList<Integer>> adjList;

    // Constructor
    DFS(int v) {
        vertices = v;
        adjList = new ArrayList<>();

        for (int i = 0; i < v; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    // Add edge
    void addEdge(int u, int v) {
        adjList.get(u).add(v);
        adjList.get(v).add(u); // undirected graph
    }

    // DFS Traversal
    void DFS(int start, boolean[] visited) {
        visited[start] = true;
        System.out.print(start + " ");

        for (int neighbor : adjList.get(start)) {
            if (!visited[neighbor]) {
                DFS(neighbor, visited);
            }
        }
    }

    public static void main(String[] args) {
        DFS g = new DFS(5);

        g.addEdge(0, 1);
        g.addEdge(0, 4);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 3);
        g.addEdge(3, 4);

        boolean[] visited = new boolean[5];

        System.out.print("DFS Traversal: ");
        g.DFS(0, visited);
    }
}
