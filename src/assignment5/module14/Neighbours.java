package assignment5.module14;

import java.util.ArrayList;

public class Neighbours {

    int vertices;
    ArrayList<ArrayList<Integer>> adjList;

    Neighbours(int v) {
        vertices = v;
        adjList = new ArrayList<>();

        for (int i = 0; i < v; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    void addEdge(int u, int v) {
        adjList.get(u).add(v);
        adjList.get(v).add(u); // undirected graph
    }

    void printNeighbors(int node) {
        System.out.print("Neighbors of " + node + ": ");

        for (int neighbor : adjList.get(node)) {
            System.out.print(neighbor + " ");
        }
    }

    public static void main(String[] args) {
        Neighbours g = new Neighbours(5);

        g.addEdge(0, 1);
        g.addEdge(0, 4);
        g.addEdge(1, 2);
        g.addEdge(1, 3);

        g.printNeighbors(1);
    }
}
