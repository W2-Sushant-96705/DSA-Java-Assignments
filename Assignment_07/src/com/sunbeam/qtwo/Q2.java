package com.sunbeam.qtwo;

import java.util.*;

class BipartiteGraph {
    int V;
    ArrayList<ArrayList<Integer>> adj;

    BipartiteGraph(int v) {
        V = v;
        adj = new ArrayList<>();

        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }
    }

    void addEdge(int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u); // undirected graph
    }

    boolean isBipartite() {
        int[] color = new int[V];
        Arrays.fill(color, -1); // -1 means uncolored

        for (int i = 0; i < V; i++) {
            if (color[i] == -1) {
                if (!bfsCheck(i, color)) {
                    return false;
                }
            }
        }
        return true;
    }

    boolean bfsCheck(int start, int[] color) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        color[start] = 0;

        while (!q.isEmpty()) {
            int node = q.poll();

            for (int neighbor : adj.get(node)) {
                if (color[neighbor] == -1) {
                    color[neighbor] = 1 - color[node];
                    q.add(neighbor);
                } else if (color[neighbor] == color[node]) {
                    return false; // same color → not bipartite
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        BipartiteGraph g = new BipartiteGraph(4);

        g.addEdge(0, 1);
        g.addEdge(0, 3);
        g.addEdge(1, 2);
        g.addEdge(2, 3);

        if (g.isBipartite()) {
            System.out.println("Graph is Bipartite");
        } else {
            System.out.println("Graph is NOT Bipartite");
        }
    }
}