package assignment5.module14;

import java.util.ArrayList;
public class AdjacencyList {
    int vertices;
    ArrayList<ArrayList<Integer>> adjList;
    // Constructor
    AdjacencyList(int v) {
        vertices = v;
        adjList = new ArrayList<>();

        for (int i = 0; i < v; i++) {
            adjList.add(new ArrayList<>());
        }
    }
    // Add edge (undirected graph)
    void addEdge(int u, int v) {
        adjList.get(u).add(v);
        adjList.get(v).add(u);
    }
    // Display adjacency list
    void display() {
        for (int i = 0; i < vertices; i++) {
            System.out.print(i + " -> ");
            for (int node : adjList.get(i)) {
                System.out.print(node + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        AdjacencyList g = new AdjacencyList(5);
        g.addEdge(0, 1);
        g.addEdge(0, 4);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 3);
        g.addEdge(3, 4);
        g.display();
    }
}

